public class Main {
	
	public static void main(String args[]){
		Calculator c = new Calculator();
		FilesLibrary fl = new FilesLibrary();
		ConsoleLib cl = new ConsoleLib();
		List list = new List();
		
		fl.readFile(list);
		double mean = c.calculateMean(list);
		double std_dev = c.calculateStdDev(list, mean);
		cl.printMeanStdResults(mean, std_dev);
	}



}

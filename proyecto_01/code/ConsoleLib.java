import java.util.Scanner;
import java.text.DecimalFormat;
import java.math.RoundingMode;

public class ConsoleLib{

DecimalFormat df;

public ConsoleLib(){
	df = new DecimalFormat("#.##");
	df.setRoundingMode(RoundingMode.CEILING);
}

public void populateList(List list) {
	Scanner in = new Scanner(System.in);
	Node new_node = null;
	System.out.println("Introducir 10 numeros:");
	for(int i=0; i<10; i++) {
		new_node = new Node(in.nextFloat());
		list.addNode(new_node);
	}
}

public void printMeanStdResults(double mean, double std_dev) {
	System.out.println("Mean: " + df.format(mean));
	System.out.println("Standard deviation: " + df.format((std_dev)));
}

}

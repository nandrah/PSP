
public class Calculator {

public double calculateMean(List list) {
	double sum = 0;
	double mean = 0;
	if(list.size > 0){
		Node current = list.first;
		for(int i=0; i<list.size; i++) {
			sum += current.number;
			if (current.next != null) {
				current = current.next;
			}
		}
		mean = sum/list.size;
	}
	return mean;
}

public double calculateStdDev(List list, double mean) {
	double sum = 0;
	double std_dev = 0;
	if(list.size > 0){
		Node current = list.first;
		for(int i=0; i<list.size; i++) {
			sum += Math.pow((current.number - mean), 2);
			if (current.next != null) {
				current = current.next;
			}
		}
		std_dev = Math.sqrt(sum/(list.size-1));
	}
	return std_dev;
}


}

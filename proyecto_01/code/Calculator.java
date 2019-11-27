import java.util.Scanner;

public class Calculator {

public static List list = new List();
public static double mean = 0;
public static double std_dev = 0;

public static void main(String args[]){
	populate_list();
	calculate_mean();
	calculate_std_dev();
	System.out.println("Mean: " + mean);
	System.out.println("Standard deviation: " + std_dev);
}

public static void calculate_mean() {
	double sum = 0;
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
}

public static void calculate_std_dev() {
	double sum = 0;
	if(mean == 0) {
		calculate_mean();
	}
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
}

public static void populate_list() {
	Scanner in = new Scanner(System.in);
	Node new_node = null;
	System.out.println("Introducir 10 numeros:");
	for(int i=0; i<10; i++) {
		new_node = new Node(in.nextFloat());
		list.add_node(new_node);
	}
}

}
public class Node {
	public double number;
	public Node next = null;
	
	public Node(double number) {
		this.number = number;
		next = null;
	}
	
	public Node(double number, Node next) {
		this.number = number;
		this.next = next;
	}
	
	public double get_number() {
		return number;
	}
}
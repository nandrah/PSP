public class List {
	
	public Node first = null;
	public Node last = null;
	public int size = 0;
	
	public void add_first(Node node){
		first = node;
		last = node;
	}
	
	public void add_node(Node node){
		if(size == 0) {
			add_first(node);
		} else {
			last.next = node;
			last = node;
		}
		size++;
	}
	
}
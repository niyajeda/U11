package u11;

public class Node {
	Object data;
	Node next;
	
	public Node(Object a) {
		data = a;
		next = null;
	}
	
	public Node(Object a, Node n) {
		data = a;
		next = n;
	}
}

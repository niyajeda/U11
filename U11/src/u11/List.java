package u11;

public class List {
	private Node head; // Kopf der Liste
	
	public List() {
		head = null; // null repr�sentiert leere Liste
	}

	// Funktionen
	/**
	 * F�gt an das Ende der this-Liste die Liste a an.
	 * Ver�ndert dabei die this-Liste.
	 */
	public void concatList(List a) {
		if(head == null){
			head = a.head;
			return;
		}
		Node x;
		x = head;
		while(x != null){
			x = x.next;
		}
		x = a.head;
	}
	/**
	 * Erzeugt eine neue Liste durch Anf�gen der Liste a an die this-Liste.
	 * Ver�ndert dabei die this-Liste nicht.
	 */

	public List appendList(List a) {
		if(head == null){
			return a;
		}
		List l = new List();
		Node x = head;
		while(x != null){
			x = new Node(l, x);
			x = x.next;
		}
		Node y;
		y = l.head;
		while(y != null){
			y = y.next;
		}
		y = a.head;
		return l;
	}
}

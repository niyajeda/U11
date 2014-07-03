package u11;

public class StackTest {
	public static void main(String[] args){
		Stack s = new Stack();
		s.push("Apfel");
		s.push("Orange");
		s.pop();
		s.push("Erdbeere");
		s.push("Kiwi");
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		System.out.print(s.list1);
	}
}

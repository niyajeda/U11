package u11;

public class CloningCheck {
	public static void main(String[] args){
		Cloning c = new Cloning();
		Cloning d = null;
		c.setProperty("Hallo Welt");
		c.setPropertyList("Hallo");
		c.setPropertyList("Hello");
		c.setPropertyList("Sunchhen");
		c.setPropertyList("shalom");
		c.setPropertyList("hola");
		if(c instanceof Cloneable){
			d = (Cloning) c.clone();
		}
		System.out.println(d.getProperty() + "\n" + d.getPropertyList(0) + "\n" + d.getPropertyList(1) + "\n" + d.getPropertyList(2) +
				"\n" + d.getPropertyList(3) + "\n" + d.getPropertyList(4) + "\n");
		System.out.println("Gleichheitstest: " + c.equals(d));
		d.setProperty("hallowelt");
		d.setPropertyList("Hi");
		System.out.println(d.getProperty() + "\n" + d.getPropertyList(0) + "\n" + d.getPropertyList(1) + "\n" + d.getPropertyList(2) +
				"\n" + d.getPropertyList(3) + "\n" + d.getPropertyList(4) + "\n" + d.getPropertyList(5));
		System.out.println("Gleichheitstest: " + c.equals(d));
	}
}

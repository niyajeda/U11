package u11;

import java.util.ArrayList;
import java.util.List;

public class Cloning implements Cloneable {
	private String property = new String();
	private List<String> property2 = new ArrayList<String>();
	
	
	public void setProperty(String p){
		this.property = p;
	}
	
	public String getProperty(){
		return this.property;
	}
	
	public void setPropertyList(String p){
		this.property2.add(p);
	}
	
	public String getPropertyList(int index){
		return this.property2.get(index);
	}
	
	@Override
	public boolean equals(Object obj){
		if(!(obj instanceof Cloning)){
			return false;
		}
		Cloning c = (Cloning)obj;
		if(!(this.property.equals(c.property))) return false;
		if(!(this.property2.equals(c.property2))) return false;
		return true;
	}
	
	@Override
	public Object clone() {
		Cloning temp = null;
	     try {
	    	 temp = (Cloning) super.clone(); 
	    } catch (CloneNotSupportedException e) {
	    	throw new InternalError(e.toString());
	    } 
	     
	    temp.property = new String(this.property);
	    temp.property2 = new ArrayList<String>(this.property2);
	    
	    return temp;
	} 
}

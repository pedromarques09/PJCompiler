package datastructures;

public abstract class PjSymbol {
	
	protected String name;
	
	public abstract String generateJavaCode();
	public PjSymbol(String name) {
		this.name = name;
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "PjSymbol [name=" + name + "]";
	}
	
	
	

}

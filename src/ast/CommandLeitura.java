package ast;

import datastructures.PjVariable;

public class CommandLeitura extends AbstractCommand {

	private String id;
	private PjVariable var;
	
	public CommandLeitura (String id, PjVariable var) {
		this.id = id;
		this.var = var;
	}
	@Override
	public String generateJavaCode() {
		// TODO Auto-generated method stub
		return id +"= _key." + (var.getType()==PjVariable.NUMBER? "nextDouble();": "nextLine();");
	}
	@Override
	public String toString() {
		return "CommandLeitura [id=" + id + "]";
	}

}

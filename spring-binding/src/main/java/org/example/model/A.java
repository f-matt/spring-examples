package org.example.model;

public class A {
	
	private int id;
	private String description;
	private B b;
	private C c;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	public C getC() {
		return c;
	}

	public void setC(C c) {
		this.c = c;
	}
	
	@Override
	public String toString() {
		return String.format("A:\n\tid: %d\n\tdescription: %s\n\t%s\n\t%s", id, description, b.toString(), c.toString());
	}
	
}

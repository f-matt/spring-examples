package org.example.model;

public class C {
	
	private int id;
	private String description;
	
	public C() {}
	
	public C(int id, String description) {
		this.id = id;
		this.description = description;
	}
	
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
	
	@Override
	public String toString() {
		return String.format("C:\n\tid: %d\n\tdescription: %s\n", id, description);
	}

}

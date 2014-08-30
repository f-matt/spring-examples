package x.y.model;

public class FooBarDto {
	
	private String id;
	private String a;
	private String b;
	private String c;
	private String d;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getA() {
		return a;
	}
	
	public void setA(String a) {
		this.a = a;
	}
	
	public String getB() {
		return b;
	}
	
	public void setB(String b) {
		this.b = b;
	}
	
	public String getC() {
		return c;
	}
	
	public void setC(String c) {
		this.c = c;
	}
	
	public String getD() {
		return d;
	}
	
	public void setD(String d) {
		this.d = d;
	}
	
	@Override
	public String toString() {
		return String.format("Foo object\n\tid: %s\n\ta: %s\n\tb: %s\n\tc: %s\n\t"
				+ "d: %s\n", id, a, b, c, d);
	}
	
}

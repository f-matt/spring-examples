package examples.model;

public class TestModel {
	
	private String first;
	private String second;
		
	public String getFirst() {
		return first;
	}
	
	public void setFirst(String first) {
		this.first = first;
	}
	
	public String getSecond() {
		return second;
	}
	
	public void setSecond(String second) {
		this.second = second;
	}
	
	@Override
	public String toString() {
		return String.format("TestModel:\n\tfirst=%s\n\tsecond=%s\n", first, second);
	}

}

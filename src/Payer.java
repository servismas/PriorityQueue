
public class Payer {
	
	public Payer(int priority, String name) {
//		super();
		this.priority = priority;
		this.name = name;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private int priority;
	private String name;
	

}

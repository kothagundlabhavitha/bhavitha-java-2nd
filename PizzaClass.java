package Pizza;

public class PizzaClass {
	private String pname;
	private String padd;
	private String type;
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPadd() {
		return padd;
	}
	public void setPadd(String padd) {
		this.padd = padd;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public PizzaClass(int piid, String pname, String padd, String type) {
		super();
		
		this.pname = pname;
		this.padd = padd;
		this.type = type;
	}
	public PizzaClass() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PizzaClass [pname=" + pname + ", padd=" + padd + ", type=" + type + "]";
	}
	public static void main(String[] args) {
		
	}
	
	

}

package classProject;

public class Bus {
	private static Bus instance;
	int busNumber;
	int customerCount;
	int price;
	
	private Bus() {
		price = 0;
		busNumber = 704;
		customerCount = 0;
	}
	
	public static Bus getInstance() {
		if(instance == null){
			instance = new Bus();
		}
		return instance;
	}
	
	//set
	public void setBus(int busNumber, int customerCount, int price) {
		this.busNumber = busNumber;
		this.customerCount = customerCount;
		this.price = price;
	}
	
	//get
	public int getBusnumber() {
		return busNumber;
	}
	public int getCustomercount() {
		return customerCount;
	}
	public int getPrice() {
		return price;
	}
	
	public void showInfo() {
		System.out.println("Bus");
		System.out.println(getBusnumber());
		System.out.println(getCustomercount());
		System.out.println(getPrice());
	}
	
	
	public void take(int price) {
		this.price += price;
		System.out.println("버스의 수입은 " + getPrice() + "원 입니다.");
	}
}

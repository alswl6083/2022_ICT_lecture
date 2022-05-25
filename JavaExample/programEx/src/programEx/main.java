package programEx;

public class main {
	public static void main(String[] args) {
		Customer customerLee = new Customer(10100, "Lee");
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerLee.calcPrice(1000));
		
		VIPCustomer vip = new VIPCustomer(10101, "Kim");
		System.out.println(vip.showCustomerInfo());
		System.out.println(vip.calcPrice(1000));
		
		//업캐스팅
		
		Customer cus = new VIPCustomer(11111,"Jeong");
		System.out.println(cus.calcPrice(1000));
		System.out.println(cus.showCustomerInfo());
		
	}
}

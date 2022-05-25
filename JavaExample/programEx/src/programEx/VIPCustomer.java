package programEx;

public class VIPCustomer extends Customer {
	private int agentID;
	private double saleRatio;
	
	public VIPCustomer(int customerID,String customerName) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		this.saleRatio = 0.1;
		this.agentID = 3000;
	}
	
	public int getAgentID() {
		return this.agentID;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price -(int)(price * this.saleRatio);
	}
}

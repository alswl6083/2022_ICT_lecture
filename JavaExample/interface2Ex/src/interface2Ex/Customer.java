package interface2Ex;

public class Customer implements Buy,Sell {

	@Override
	public void sell() {
		System.out.println("�Ǹ��ϱ�");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buy() {
		System.out.println("�����ϱ�");
		// TODO Auto-generated method stub
		
	}
	
	public void order() {
		System.out.println("�� �ֹ�");
	}

}

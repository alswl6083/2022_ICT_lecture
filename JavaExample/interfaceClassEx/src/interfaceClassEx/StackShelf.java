package interfaceClassEx;

public class StackShelf extends Shelf implements Stack {

	@Override
	public void push(String title) {
		shelf.add(title);
		// TODO Auto-generated method stub
		
	}

	@Override
	public String pop() {
		if(getStackSize()<=0) {
			return "������ ������ϴ�";
		}
		// TODO Auto-generated method stub
		return shelf.remove(getStackSize()-1);
	}

	@Override
	public int getStackSize() {
		// TODO Auto-generated method stub
		return getCount();
	}

}

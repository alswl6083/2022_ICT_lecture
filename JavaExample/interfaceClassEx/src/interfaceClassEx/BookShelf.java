package interfaceClassEx;

public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQueue(String title) {
		shelf.add(title);
		// TODO Auto-generated method stub
		
	}

	@Override
	public String deQueue() {
		if(getSize()<=0) {
			return "큐가 비었습니다";
		}return shelf.remove(0);
	}
		// TODO Auto-generated method stub

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return getCount();
	}

}

package interfaceClassEx;

public class main {
	public static void main(String[] args) {
		Queue shelfQueue = new BookShelf();
		shelfQueue.enQueue("1��");
		shelfQueue.enQueue("2��");
		shelfQueue.enQueue("3��");
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		
		Stack shelfStack = new StackShelf();
		shelfStack.push("1��");
		shelfStack.push("2��");
		shelfStack.push("3��");
		
		System.out.println();
		
		System.out.println(shelfStack.pop());
		System.out.println(shelfStack.pop());
		System.out.println(shelfStack.pop());
	}
}

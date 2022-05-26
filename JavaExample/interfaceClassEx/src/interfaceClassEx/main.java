package interfaceClassEx;

public class main {
	public static void main(String[] args) {
		Queue shelfQueue = new BookShelf();
		shelfQueue.enQueue("1번");
		shelfQueue.enQueue("2번");
		shelfQueue.enQueue("3번");
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		
		Stack shelfStack = new StackShelf();
		shelfStack.push("1번");
		shelfStack.push("2번");
		shelfStack.push("3번");
		
		System.out.println();
		
		System.out.println(shelfStack.pop());
		System.out.println(shelfStack.pop());
		System.out.println(shelfStack.pop());
	}
}

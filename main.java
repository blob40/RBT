//Name: Alex Krouse
//Date: 2/4/26
//Testing code for RBT

public class main {

	public static void main(String[] args) {
		System.out.println("running");
		
		// Simple test: insert, print, search, delete, print
		RedBlackTree rbt = new RedBlackTree();
		rbt.insert(8);
		rbt.insert(3);
		rbt.insert(10);
		rbt.insert(2);
		rbt.insert(1);

		System.out.println("Is RedBlack Tree: " + rbt.isRedBlack());
		System.out.println("Shortest True Path: " + rbt.shortestTruePath());
		System.out.println("True Height diff: " + rbt.trueHeightDiff());
		rbt.printTree();

		
		
		rbt.delete(3);
		System.out.println("AD Is RedBlack Tree: " + rbt.isRedBlack());
		System.out.println("AD Shortest True Path: " + rbt.shortestTruePath());
		System.out.println("AD True Height diff: " + rbt.trueHeightDiff());
		rbt.printTree();
	}
}

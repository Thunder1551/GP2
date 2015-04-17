import java.util.LinkedList;

public class TestVisitor {

	public static void main(String[] args) {
		
		// An object of type Tree:
		Tree tree = new Tree ( 
				              new Tree (
				            		  new Tree(null, 1 , null)
				            		  ,2
				            		  ,new Tree(null, 3,null))
				               ,4
				               ,new Tree(null , 5 , null)
				);
		//creating a Sumvisitor to add value of each node:
		SumVisitor sumVisitor = new SumVisitor();
		tree.acceptInOrder(sumVisitor);
		System.out.println("Sum of all nodes = " + sumVisitor.getSum());
		
		//Creating three linkedlist to save nodes of our tree in 3 order:
		LinkedList<Integer> listInOrder = new LinkedList<Integer>();
		LinkedList<Integer> listPreOrder = new LinkedList<Integer>();
		LinkedList<Integer> listPostOrder = new LinkedList<Integer>();
		
		//Creating 3 visitor with every list:
		CreatListVisitor listVisitorInOrder = new CreatListVisitor(listInOrder);
		CreatListVisitor listVisitorPreOrder = new CreatListVisitor(listPreOrder);
		CreatListVisitor listVisitorPostOrder = new CreatListVisitor(listPostOrder);
		
		//Visiting same tree in 3 order:
		tree.acceptInOrder(listVisitorInOrder);
		tree.acceptPreOrder(listVisitorPreOrder);
		tree.acceptPostOrder(listVisitorPostOrder);
		
		System.out.println("tree in order = " + listInOrder);
		System.out.println("tree pre order = " + listPreOrder);
		System.out.println("tree post order = " +listPostOrder);
		

	}
}

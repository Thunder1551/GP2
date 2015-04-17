import java.util.LinkedList;

/**
 * 
 * A class which implement Visitor interface and add each node of a tree to a linkedlist.
 *
 */
public class CreatListVisitor implements Visitor {
	
	private LinkedList<Integer> linkList ;
	
	public CreatListVisitor(LinkedList<Integer> linkList) {
		super();
		this.linkList = linkList;
	}

	@Override
	public void process(Tree tree) {
		
		linkList.add(tree.getValue());
	}

	public LinkedList<Integer> getLinkList() {
		return linkList;
	}
 
}

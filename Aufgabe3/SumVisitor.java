
public class SumVisitor implements Visitor {
	
	// vaiable sum to save sum of the value of each node
	private int sum = 0;
	
	public SumVisitor(){
		this.sum = 0;
	}

	@Override
	public void process(Tree tree) {
		 sum += tree.getValue();
	}

	public int getSum() {
		return sum;
	}

}

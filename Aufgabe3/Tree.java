/**
 * Implements a tree whose nodes contain integer values.
 * 
 */
public class Tree {

	/**
	 * The left subtree.
	 */
	private Tree left;

	/**
	 * The right subtree.
	 */
	private Tree right;

	/**
	 * The numerical value.
	 */
	private int value;

	/**
	 * Gets the numerical value of this node.
	 * 
	 * @return The numerical value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * Creates a new tree node.
	 * 
	 * @param left
	 *            The left subtree of the new node
	 * @param value
	 *            The numerical value of the new node
	 * @param right
	 *            The right subtree of the new node
	 */
	public Tree(Tree left, int value, Tree right) {
		this.left = left;
		this.value = value;
		this.right = right;
	}

	/**
	 * Applies a visitor to each node of the tree according to a depth-first
	 * traversal. Depth-first traversal is implemented recursively, and nodes
	 * are processed in-order.
	 * 
	 * @param visitor
	 *            The visitor inspecting the nodes of this tree.
	 */
	public void acceptInOrder(Visitor visitor) {

		// Apply visitor to left subtree
		if (left != null) {
			left.acceptInOrder(visitor);
		}

		// Let the visitor inspect this node
		visitor.process(this);

		// Apply visitor to right subtree
		if (right != null) {
			right.acceptInOrder(visitor);
		}
	}

	/**
	 * Apply a visitor in pre-order
	 * 
	 * @param visitor
	 *            The visitor inspecting the nodes of this tree.
	 */
	public void acceptPreOrder(Visitor visitor) {

		// Let the visitor inspect this node
		visitor.process(this);

		// Apply visitor to left subtree
		if (left != null) {
			left.acceptPreOrder(visitor);
		}

		// Apply visitor to right subtree
		if (right != null) {
			right.acceptPreOrder(visitor);
		}
	}

	/**
	 * Apply a visitor in Post-order
	 * 
	 * @param visitor
	 *            The visitor inspecting the nodes of this tree.
	 */

	public void acceptPostOrder(Visitor visitor) {

		// Apply visitor to left subtree
		if (left != null) {
			left.acceptPostOrder(visitor);
		}

		// Apply visitor to right subtree
		if (right != null) {
			right.acceptPostOrder(visitor);
		}

		// Let the visitor inspect this node
		visitor.process(this);
	}

}

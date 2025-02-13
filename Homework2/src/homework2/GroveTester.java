package homework2;
public class GroveTester {

	public static void main(String[] args) {
		
		Grove grove1 = new Grove("Grove 1");
		
		System.out.println(grove1);
		
		Tree tree1 = new Tree(1, 37, "Spruce");
		Tree tree2 = new Tree(2, 37, "Spruce");
		Tree tree3 = new Tree(3, 37, "Spruce");
		Tree tree4 = new Tree(4, 37, "Spruce");
		Tree tree5 = new Tree(5, 37, "Spruce");
		Tree tree6 = new Tree(6, 37, "Spruce");
		
		grove1.plant(tree1);
		grove1.plant(tree2);
		grove1.plant(tree3);
		grove1.plant(tree4);
		grove1.plant(tree5);
		grove1.plant(tree6);
		
		System.out.println(grove1);
		
		grove1.remove(3);
		grove1.remove(5);
		
		System.out.println(grove1);
		
		Tree treeMaple = new Tree(7, 13, "Maple");
		
		grove1.plant(treeMaple);
		
		System.out.println(grove1);
		
	}

}

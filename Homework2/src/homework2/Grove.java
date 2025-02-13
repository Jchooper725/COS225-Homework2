package homework2;
import java.util.ArrayList;

public class Grove {

	private ArrayList<Tree> array;
	private String name;
	
	public Grove(String name) {
		this.name = name;
		this.array = new ArrayList<Tree>(16);
		for(int i  = 0; i < 16; i++) {
			array.add(null);
		}
	}
	
	//inserts tree into lowest empty index available. Returns -1 if no index is empty
	public int plant(Tree tree) {
		for(int i = 0; i < 16; i++) {
			if(array.get(i) == null) {
				array.set(i, tree);
				return i;
			}
		}
		return -1;
	}
	
	//Removes tree from index, returns removed tree
	public Tree remove(int x) {
		Tree ret = array.get(x);
		array.set(x, null);
		return ret;
	}
	
	//Prints number of trees in ArrayList
	public String toString() {
		int c = 0;
		for(int i = 0; i < 16; i++) {
			if(! (array.get(i) == null)) {
				c++;
			}
		}
		return "" + c;
	}
}

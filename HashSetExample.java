import java.util.HashSet;

public class HashSetExample {
	public static void main(String args[]) {
		HashSet<String> hashset = new HashSet<String>();
		hashset.add("checking");
		hashset.add("Values");
		hashset.add("for");
		hashset.add("Output");
		
		hashset.add("for");
		hashset.add("Values");
		
		hashset.add("");
		hashset.add(null);
		
		System.out.println(hashset);
	}
}

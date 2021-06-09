
public class Main {

	public static void main(String[] args) {
		 String keys[] = {"the", "a", "there", "answer", "any",
                 "by", "bye", "their","hero", "heroplane"};

		 String output[] = {"Not present in trie", "Present in trie"};
		 
		 Trie tree = new Trie();
		 int i;
	        for (i = 0; i < keys.length ; i++)
	            tree.insert(keys[i]);
	       
	        // Search for different keys
	        if(tree.search("the") == true)
	            System.out.println("the --- " + output[1]);
	        else System.out.println("the --- " + output[0]);
	          
	        if(tree.search("these") == true)
	            System.out.println("these --- " + output[1]);
	        else System.out.println("these --- " + output[0]);
	          
	        if(tree.search("their") == true)
	            System.out.println("their --- " + output[1]);
	        else System.out.println("their --- " + output[0]);
	          
	        if(tree.search("thaw") == true)
	            System.out.println("thaw --- " + output[1]);
	        else System.out.println("thaw --- " + output[0]);
	        
	        if(tree.search("the")==true)
	            System.out.println("Yes");
	        else
	            System.out.println("No");
	 
	        if(tree.search("these")==true)
	            System.out.println("Yes");
	        else
	            System.out.println("No");
	 
	        tree.remove("heroplane");
	         
	        if(tree.search("heroplane")==true)
	            System.out.println("Yes");
	        else
	            System.out.println("No");

	}

}

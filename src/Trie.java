
public class Trie {
	private Node root;
	
	public Trie() {
		root = new Node();
	}
	
	public void insert(String key) {
		int level=0;
		int length = key.length();
		int index=0;
		
		Node traversal = root;
		
		while(level<length) {
			index = key.charAt(level) - 'a';
			if(traversal.isIndex(index)==false) {
				traversal.setIndex(index);
				traversal.setWord(key.charAt(level));
			}
			traversal = traversal.getIndex(index);
			level++;
		}
		traversal.setEndWord(true);
	}
	
	public boolean search(String key) {
		int level = 0;
		int length = key.length();
		int index;
		boolean search=true;
		Node traversal = root;
		while(level<length) {
			index = key.charAt(level) - 'a';
			System.out.println(key.charAt(level));
			if(traversal.isIndex(index)==false) {
				search = false;
				return search;
			}
			level++;
			traversal = traversal.getIndex(index);
		}
		return search;
	}
	
	public boolean isEmpty(Node root)
	{
	    for (int i = 0; i < 26; i++)
	        if (root.isIndex(i)==true) {
	            return false;
	        }
	    return true;
	}
	
	public Node remove(String key) {
		Node toRemove = delete(root, key, 0);
		return toRemove;
	}
	
	private Node delete(Node root, String key, int depth) {
		System.out.println(key.charAt(depth));
		if(root==null) {
			return null;
		}
		
		
		if(depth==key.length()-1) {
			System.out.println("at the end");
			if(root.isEndWord()==true) {
				root.setEndWord(false);
			}
			if(isEmpty(root)) {
				root=null;
			}
			return root;
		}
		
		System.out.println("HERE!" + depth + " " + key.length());
		
		int index = key.charAt(depth) - 'a';
		Node toSet = delete(root.getIndex(index),key,depth+1);
		root.setIndex(index, toSet);
		//System.out.println(isEmpty(root) + "  " + root.isEndWord());
		
		if(isEmpty(root) && root.isEndWord()==false) {
			System.out.println("WHATS POPIGN");
			root=null;
		}
		
		return root;
	}
}

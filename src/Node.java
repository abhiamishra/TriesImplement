
public class Node {
	private Node[] charPointers = new Node[26];
	private boolean isEndWord = false;
	private char word;
	public Node[] getCharPointers() {
		return charPointers;
	}
	public void setCharPointers(Node[] charPointers) {
		this.charPointers = charPointers;
	}
	
	public void setIndex(int index) {
		charPointers[index] = new Node();
	}
	
	public Node getIndex(int index) {
		return charPointers[index];
	}
	
	public boolean isIndex(int index) {
		if (charPointers[index]==null){
			return false;
		}
		return true;
	}
	
	public boolean isEndWord() {
		return isEndWord;
	}
	public void setEndWord(boolean isEndWord) {
		this.isEndWord = isEndWord;
	}
	
	public Node() {
		isEndWord=false;
		for(int i=0; i<26; i++) {
			charPointers[i] = null;
		}
	}
	public void setIndex(int index, Node delete) {
		charPointers[index] = delete;

		
	}
	public char getWord() {
		return word;
	}
	public void setWord(char word) {
		this.word = word;
	}
	
}

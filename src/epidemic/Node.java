package epidemic;

public class Node{
	 
	public int id;
	private int maxCons; //max number of connections
	private int alive; //0= dead, 1 = alive;
	private int infected; // 0= not infected, 1 otherwise
	private int coutDiscarded;// nr of discarded msg's cause too old value 
	private int consIds; //connected links id
	private int info; //info node has;
	private float timeLog; //time of last mgs that has been received
	int maxTime; //max age a msg can have to be used
	
	public void setId(int a) {//call it to set the node with an Id number
		id = a;
	}
	public int whoAreYou() { //returns node's Id
		return id;
	}
	public int whatDoYouKnow() { //returns node's current value/info
		return info;
	}
	public float whenDidTheyTellYou() { //returns the time a node received his last msg
		return timeLog;
	}
	public int health() {//returns 1 if infected
		return infected;
	}
}

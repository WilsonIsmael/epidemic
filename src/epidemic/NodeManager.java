package epidemic;
import java.io.*;

public class NodeManager {
	
	static void displayNodesId(int i, int nrNodes,Node mesh[]) {
		for ( i=0; i<nrNodes; i++) {
			System.out.println("Node " + mesh[i].whoAreYou() + " knows " + mesh[i].whatDoYouKnow());
		}
	}
	//por completar
	/*
	static void displayNodesInfo(int i, int nrNodes,Node mesh[]) {
		for ( i=0; i<nrNodes; i++) {
			System.out.println("Node " + i +" Knows "+ mesh[i].whoAreYou());
		}
	}
	*/
	static Node[] createNodes(int nrNodes) {
		int i =0;
	
		//creates a vector to hold/reference the nodes
		Node[] mesh= new Node[nrNodes];
		
		//nodes creation
		for (i = 0; i<(nrNodes); i++) {
			mesh[i] = new Node();
			mesh[i].setId(i);
			}
		System.out.println(+ nrNodes + " Nodes Created");
		return mesh;
	}
	
	public static void main(String[] args) {
		
		//quantos nós quer criar?
		Node[] mesh = createNodes(100);
		displayNodesId(0,100,mesh);
	}
}

package sv.CodingChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChildrensGame {
	static class Node 
    { 
        public int data ; 
        public Node next; 
        public Node( int data ) 
        { 
            this.data = data; 
        } 
    } 
      
    /* Function to find the elimination order of children after one in   
     every k-th position is eliminated in a circle of n kids */
    public static List<Integer> getEliminationOrder(int k, int n) 
    { 
        // Create a circular linked list of size n. 
        Node head = new Node(1); 
        Node prev = head; 
        
        List<Integer> elim = new ArrayList<Integer>();
        
        if(k<=0 || n<=0) {
        	return elim;
        }
        if(k==1) {
        	for (int i=1;i<=n;i++) {
        		elim.add(i);
        	}
    		return elim;
        }
        for(int i = 2; i <= n; i++) 
        { 
            prev.next = new Node(i); 
            prev = prev.next; 
        }          
        // Connect last node to first 
        prev.next = head;         
        Node ptr1 = head, ptr2 = head;
        
        /* while only one node is left in the linked list*/
        while(ptr1.next != ptr1) 
        {             
            // Find k-th node 
            int count = 1; 
            while(count != k) 
            { 
                ptr2 = ptr1; 
                ptr1 = ptr1.next; 
                count++; 
            }               
            /* Remove the k-th node */
            elim.add(ptr2.next.data);
            ptr2.next = ptr1.next; 
            ptr1 = ptr2.next; 
        } 
        elim.add(ptr1.data);
        return elim;
    } 
      
    /* Driver program to test above function */
    public static void main(String args[]) 
    { 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of children: ");
        int n = in.nextInt();
        System.out.println("Enter the position k: ");
        int k = in.nextInt();
        List<Integer> eliminationOrder = getEliminationOrder(k, n); 
        int winningId = eliminationOrder.get(eliminationOrder.size()-1);
        System.out.println ("Elimination Order" + eliminationOrder);
        System.out.println ("Id of the winner" + winningId);

    } 
} 


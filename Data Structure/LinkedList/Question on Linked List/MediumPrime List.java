
//User function Template for Java
/*
class Node{
    Node next;
    int val;
    public Node(int data){
        val=data;
        next=null;
    }
}
*/

class Solution
{
   
    //---------------------------------------------------------------------
    //Time Complexity of this code is:- O(n*n!)
    Node primeList(Node head){
        Node currNode = head;
        while(currNode!=null){
            int a = currNode.val;
            currNode.val = findNearestPrime(a);
            currNode = currNode.next;
        }
        return head;
        
    }
    
    
    public  int findNearestPrime(int n) {
		if(n==1) return 2;
		int maxPrime=0;
		int minPrime=0;
		int countForMax=0; int countForMin=0;
		for(int i=n; i<Integer.MAX_VALUE; i++) {
			boolean b = findPrime(i);
			countForMax++;
			if(b) {
				maxPrime=i;
				break;
			}
		}
		
		for(int i=n; i>0; i--) {
			boolean b = findPrime(i);
			countForMin++;
			if(b) {
				minPrime=i;
				break;
			}
		}
		if(countForMax==countForMin) {
			
			return Math.min(minPrime, maxPrime);
		}
		
		return countForMax<countForMin ? maxPrime : minPrime;
	}
	
	// n! TC
	public  boolean findPrime(int n) {
		boolean b=true;
		for(int i=2; i*i<=n; i++) {  // TC:- n!
			if(n%i==0) {
				b=false;
				break;
			}
		}
		
		if(b) {
			return true;
		}
		return false;
	}
    
}

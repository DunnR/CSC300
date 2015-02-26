
public class Stack 
{
	
	private Node head;
	
	public Stack()
	{
		
		this.head = null;
		
		
	}
	
	public void addFront(int payload)
	{
		
		Node n = new Node(payload); 
		
		if(this.head == null)
		{
			this.head = n;
		}
		else
		{
			n.setNextNode(head); // set n to what head was pointing to?
			
			head = n; // set head always pointing to n?
		}
		
	}
	
	public void removeFront()
	{
		
		 Node currNode = head;
		 
		 head = head.getNextNode();
		
		 currNode.setNextNode(null);
	
		
	}
	
	public void getAtIndex()
	{
		Node currNode = head;

		System.out.println(currNode.getPayload());
		
	}
	
}

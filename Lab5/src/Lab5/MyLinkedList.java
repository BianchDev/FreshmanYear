package Lab5;

import week4.LLNode;

public class MyLinkedList<T> {
    private LLNode head;  // a reference to the first node in the list

    // Sets up an initially empty list.
    public MyLinkedList() {
        head = null;
    }

    // internal class
    private class LLNode {
        private T info;     // the element stored in the node
        private LLNode link;  // the reference to the next node in the list

        // Stores the element and sets the next reference to null.
        public LLNode(T element) {
            info = element;
            link = null;
        }
        
        public void setInfo(T info){ this.info = info;}

        public T getInfo(){ return info; }

        public void setLink(LLNode link){ this.link = link;}  

        public LLNode getLink(){ return link;} 

    }
    
    public String printList() {
    	LLNode current = head;
    	String str = "";

        while (current != null) {
            str = str + current.getInfo() + " ";
            current = current.getLink();
        }

        return str;
    }
    
    /**
     * Add the new element to the front of the linked list
     * @param elementToAdd info of new element
     */
    public void addToFront(T elementToAdd) {
    	LLNode newNode = new LLNode(elementToAdd);
    	
    	newNode.setLink(head);
    	head = newNode;
    }
    
    /**
     * Remove the first element from the linked list, if list is empty, remove nothing
     * @return value of last element
     */
    public T removeFromFront() 
    {
    	//check if list is empty if empty remove null else remove last element 
    	T elementRemoved = null;

        if (head != null)
        {
            elementRemoved = head.info;
            head = head.link;
        }

        return elementRemoved;   	
    }
    
    
    
    /**
     * Checking if a List Contains a Particular Element
     * @param element the target element 
     * @return return true when found
     */
    public boolean contains(T element) 
    {
    	LLNode current = head;

    	
    	//checking if the current list is empty 
        while (current != null && !current.getInfo().equals(element))
        {
            current = current.getLink();
        }

        return current != null;    
     }
    
    
    /**
     * Add the new element to the end of the linked list
     * @param elementToAdd info of new element
     */
    public void addToEnd(T elementToAdd) 
    {
    	LLNode current = head;
    	
    	LLNode newNode = new LLNode(elementToAdd);
    	
    		if(current == null)
    		{
    			head = newNode; 
    		}
    		else 
    		{

    			while(current.getLink() != null)
    			{
    				current = current.getLink(); //update to next
    			}
        		current.setLink(newNode);

    		}
    }
    
    /**
     * return the size of the linked list
     * @return number of elements
     */
    public int size() {
    	LLNode current = head;
    	int elemNum = 0;

        while (current != null)
        {
            current = current.getLink();
            elemNum++; 
        }

        System.out.println();
		return elemNum;
    }
    
    /**
     * Removing a Particular Element
     * @param elementToRemove the element we will remove
     * @return the removed element
     */
    public T removeElement(T elementToRemove) 
    {

    	T element = null;
    	//LLNode current = head;

    	// if head is not empty continue 
    	if(head != null)
    	{
    		if(head.getInfo() == elementToRemove)
    		{
    			element = removeFromFront();
    		}
    		else 
    		{    
    			LLNode previous = head;
                LLNode current = head.getLink();
    			
            	while (current != null && !current.getInfo().equals(elementToRemove))
            	{
            		current = current.getLink(); 
            		previous = previous.getLink(); 
            	}
            	if (current != null)  // the element was found
                {
                    element = current.getInfo();
                    previous.link = current.link;
                }

    		}

    
    	}
    	return element; 
       

  }
}

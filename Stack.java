/* @Author Shanto2005 */ 

public class Stack  {
    public Node Head;
    public int Size = 0;
    public Node LastNode;
    // Empty
    public  boolean isEmpty() {
        return Head == null;
    }
    // add 
    public void add(int data) {
         Node newNode = new Node(data);
         Size++;
        if(isEmpty()) {
            Head = newNode;
            LastNode = Head;
            return;
        }
        newNode.next = Head;
        Head = newNode;
    }
    // Pop
    public int pop() {
        if(isEmpty()) {
            return -1;
        }
        int Top = Head.data;
        Head = Head.next;
        Size--;
        return Top;
    }
    // peek
    public int peek() {
        if(isEmpty()) {
            return -1;
            
        }
        return Head.data;
    }
    // peek last
    public int peekLast() {
        if(isEmpty()) {
            return -1;
        }
        return LastNode.data;
    }
    /*     
    All methods
    add()
    pop()
    peek()
    peekLast()
    Size()
    
    */
}
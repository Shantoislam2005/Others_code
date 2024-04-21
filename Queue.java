/* @Author Shanto2005 */ 
public class Queue{
    public int [] q;
    public int frant = -1;
    public int rear = -1;
    public int size;
    
   public Queue(int n) {
       q = new int [n];
       this.size = n;
   }
    
    public boolean isEmpty() {
        return rear == -1 && frant == -1;
    }
    
    public boolean isFull() {
        return (rear + 1) % size == frant;
    }
    // Add element 
    public void add(int data) {
        if(isFull()) {
            Toast.showText("Queue full", 5);
            return;
        }
        if(frant == -1) {
            frant = 0;
        }
        rear = (rear + 1) % size;
        q[rear] = data;
    }
    // Delete element
    public int delete() {
        if (isEmpty()) {
            Toast.showText("Queue empty", 5) ;
            return -1;
        }
        int r = q[frant];
        if(rear == frant) {
            rear = frant = -1;
        } else {
            frant = (frant + 1) % size;
        }
        return r;
    } 
    
    // Peek element
    public int peek() {
        if(isEmpty()) {
            Toast.showText("Queue  full", 5);
            return -1;
        }
        return q[frant];
    }
}

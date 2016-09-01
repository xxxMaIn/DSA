package arrayqueue;

public class ArrayQueue {
    int QSIZE;
    private int rear = 0;
    private int front = 0;
    private int [] queue;
    private int nItems;
    int temp[] = new int[10];
    
    public ArrayQueue(int size) {
        QSIZE = size;
        queue = new int [QSIZE];
        }
   
    public void show() {
        for (int i = front; i < QSIZE; i++) {
            System.out.println("Queue [" + i + "] = " + queue[i] );
        }
        System.out.println();
    }
    
     public boolean isFull() {
            if (nItems == QSIZE) {
                System.out.println( " Queue is Full ");
                return true;
            }else {
                return false;
            }
        }
   
     public boolean isEmpty() {
            if (nItems == 0) {
                System.out.println("Queue is Empty");
                System.out.println();
                return true;
            }else {
                return false;
            }
        }        
        
    public void enqueue (int num) {
        rear=nItems;
        if (isFull()) {
            System.out.println("Failed to enqueue");
            System.out.println();
        }else{
            System.out.println("Trying to enqueue on Queue [" + rear + "]..");
            System.out.println();
            queue[nItems] = num;
            nItems++;
            System.out.println(num + " was Successfully Added. ");
            System.out.println();
        }
       
       }
    
    public void dequeue(){
        if (isEmpty()) {
            System.out.println("Failed to dequeue");
            System.out.println();
        }else{
            System.out.println("Trying to dequeue on Queue [" + (front) + "]..");
            System.out.println(queue[front] + " was successfully removed");
            System.out.println();
            queue[front] = 0;
            for (int i=0; i<front; i++) {
                queue[i] = queue[i+1];
                front--;
        }
    }
 }

    public void peekfront() {
        if (queue[front]==(queue[0])) {
            System.out.println("PEEK FRONT = " + queue[front]);
            System.out.println();
        }else {
            System.out.println("PEEK FRONT = " + queue[front - 1]);
            System.out.println();
        }
    }
    
    public void peekrear(){
        System.out.println("PEEK REAR = " + queue[rear]);
        System.out.println();
    }
  
        
    public static void main(String[] args) {
            ArrayQueue storage = new ArrayQueue(10);
            
            System.out.println("STORAGE CAPACITY [" + storage.QSIZE + "]");
            System.out.println();
                
            storage.show();
            storage.isEmpty();
            storage.enqueue(1);
            storage.enqueue(2);
            storage.enqueue(3);
            storage.enqueue(4);
            storage.enqueue(5);
            storage.enqueue(6);
            storage.show();
            storage.peekrear();
            storage.peekfront();
            storage.dequeue();
            storage.show();
            storage.enqueue(7);
            storage.enqueue(8);
            storage.enqueue(9);
            storage.enqueue(10);
            storage.enqueue(11);
            storage.show();
    }

}
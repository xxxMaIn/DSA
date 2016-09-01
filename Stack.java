
package stack;
public class Stack {
    
    int capacity;
    private int top = 0;
    private String[] storage;
    
    public Stack(int size) {
        capacity = size;
        storage = new String [capacity];
    }
    
    public void show() {
        for (int i = capacity-1; i >= 0; i--) {
            System.out.println("Stack [" + i + "] = " + storage[i] );
        }
        System.out.println();
    }
    
    private boolean isFull() {
        if (top == capacity) {
            System.out.println("Stack is Full");
            System.out.println();
            return true;
        } 
        return false;
    }
    
    private boolean isEmpty() {
        if (storage [0] == null ) {
            System.out.println("Stack is Empty");
            System.out.println();
            return true;
        }
        return false;
    }

    public void push(String value) {
        if (isFull()) {
            System.out.println("Failed to push!");
        }else {
            System.out.println("Trying to push on Stack [" + top + "]..");
            storage[top] = value;
            top++;
            System.out.println(value + " was Succesfully added. ");
            System.out.println();
        }
    }
    
    public void pop() {
        if (isEmpty()) {
            System.out.println("Failed to pop");
        }else{
            System.out.println("Trying to pop on Stack [" + (top-1) + "]..");
            storage[top] = null;
            top--;
            System.out.println(storage[top] + " was successfully removed");
            System.out.println();
        }
    }
    
    public void peek() {
        if (storage[top]==(storage[0])) {
            System.out.println("PEEK TOP = " + storage[top]);
            System.out.println();
        }else {
            System.out.println("PEEK TOP = " + storage[top]);
            System.out.println();
        }
    }
    
            
    public static void main(String[] args) {
        Stack storage = new Stack(10);
            System.out.println("STORAGE CAPACITY [" + storage.capacity + "]");
            System.out.println();
            
            storage.pop();
            storage.isEmpty();
            storage.peek();
            
            storage.push("1");
            storage.push("2");
            storage.push("3");
            storage.push("4");
            storage.show();
            storage.pop();
            storage.pop();
            storage.pop();
            storage.pop();
            storage.pop();
            storage.show();
    }
    
}
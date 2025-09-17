import java.util.LinkedList; 
import java.util.Queue; 
class StackUsingTwoQueues { 
    Queue<Integer> q1 = new LinkedList<>(); 
    Queue<Integer> q2 = new LinkedList<>(); 
    // Push operation 
    public void push(int x) { 
        q2.add(x); 
        while (!q1.isEmpty()) { 
            q2.add(q1.remove()); 
        } 
        Queue<Integer> temp = q1; 
        q1 = q2; 
        q2 = temp; 
    } 
    // Pop operation 
    public int pop() { 
        if (q1.isEmpty()) { 
            System.out.println("Stack is empty!"); 
            return -1; 
        } 
        return q1.remove(); 
    } 
 
   // Top operation 
    public int top() { 
        if (q1.isEmpty()) { 
            System.out.println("Stack is empty!"); 
            return -1; 
        } 
        return q1.peek(); 
    } 
    // isEmpty operation 
    public boolean isEmpty() { 
        return q1.isEmpty(); 
    } 
    public static void main(String[] args) { 
        StackUsingTwoQueues stack = new StackUsingTwoQueues(); 
        System.out.println("Pushing elements: 10, 20, 30"); 
        stack.push(10); 
        stack.push(20); 
        stack.push(30); 
        System.out.println("Top element: " + stack.top()); 
        System.out.println("Popping element: " + stack.pop()); 
        System.out.println("Top element after pop: " + stack.top()); 
        System.out.println("Is stack empty? " + stack.isEmpty()); 
        System.out.println("Popping remaining elements: " + stack.pop() + ", " + 
stack.pop()); 
        System.out.println("Is stack empty now? " + stack.isEmpty()); 
    } 
}

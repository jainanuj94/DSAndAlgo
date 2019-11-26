package stacksandqueues;
import java.util.Stack;

public class QueueWithStacks {

    public static class MyQueue<T>{
        private Stack<T> stackNewestOnTop = new Stack<>();
        private Stack<T> stackOldestOnTop = new Stack<>();

        public void enqueue(T value){
            stackNewestOnTop.push(value);
        }

        public T peek(){ //Get oldest item
            // Move elements from stackNewest to stackOldest
            shiftStacks();
            return stackOldestOnTop.peek();
            //move elements back -- what if we did't? - we need not do this
        }

        private void shiftStacks() {
            if(stackOldestOnTop.isEmpty()){
                while(!stackNewestOnTop.isEmpty()){
                    stackOldestOnTop.push(stackNewestOnTop.pop());
                }
            }
        }

        public T dequeue(){ //Get oldest item and remove it
            // Move elements from stackNewest to stackOldest
            shiftStacks();
            return stackOldestOnTop.pop();
            //move elements back - what if we did't? - we need not to this
        }
    }

    public static void main(String[] args) {

    }
}

// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no

import java.util.Stack;

class MyQueue {

    /** Initialize your data structure here. */
    Stack s1,s2;
    public MyQueue() {
        s1 = new Stack();
        s2 = new Stack();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        s1.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int popElement;
        if(s1.empty()==true){
            return 0;
        }else{
            while (!s1.isEmpty()) 
        {  
            s2.push(s1.pop());  
            //s1.pop();  
        }  
        popElement = (int) s2.pop();

        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return popElement;
        }
        
    }
    
    /** Get the front element. */
    public int peek() {
        int peekElement;
        if(s1.empty()==true){
            return 0;
        }else{
            while (!s1.isEmpty()) 
        {  
            s2.push(s1.pop());  
            //s1.pop();  
        }  
        peekElement = (int) s2.peek();

        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return peekElement;
        }
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
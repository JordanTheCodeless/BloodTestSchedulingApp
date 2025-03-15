/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author jordancarthy
 */
public interface StackInterface {
    //This is the Stack interface that will hold the methods for the Stack 
    public boolean isEmpty();
    public Object pop();
    public Object recursivePop(int n);// will use this recursive method
    public boolean isFull();
    public void push(Object newItem);
    public int size();
    
        
        
}

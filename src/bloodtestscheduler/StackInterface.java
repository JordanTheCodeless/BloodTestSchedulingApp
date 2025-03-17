/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author jordancarthy 14/03/2025 StackInterface 1.0
 */
public interface StackInterface {
    //This is the Stack interface that will hold the methods for the Stack 
    public boolean isEmpty();
    public Object pop();
    public boolean isFull();
    public void push(Patient newItem);
    public int size();
    
        
        
}

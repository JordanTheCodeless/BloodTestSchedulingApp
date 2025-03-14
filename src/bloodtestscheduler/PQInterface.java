/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author jordancarthy
 * 14/03/2025
 * PQInterface 1.0
 */
public interface PQInterface {
    //Interface will hold the methods the PriorityQueue will need to implement
    public void enqueue(int priority, Patient element);// Add to queue
    public int size(); // check queue size
    public boolean isEmpty(); 
    public Object dequeue(); // remove from front of queue
    public String displayQ(); // print queue
    
}

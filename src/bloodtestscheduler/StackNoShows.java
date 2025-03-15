/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

import java.util.ArrayList;

/**
 *
 * @author jordancarthy
 */
public class StackNoShows implements StackInterface {

    // Will make it an array list of type Patient
    public ArrayList<Patient> noShowers;

    // constructor
    public StackNoShows() {
        noShowers = new ArrayList<>();
    }

    @Override
    public int size() {
        return noShowers.size();
    }

    @Override
    public boolean isEmpty() {
        return noShowers.isEmpty();

    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void push(Object newItem) {
        noShowers.add(0, (Patient) newItem);
    }

    @Override
    public Object pop() {
        if (!noShowers.isEmpty()) {
            return noShowers.remove(0);
        } else {
            return null;
        }
    }

    public void emptyStack() {
        while (!noShowers.isEmpty()) {
            System.out.println("Popping" + pop());

        }
    }
    
    // This will be my recursive method with the pop function this will help show the last 5 noShows in the main app
    @Override
    public Object recursivePop(int n) {
        if (n <= 0 || noShowers.isEmpty()) { // first base case
            return null;
        }
        if (n == 1) { // n is 1 we can only pop one
            return noShowers.remove(0);
        }
        noShowers.remove(0);
        return recursivePop(n - 1);
    }

}

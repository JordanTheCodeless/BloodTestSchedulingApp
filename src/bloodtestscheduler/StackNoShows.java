/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author jordancarthy 14/03/2024 StackNoShows 1.0
 */
public class StackNoShows implements StackInterface, Serializable {

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
    public void push(Patient newItem) {
        noShowers.add(0, newItem);
    }

    @Override
    public Object pop() {
        if (!noShowers.isEmpty()) {
            return noShowers.remove(0);
        } else {
            return null;
        }
    }

    public String emptyStack() {
        String concat = "";
        while (!noShowers.isEmpty()) {
            concat += "Popping " + noShowers.get(0).getName() + "\n";
            pop();

        }
        return concat;

    }

    public String lastFiveNoShows(int n) {
        String concat;

        // Base cases 
        if (noShowers.isEmpty() || n >= noShowers.size() || n >= 5 || noShowers.get(n) == null) {
            concat = "";
        } else {
            concat = "\n---------- no show " + (n+1) + "-------\n"+ noShowers.get(n).printPatient() + lastFiveNoShows(n + 1);

        }
        return concat;
    }

}

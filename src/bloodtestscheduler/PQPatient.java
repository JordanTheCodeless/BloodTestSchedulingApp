/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author jordancarthy 14/03/2025 PQPatient 1.0
 */
//We will override the abstract methods by implementing the PQInterface
public class PQPatient implements PQInterface, Serializable {

    // create instance of PQ with ArrayList with generic of our patient
    ArrayList<Patient> patientList;

    public PQPatient() {
        patientList = new ArrayList<>();
    }

    // return size of queue
    public int size() {
        return patientList.size();
    }

    // This will help when deciding on the position the element will be placed in the queue
    public boolean isEmpty() {
        return patientList.isEmpty();
    }

    // Will need to remove the object from the front of the queue
    public Patient dequeue() {
        if (!patientList.isEmpty()) {
            return patientList.remove(0);
        } else {
            return null;
        }
    }

    // Will need to implement a method for inserting based on priority was going to use comparator but for the cause of understanding insertion will implement a  different method similar to one displayed in class , // The current index I will put at the end of the list since im only working with three priorities and to ensure that the FIFO structure holds I will iterate backwards
    public int findPriorityPos(int tempKey, int ageKey, String status) {
        Patient temp;
        int currentIndex = patientList.size() - 1;// we will start at last item
        while (currentIndex >= 0) {
            temp = patientList.get(currentIndex); // assigning temp to last 
            if (temp.getPriority() > tempKey) { // checking priority of tempkey later
                currentIndex--;
            } else if (temp.getPriority() == tempKey && temp.getAge() < ageKey) {
                currentIndex--;
            } else if (temp.getPriority() == tempKey && temp.getAge() == ageKey && status.equals("true") && temp.getHospitalWard().equals("false")) {
                currentIndex--;
            } else {
                return currentIndex + 1; // this ensures its added after the one that is equal
            }
        }
        return 0;
    }

    // adding to the queue based off priority
    public void enqueue(int priorityKey,int ageKey,String status, Patient thisPatient) {
        // Create temp patient filling out default,
        // used idea from class code due to uncertainty of how it will perform in the GUI @author E.Thornbury
        Patient temp = new Patient(thisPatient.getName(), thisPatient.getAge(), thisPatient.getPriority(),thisPatient.getHospitalWard(), thisPatient.getGpName());
        int index = findPriorityPos(priorityKey,ageKey,status);
        if (index > size()) {
            patientList.add(temp);
        } else {
            patientList.add(index, temp);
        }
    }

    //Will display message with this method 
    public String displayQ() {
        String displayString = "";
        if (patientList.isEmpty()) {
            return "\nNo patients to display currently";
        } else {
            for (Patient temp : patientList) {
                displayString += temp.printPatient();
            }
            return displayString;
        }
    }
}

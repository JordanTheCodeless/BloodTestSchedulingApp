/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

import java.io.Serializable;

/**
 *
 * @author jordancarthy
 * 
 */
/*save patients by making Patient Serializable*/
public class Patient implements Serializable {

    // Declare my variables for patient 
    private String name, gpName;
    private int age, priority;
    private  String hospitalWard;

    // Create my Constructor 
    public Patient(String name, int age, int priority,String hospitalWard, String gpName) {
        this.name = name;
        this.age = age;
        this.priority = priority;
        this.gpName = gpName;
        this.hospitalWard = hospitalWard;
    }
    // Getters + setters most important *getPriority()*

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getGpName() {
        return gpName;
    }

    public void setGpName(String gpName) {
        this.gpName = gpName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
    public void setHospitalWard(String hospitalWard){
        this.hospitalWard = hospitalWard;// Couldnt put this.hospitalWard didnt get any info from netbeans either to check documentation
    }
    public String getHospitalWard(){
        return hospitalWard;
    }
    // Method to out put string , Currently have priority as an int for Comparison in pQueue.
    public String priorityToString() {
        if (priority == 1) {
            return "Urgent";
        } else if (priority == 2) {
            return "Medium";
        } else {
            return "Low";
        }
    }
//    Print Patient will use line breaks for readability in gui
    public String printPatient(){
        return "Patient : " + name + "\nAge : " + age + "\nPriority : " + priorityToString() + "\nHospital Bound : " + hospitalWard + "\nGP : " + gpName + "\n";
    }
    
public String basicPrint(){
    return "Patient : " + name + "\nAge : " + age + "\nGP : " + gpName + "\n";
}
}

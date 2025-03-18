/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author jordancarthy 17/03/2024
 */
public class BloodTestSchedulerApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        // Testing that functionality is working with different instances 
        // Priority Queue
        PQPatient testQueue = new PQPatient();
        // StackNoShow Stack
        StackNoShows testStack = new StackNoShows();
        // Patient One
        Patient patientOne = new Patient("Jordan",19,1,"true","Murphy");
        // Patient Two
         Patient patientTwo = new Patient("James",30,1,"false","Doctor");
         // Patient Three
        Patient patientThree = new Patient("Jake",35,3,"true","Doctor");
        // Patient Four
         Patient patientFour = new Patient("Javier",20,2,"true","Doctor");
         // Patient 5
         Patient patientFive = new Patient("Jacob",28,1,"false","Doctor");
        // adding patients to PQueue
        testQueue.add(patientOne.getPriority(), patientOne.getAge(), patientOne.getHospitalWard(), patientOne);
        
        testQueue.add(patientTwo.getPriority(), patientTwo.getAge(), patientTwo.getHospitalWard(), patientTwo);
        
         testQueue.add(patientThree.getPriority(), patientThree.getAge(), patientThree.getHospitalWard(), patientThree);
         
         testQueue.add(patientFour.getPriority(), patientFour.getAge(), patientFour.getHospitalWard(), patientFour);
         
          testQueue.add(patientFive.getPriority(), patientFive.getAge(), patientFive.getHospitalWard(), patientFive);
         
        // This dis[plays the Priority queue in order
         System.out.println(testQueue.displayQ());
         
         // adding users to no show from priority queue
         while(!testQueue.isEmpty()){
         Patient tester = testQueue.poll();// poll method from queue removes front
         testStack.push(tester);
         }
//         testStack.push(patientThree);
//         testStack.push(patientOne);
//         testStack.push(patientFour);
//         testStack.push(patientOne);
         // recursive method to show last five in  stack which is all
         System.out.println(testStack.lastFiveNoShows(0));
         // empty stack 
         System.out.println(testStack.emptyStack());
         // will add someone back to priority queue and peek just to make sure 
           testQueue.add(patientFive.getPriority(), patientFive.getAge(), patientFive.getHospitalWard(), patientFive);
           // using peek method should display jacob
           System.out.println(testQueue.peek().getName());
           // check if is Empty stack should return true 
           System.out.println(testStack.isEmpty()); 
          
        
        BloodTestSchedulerGUI mainGui = new BloodTestSchedulerGUI();
        mainGui.setVisible(true);
    }
    
}

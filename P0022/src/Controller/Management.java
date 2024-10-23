/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.*;
import Utility.Validation;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Calendar;
/**
 *
 * @author HP
 */
public class Management {
    private final Validation val = new Validation();
    private final ArrayList<Candidate> canList = new ArrayList<>();
    
    private boolean checkEmpty() {
        return canList.isEmpty();
    }
    
    private String uniqueID() {
        while (true) {
            String id = val.checkID("Enter Candidate ID (unique): ");       
            if (checkEmpty()) {
                return id;
            }        
            boolean isUnique = true;
            for (Candidate cd : canList) {
                if (cd.getId().equals(id)) {
                    System.err.println("This ID already exists.");
                    isUnique = false;
                    break;
                }
            }        
            if (isUnique) {
                return id;
            }
        }
    }
    
    public void newCandidate(int type) {
        while(true) {
            System.out.println("New Candidate:  ");
            String id = uniqueID();
            String firstName = val.checkStringName("Enter Candidate first Name: ");
            String lastName = val.checkStringName("Enter Candidate last Name: ");
            int birthdDate = val.checkInteger("Enter birth year: ", 1900, Calendar.getInstance().get(Calendar.YEAR));
            String address = val.checkStringName("Enter address: ");
            String phone = val.checkPhoneNumber("Enter Phone number: ");
            String email = val.checkValidEmail("Enter Candidate Email: ");
        
            Candidate candidate = new Candidate(id, firstName, lastName, birthdDate, address, phone, email, type);
            switch (type) {
                case 0:
                    newExperince(candidate);
                    break;
                case 1:
                    newFresher(candidate);
                    break;
                case 2:
                    newInternship(candidate);
                    break;
            }
            boolean cmd = val.checkYN("Do you want to continue to enter a new Candidate (Y/N): ");
            if(!cmd) {
                System.out.println("Exiting...");
                return;
                }
            }
        }  
    
    public void newExperince(Candidate c) {
        int expY = val.checkExperince(c.getBirthDate());
        String proSkill = val.checkStringName("Enter professional skill of Experinced: ");
        Experince ex = new Experince(c.getId(), c.getFirstName(), c.getLastName(), c.getBirthDate(), 
                c.getAddress(), c.getPhone(), c.getEmail(), c.getCandidateType(), expY, proSkill);
        canList.add(ex);
        System.out.println("Experinced Candidate added successfully.");
    }
    
    public void newFresher(Candidate c) {
        int graY = val.checkInteger("Enter Graduation year: ", 1900+c.getBirthDate(), 
                Calendar.getInstance().get(Calendar.YEAR));
        String graRank = val.checkGraduationRank("Enter graduation Rank(Excellent, Good, Fair, Poor): ");
        String education = val.checkStringName("Enter graduated College: ");
        Fresher fr = new Fresher(c.getId(), c.getFirstName(), c.getLastName(), c.getBirthDate(), 
                c.getAddress(), c.getPhone(), c.getEmail(), c.getCandidateType(), graY, graRank, education);
        canList.add(fr);
        System.out.println("Fresher Candidate added successfully.");
    }
    
    public void newInternship(Candidate c) {
        String major = val.checkStringName("Internship Major: ");
        String semester = val.checkStringName("Enter Semester: ");
        String university = val.checkStringName("Internship from University: ");
        Internship ins = new Internship(c.getId(), c.getFirstName(), c.getLastName(), c.getBirthDate(), 
                c.getAddress(), c.getPhone(), c.getEmail(), c.getCandidateType(), major, semester, university);
        canList.add(ins);
        System.out.println("Intern Candidate added successfully.");
    }
    
    public void searchCandidate() {
        if(checkEmpty()) {
            System.out.println("The List is empty.");
            return;
        }
        displayCandidateList();
        boolean found = false;
        String name = val.checkStringName("Enter first name, last name or full name of Candidate: ");
        int type = val.checkInteger("Enter Candidate type: ", 0, 2);
        for(Candidate c : canList) {
            String fullname = c.getFirstName() + " " + c.getLastName();
            if(type == c.getCandidateType() && (c.getFirstName().equalsIgnoreCase(name) ||
                    c.getLastName().equalsIgnoreCase(name) || fullname.equalsIgnoreCase(name)
                    || fullname.contains(name) ) ) {
                System.out.println(c);
                found = true;
            }
        }
        if(!found) {
            System.out.println("Can not found Candidate name " + name + " of type " + type);
        }
        System.out.println("");
    }
    
    public void displayCandidateList() {
        if(checkEmpty()) {
            System.out.println("The List is empty.");
            return;
        }
        boolean exp = false;
        boolean fres = false;
        boolean inte = false;
        
        System.out.println("1. Experinced Candidate:");
        for(Candidate c : canList) {
            if(c instanceof Experince) {
                System.out.println(c.getFirstName() + " " + c.getLastName());
                exp = true;
            }
        }
        if(!exp) {
            System.out.println("No Experinced Candidate found.");
        }
        
        System.out.println("2. Fresher Candidate:");
        for(Candidate c : canList) {
            if(c instanceof Fresher) {
                System.out.println(c.getFirstName() + " " + c.getLastName());
                fres = true;
            }
        }
        if(!fres) {
            System.out.println("No Fresher Candidate found.");
        }
        
        System.out.println("3. Intern Candidate:");
        for(Candidate c : canList) {
            if(c instanceof Internship) {
                System.out.println(c.getFirstName() + " " + c.getLastName());
                inte = true;
            }
            if(!inte) {
            System.out.println("No Internship Candidate found.");
            }
        }
        
        System.out.println("");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utility;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Validation {
    private final Scanner sc = new Scanner(System.in);
    private final String regex1 = "[A-Za-z0-9\\s]+";
    private final String regex2 = "[A-Za-z\\s\\,]+";
    private final String EMAIL = "^[A-Za-z0-9]+@[A-Za-z.]+\\.[A-Za-z]{2,4}$";
    private final String PHONE = "[0-9]+";
    
    public String checkID(String msg) {
        while(true) {
            System.out.print(msg);
            String s = sc.nextLine().trim();
            if(s.isEmpty()) {
                System.err.println("String cannot be empty");
            } else if(s.matches(regex1)) {
                return s;
            } else {
                System.err.println("Invalid input. Only letters, digits, and spaces allowed.");
            }
        }
    }
    
    public String checkStringName(String msg) {
        while(true) {
            System.out.print(msg);
            String s = sc.nextLine().trim();
            if(s.isEmpty()) {
                System.err.println("String cannot be empty");
            } else if(s.matches(regex2)) {
                return s;
            } else {
                System.err.println("Invalid input. Only letters, digits, and spaces allowed.");
            }
        }
    }
    
    public int checkInteger(String mess, int min, int max) {
        while(true) {
            System.out.print(mess);
            String input = sc.nextLine().trim();
            if(input.isEmpty()) {
            System.err.print("Input can not be empty.");          
            }
            else{
                try{
                    int n = Integer.parseInt(input);
                    if(n > max || min > n) {
                        System.err.println("Only permits Integer in range " + min + " to " + max);
                        continue;
                    }
                    return n;
                }
                catch(NumberFormatException e) {
                    System.err.println("Invalid Input Format. Only Intger number (digits) is permitted.");
                }
            }
        }
    }
    
    public boolean checkYN(String msg) {
        while(true) {
            System.out.print(msg);
            String s = sc.nextLine().trim();
            if(s.isEmpty()) {
                System.err.println("Answer cannot be empty");
            } else if(s.equalsIgnoreCase("yes") || s.equalsIgnoreCase("Y")) {
                return true;
            } else if(s.equalsIgnoreCase("no") || s.equalsIgnoreCase("N")) {
                return false;
            } else {
                System.err.println("Invalid input. Only enter (Yes/No or Y/N)");
            }
        }
    }
    
    public String checkPhoneNumber(String msg) {
        while(true) {
            System.out.print(msg);
            String s = sc.nextLine().trim();
            if(s.isEmpty()) {
                System.err.println("Phone number cannot be empty");
            } else 
                if(s.matches(PHONE) && s.length() >= 10) {
                return s;
                }
                else if(s.length() < 10) {
                    System.err.println("The Phone number must consist of at least 10 digits.");
                }
                else {
                System.err.println("Invalid input. Only digits sre allowed.");
            }
        }
    }
    
    public String checkValidEmail(String msg) {
        while(true) {
            System.out.print(msg);
            String s = sc.nextLine().trim();
            if(s.isEmpty()) {
                System.err.println("Email cannot be empty");
            } else if(s.matches(EMAIL)) {
                return s;
            } else {
                System.err.println("Invalid input. Only permit <name>@<domain>.");
            }
        }
    }
    
    public String checkGraduationRank(String msg) {
        while(true) {
            System.out.print(msg);
            String s = sc.nextLine().trim();
            if(s.isEmpty()) {
                System.err.println("Input can not br empty");
            }
            else{
                if(s.equalsIgnoreCase("Excellent") || s.equalsIgnoreCase("Good") ||
                    s.equalsIgnoreCase("Fair") || s.equalsIgnoreCase("Poor")) {
                    return s;
                }
                else {
                    System.err.println("There is 4 types: Excellent, Good, Fair, Poor.");
                }
            }
        }
    }
    
    public int checkExperince(int birthDate) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = currentYear - birthDate;
        int expYear = checkInteger("Years of Experince: ", 0, age);
        return expYear;
    }
}

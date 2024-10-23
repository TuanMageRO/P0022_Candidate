/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Utility.Validation;
/**
 *
 * @author HP
 */
public class UI {
    Validation val = new Validation();
    
    public int menu() {
        System.out.println("======Main Menu======");
        System.out.println("1.Experince");
        System.out.println("2.Fresher");
        System.out.println("3.Internship");
        System.out.println("4.Search Candidate");
        System.out.println("5.Exit");
        int choice = val.checkInteger("Enter your choice: ", 1, 5);
        return choice;
    }
}

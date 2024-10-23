/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author HP
 */
public class Fresher extends Candidate{
    private int graduationDate;
    private String graduationRank;
    private String education;

    public Fresher() {
    }

    public Fresher(int graduationDate, String graduationRank) {
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
    }

    public Fresher(String id, String firstName, String lastName, int birthDate, String address, String phone, 
            String email, int candidateType, int graduationDate, String graduationRank, String education) {
        super(id, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public int getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(int graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
    
}

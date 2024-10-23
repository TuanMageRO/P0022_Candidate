/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author HP
 */
public class Experince extends Candidate {
    private int yearOfExperince;
    private String professionalSkill;

    public Experince() {
    }

    public Experince(int yearOfExperince, String professionalSkill) {
        this.yearOfExperince = yearOfExperince;
        this.professionalSkill = professionalSkill;
    }

    public Experince( String id, String firstName, String lastName, int birthDate, String address,
            String phone, String email, int candidateType, int yearOfExperince, String professionalSkill) {
        super(id, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.yearOfExperince = yearOfExperince;
        this.professionalSkill = professionalSkill;
    }

    public int getYearOfExperince() {
        return yearOfExperince;
    }

    public void setYearOfExperince(int yearOfExperince) {
        this.yearOfExperince = yearOfExperince;
    }

    public String getProfessionalSkill() {
        return professionalSkill;
    }

    public void setProfessionalSkill(String professionalSkill) {
        this.professionalSkill = professionalSkill;
    }
    
    
}

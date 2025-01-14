/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author HP
 */
public class Internship extends Candidate {
    private String major;
    private String semester;
    private String university;

    public Internship() {
    }

    public Internship(String major, String semester, String university) {
        this.major = major;
        this.semester = semester;
        this.university = university;
    }

    public Internship(String id, String firstName, String lastName, int birthDate, String address, String phone,
            String email, int candidateType, String major, String semester, String university) {
        super(id, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.major = major;
        this.semester = semester;
        this.university = university;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
    
    
}

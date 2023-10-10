package Candidate;

import java.util.Date;
public class FresherCandidate extends Candidate {
    private Date graduationDate;
    private String graduationRank;
    private String education;

    public FresherCandidate(int candidateId, String firstName, String lastName, Date birthDate, String address, String phone, String email, Date graduationDate, String graduationRank, String education) {
        super(candidateId, firstName, lastName, birthDate, address, phone, email, 1);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    // Getters and setters for additional attributes

    public Date getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(Date graduationDate) {
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

    @Override
    public String toString() {
        return super.toString() + " | " + graduationDate + " | " + graduationRank + " | " + education;
    }
    
}

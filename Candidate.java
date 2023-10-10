package Candidate;
import java.util.Date;

public class Candidate {
    
     private int candidateId;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String address;
    private String phone;
    private String email;
    private int candidateType;

    public Candidate(int candidateId, String firstName, String lastName, Date birthDate, String address, String phone, String email, int candidateType) {
        this.candidateId = candidateId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.candidateType = candidateType;
    }

   
    public int getCandidateId() {
        return candidateId;
    }

    public int getCandidateType() {
        return candidateType;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return getFullName() + " | " + birthDate + " | " + address + " | " + phone + " | " + email + " | " + candidateType;
    }
}
    


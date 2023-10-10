package Candidate;
import java.util.Date;

public class ExperienceCandidate extends Candidate {
    
    private int expInYear;
    private String proSkill;

    public ExperienceCandidate(int candidateId, String firstName, String lastName, Date birthDate, String address, String phone, String email, int expInYear, String proSkill) {
        super(candidateId, firstName, lastName, birthDate, address, phone, email, 0);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    // Getters and setters for additional attributes

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return super.toString() + " | " + expInYear + " | " + proSkill;
    }
}

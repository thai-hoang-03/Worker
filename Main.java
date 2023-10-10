import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Candidate> candidates = new ArrayList<>();

        while (true) {
            System.out.println("CANDIDATE MANAGEMENT SYSTEM");
            System.out.println("1. Experience");
            System.out.println("2. Fresher");
            System.out.println("3. Internship");
            System.out.println("4. Searching");
            System.out.println("5. Exit");
            System.out.print("Please choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    candidates.add(createExperienceCandidate(scanner));
                    break;
                case 2:
                    candidates.add(createFresherCandidate(scanner));
                    break;
                case 3:
                    candidates.add(createInternCandidate(scanner));
                    break;
                case 4:
                    searchCandidates(scanner, candidates);
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static ExperienceCandidate createExperienceCandidate(Scanner scanner) {
        System.out.print("Enter Candidate Id: ");
        int candidateId = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Birth Date (yyyy): ");
        String birthDate = scanner.next();

        System.out.print("Enter Address: ");
        String address = scanner.next();
        scanner.nextLine();  // Consume the newline character

        System.out.print("Enter Phone: ");
        String phone = scanner.next();

        System.out.print("Enter Email: ");
        String email = scanner.next();

        System.out.print("Enter Years of Experience: ");
        int expInYear = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        System.out.print("Enter Professional Skill: ");
        String proSkill = scanner.nextLine();

        return new ExperienceCandidate(candidateId, firstName, lastName, birthDate, address, phone, email, expInYear, proSkill);
    }

    private static FresherCandidate createFresherCandidate(Scanner scanner) {
        System.out.print("Enter Candidate Id: ");
        int candidateId = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Birth Date (yyyy): ");
        String birthDate = scanner.next();

        System.out.print("Enter Address: ");
        String address = scanner.next();
        scanner.nextLine();  // Consume the newline character

        System.out.print("Enter Phone: ");
        String phone = scanner.next();

        System.out.print("Enter Email: ");
        String email = scanner.next();

        System.out.print("Enter Graduation Date (yyyy): ");
        String graduationDate = scanner.next();

        System.out.print("Enter Graduation Rank (Excellence/Good/Fair/Poor): ");
        String graduationRank = scanner.next();

        System.out.print("Enter University where Student Graduated: ");
        String education = scanner.next();
        scanner.nextLine();  // Consume the newline character

        return new FresherCandidate(candidateId, firstName, lastName, birthDate, address, phone, email, graduationDate, graduationRank, education);
    }

    private static InternCandidate createInternCandidate(Scanner scanner) {
        System.out.print("Enter Candidate Id: ");
        int candidateId = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Birth Date (yyyy): ");
        String birthDate = scanner.next();

        System.out.print("Enter Address: ");
        String address = scanner.next();
        scanner.nextLine();  // Consume the newline character

        System.out.print("Enter Phone: ");
        String phone = scanner.next();

        System.out.print("Enter Email: ");
        String email = scanner.next();

        System.out.print("Enter Majors: ");
        String majors = scanner.next();
        scanner.nextLine();  // Consume the newline character

        System.out.print("Enter Semester: ");
        String semester = scanner.next();
        scanner.nextLine();  // Consume the newline character

        System.out.print("Enter University Name: ");
        String universityName = scanner.nextLine();

        return new InternCandidate(candidateId, firstName, lastName, birthDate, address, phone, email, majors, semester, universityName);
    }

    private static void searchCandidates(Scanner scanner, ArrayList<Candidate> candidates) {
        System.out.print("Input Candidate name (First name or Last name): ");
        String searchName = scanner.next();

        System.out.print("Input type of candidate (0: Experience, 1: Fresher, 2: Intern): ");
        int searchType = scanner.nextInt();

        System.out.println("The candidates found:");
        for (Candidate candidate : candidates) {
            if ((candidate.getCandidateType() == searchType) && (candidate.getFullName().toLowerCase().contains(searchName.toLowerCase()))) {
                System.out.println(candidate.toString());
            }
        }
    }
}

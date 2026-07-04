package Main.java.oops_practice.oops_pratices.org.example.gcr_codebase.Polymorphism;

class LibraryMember {

    String memberName;
    String memberId;

    public LibraryMember(String memberName, String memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
    }

    public double calculateFine(int overdueDays) {
        return 0;
    }

    public void printDetails() {
        System.out.println("Member Name : " + memberName);
        System.out.println("Member ID   : " + memberId);
    }
}

class StudentMember extends LibraryMember {

    public StudentMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays * 2;
    }
}

class FacultyMember extends LibraryMember {

    public FacultyMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays * 1;
    }
}

class GuestMember extends LibraryMember {

    public GuestMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays * 5;
    }
}

public class LibraryMemberDemo {

    public static void main(String[] args) {

        LibraryMember[] members = {
                new StudentMember("Nitin", "S101"),
                new FacultyMember("Rahul", "F201"),
                new GuestMember("Priya", "G301"),
                new StudentMember("Aman", "S102")
        };

        int overdueDays = 4;

        System.out.println("Library Members:\n");

        for (LibraryMember member : members) {

            member.printDetails();

            System.out.println("Fine: ₹" + member.calculateFine(overdueDays));
            System.out.println();
        }

        String searchId = "G301";

        System.out.println("Searching for Member ID: " + searchId);

        boolean found = false;

        for (LibraryMember member : members) {
            if (member.memberId.equals(searchId)) {
                System.out.println("\nMember Found:");
                member.printDetails();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Member not found.");
        }
    }
}
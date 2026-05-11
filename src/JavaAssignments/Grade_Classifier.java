package JavaAssignments;

public class Grade_Classifier {
    public static void main(String[] args) {
        int marks = 82;

        System.out.println("marks obtained:" + marks);

        if (marks >= 90 && marks <= 100) {
            System.out.println("obtained grade : O(Outstanding)");
        } else if (marks >= 75) {
            System.out.println("Obtained grade : A");
        } else if (marks >= 60) {
            System.out.println("Obtained grade : B");
        } else if (marks >= 45) {
            System.out.println("obtained grade : C");
        } else if (marks < 45) {
            System.out.println("Obtained grade : fail");
        }


    }
}

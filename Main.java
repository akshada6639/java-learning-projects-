
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Student Placement Tracker =====");

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your skill: ");
        String skill = sc.nextLine();

        System.out.print("Enter total topics: ");
        int totalTopics = sc.nextInt();

        System.out.print("Enter completed topics: ");
        int completedTopics = sc.nextInt();
        
if (totalTopics <= 0 || completedTopics < 0 || completedTopics > totalTopics) {
    System.out.println("Invalid topic count!");
} else {
    double progress = (completedTopics * 100.0) / totalTopics;

    System.out.println("\n===== Your Progress =====");
    System.out.println("Student Name: " + name);
    System.out.println("Skill: " + skill);
    System.out.println("Total Topics: " + totalTopics);
    System.out.println("Completed Topics: " + completedTopics);
    System.out.println("Remaining Topics: " + (totalTopics - completedTopics));
    System.out.println("Progress: " + progress + "%");

    if (progress == 0) {
        System.out.println("Status: Not Started");
    } else if (progress < 100) {
        System.out.println("Status: In Progress");
    } else {
        System.out.println("Status: Completed");
    }
}

        sc.close();
    }
}



public class Main {
    public static void main(String args []){
        System.out.println("Hello, GitHub!");
        System.out.println("I am learning learning Git and GitHub.");
        System.out.println("My will build projects for my internship.");
    }
}

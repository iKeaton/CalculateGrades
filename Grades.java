/**
 * A program that will calculate the total points 
 * and average grade each time a new score is added to the total.
 * 
 * @author Keaton M.
 * @version October 5, 2022
 */

public class Grades {
    public static void main(String[ ] args)
    {
        // Local Variables
        int numTests = 0;      // counts number of tests
        int testGrade = 0;     // individual test grade
        int totalPoints = 0;   // total points for all tests
        double average = 0.0;  // average grade
        
        // Calculate First Test
        testGrade = 95;
        totalPoints += testGrade;
        numTests++;
        average = ((double)totalPoints / (double)numTests);
        System.out.print("Test # " + numTests + "  ");
        System.out.print("Test Grade: " + testGrade + "  ");
        System.out.print("Total Points: " + totalPoints + "   ");
        System.out.println("Average Score: " + average);

        // Calculate Second Test
        testGrade = 73;
        totalPoints += testGrade;
        numTests++;
        average = ((double)totalPoints / (double)numTests);
        System.out.print("Test # " + numTests + "  ");
        System.out.print("Test Grade: " + testGrade + "  ");
        System.out.print("Total Points: " + totalPoints + "  ");
        System.out.println("Average Score: " + average);

        // Calculate Third Test
        testGrade = 91;
        totalPoints += testGrade;
        numTests++;
        average = ((double)totalPoints / (double)numTests);
        System.out.print("Test # " + numTests + "  ");
        System.out.print("Test Grade: " + testGrade + "  ");
        System.out.print("Total Points: " + totalPoints + "  ");
        System.out.println("Average Score: " + average);

        // Calculate Fourth Test
        testGrade = 82;
        totalPoints += testGrade;
        numTests++;
        average = ((double)totalPoints / (double)numTests);
        System.out.print("Test # " + numTests + "  ");
        System.out.print("Test Grade: " + testGrade + "  ");
        System.out.print("Total Points: " + totalPoints + "  ");
        System.out.println("Average Score: " + average);

        // Five Extra Tests //

        // Calculate Fifth Test
        testGrade = 76;
        totalPoints += testGrade;
        numTests++;
        average = ((double)totalPoints / (double)numTests);
        System.out.print("Test # " + numTests + "  ");
        System.out.print("Test Grade: " + testGrade + "  ");
        System.out.print("Total Points: " + totalPoints + "  ");
        System.out.println("Average Score: " + average);

        // Calculate Sixth Test
        testGrade = 85;
        totalPoints += testGrade;
        numTests++;
        average = ((double)totalPoints / (double)numTests);
        System.out.print("Test # " + numTests + "  ");
        System.out.print("Test Grade: " + testGrade + "  ");
        System.out.print("Total Points: " + totalPoints + "  ");
        System.out.println("Average Score: " + average);

        // Calculate Seventh Test
        testGrade = 94;
        totalPoints += testGrade;
        numTests++;
        average = ((double)totalPoints / (double)numTests);
        System.out.print("Test # " + numTests + "  ");
        System.out.print("Test Grade: " + testGrade + "  ");
        System.out.print("Total Points: " + totalPoints + "  ");
        System.out.println("Average Score: " + average);

        // Calculate Eighth Test
        testGrade = 63;
        totalPoints += testGrade;
        numTests++;
        average = ((double)totalPoints / (double)numTests);
        System.out.print("Test # " + numTests + "  ");
        System.out.print("Test Grade: " + testGrade + "  ");
        System.out.print("Total Points: " + totalPoints + "  ");
        System.out.println("Average Score: " + average);

        // Calculate Ninth Test
        testGrade = 87;
        totalPoints += testGrade;
        numTests++;
        average = ((double)totalPoints / (double)numTests);
        System.out.print("Test # " + numTests + "  ");
        System.out.print("Test Grade: " + testGrade + "  ");
        System.out.print("Total Points: " + totalPoints + "  ");
        System.out.println("Average Score: " + average);
    }
}

/** Ex. 6.28 Grades class
 * Reads a student average from the user and displays the grade
 */
import java.util.Scanner;
public class Grades {

     public static void main(String[] args){

      Scanner input = new Scanner(System.in);

      System.out.println("Please enter a student's average: ");
      int newGrade = input.nextInt();
      while (newGrade<0 || newGrade>100){
         System.out.println("Invalid input");
         System.out.println("Please enter a student's average: ");
         newGrade = input.nextInt();
       }
      System.out.printf("Point is: %d\n", qualityPoints (newGrade));
   }
    public static int qualityPoints (int grade) {
        if (grade >= 90)
           return 4;
        else if (grade >= 80)
           return 3;
        else if (grade >= 70)
           return 2;
        else if (grade >= 60)
           return 1;
        else
           return 0;

   }}


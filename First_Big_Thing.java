import java.util.Scanner;

public class First_Big_Thing {
   public static void main(String[] args) {
      
      String personName = "howl";
      boolean isPerson = false;
      int ageOfPerson = 1;
      double rating = 0;
      
      System.out.println("Please rate person.");
      Scanner ratingScan = new Scanner(System.in);
      rating = ratingScan.nextDouble();
      System.out.println("You have rated " + personName + " who is age " + ageOfPerson + ", " + rating + " out of 10 stars, status of personhood: " + isPerson );
      ratingScan.close();
      
      
      
      
   }
}
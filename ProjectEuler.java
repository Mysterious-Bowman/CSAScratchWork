public class ProjectEuler {
   
   public static long problem1() {
      
      long sum = 0;
      
      //Problem 0: Among the first 112 thousand square numbers, what is the sum of all the odd squares?
      for(int i = 1; i < 112001; i += 2)
      {
         System.out.println("i: " + i);
         System.out.println("i^2: " + Math.pow(i,2));
         sum += Math.pow(i,2);
         System.out.println("sum: " + sum);
      }
      return sum;
   }
   
   public static int problem2() {
      
      
      int currentFibNum = 1;
      int lastFibNum = 1;
      int tempNum;
      int sum = 0;
      
      while(currentFibNum < 4000000) {
         
         
         
         if (currentFibNum % 2 == 0) {
            sum += currentFibNum;
         }
         
         System.out.println(currentFibNum);
         tempNum = currentFibNum;
         currentFibNum += lastFibNum;
         lastFibNum = tempNum;
         
         
         
         
         
         
         
      }
      
      
      
      
      
      return sum;
   }
   
   public static void main(String[] args) {
      System.out.println("The answer to problem 1 is: " + problem1());
      System.out.println("The answer to problem 2 is: " + problem2());      
   }  
}
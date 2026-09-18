public class practice091826 {
   public static void main(String[] args) {
      
      long current = 2;
      
      for(int i = 0; i < 128; i++) {
         
         System.out.println((i + 1) + ": " + current);
         current = current * 2;
      }
      
   }
}
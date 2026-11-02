public class TungstenCube {
   String color;
   double cubeSize;
   double weightOfCube;
   
   
   public static void main(String[] args) {
      TungstenCube cube1 = new TungstenCube();
      cube1.cubeSize = 2.0;
      TungstenCube cube2 = new TungstenCube();
      cube2.cubeSize = cube1.Drop(1.0);
      TungstenCube cube3 = new TungstenCube();
      cube3.cubeSize = 3.0;
      cube1.Drop(1.0);
      cube2.Drop(1.0);
      cube3.Drop(1.0);
   }
   
   public double Drop(double heightDroppedFrom) {
   System.out.println("OW!");
   System.out.println("Damage: " + (heightDroppedFrom * cubeSize));
   return heightDroppedFrom;
   }
   
   
}
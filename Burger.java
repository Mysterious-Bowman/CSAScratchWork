public class Burger {
   private int numPatties;
   private boolean isTasty;
   private double gramsOfSauce;
   private String burgerName;
   private int numberOfBites;
   
   public Burger() {
      numPatties = 1;
      isTasty = true;
      gramsOfSauce = 30;
      burgerName = "Craig the Burger";
      numberOfBites = 0;
   }
   
   public Burger(int numPatties, boolean isTasty, double gramsOfSauce, String burgerName ){
      this.numPatties = numPatties;
      this.isTasty = isTasty;
      this.gramsOfSauce = gramsOfSauce;
      this.burgerName = burgerName;
      this.numberOfBites = 0;
   }
   
   public void biteBurger() {
      System.out.println("Chomp ... Yum!");
      numberOfBites++;
   }
   
   public int getNumberOfBites() {
      return numberOfBites;
   }
   
   public static String getBurgerRecipe() {
      return "Cook burger, put on bun, add condiments";
   }
   
   public static void main(String[] args) {
   
   
      Burger burg1 = new Burger();
      Burger burg2 = new Burger(5,true,10.0,"lil' fella");
      
      burg1.biteBurger();
      burg1.biteBurger();
      burg1.biteBurger();
      burg1.biteBurger();
      System.out.println(burg1.getNumberOfBites());
      System.out.println(getBurgerRecipe());
   }
   
}
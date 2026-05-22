import java.util.Scanner;

class ArithmeticalOperations{
   public static void main(String args[]){
      //Creating an object for Scanner class
      Scanner scan = new Scanner(System.in);

      System.out.println("Enter the 1st number ");
      int x = scan.nextInt();
      System.out.println("Enter the 2nd number ");
      int y = scan.nextInt();
      System.out.println("Press 1 for Addition");
      System.out.println("Press 2 for Subtraction");
      System.out.println("Press 3 for Multiplication");
      System.out.println("Press 4 for Division");
      System.out.println("Please Enter your choice ");
      int opt = scan.nextInt();
      int result = 0;

      if(opt == 1){
         result = x + y;
         System.out.println("The addition is "+result);
      }
      else if(opt == 2){
         result = x - y;
         System.out.println("The subtraction is "+result);
      }
      else if(opt == 3){
         result = x * y;
         System.out.println("The multiplication is "+result);
      }   
      else if(opt == 4){
         result = x / y;
         System.out.println("The division is "+result);
      }
      else{
         System.out.println("You have entered a wrong choice");
      }
   }
}
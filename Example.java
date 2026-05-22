/*
     Taking input from the User in Java:
         There 4 ways to take input from the user in java.
	 -> Using Command Line Arguments.
         -> Using Scanner object
         -> Using Buffered Reader
         -> Using Text Field in AWT.
*/


class Example{
   public static void main(String[] args){
       String fullName = args[0] + ". " +args[1];
       System.out.println("Your Full name is " + fullName);
   }
}
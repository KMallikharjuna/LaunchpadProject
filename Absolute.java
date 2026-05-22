class Absolute{
   public static void main(String args[]){
      int x = Integer.parseInt(args[0]);
      if(x < 0){
          x = x * -1;
      }
      System.out.println(x);
   }
}


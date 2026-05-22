class Authenticate{
  public  static void main(String details[]){
     String username = details[0];
     String mobileNumber = details[1];
     String password = details[2];

     String user = "Super_star";
     String mobile = "8868868886";
     String pwd = "Yuvaraj@123";
     String login = (user.equals(username) ||
                     mobile.equals(mobileNumber)) &&
                     pwd.equals(password)?
             "Welcome Mahesh" : "Sorry!! wrong details";

     System.out.println(login);
  }
}
package src.bank;

class  Account {
   public String name;
   protected String email;
   int age;
   private  String password;

   public String getPassword() {
      return password;
   }
   public void setPassword(String password) {
      this.password = password;
   }
}

public class Bank {
   public static void main(String[] args) {
      Account account1 = new Account();
      account1.name = "himanshu"; // able to access name bcz its public;
      account1.email ="himansh9489@gmail.com"; // able to access email bcz its protected
      account1.age = 23; // able to access age bcz its default
      // account1.password = "asdf";
      // unable to access it bcz its private;
      // to access it need getter and setter methods
      account1.setPassword("asdf");
      System.out.println(account1.getPassword());
   }
}

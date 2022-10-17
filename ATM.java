import java.util.ArrayList;
import java.util.Scanner;
abstract public class ATM {
    Server verify=new Server();
    Scanner input=new Scanner(System.in);

   abstract public void deposit();

   abstract public void getBalance();
   abstract public void creditCardWithdraw();
   public void withdraw()
  {
      int accountNumber=  verify.verification();
      if(accountNumber!=0)
      {
          System.out.println("Enter the withdraw amount");
          int amount=input.nextInt();
          if(amount%5==0&&amount<= Server.getList1().get(accountNumber))
          {

              Server.getList1().replace(accountNumber,  Server.getList1().get(accountNumber) - amount);
              System.out.println("Amount is withdrawn successfully");
              System.out.println("Balance:" +  Server.getList1().get(accountNumber));
          }
          else
          {
              System.out.println("Insufficient balance or Enter amount divisible by 5");
          }
      }
      else
      {
          System.out.println("Invalid details");
      }
  }


}

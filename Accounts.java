
public class Accounts {

   private String name;
   private long panNumber;
   private String dateOfBirth;
   private long phoneNumber;
    private int accountNumber;
    private int balance;
    AccountGeneration newAccount=new AccountGeneration();
   Accounts(String name,long phoneNumber,String dateOfBirth,long panNumber,int balance,int accountNumber)
    {
        this.name=name;
        this.balance=balance;
        this.phoneNumber=phoneNumber;
        this.dateOfBirth=dateOfBirth;
        this.panNumber=panNumber;
this.accountNumber=accountNumber;

    }

}





import java.util.Scanner;

public class AccountGeneration {

Scanner input=new Scanner(System.in);
    Server server=new Server();
    static int accountNumber=1000000;
    static int debitCardNumber=10000;
    static int creditCardNumber=22334455;
    static int ccv=300;
    static int pin=1000;
    Accounts accounts;
    public void accountGeneration()
    {   System.out.println("Enter Name:");

        String name=input.nextLine();
        System.out.println("Enter Phone Number:");
        long phoneNumber=input.nextLong();
        System.out.println("Enter DOB:DD-MM-YYYY");
        input.nextLine();
        String dateOfBirth=input.nextLine();
        System.out.println("Enter Pan card Number");
        long panNumber=input.nextLong();
        System.out.println("Enter the Initial Deposit:");
        int balance=input.nextInt();
       accounts=new Accounts(name,phoneNumber,dateOfBirth,panNumber,balance,accountNumber);
        Card card=new DebitCard(debitCardNumber,pin,ccv);
       Server.setDebitCards(card);
       Server.setList(card,accountNumber);
       Server.setList1(accountNumber,balance);
       System.out.println("Your Account Details:");
       System.out.println("AccountNumber:"+accountNumber);
       System.out.println("Debit cardNumber:"+debitCardNumber);
       System.out.println("Pin:"+pin);
       debitCardNumber++;
       pin++;
       ccv++;
       accountNumber++;

    }
    public void creditCardGeneration()
    {System.out.println("Enter the accountNumber");
        int accountNumber=input.nextInt();
        if(     server.accountNumberVerification(accountNumber)) {
            CreditCard card = new CreditCard(creditCardNumber, pin, ccv);
            Server.setCreditCards(card);
            Server.setList(card, accountNumber);
            System.out.println("Credit card Details");
            System.out.println("CreditCard Number:" + creditCardNumber++);
            System.out.println("Pin:" + pin++);
            System.out.println("ccv:" + ccv++);
        }
        else {
            System.out.println("Enter a valid Account number");
        }

    }
}

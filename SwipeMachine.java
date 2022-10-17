import java.util.ArrayList;
import java.util.Scanner;

public class SwipeMachine {
    Server verify=new Server();
    Scanner input=new Scanner(System.in);
    public void swipe()
    {int accountNumber=  verify.verification();
        if(accountNumber!=0) {
            System.out.println("Enter the purchase amount");
            int amount = input.nextInt();
            if(amount<= Server.getList1().get(accountNumber)){
                Server.getList1().replace(accountNumber,  Server.getList1().get(accountNumber) - amount+(int)(amount*0.01));
                System.out.println("purchase is successfully");
                System.out.println("Cashback:"+amount*0.01);
                System.out.println("Balance:" +  Server.getList1().get(accountNumber));}
            else {
                System.out.println("Insufficient balance");
            }
        }
        else
        {
            System.out.println("Invalid details");
        }
    }
    public void creditCardSwipe()
    {
        int cardNumber=  verify.verification();
        if(cardNumber!=0) {
            System.out.println("Enter the purchase amount(limit -100000):");
            int amount = input.nextInt();
            ArrayList<CreditCard> creditCards=Server.getCreditCards();
            for(CreditCard card:creditCards)
            {System.out.println("Y");
                if(card.cardNumber==cardNumber)
                {
                    card.creditCardDue+=amount-(int)(amount*0.01);
                    System.out.println("purchase is successfully");
                    System.out.println("Cashback:"+amount*0.01);
                    System.out.println("Credit card Due:"+card.creditCardDue);
                }
            }

        }
        else
        {
            System.out.println("Invalid details");
        }

    }
}

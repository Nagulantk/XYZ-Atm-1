import java.util.ArrayList;

public class XyzAtm extends ATM{
    public void deposit()
    {int accountNumber=  verify.verification();
        if(accountNumber!=0)
        {
            System.out.println("Enter the deposit amount");
            int amount=input.nextInt();
            Server.getList1().replace(accountNumber, Server.getList1().get(accountNumber)+amount);
            System.out.println("Amount is deposited successfully");
            System.out.println("Balance:"+ Server.getList1().get(accountNumber));
        }
        else
        {
            System.out.println("Invalid details");
        }
    }

    public void getBalance()
    {int accountNumber= verify.verification();
        if(accountNumber!=0)
        {System.out.println("Balance:"+ Server.getList1().get(accountNumber));}
        else {
            System.out.println("Enter valid details");
        }
    }
    public void creditCardWithdraw()
    {
        int cardNumber=  verify.verification();
        if(cardNumber!=0) {
            System.out.println("Enter the withdraw amount(limit -100000):");

            int amount = input.nextInt();
            if(amount<=100000) {
                ArrayList<CreditCard> creditCards = Server.getCreditCards();
                for (CreditCard card : creditCards) {
                    if (card.cardNumber == cardNumber) {
                        if(amount<=100) {
                            card.creditCardDue += amount + (int) (amount * 0.02);
                            System.out.println("Amount is withdrawn");
                            System.out.println("Tax:" + amount * 0.02);
                        }
                        else {
                            card.creditCardDue += amount + (int) (amount * 0.04);
                            System.out.println("Amount is withdrawn");
                            System.out.println("Tax:" + amount * 0.04);
                        }
                        System.out.println("Credit card Due:" + card.creditCardDue);
                    }
                }
            }

        }
        else
        {
            System.out.println("Invalid details");
        }
    }
    public void withdraw()
    {
        float tax;
        int accountNumber=  verify.verification();
        if(accountNumber!=0)
        {
            System.out.println("Enter the withdraw amount");
            int amount=input.nextInt();
            if(amount%5==0&&amount<= Server.getList1().get(accountNumber))
            {
                if(amount<=100)
                {
                    tax=0.02f;
                }
                else {
                    tax=0.04f;
                }
                Server.getList1().replace(accountNumber,  Server.getList1().get(accountNumber) - amount-(int)(amount*tax));
                System.out.println("Amount is withdrawn successfully");
                System.out.println("Balance:" +  Server.getList1().get(accountNumber));
                System.out.println("Tax:"+amount*tax);

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

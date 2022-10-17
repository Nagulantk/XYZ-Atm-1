import java.util.ArrayList;
import java.util.HashMap;

public class CreditCardBill {
    Server verify=new Server();

    public void billPayment()
    {
      int cardNumber= verify.verification();
        ArrayList<CreditCard> creditCards = Server.getCreditCards();
        HashMap<Card,Integer> list=Server.getList();
        HashMap<Integer,Integer> list1=Server.getList1();
        for (CreditCard card : creditCards) {
            if (card.cardNumber == cardNumber) {
                  int accountNumber=list.get(card);
                  if(card.creditCardDue<=list1.get(accountNumber))
                  {
                      list1.replace(accountNumber,list1.get(accountNumber)-card.creditCardDue);
                      card.creditCardDue=0;
                      System.out.println("Bill payment is SuccessFull");
                      System.out.println("Remaining balance in the account:"+list1.get(accountNumber));
                  }
                  else
                  {
                      System.out.println("Insufficient balance in the account");
                  }
            }
        }
    }
}

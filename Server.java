import java.util.*;
public class Server {
  private static ArrayList<Card> debitCards=new java.util.ArrayList<>();
  private static ArrayList<CreditCard> creditCards=new java.util.ArrayList<>();
  private static  HashMap<Card,Integer> list=new HashMap<>();
   private static  HashMap<Integer,Integer> list1=new HashMap<>();
   Scanner input=new Scanner(System.in);


    public static ArrayList<CreditCard> getCreditCards() {
        return creditCards;
    }
    public static HashMap<Card, Integer> getList() {
        return list;
    }

    public static HashMap<Integer, Integer> getList1() {
        return list1;
    }

    public static void setDebitCards(Card card) {
        debitCards.add(card);
    }
    public static void setCreditCards(CreditCard card) {
        creditCards.add(card);
    }

    public static void setList(Card card, Integer accountNumber) {
        list.put(card,accountNumber);
    }

    public static void setList1(int accountNumber,int balance) {
        list1.put(accountNumber,balance);
    }

    public int verification()
    {System.out.println("Enter the card Number");
        int cardNumber=input.nextInt();
        System.out.println("Enter pin");
        int pin=input.nextInt();
        for(Card card :debitCards)
        {
            if(card.cardNumber==cardNumber&&card.getPin()==pin)
            {
                return list.get(card);
            }
        }
        for(CreditCard card:creditCards)
        {
            if(card.cardNumber==cardNumber&&card.getPin()==pin)
            {
                return cardNumber;
            }
        }
        return 0;

    }
    public boolean accountNumberVerification(int accountNumber)
    {
        for(Map.Entry<Integer,Integer> accountList:list1.entrySet())
        {
            if(accountList.getKey()==accountNumber)
            {
                return true;
            }
        }
        return false;
    }
}

public class Card {
    int cardNumber;
    private  int ccv;
   private int pin;
    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    Card(int cardNumber, int pin, int ccv)
    {
        this.ccv=ccv;
        this.cardNumber=cardNumber;
        this.pin=pin;
    }
}

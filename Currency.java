import java.io.Serializable;

class Currency implements Serializable {
    protected String currency;
    protected float amount;

    public Currency(String cur, float amt) {
        this.currency = cur;
        this.amount = amt;
    }

    public void printCurrency() {
        System.out.print(currency);
        System.out.println(amount);
    }
}

class Dollar extends Currency {
    public Dollar(char sm, float dol) {
        super("$" + sm, dol);
    }
}

class Rupee extends Currency {
    public Rupee(String sm, float rup) {
        super("Rs." + sm, rup);
    }
}

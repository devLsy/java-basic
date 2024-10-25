package extends1.ex;

public class CryptoCurrency extends Item{

    private String coin;
    private String symbol;

    public CryptoCurrency(String name, int price, String coin, String symbol) {
        super(name, price);
        this.coin = coin;
        this.symbol = symbol;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 코인:" + coin + ", 심볼:" + symbol);
    }
}

package horaDaPratica.interfac;

public class MainExchange {
    public static void main(String[] args) {
        CurrencyConverter converter = new CurrencyConverter();
        System.out.println(converter.USDToBzReal(300));

        System.out.println(converter.BzRealToUSD(100));


    }


}

package horaDaPratica.interfac;

public class CurrencyConverter implements FinancialConverter{
    private double BREAL = 1;
    private final double USD = 1;
    private double exchange;
    private String currency;


    double getExchangeRate(String currency) {
        switch (currency){
            case "USD":
                return this.USD;
            case "BREAL":
                BREAL = 6.30;
                return this.BREAL;
            default:
                System.out.println("Invalid currency");
                return 0;
        }
    }

    @Override
    public double USDToBzReal(double USD) {
        BREAL = getExchangeRate("BREAL");
        exchange = USD * this.BREAL;
        return exchange;
    }

    @Override
    public double BzRealToUSD(double BREAL){
        exchange = (BREAL * this.USD) / this.BREAL;
        return exchange;
    }
}

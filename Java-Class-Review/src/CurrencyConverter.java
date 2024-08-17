import com.sun.source.tree.BreakTree;

public class CurrencyConverter {

    public static void main(String[] args) {

        double euros = convertTo("euro", 100.0);
        System.out.println(euros);

    }

    public static double convertTo(String currency, double amount) {double convertedAmount = 0;
        switch (currency) {
            case "euro":
                convertedAmount = amount * 0.91;
                break;
            case "yen":
                convertedAmount = amount * 121.03;
                break;
            case "won":
                convertedAmount = amount * 1217.52;
                break;
            default:
                System.out.println("Conversion is not available to " + currency);

        }


        return convertedAmount;

    }

}


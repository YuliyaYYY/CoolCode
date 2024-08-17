package Week_04;

public class IphoneModels {

    public static void main(String[] args) {
        String iPhoneModel = "15 Pro";
        double monthlyPayment = 0;

        switch (iPhoneModel) {
            case "15 Pro":
            case "15 Pro Max":
                monthlyPayment = 41.62;
                break;
            case "15":
            case "15 Plus":
                monthlyPayment = 33.29;
                break;
        }
            System.out.println("Monthly Payment = $" + monthlyPayment);

    }
}
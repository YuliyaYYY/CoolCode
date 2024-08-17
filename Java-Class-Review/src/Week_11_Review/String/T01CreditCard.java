/* package Week_11_Review.String;

public class T01CreditCard {

    public class T01CreditCard {
        public static void main(String[] args) {
            System.out.println(maskCreditCard("1234567890123456", "Visa"));
        }

        public static String maskCreditCard(String creditCardNumber, String type) {
            type = type.toLowerCase()
            if ((type.equals("mastercard") || type.equals("visa") || type.equals("discover"))
                    && creditCardNumber.length() != 16) {
                return "invalid card number";
            } else if (type.equals("american express") && creditCardNumber.length() != 15) {
                return "invalid card number";

            }
            String masked = creditCardNumber.substring(creditCardNumber.length() - 4);
            return masked;

        }
    }

*/


/*
Method to hide the first 11 or 12 digits of a credit card number and
only display the last 4 digits.
creditCardNumber = "1234567890123456" => "****-****-****-3456"

if credit card number length invalid, return "invalid card number"

Valid cards:
    -Mastercard: 16 digits
    -Discover: 16 digits
    -American Express: 15 digits
 */
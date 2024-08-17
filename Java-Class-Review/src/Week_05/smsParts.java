package Week_05;

public class smsParts {

    public static void main(String[] args) {


        String sms = "Sender: <Mike Smith>. From Number: [202-123-3456]. Message: I love programming";
        int senderStart = sms.indexOf("<")+1;
        int senderEnd = sms.indexOf('>');

        System.out.println(senderEnd);
        System.out.println(senderStart);
        String sender = sms.substring(senderStart, senderEnd);
        System.out.println("sender = " + sender);


    }
}

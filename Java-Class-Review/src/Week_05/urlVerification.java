package Week_05;

public class urlVerification {

    public static void main(String[] args) {

            String url = "www.google.com";

        if (url.startsWith("www") && url.endsWith(".com") || url.endsWith(".org") || url.endsWith(".edu")) {

            String domain = url.substring(4, url.length()-4);

            System.out.println(url  + " is valid for " + domain);
        }else{
            System.out.println("URL is invalid");

                if (!url.startsWith("www.")){
                    System.out.println("www. is missing");
                }
               if (!(url.endsWith(".com") || url.endsWith(".org") || url.endsWith(".edu")) ){
                   System.out.println("Extension is missing");
               }
        }
    }
}

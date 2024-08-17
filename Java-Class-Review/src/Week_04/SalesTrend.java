package Week_04;

public class SalesTrend {

    public static void main(String[] args) {

        int soldYesterday = 66;
        int soldToday = 53;
        int salesTrend;

        if (soldToday >= soldYesterday){
               salesTrend = 1;
        } else {
            salesTrend = -1;

            salesTrend = (soldToday >= soldYesterday)? 1 : -1;

            System.out.println("salesTrend = " + salesTrend);
        }




    }
}

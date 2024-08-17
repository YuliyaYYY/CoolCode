package Week_06;

public class Adidas {

    public static void main(String[] args) {

        char mySize = getMensShirtSize(90);
        System.out.println(mySize);

    }

    public static char getMensShirtSize(int chestSize) {

        char shirtSize;
        if (chestSize >= 87 && chestSize <= 92) {
            shirtSize = 'S';
        } else if (chestSize >= 93 && chestSize <= 100) {
            shirtSize = 'M';
        } else if (chestSize >= 101 && chestSize <= 108) {
            shirtSize = 'L';
        } else {
            System.out.println("Not available");
            shirtSize = 'N';
        }

        return shirtSize;
    }
}
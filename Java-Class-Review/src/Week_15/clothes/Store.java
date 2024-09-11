package Week_15.clothes;

public class Store {
    public static void main(String[] args) {
        Clothes clothes = new Tshirt();

        Clothes jacket = new Jacket();
        HasHood jacketWithHood = new Jacket();

        jacketWithHood.putOnHood();
    }
}

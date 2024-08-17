package Week_13.access.a;

public class Computer {

    public String os;
    protected int memory;
    public String brand;
    private boolean hasWifiCard;

    @Override
    public String toString() {
        return "Computer{" +
                "os='" + os + '\'' +
                ", memory=" + memory +
                ", brand='" + brand + '\'' +
                ", hasWifiCard=" + hasWifiCard +
                '}';
    }
}

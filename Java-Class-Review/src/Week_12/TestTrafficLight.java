package Week_12;

import org.w3c.dom.ls.LSOutput;

public class TestTrafficLight {

    public static void main(String[] args) {

        TrafficLight trLight1 = new TrafficLight("yellow");
        System.out.println("Color = " + trLight1.getColor());

        TrafficLight trLight2 = new TrafficLight("black");
        System.out.println("Color = " + trLight2.getColor());

        trLight2.action();

        TrafficLight light = new TrafficLight("red");
        light.action();
        for (int i = 5; i >= 0; i--){
            System.out.println("waiting... " +i);
        }
        light.setColor("Green");
        light.action();
    }
}

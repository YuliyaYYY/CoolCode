package Week_12;

public class TrafficLight {

    private String color;

    public TrafficLight(String color){
        setColor(color);
    }

    public void setColor(String color) {
        color = color.trim().toLowerCase();
        if(color.equalsIgnoreCase("green")||color.equalsIgnoreCase("yellow")||color.equalsIgnoreCase("red")){
            this.color = color;
        }else{
            System.out.println("Invalid color");
            System.exit(1);
        }
    }

    public String getColor(){
        return color;
    }

    public void action() {
        switch (color) {
            case "red" -> System.out.println("Stop");
            case "green" -> System.out.println("Go");
            case "yellow" -> System.out.println("Prepare to stop");
        }

    }
}

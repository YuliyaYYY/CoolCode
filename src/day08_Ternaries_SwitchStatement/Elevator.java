package day08_Ternaries_SwitchStatement;

public class Elevator {

    public static void main(String[] args) {

        int floorNum = 6;

        if(floorNum >= 1 && floorNum <= 3){

            if(floorNum == 1){
                System.out.println("Floor 1 selected . Companies: Lobby, Verizon, Starbucks");
            }else if (floorNum == 2){
                System.out.println(" Floor 2 selected . Companies: Cybertek, NASA, Intelsat");
            }else
                System.out.println(" Floor 3 selected . Companies: Lyft, BoFA, Stake House");
        }else{
            System.out.println("Invalid Floor");
        }
    }
}
package Day25_constructors;

import java.sql.SQLOutput;

public class TestRectangleObjects {

    public static void main(String[] args) {

    /*    Rectangle rectangle1 = new Rectangle();
        rectangle1.setInfo(3,4);

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setInfo(4,5);

        Rectangle rectangle3 = new Rectangle();
        rectangle3.setInfo(5,6);


        System.out.println(rectangle1);
        System.out.println(rectangle2)
        System.out.println(rectangle3);
     */

        Rectangle rectangle1 = new Rectangle(3,4);

        Rectangle rectangle2 = new Rectangle(4,5);

        Rectangle rectangle3 = new Rectangle(5,6);


        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle3);



    }
}

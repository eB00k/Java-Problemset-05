package P7;

public class MyPointTest {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        p1.setX(5);
        p1.setY(6);
        System.out.println("point1: " + p1);
        System.out.println("x is: " + p1.getX());
        System.out.println("y is: " + p1.getY());
        p1.setXY(4, 4);
        System.out.println("new point1: " + p1.toString());
        MyPoint p2 = new MyPoint(0, 1);
        System.out.println("point 2: " + p2);

        System.out.println(p1.distance(p2));
        System.out.println(p2.distance(p1));
        System.out.println(p1.distance(5, 6));
        System.out.println(p1.distance());
    }
}


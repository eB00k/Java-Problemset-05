package P7;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {}

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }
    public int[] getXY() {
        return new int[] {x, y};
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return String.format("(%d,%d)", x, y);
    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow((getX() - x), 2) + Math.pow((getY() - y), 2));
    }

    public double distance(MyPoint another) {
        return Math.sqrt(Math.pow((getX() - another.getX()), 2) + Math.pow((getY() - another.getY()), 2));
    }

    public double distance() {
        return Math.sqrt(Math.pow((getX()), 2) + Math.pow((getY()), 2));
    }
}
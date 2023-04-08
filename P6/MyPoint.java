package P6;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint() {

    }
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

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY() {
        return new int[]{x, y};
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return String.format("(%d,%d)", x, y);
    }

    public double distance(int x, int y) {
        int lenX = this.x - x;
        int lenY = this.y - y;
        double res = Math.sqrt(lenX * lenX + lenY * lenY);
        return res;
    }

    public double distance(MyPoint another) {
        int lenX = this.x - another.x;
        int lenY = this.y - another.y;
        double res = Math.sqrt(lenX * lenX + lenY * lenY);
        return  res;
    }
    public double distance() {
        return distance(0, 0);
    }
}












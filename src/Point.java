public class Point {
    //member variables
    private int x, y;

    //setters
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    //getters
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    //constructors
    public Point() {
        this(0,0);
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //distance between this point and point (0, 0)
    public double distance() {
        return Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2));
    }

    //distance between this point and point (x, y)
    public double distance(int x, int y) {
        return Math.sqrt(Math.pow((getX() - x), 2) + Math.pow((getY() - y), 2));
    }

    //distance between this point and another, already defined point
    public double distance(Point another) {
        return Math.sqrt(Math.pow(getX() - another.getX(), 2) + Math.pow(getY()- another.getY(), 2));
    }
}

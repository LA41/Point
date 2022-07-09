public class Main {
    public static void main(String[] args) {
        Point first = new Point(4, 0);
        Point second = new Point(1, 3);

        System.out.println(first.distance()); //distance to point (0, 0)
        System.out.println(first.distance(second)); //distance to defined point
        System.out.println(first.distance(2, 0)); // distance to point (x, y)
    }
}

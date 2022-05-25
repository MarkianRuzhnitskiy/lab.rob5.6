public class Third {
    public static void main(String[] args) {
        double x = 1.7;
        int y = (int) x;
        double x2 = (10*x-10*y)/10;
        double x3 = x2 + 0.5;
        int x4 = (int) x + (int) x3;
        System.out.println(x4);
    }
}

package sig.oss;

public class Calc {
    private int r = 0;
    public int add(int x, int y) {
        System.out.print(">>>>>>> Run add method ....");
        return x+y;
    }

    public int sub(int x, int y) {
        System.out.print(">>>>>>> Run sub method ...");
        return x - y;
    }

    public int inc(int d) {
        return r += d;
    }

    public int getResult() {
        return r;
    }
}
public class Minus implements Action {
    @Override
    public int value(int a, int b) {
        return a - b;
    }

    @Override
    public String deystvie() {
        return "-";
    }
}

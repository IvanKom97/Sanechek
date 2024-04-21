public class Multiply implements Action{
    @Override
    public String deystvie() {
        return "*";
    }

    @Override
    public int value(int a, int b) {
        return a * b;
    }
}

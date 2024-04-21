public class Divide implements Action {
    @Override
    public int value(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("Cannot");
        }
        return a / b;
    }

    @Override
    public String deystvie() {
        return "/";
    }
}

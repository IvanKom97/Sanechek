import java.util.List;

@org.springframework.stereotype.Service


public class Service {
    public int res(String move, int ar, int b) {
        int result = 0;
        List<Action> actions = List.of(new Minus(), new Plus(), new Multiply(), new Divide());
        for (Action a : actions) {
            if (move.equals(a.deystvie())) {
                result = a.value(ar, b);
            }
        }
        return result;
    }
}
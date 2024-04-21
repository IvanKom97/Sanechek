import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/calculator")
public class Controller {
    Service service = new Service();

    @GetMapping(path = "/hello")
    public String hello() {
        return "hello";
    }
    @GetMapping(path = "/sum")
    public String res(@RequestParam String move,
                      @RequestParam int a,
                      @RequestParam int b) {

        int res = service.res(move, a, b);
        return a + " " + move + " " + b + " = " + res;
    }
}

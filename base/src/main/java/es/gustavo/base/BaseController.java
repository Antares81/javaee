package es.gustavo.base;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BaseController {

    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hola Base!";
    }
}

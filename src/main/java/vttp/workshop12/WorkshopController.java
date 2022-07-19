package vttp.workshop12;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/index")
public class WorkshopController {
    
    @GetMapping
    public String test() {
        return "index";
    }
}

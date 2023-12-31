package pl.mrqs.camper_for_rent.api.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@RequestMapping(HomeController.HOME)
@AllArgsConstructor
public class HomeController {

    static final String HOME = "/";

    @GetMapping(value = HOME)
    public String homePage() {
        return "home";
    }
}

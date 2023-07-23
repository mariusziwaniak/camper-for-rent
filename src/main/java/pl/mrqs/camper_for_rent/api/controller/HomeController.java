package pl.mrqs.camper_for_rent.api.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
//@AllArgsConstructor
public class HomeController {

    @GetMapping
    public String homePage() {
        return "home";
    }
}

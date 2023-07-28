package pl.mrqs.camper_for_rent.api.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class OwnerController {

    static final String OWNER = "/owner";

    @GetMapping(value = OWNER)
    public String homePage() {
        return "owner";
    }
}

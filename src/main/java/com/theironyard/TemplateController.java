package com.theironyard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TemplateController {

    @RequestMapping(path = "/")
    public String home(){
        return "home";
    }
}

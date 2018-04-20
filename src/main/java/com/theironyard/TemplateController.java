package com.theironyard;

import com.theironyard.entities.Periodicaltexts;
import com.theironyard.repositories.PeriodicaltextsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class TemplateController {

    @Autowired
    PeriodicaltextsRepository periodicaltextsRepository;




   /* @RequestMapping(path = "/")
    public String home(Model model){

        if(widgetRepository.count() == 0) {
            ArrayList<Widget> widgets = new ArrayList<>();

            for(int x = 0 ; x < 10 ; x++) {
                widgets.add(new Widget("Example Widget " + x, "Widget " + x + " is very big", new Random().nextDouble() * 100));
            }

            widgetRepository.save(widgets);
        }

        model.addAttribute("widgets", widgetRepository.findAll());

        return "home";
    }*/

   @RequestMapping(path = "/")
    public String home(Model model){
       ArrayList<Periodicaltexts> breviary_elements = new ArrayList<>();





   return "home";
   }


}

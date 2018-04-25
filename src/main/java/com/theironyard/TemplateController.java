package com.theironyard;

import com.theironyard.entities.Periodicaltexts;
import com.theironyard.repositories.PeriodicaltextsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@Controller
public class TemplateController {

    @Autowired
    PeriodicaltextsRepository periodicaltextsRepository;




    @RequestMapping(path = "/")
    public String home(Model model){

        if(periodicaltextsRepository.count() == 0) {
            //ArrayList<Periodicaltexts> periodicaltexts = new ArrayList<>();

            /*for(int x = 0 ; x < 10 ; x++) {
                widgets.add(new Widget("Example Widget " + x, "Widget " + x + " is very big", new Random().nextDouble() * 100));
            }*/
           // periodicaltexts.add(new Periodicaltexts(41,"Hymn","Nieszpory","Okres Adwentu do dnia 16 grudnia","",1,"1 Stwórco gwiaździstych przestworzy\\nI wieczne światło wierzących,\\nChryste, coś wszystkich odkupił,\\nWysłuchaj naszą modlitwę.\\n2 Zdjęty litością nad światem,\\nKtóremu śmierć zagrażała,\\nJego zbawieniem się stałeś\\nI uzdrowiłeś z niemocy.\\n3 Świat już pogrążał się w mroku,\\nLecz Ty, jak słońce promienne,\\nZ łona Dziewicy wyszedłeś,\\nZrodzony przez Nią w czystości.\\n4 Byty niebiańskie i ziemskie,\\nPosłuszne Twoim rozkazom,\\nHołd Ci składają w pokorze\\nI sławią Twoją potęgę.\\n5 Ciebie, Najświętszy, prosimy:\\nNim przyjdziesz sądzić sumienia,\\nObroń nas w życiu doczesnym\\nOd przewrotności szatana.\\n6 Chryste, nasz Królu łagodny,\\Niech Tobie z Ojcem i Duchem\\nBędzie podzięka i chwała\\nPrzez całą wieczność bez kresu. Amen."));
           // periodicaltextsRepository.save(periodicaltexts);
        }

        model.addAttribute("periodicaltexts", periodicaltextsRepository.findAll());

        return "home";
    }


  /*  @RequestMapping(value = "/thyme", method = RequestMethod.GET)
    public String showAllPosts(Model model) {
        model.addAttribute("periodicaltexts", periodicaltextsRepository.findAll());
        return "index";
    }*/

  @RequestMapping("/thyme")
    public String index(){
      return "index.html";
  }

   /*@RequestMapping(path = "/")
    public String home(Model model){
       ArrayList<Periodicaltexts> breviary_elements = new ArrayList<>();





   return "home";
   }*/


}

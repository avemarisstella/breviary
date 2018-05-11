package gradle.cucumber.pages;

import com.codeborne.selenide.Selenide;

public class DisplayPrayer {

    public DisplayPrayer open(){
        Selenide.open("localhost:8080/prayer");
        return this;
    }

}

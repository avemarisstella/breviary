package gradle.cucumber;

import com.codeborne.selenide.Configuration;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.ChromeDriverManager;

public class Base {

    @Before
    public void setUp() {
        ChromeDriverManager.getInstance().setup();
        Configuration.browser = "chrome";
    }
}

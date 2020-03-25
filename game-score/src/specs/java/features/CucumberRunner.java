package features;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Before;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty"
        },
        strict = true

)
public class CucumberRunner {
        @Before
        public void shout(){
                System.out.println("Behold! Here comes Cucumber!");
        }
}

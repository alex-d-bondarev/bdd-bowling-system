package features.steps;

import io.cucumber.java8.En;

public class RestDefinitions implements En {

    public RestDefinitions() {
        When("I request (.+) endpoint from admin port", (String endpoint) -> {

        });

        Then("response should contain healthy = true", () -> {
            throw new io.cucumber.java8.PendingException();
        });

    }

}

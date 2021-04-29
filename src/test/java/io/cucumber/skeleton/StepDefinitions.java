package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

public class StepDefinitions extends CucumberSpringConfiguration {
    @Autowired
    ComponentExample componentExample;

    @Given("I have {int} cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) {
        assertThat(componentExample.doSomething()).isTrue();
    }
}

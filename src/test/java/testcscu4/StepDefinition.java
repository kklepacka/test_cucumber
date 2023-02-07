package testcscu4;

import io.cucumber.java.en.Given;

public class StepDefinition {
    @Given("Test ` echo test `")
    public void test1() {
        System.err.println("Test ` echo test `");
    }
    @Given("Test '")
    public void test2() {
        System.err.println("Test '");
    }
    @Given("Test %test%")
    public void test3() {
        System.err.println("Test %test%");
    }
}

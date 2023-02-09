package testcscu4;

import io.cucumber.java.en.Given;

public class StepDefinition {

    @Given("Test \\\"")
    public void test1() {
        System.out.println("Test");
    }

    @Given("Test \\< \\/tmp")
    public void test2_tmp() {
        System.out.println("Test");
    }

    @Given("Test \\> \\/tmp")
    public void test3() {
        System.out.println("Test");
    }

    @Given("Test \'test\'")
    public void test4() {
        System.out.println("Test");
    }

    @Given("Test $test")
    public void test5_$test() {
        System.out.println("Test");
    }

    @Given("Test \\\\")
    public void test6() {
        System.out.println("Test");
    }

    @Given("Test \\/")
    public void test7() {
        System.out.println("Test");
    }

}

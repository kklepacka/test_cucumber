package testcscu4;

import io.cucumber.java.en.Given;

public class StepDefinition {
    @Given("test '")
    public void test1() {
        System.out.println("Test");
    }
    @Given("Test ` echo test `")
public void test2() {
    System.out.println("Test");
}

    @Given("Test $test")
    public void test3() {
        System.out.println("Test");
    }

    @Given("Test & echo toto")
    public void test4() {
        System.out.println("Test");
    }

    @Given("Test ; echo toto")
    public void test5() {
        System.out.println("Test");
    }

    @Given("Test | echo toto")
    public void test6() {
        System.out.println("Test");
    }

    // @Given("Test echo test < /tmp")
    // public void test7() {
    //     System.out.println("Test");
    // }

    // @Given("Test echo test > /tmp")
    // public void test8() {
    //     System.out.println("Test");
    // }

    @Given("Test ^")
    public void test9() {
        System.out.println("Test");
    }
    @Given("Test %test%")
    public void test10() {
        System.out.println("Test");
    }

    @Given("Test $\\{echo test}")
    public void test11() {
        System.out.println("Test");
    }

    // @Given("Test backslash \\\\")
    // public void test12() {
    //     System.out.println("Test");
    // }

    // @Given("Test slash /")
    // public void test13() {
    //     System.out.println("Test");
    // }

    @Given("Test $\\(echo test)")
    public void test14() {
        System.out.println("Test");
    }

    @Given("Test #test")
    public void test15() {
        System.out.println("Test");
    }

    @Given("Test 𨱏")
    public void test16() {
        System.out.println("Test");
    }

    @Given("Test 👩‍❤️‍💋‍👨")
    public void test17() {
        System.out.println("Test");
    }

    @Given("Test [test]")
    public void test18() {
        System.out.println("Test");
    }

    @Given("Test ^^")
    public void test19() {
        System.out.println("Test");
    }

    // @Given("Test "test""")
    // public void test20(String string) {
    //     System.out.println("Test");
    // }
    // @Given("Test 'test'")
    // public void test21(String string) {
    //     System.out.println("Test");
    // }

    // @Given("Test $test")
    // public void test22() {
    //     System.out.println("Test");
    // }

    @Given("Test ,.+-_~@€çé=àû*?!")
    public void test23() {
        System.out.println("Test");
    }
    @Given("Test .\\/test")
    public void test24() {
        System.out.println("Test");
    }
    
}

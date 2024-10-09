package org.iesvdm.transformer;

public class GreetingAdder implements Transformer<String, String> {
    private String greeting;

    public GreetingAdder(String greeting) {
        this.greeting = greeting;
    }

    @Override
    public Integer apply(Integer input) {
        return 0;
    }

    @Override
    public String transform(String element) {
        return greeting + element;
    }
}
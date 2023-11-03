package brianvermeer.examples;

import java.util.Optional;

public class OptionalExample {

    public void execute() {
        var maybeString = Optional.of("FOO");

        var foo = maybeString
                .map(this::runIfExist)
                .orElseGet(this::runIfEmpty);

        System.out.println(foo);
    }


    private String runIfExist(String string) {
        System.out.println("only run if optional is filled");
        return string;
    }

    private String runIfEmpty() {
        System.out.println("only run if optional is EMPTY");
        return "EMPTY";
    }


    public static void main(String[] args) {
        OptionalExample oe = new OptionalExample();
        oe.execute();
    }
}

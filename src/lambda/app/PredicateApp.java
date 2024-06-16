package lambda.app;

import java.util.function.Predicate;

public class PredicateApp {

    public static void main(String[] args) {

//        Predicate<String> predicateCheckBlank = new Predicate<String>() {
//            @Override
//            public boolean test(String value) {
//                return value.isBlank();
//            }
//        };

        Predicate<String> predicateBlankCheck = value -> value.isBlank();

        System.out.println(predicateBlankCheck.test(""));
        System.out.println(predicateBlankCheck.test("arham"));
    }
}

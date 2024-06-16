package lambda.app;

import lambda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {

        //in this case, we create with anonymous class
//        SimpleAction simpleAction = new SimpleAction() {
//            @Override
//            public String action() {
//                return "Arham";
//            }
//        };
//
//        System.out.println(simpleAction.action());

        // in this case, we create using lambda standar
//        SimpleAction simpleAction1 = ()-> {
//            return "mamat";
//        };
//
//        System.out.println(simpleAction1.action());

        // in this case we create lambda with parameter
        SimpleAction simpleAction = (String name) -> {
            return "hello" +name;
        };

        //lambda without call data type
        SimpleAction simpleAction1 = (value) -> {
            return "hello" +value;
        };

        //lambda without block
        SimpleAction simpleAction2 = (String value) -> "hello "+value;

        SimpleAction simpleAction3 = (value) -> "hello "+value;

        SimpleAction simpleAction4 = value -> "hello "+value;
    }
}

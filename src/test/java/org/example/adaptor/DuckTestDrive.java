package org.example.adaptor;

public class DuckTestDrive {

    public static void main(String[] args){
        Duck duck = new MallarDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyAdaptor = new TurkeyAdaptor(turkey);

        System.out.println("칠면조가 말하길");
        turkey.gobble();;
        turkey.fly();

        System.out.println("\n오리가 말하길");
        testDuck(duck);

        System.out.println("\n칠면조 어댑터가 말하길");
        testDuck(turkeyAdaptor);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}

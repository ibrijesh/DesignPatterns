package StatePattern;

import StatePattern.ConcreteState.DraftState;
import StatePattern.Context.DocumentContext;

public class StatePatternMain {
    public static void main(String args[]) {
        System.out.println("Hello World");

        DocumentContext document = new DocumentContext(new DraftState());

        document.Request();
        document.Request();
        document.Request();
        document.Request();
        document.Request();
        document.Request();


    }
}

package StatePattern.ConcreteState;

import StatePattern.Context.DocumentContext;
import StatePattern.State.IDocumentState;

public class DraftState implements IDocumentState {
    @Override
    public void handle(final DocumentContext context) {
        System.out.println("Document in in Draft State");
        context.setState(new ReviewState());
    }
}

package StatePattern.ConcreteState;

import StatePattern.ConcreteState.ApprovedState;
import StatePattern.Context.DocumentContext;
import StatePattern.State.IDocumentState;

public class ReviewState implements IDocumentState {

    @Override
    public void handle(final DocumentContext context) {
        System.out.println("Document under Review.");
        context.setState(new ApprovedState());
    }
}

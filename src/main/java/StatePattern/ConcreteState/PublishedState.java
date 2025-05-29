package StatePattern.ConcreteState;

import StatePattern.ConcreteState.ArchivedState;
import StatePattern.Context.DocumentContext;
import StatePattern.State.IDocumentState;

public class PublishedState implements IDocumentState {
    @Override
    public void handle(final DocumentContext context) {
        System.out.println("Document is Published");
        context.setState(new ArchivedState());
    }
}

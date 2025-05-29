package StatePattern.ConcreteState;

import StatePattern.Context.DocumentContext;
import StatePattern.State.IDocumentState;

public class ArchivedState implements IDocumentState {

    @Override
    public void handle(final DocumentContext context) {
        System.out.println("Document is Archived");
    }
}

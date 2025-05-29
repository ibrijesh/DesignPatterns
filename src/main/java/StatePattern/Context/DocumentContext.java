package StatePattern.Context;

import StatePattern.State.IDocumentState;


public class DocumentContext {
    private IDocumentState state;

    public DocumentContext(IDocumentState state) {
        this.state = state;
    }

    public void setState(IDocumentState state) {
        this.state = state;
    }

    public void Request() {
        state.handle(this);
    }

}

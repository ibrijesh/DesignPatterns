package StatePattern.State;

import StatePattern.Context.DocumentContext;

public interface IDocumentState {
    void handle(DocumentContext context);
}

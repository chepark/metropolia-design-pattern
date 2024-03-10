public abstract class HandlerChain {
    protected HandlerChain nextChain;

    public void setNextChain(HandlerChain nextChain) {
        this.nextChain = nextChain;
    }

    public abstract void handleFeedback(Message message);
}

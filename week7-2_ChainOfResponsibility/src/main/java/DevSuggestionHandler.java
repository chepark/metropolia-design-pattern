public class DevSuggestionHandler extends HandlerChain{
    @Override
    public void handleFeedback(Message message) {
        if (message.getMessageType() == MessageType.DEVELOPMENT_SUGGESTION) {
            System.out.println("Development suggestion logged: " + message.getMessageContent());
        } else if (nextChain != null) {
            nextChain.handleFeedback(message);
        }
    }
}

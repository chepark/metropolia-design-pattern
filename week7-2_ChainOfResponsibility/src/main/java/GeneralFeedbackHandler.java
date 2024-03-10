public class GeneralFeedbackHandler extends HandlerChain{
    @Override
    public void handleFeedback(Message message) {
        if (message.getMessageType() == MessageType.GENERAL_FEEDBACK) {
            System.out.println("General feedback analyzed: " + message.getMessageContent());
        } else if (nextChain != null) {
            nextChain.handleFeedback(message);
        }
    }
}

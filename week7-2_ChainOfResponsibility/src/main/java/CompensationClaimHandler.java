public class CompensationClaimHandler extends HandlerChain {
    @Override
    public void handleFeedback(Message message) {
        if (message.getMessageType() == MessageType.COMPENSATION_CLAIM) {
            System.out.println("Compensation claim processed: " + message.getMessageContent());
        } else if (nextChain != null) {
            nextChain.handleFeedback(message);
        }
    }
}

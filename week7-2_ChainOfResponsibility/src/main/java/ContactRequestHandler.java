public class ContactRequestHandler extends HandlerChain {
    @Override
    public void handleFeedback(Message message) {
        if (message.getMessageType() == MessageType.CONTACT_REQUEST) {
            System.out.println("Contact request forwarded: " + message.getMessageContent());
        } else if (nextChain != null) {
            nextChain.handleFeedback(message);
        }
    }
}

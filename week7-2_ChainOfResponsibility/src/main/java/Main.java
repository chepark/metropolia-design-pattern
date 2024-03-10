public class Main {
    public static void main(String[] args) {
        // Create handler chain
        HandlerChain compensation = new CompensationClaimHandler();
        HandlerChain contact = new ContactRequestHandler();
        HandlerChain development = new DevSuggestionHandler();
        HandlerChain general = new GeneralFeedbackHandler();

        compensation.setNextChain(contact);
        contact.setNextChain(development);
        development.setNextChain(general);

        // Create messages
        Message compensationClaim = new Message(MessageType.COMPENSATION_CLAIM, "I want a refund.", "customer1@example.com");
        Message contactRequest = new Message(MessageType.CONTACT_REQUEST, "I need help with my account.", "customer2@example.com");
        Message developmentSuggestion = new Message(MessageType.DEVELOPMENT_SUGGESTION, "Add a dark mode feature.", "developer@example.com");
        Message generalFeedback = new Message(MessageType.GENERAL_FEEDBACK, "Great service!", "customer3@example.com");

        // Process messages
        compensation.handleFeedback(compensationClaim);
        compensation.handleFeedback(contactRequest);
        compensation.handleFeedback(developmentSuggestion);
        compensation.handleFeedback(generalFeedback);
    }
}

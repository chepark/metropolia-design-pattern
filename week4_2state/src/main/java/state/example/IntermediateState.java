package state.example;

public class IntermediateState implements State {
    public void train(GameCharacter character) {
        System.out.println("Training... Gaining experience.");
        character.gainExperience(15);
    }

    public void meditate(GameCharacter character) {
        System.out.println("Meditating... Gaining health.");
        character.gainHealth(5);
    }

    public void fight(GameCharacter character) {
        System.out.println("Fighting is not available at the Intermediate level.");
    }
}

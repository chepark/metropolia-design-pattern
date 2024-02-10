package state.example;

public class NoviceState implements State{
    public void train(GameCharacter character) {
        System.out.println("Training... Gaining experience.");
        character.gainExperience(10);
    }

    public void meditate(GameCharacter character) {
        System.out.println("Meditation is not available at the Novice level.");
    }

    public void fight(GameCharacter character) {
        System.out.println("Fighting is not available at the Novice level.");
    }
}

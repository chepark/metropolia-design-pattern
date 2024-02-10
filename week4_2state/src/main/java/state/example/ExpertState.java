package state.example;

public class ExpertState implements State{
    public void train(GameCharacter character) {
        System.out.println("Training at Expert level... Gaining more experience.");
        character.gainExperience(20);
    }

    public void meditate(GameCharacter character) {
        System.out.println("Meditating at Expert level... Gaining more health.");
        character.gainHealth(10);
    }

    public void fight(GameCharacter character) {
        System.out.println("Fighting at Expert level... Gaining experience but losing some health.");
        character.gainExperience(30); // Gain more experience from fighting
        character.gainHealth(-15); // Lose some health due to fighting
    }
}

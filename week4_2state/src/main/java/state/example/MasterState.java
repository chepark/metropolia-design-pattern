package state.example;

public class MasterState implements State{
    public void train(GameCharacter character) {
        System.out.println("As a Master, you have transcended the need for training.");
    }

    public void meditate(GameCharacter character) {
        System.out.println("As a Master, your meditation is a testament to your enlightenment.");
    }

    public void fight(GameCharacter character) {
        System.out.println("As a Master, few can challenge you. Your battles are now beyond the physical.");
    }
}

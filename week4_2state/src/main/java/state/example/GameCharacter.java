package state.example;

public class GameCharacter {
    private String name;
    private int level;
    private int experiencePoints;
    private int healthPoints;
    private State state;

    public GameCharacter(String name) {
        this.name = name;
        this.level = 1;
        this.experiencePoints = 0;
        this.healthPoints = 100; // Default health points
        this.state = new NoviceState(); // Start at Novice level
    }

    // Delegate state-specific behavior to the current state object
    public void train() {
        state.train(this);
        checkLevelUp();
    }

    public void meditate() {
        state.meditate(this);
        checkLevelUp();
    }

    public void fight() {
        state.fight(this);
        checkLevelUp();
    }

    // Methods to gain experience and health
    public void gainExperience(int points) {
        this.experiencePoints += points;
    }

    public void gainHealth(int points) {
        this.healthPoints += points;
    }

    // Check and update the level/state based on experience points
    private void checkLevelUp() {
        if (this.experiencePoints >= 100 && !(this.state instanceof ExpertState)) {
            this.state = new ExpertState();
            this.level = 3; // Assuming level 2 is Intermediate
            System.out.println("You've advanced to Expert level!");
        } else if (this.experiencePoints >= 200 && !(this.state instanceof MasterState)) {
            this.state = new MasterState();
            this.level = 4; // Master level
            System.out.println("You've reached the Master level. Congratulations!");
        }
    }

    // Method to display current status
    public void displayStatus() {
        System.out.println("Character: " + name + ", Level: " + level + ", Experience: " + experiencePoints + ", Health: " + healthPoints);
    }

    public int getLevel() {
        return this.level;
    }
}


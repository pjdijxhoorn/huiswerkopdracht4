package novi.basics;

public abstract class Pokemon {
    private String Name;
    private int level;
    private int hp;
    private String sound;
    private String food;
// constructor(s) ----------------------------------------------------------------------------------

    public Pokemon() {

    }

    public Pokemon(String name, int level, int hp, String sound, String food) {
        Name = name;
        this.level = level;
        this.hp = hp;
        this.sound = sound;
        this.food = food;
    }
    // gettersNsetters -----------------------------------------------------------------------------

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }


// methods ----------------------------------------------------------------------------------

    public abstract void printPokemon();

    public void moves(String moves) {
        System.out.println(getName() + " " + moves + ".");
    }

    public void eats() {
        System.out.println(getName() + " likes to eat " + getFood() + ".");
    }

    public void ability() {
        System.out.println(getName() + " has the ability of tackle.");
    }
}


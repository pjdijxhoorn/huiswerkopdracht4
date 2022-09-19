package novi.basics;

public class GrassPokemon extends Pokemon{
    private boolean isPlant;
    private int evolutions;

    // constructor(s) ----------------------------------------------------------------------------------

    public GrassPokemon(String name, int level, int hp, String sound, String food, boolean isPlant, int evolutions) {
        super(name, level, hp, sound, food);
        this.isPlant = isPlant;
        this.evolutions = evolutions;
    }


    // methods ----------------------------------------------------------------------------------

    @Override
    public void eats() {
        System.out.println("This pokemon doesn't eat but photosynthesis instead.");
    }
    public void isplant(){
        if (isPlant == true)
        System.out.println(getName()+ "is a plant.");
        else
            System.out.println(getName() + "is a grass type pokemon but not a plant.");
    }
    public void evolutions(){
        System.out.println(getName()+ " has " + evolutions + " evolutions.");
    }


    // gettersNsetters -----------------------------------------------------------------------------

    public boolean isPlant() {
        return isPlant;
    }

    public void setPlant(boolean plant) {
        isPlant = plant;
    }

    public int getEvolutions() {
        return evolutions;
    }

    public void setEvolutions(int evolutions) {
        this.evolutions = evolutions;
    }
}

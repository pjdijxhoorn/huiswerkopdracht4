package novi.basics;

public class WaterPokemon extends Pokemon{

    private boolean canWalk;
    private String color;

    // constructor(s) ----------------------------------------------------------------------------------
    public WaterPokemon(String name, int level, int hp, String sound, String food, boolean canWalk, String color) {
        super(name, level, hp, sound, food);
        this.canWalk = canWalk;
        this.color = color;
    }

    // methods ----------------------------------------------------------------------------------
    @Override
    public void ability(){
        System.out.println(getName()+ " can use watergun.");
    }

    public void canwalk(){
        if (canWalk)
            System.out.println(getName() + " can walk");
        else
            System.out.println(getName() + " cannot walk");
    }

    public void color(){
        System.out.println(getName() + " is "+ color);
    }


    // gettersNsetters -----------------------------------------------------------------------------

    public boolean isCanWalk() {
        return canWalk;
    }

    public void setCanWalk(boolean canWalk) {
        this.canWalk = canWalk;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

package novi.basics;

public class FirePokemon extends Pokemon{
    private boolean isOnFire;
    private int bodyheat;

    // constructor(s) ----------------------------------------------------------------------------------
    public FirePokemon(String name, int level, int hp, String sound, String food, boolean isOnFire, int bodyheat) {
        super(name, level, hp, sound, food);
        this.isOnFire = isOnFire;
        this.bodyheat = bodyheat;
    }

    // methods ----------------------------------------------------------------------------------

    @Override
    public void ability(){
        System.out.println(getName()+ " can use ember.");
    }


    public void burns(){
        if (isOnFire == true)
            System.out.println(getName() + " is on fire.");
        else
            System.out.println(getName()+ " is not on fire.");
    }

    public void temperature(){
        System.out.println(getName() + " Has a temperature off " + getBodyheat() +".");
    }

    // gettersNsetters -----------------------------------------------------------------------------

    public boolean isOnFire() {
        return isOnFire;
    }

    public void setOnFire(boolean onFire) {
        isOnFire = onFire;
    }

    public int getBodyheat() {
        return bodyheat;
    }

    public void setBodyheat(int bodyheat) {
        this.bodyheat = bodyheat;
    }
}

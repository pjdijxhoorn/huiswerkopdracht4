package novi.basics;

public class ElectricPokemon extends Pokemon{
    private boolean isYellow;
    private String emotion;

    // constructor(s) ----------------------------------------------------------------------------------

    public ElectricPokemon(String name, int level, int hp, String sound, String food, boolean isYellow, String emotion) {
        super(name, level, hp, sound, food);
        this.isYellow = isYellow;
        this.emotion = emotion;
    }


    // methods ----------------------------------------------------------------------------------
    @Override
    public void ability(){
        System.out.println(getName()+ " can use shock.");
    }

    public void yellow(){
        if(isYellow)
            System.out.println(getName() +" is yellow.");
        else
            System.out.println(getName()+ " is not yellow.");
    }

    public void emotion(){
        System.out.println(getName() + " is "+ getEmotion()+".");
    }

    // gettersNsetters -----------------------------------------------------------------------------

    public boolean isYellow() {
        return isYellow;
    }

    public void setYellow(boolean yellow) {
        isYellow = yellow;
    }

    public String getEmotion() {
        return emotion;
    }

    public void setEmotion(String emotion) {
        this.emotion = emotion;
    }
}

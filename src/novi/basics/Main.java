package novi.basics;

public class Main {

    public static void main(String[] args) {

        //Neutral--------------------------------------------------------------------------------------------------
        System.out.println("-----Neutral-----");
        Pokemon mewto = new Pokemon();
        Pokemon mew = new Pokemon("mew",100,100,"mew","cosmic energy");
        System.out.println(mew.getName() +" is level "+ mew.getLevel()+ ", Has "+ mew.getHp()+"hp, and makes this sound: " + mew.getSound() );

        System.out.println("");

        //Grass--------------------------------------------------------------------------------------------------
        System.out.println("-----Grass-----");
        GrassPokemon Bulbasaur = new GrassPokemon("bulbasaur",14,60,"bulba bulbasaur", "sunlight",true,3);
        System.out.println(Bulbasaur.getName() +" is level "+ Bulbasaur.getLevel()+ ", Has "+ Bulbasaur.getHp()+"hp, and makes this sound: " + Bulbasaur.getSound() );

        Bulbasaur.ability();
        Bulbasaur.eats();
        Bulbasaur.moves("walks");
        Bulbasaur.isplant();
        Bulbasaur.evolutions();
        System.out.println("");

        //Fire--------------------------------------------------------------------------------------------------
        System.out.println("-----Fire-----");
        FirePokemon charmeleon = new FirePokemon("Charmeleon",13,52,"char char","small bugs",true,150);
        System.out.println(charmeleon.getName() +" is level "+ charmeleon.getLevel()+ ", Has "+ charmeleon.getHp()+"hp, and makes this sound: " + charmeleon.getSound() );
        charmeleon.ability();
        charmeleon.eats();
        charmeleon.moves("walks");
        charmeleon.burns();
        charmeleon.temperature();
        System.out.println("");

        //Water--------------------------------------------------------------------------------------------------
        System.out.println("-----Water-----");
        WaterPokemon squirtle = new WaterPokemon("Squirtle",2,5,"squirtle", "waterplants",true,"blue");
        squirtle.ability();
        squirtle.eats();
        squirtle.moves("swims");
        squirtle.canwalk();
        squirtle.color();
        System.out.println("");

        //Electric--------------------------------------------------------------------------------------------------
        System.out.println("-----Electric-----");
        ElectricPokemon pikachu = new ElectricPokemon("Pikachu", 5,45,"pika pika","berries",true,"happy");
        System.out.println(pikachu.getName() +" is level "+ pikachu.getLevel()+ ", Has "+ pikachu.getHp()+"hp, and makes this sound: " + pikachu.getSound() );
        pikachu.ability();
        pikachu.eats();
        pikachu.moves("hops");
        pikachu.yellow();
        pikachu.emotion();

    }
}




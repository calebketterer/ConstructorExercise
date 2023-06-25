public class Piece {

    String name;
    String faction;
    int value;

    Piece (String name, String faction, int value){

        this.name = name;
        this.faction = faction;
        this.value = value;

    }

    void summary (){
        System.out.println("The " + this.name +" belongs to the " + this.faction + " faction and is worth " + this.value + " points.");
    }
}

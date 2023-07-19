public class Piece {

    String name;
    String faction;
    int xLoc;
    int yLoc;
    int playerNum;
    int indexNum;

    Piece (String name, String faction){

        this.name = name;
        this.faction = faction;

    }

    Piece (String name, String faction, int xLoc, int yLoc){

        this.name = name;
        this.faction = faction;
        this.xLoc = xLoc;
        this.yLoc = yLoc;

    }

    Piece (String name, String faction, int xLoc, int yLoc, int playerNum, int indexNum){

        this.name = name;
        this.faction = faction;
        this.xLoc = xLoc;
        this.yLoc = yLoc;
        this.playerNum = playerNum;
        this.indexNum = indexNum;

    }

    void summary (){
            System.out.println("The " + this.name + " belongs to the " + this.faction + " faction.");
    }
}

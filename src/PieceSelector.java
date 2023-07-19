import java.util.Random;

public class PieceSelector {

    public static String SelectorData(int faction, int type){

        Piece[][] piece = new Piece[5][5]; //Two Dimensional Piece Array

        // Pieces need location, index, pt value, movement list

        //Random Piece Selector
        if(faction==-1||type==-1){
            Random rand = new Random();
            faction = rand.nextInt(5);
            type = rand.nextInt(5);
        }

        // Traditional Pieces
        piece[0][0] = PieceList.Royalty;
        piece[0][1] = PieceList.Rook;
        piece[0][2] = PieceList.Knight;
        piece[0][3] = PieceList.Bishop;
        piece[0][4] = PieceList.Pawn;

        // Melee Combat
        piece[1][0] = PieceList.Warlord;
        piece[1][1] = PieceList.Barracks;
        piece[1][2] = PieceList.HeavyCavalry;
        piece[1][3] = PieceList.Berserker;
        piece[1][4] = PieceList.Infantry;

        // Conspiracy
        piece[2][0] = PieceList.Usurper;
        piece[2][1] = PieceList.TortureChamber;
        piece[2][2] = PieceList.Emissary;
        piece[2][3] = PieceList.Informant;
        piece[2][4] = PieceList.Scout;

        // Pacifist
        piece[3][0] = PieceList.Peacekeeper;
        piece[3][1] = PieceList.Library;
        piece[3][2] = PieceList.Courier;
        piece[3][3] = PieceList.Squire;
        piece[3][4] = PieceList.Agent;

        // Cursed
        piece[4][0] = PieceList.Abomination;
        piece[4][1] = PieceList.HauntedManor;
        piece[4][2] = PieceList.PhantomRider;
        piece[4][3] = PieceList.Conjurer;
        piece[4][4] = PieceList.Spectre;

        return "The " + piece[faction][type].name + " pieces belong to the " + piece[faction][type].faction + " faction.";
    }
}
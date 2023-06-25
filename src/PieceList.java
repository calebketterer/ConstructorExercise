public class PieceList {

    // Traditional Chess Pieces
    static Piece King = new Piece("King","Traditional",8);
    static Piece Queen = new Piece("Queen","Traditional",8);
    static Piece Royalty = new Piece("King and Queen","Traditional",8);
    static Piece Rook = new Piece("Rook","Traditional",5);
    static Piece Knight = new Piece("Knight","Traditional",3);
    static Piece Bishop = new Piece("Bishop","Traditional",3);
    static Piece Pawn = new Piece("Pawn","Traditional",1);

    // Melee Combat Variant
    static Piece Warlord = new Piece("Warlord","Melee Combat",9);
    static Piece Barracks = new Piece("Barracks","Melee Combat",6);
    static Piece HeavyCavalry = new Piece("Heavy Cavalry","Melee Combat",4);
    static Piece Berserker = new Piece("Berserker","Melee Combat",4);
    static Piece Infantry = new Piece("Infantry","Melee Combat",2);

    // Conspiracy Variant
    static Piece Usurper = new Piece("Usurper","Conspiracy",9);
    static Piece TortureChamber = new Piece("Torture Chamber","Conspiracy",6);
    static Piece Emissary = new Piece("Emissary","Conspiracy",4);
    static Piece Informant = new Piece("Informant","Conspiracy",4);
    static Piece Scout = new Piece("Scout","Conspiracy",2);

    // Pacifist Faction
    static Piece Peacekeeper = new Piece("Peacekeeper","Pacifist",9);
    static Piece Library = new Piece("Library","Pacifist",6);
    static Piece Courier = new Piece("Courier","Pacifist",4);
    static Piece Squire = new Piece("Squire","Pacifist",4);
    static Piece Agent = new Piece("Agent","Pacifist",2);

    // Cursed Faction
    static Piece Abomination = new Piece("Abomination","Cursed",9);
    static Piece HauntedManor = new Piece("Haunted Manor","Cursed",6);
    static Piece PhantomRider = new Piece("Phantom Rider","Cursed",4);
    static Piece Conjurer = new Piece("Conjurer","Cursed",4);
    static Piece Spectre = new Piece("Spectre","Cursed",2);

}

public class PieceList {

    static Piece EmptySpace = new Piece("--X--","None");

    // Traditional Chess Pieces
    static Piece King = new Piece("King","Traditional");
    static Piece Queen = new Piece("Queen","Traditional");
    static Piece Royalty = new Piece("King and Queen","Traditional");
    static Piece Rook = new Piece("Rook","Traditional");
    static Piece Knight = new Piece("Knight","Traditional");
    static Piece Bishop = new Piece("Bishop","Traditional");
    static Piece Pawn = new Piece("Pawn","Traditional");

    // Melee Combat Variant
    static Piece Warlord = new Piece("Warlord","Melee Combat");
    static Piece Barracks = new Piece("Barracks","Melee Combat");
    static Piece HeavyCavalry = new Piece("Heavy Cavalry","Melee Combat");
    static Piece Berserker = new Piece("Berserker","Melee Combat");
    static Piece Infantry = new Piece("Infantry","Melee Combat");

    // Conspiracy Variant
    static Piece Usurper = new Piece("Usurper","Conspiracy");
    static Piece TortureChamber = new Piece("Torture Chamber","Conspiracy");
    static Piece Emissary = new Piece("Emissary","Conspiracy");
    static Piece Informant = new Piece("Informant","Conspiracy");
    static Piece Scout = new Piece("Scout","Conspiracy");

    // Pacifist Faction
    static Piece Peacekeeper = new Piece("Peacekeeper","Pacifist");
    static Piece Library = new Piece("Library","Pacifist");
    static Piece Courier = new Piece("Courier","Pacifist");
    static Piece Squire = new Piece("Squire","Pacifist");
    static Piece Agent = new Piece("Agent","Pacifist");

    // Cursed Faction
    static Piece Abomination = new Piece("Abomination","Cursed");
    static Piece HauntedManor = new Piece("Haunted Manor","Cursed");
    static Piece PhantomRider = new Piece("Phantom Rider","Cursed");
    static Piece Conjurer = new Piece("Conjurer","Cursed");
    static Piece Spectre = new Piece("Spectre","Cursed");

}

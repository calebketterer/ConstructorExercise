public class Board {

    static final int xSize = 8;
    static final int ySize = 8;

    static Piece[][] EmptyBoardSpace = {

            {null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null}, //black or p2
            {null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null}, //white or p1
            {null, null, null, null, null, null, null, null}

    };

    static Piece[][] StandardBoardSpace = {

            {PieceList.Rook, PieceList.Knight, PieceList.Bishop, PieceList.Queen, PieceList.King, PieceList.Bishop, PieceList.Knight, PieceList.Rook},
            {PieceList.Pawn, PieceList.Pawn, PieceList.Pawn, PieceList.Pawn, PieceList.Pawn, PieceList.Pawn, PieceList.Pawn, PieceList.Pawn},
            {PieceList.EmptySpace, PieceList.EmptySpace, PieceList.EmptySpace, PieceList.EmptySpace, PieceList.EmptySpace, PieceList.EmptySpace, PieceList.EmptySpace, PieceList.EmptySpace},
            {PieceList.EmptySpace, PieceList.EmptySpace, PieceList.EmptySpace, PieceList.EmptySpace, PieceList.EmptySpace, PieceList.EmptySpace, PieceList.EmptySpace, PieceList.EmptySpace},
            {PieceList.EmptySpace, PieceList.EmptySpace, PieceList.EmptySpace, PieceList.EmptySpace, PieceList.EmptySpace, PieceList.EmptySpace, PieceList.EmptySpace, PieceList.EmptySpace},
            {PieceList.EmptySpace, PieceList.EmptySpace, PieceList.EmptySpace, PieceList.EmptySpace, PieceList.EmptySpace, PieceList.EmptySpace, PieceList.EmptySpace, PieceList.EmptySpace},
            {PieceList.Pawn, PieceList.Pawn, PieceList.Pawn, PieceList.Pawn, PieceList.Pawn, PieceList.Pawn, PieceList.Pawn, PieceList.Pawn},
            {PieceList.Rook, PieceList.Knight, PieceList.Bishop, PieceList.Queen, PieceList.King, PieceList.Bishop, PieceList.Knight, PieceList.Rook}

    };

    static Piece [][] CurrentBoardSpace = StandardBoardSpace;

    public static void BoardSpace() {
        for (int i = 0; i < xSize; i++) {
            for (int j = 0; j < ySize; j++) {
                System.out.print(CurrentBoardSpace[i][j].name + " ");
            }
            System.out.println("\n");
        }
    }


}

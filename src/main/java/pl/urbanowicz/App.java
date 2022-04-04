package pl.urbanowicz;

import pl.urbanowicz.task.*;

public class App {
    public static void main(String[] args) {
        ChessPiece blackPawn = new BlackPiece("Czarny Pionek","7", "a");
        ChessPiece whitePawn = new WhitePiece("Biały Pionek","2","a");
        ChessPiece blackQueen = new BlackQueen("Czarna Królowa");
        ChessPiece whiteQueen = new WhiteQueen("Biala Królowa");

        //exactly same color object is used
        System.out.println(blackPawn.getColor()==blackQueen.getColor());
        System.out.println(whitePawn.getColor()==whiteQueen.getColor());


        // List<Object> activeUnits = new ArrayList<>();
        // for (int i = 0; i < 10000000; i++) {
        //     activeUnits.add(new TeslaTank(0, 0));
        //     activeUnits.add(new Rifleman(0, 0));
        //     activeUnits.add(new Destroyer(0, 0));
        // }
    }
}

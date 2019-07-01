package com.stackroute.PE3;

public class ChessBoard {

    public String[][] chessBoard() {
        String[][] chess = new String[8][8];
        for(int i=0; i<8; i=i+2){

            for(int j=0;j<8; j+=2) {
                chess[i][j] = "WW|";
            }

            for(int k=1;k<8; k+=2) {
                chess[i][k] = "BB|";
            }

        }

        for(int i=1; i<8; i=i+2){

            for(int j=0;j<8; j+=2) {
                chess[i][j] = "BB|";
            }

            for(int k=1;k<8; k+=2) {
                chess[i][k] = "WW|";
            }

        }

        return chess;


    }

}

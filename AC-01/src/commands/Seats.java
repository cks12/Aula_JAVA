package commands;

public class Seats {
    int[][] listSeats;
    public Seats(){
        this.listSeats = new int[8][20];
    }

    public void displaySeats(){
        System.out.println("\n----- Mapa de Assentos -----\n");
        System.out.println(" 01 02 03 04 05 06 07 08 09 10 11 12 13 14 15 16 17 18 19 20");
        for (int i = 0; i < listSeats.length; i++) {

            System.out.print((char) ('A' + i) + " ");

            for (int j = 0; j < listSeats[i].length; j++) {

                    System.out.print(listSeats[i][j] + "  ");
            }

            System.out.println();
        }

        System.out.println();
    }
}

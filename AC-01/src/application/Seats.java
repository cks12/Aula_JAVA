package application;

public class Seats extends cash {

    int[][] listSeats;

    int row;
    int column; 

    public Seats(int row, int column, float ticket_price){
        super(ticket_price);
        this.row = row;
        this.column = column;

        this.listSeats = new int[row][column];
        
    }

    public void displaySeats(){
        System.out.println("\n----- Mapa de Assentos -----\n");

        System.out.print("  ");

        for (int i = 1; i <= this.column; i++){

            if (i <= 9)

                System.out.print("0"+i+" ");

            else

                System.out.print(i+" ");    

        }

        System.out.println();

        for (int i = 0; i < this.row; i++) {

            System.out.print((char) ('A' + i) + " ");

            for (int j = 0; j < this.column; j++) {

                    System.out.print(listSeats[i][j] + "  ");
            }

            System.out.println();
        }

        System.out.println();
    }
}

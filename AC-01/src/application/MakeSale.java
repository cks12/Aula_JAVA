package application;

import java.util.Scanner;

public class MakeSale extends commandsAbstract {

    public MakeSale(Seats _seats){

        super(_seats);

        this.name = "Realizar compra de ingresso";

    }

    @Override
    public void function(Scanner scanner){
        char finnaleLetter = (char) ((char) + 'A' + this.seats.row - 1);

        System.out.print("Informe a letra da fileira (A-"+finnaleLetter+"): ");
        String letterRow = scanner.next().toUpperCase();

        if (letterRow.charAt(0) < 'A' || letterRow.charAt(0) > finnaleLetter) {
            System.out.println("Fileira inválida.");
            return;
        }

        System.out.print("Informe o número da poltrona (1-"+this.seats.column+"):");
        int numberChair = scanner.nextInt();

        if (numberChair < 1 || numberChair > this.seats.column) {
            System.out.println("Poltrona inválida.");
            return;
        }

        int RowIndex = letterRow.charAt(0) - 'A';
        int ChairIndex = numberChair - 1;

        if(seats.listSeats[RowIndex][ChairIndex] == 0){
            seats.listSeats[RowIndex][ChairIndex] = 1;
            this.seats.make_sale();
            System.out.println("Compra efetuada com sucesso!");
        }else{
            System.out.println("Poltrona já vendida.");
        }
    }

}

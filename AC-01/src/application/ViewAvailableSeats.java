package application;

import java.util.Scanner;

public class ViewAvailableSeats extends commandsAbstract {

    public ViewAvailableSeats(Seats _seats){

        super(_seats);

        this.name = "Visualizar lugares disponíveis";

    }

    @Override
    public void function(Scanner scanner){

        this.seats.displaySeats();

    }
}

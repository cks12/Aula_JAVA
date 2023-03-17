package application;

import java.util.Scanner;

public class ViewResume extends commandsAbstract {

    public ViewResume(Seats _seats){

        super(_seats);

        this.name = "Exibir relatório";

    }

    @Override
    public void function(Scanner scanner){

        this.seats.print_total_cash();

    }
}

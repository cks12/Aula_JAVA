package commands;

public class ViewAvailableSeats extends commandsAbstract {

    public ViewAvailableSeats(Seats _seats){
        super(_seats);
        this.name = "Visualizar lugares disponíveis";
    }

    @Override
    public void function(){
        this.seats.displaySeats();
    }
}

package commands;

public abstract class commandsAbstract {
    public String name;
    public Seats seats; 

    public commandsAbstract(Seats _seats){
        this.seats = _seats;
    }

    public abstract void function();
}
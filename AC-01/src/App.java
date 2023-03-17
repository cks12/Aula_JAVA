// CAIO CAIK FRESNEDA DE SOUZA

// Imports commands package
import java.util.Scanner;

import commands.*;

public class App {

    static Seats seats;

    static commandsAbstract[] commands = new commandsAbstract[1];

    private static void createCommands(){
        commands[0] = new ViewAvailableSeats(seats);
    }

    private static void writeCommand(int number,String name){
        System.out.println(number+". "+name);
    }

    private static void viewAllCommands(){
        for (int i=0; i < commands.length; i++){
            writeCommand(i+1, commands[i].name);
        }
        writeCommand(commands.length+1, "Sair");
    };

    private static void executeCommand(int index){
        if(index < 0  ||  index > commands.length){
            System.out.println("> Comando invalido!");
            return;
        }
        commands[index - 1].function();
        return;

    }

    private static void readLine(){
        Scanner scanner = new Scanner(System.in);
        int option;
        while(true){
            viewAllCommands();
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();

            if(option == commands.length+1){
                break;
            }

            executeCommand(option);
        }
        scanner.close();
    }
    public static void main(String[] args)  {
        seats = new Seats();  
        createCommands();  
        readLine();
    }
}

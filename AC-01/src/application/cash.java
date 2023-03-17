package application;

public class cash {

    private float ticket_price;
    private int sale_ticket;
    private float total_cash;

    public cash (float ticket_price) {

        this.ticket_price = ticket_price;
        this.total_cash = 0;
        this.sale_ticket = 0;
    }

    public void make_sale(){
        this.total_cash += ticket_price;
        this.sale_ticket += 1;
    }

    public void print_total_cash(){
        System.out.println("Ingressos Vendidos............: "+sale_ticket);
        System.out.println("Total Arrecadado..............: R$ "+total_cash);
    }
}

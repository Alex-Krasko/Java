package Arch_PO_4;

public class Lesson_4 {
    
}

class Customer {
    public int id;
    public Ticket[] tickets;
    public CashProvider cash;

    public boolean buyTicket(Ticket ticket[]){ return true; }
    public Ticket searchTicket(DateTime dt, int num){ return tickets[num];}
}

class Ticket extends Customer{
    public int rootNumber;
    public int place;
    public int price;
    public DateTime date;
    public boolean isValid;
}

abstract class CashProvider {
    public long card;
    public boolean isAuthorization;

    public void buy(int price){}
    public void authorization(Customer customer){}
}

class TicketProvider extends Customer{
    public Ticket[] getTickets(int rootNumber){ return tickets; }
    public boolean updateTicketStatus(Ticket tickets) { return true; }
}

class DateTime {}
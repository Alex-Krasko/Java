package Arch_PO_4;

import java.util.Date;
import java.util.Scanner;

public class Lesson_4 {
public static void main(String[] args) {

    Scanner scanner = new Scanner("Введите номер маршрута?");
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите номер маршрута: ");

    int routeNumber = sc.nextInt();
    String ddd = scanner.nextLine();
    Customer you = new Customer(1);

    System.out.println("Введите номер карты: ");
    long cardNumber = sc.nextInt();
    you.cash = new CashProvider(cardNumber);
    you.cash.authorization(you);

    you.tickets = new TicketProvider().getTickets(112);

    you.buyTicket(you.searchTicket(new Date(),1));

    new  TicketProvider().updateTicketStatus(you.searchTicket(new Date(),1));
}

}

class Customer {
public int id;
public Ticket[] tickets;
public CashProvider cash;

public Customer(int id)
{
    this.id = id;
}

public boolean buyTicket(Ticket ticket)
{
    System.out.println("Вы купили билет на место "+ ticket.place+" маршрут "+ticket.rootNumber);
    return true;
}
public Ticket searchTicket(Date dt, int num){ return tickets[num];}

}

class Ticket{
public int rootNumber;
public int place;
public int price;
public Date date;
public boolean isValid;

public Ticket(int route, int place, int price, Date dat, boolean valid)
{
    this.rootNumber = route;
    this.place = place;
    this.price = price;
    this.date = dat;
    this.isValid = valid;
}

}

class CashProvider {
public long card;
public boolean isAuthorization;

public CashProvider(long card)
{
    this.card = card;
}

public void buy(int price){}
public void authorization(Customer customer){isAuthorization = true;}

}

class TicketProvider {
public Ticket[] getTickets(int rootNumber)
{
Ticket[] ticks = new Ticket[3];
ticks[0] = new Ticket(112,1,36,new Date(),false);
ticks[1] = new Ticket(112,2,36,new Date(),false);
ticks[2] = new Ticket(112,3,36,new Date(),false);
return ticks;
}
public boolean updateTicketStatus(Ticket tickets) { return true; }
}

public class Bus {
int seats;
String color;

Bus(int seats, String color)
{
	this.seats=seats;
	this.color=color;
}

Bus(){
	this(40);
}

Bus(int seats)
{
	this(seats,"red");
}
void printDetails() {
	System.out.println("Seat color :"+color+" Seat :"+seats+"\n");
}

}

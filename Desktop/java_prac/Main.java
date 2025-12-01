class Car{
String brand;
int year;

void start(){
	System.out.println(brand + "  starting");
	}
}

public class Main{
public static void main(String[] args){
	Car c1 = new Car();
	c1.brand="toyota";
	c1.year =2020;

	c1.start();
}
}
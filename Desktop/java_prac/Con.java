class Laptop{
	String model;
	int price;

 Laptop(String m,int p){
	
	model = m;
 	price =p;
	}

	void use(){
	System.out.println("u r using " +model);
	}
}
public class Con{
	public static void main(String[] args) {
	Laptop l1 = new Laptop("Lenovo",5000);
	Laptop l2 = new Laptop("Asus",2300);
	l1.use();
	l2.use();
}
}
 	



	
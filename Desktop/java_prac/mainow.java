class god{
	int age;
	String name;


god(int praayam, String peru){
		age=praayam;
		name=peru;
		}

 void bless(){
System.out.println(name + "is blessing");
}
}


public class Mainow{
	public static void main(String[] args){
		god jesus= new god(100,"jesus");
	jesus.bless();
		}
}
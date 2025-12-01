 class Bird{

String name;
int sound_hz;


void fly(){
System.out.println(name +" is flying");
}


}
public class Tom{
public static void main(String[] args){
	Bird c1 = new Bird();
	c1.name="crow";
	c1.sound_hz= 1500;
	c1.fly();
}
}

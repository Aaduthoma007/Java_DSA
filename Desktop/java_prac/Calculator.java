public class Calculator{
	public static void main(String[] args){
	//expecting int a "op" int b
	int a=Integer.parseInt(args[0]);
	String op=args[1];
	int b=Integer.parseInt(args[2]);

	switch(op){
	case "+":
	System.out.println("sum is "+(a+b));
	break;
	
	case "-":
	System.out.println("difference is " +(a-b));
	break;

	case "*":
	System.out.println("multiplied value is" +(a*b));
	break;

	case "/":
	if(b==0){
	System.out.println("Division Undefined");
	}
	else{
	System.out.println("divided value is " +(a/b));
	
	}
	break;
	}
}
}


	
	
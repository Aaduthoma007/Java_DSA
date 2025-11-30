import java.io.*;
import java.util.*;

public class UIArray{
public static void main(String[] args){
	Scanner sc =new Scanner(System.in);
	System.out.println("enter array limit");
	int size=sc.nextInt();
	int[] arr = new int[size];
	System.out.println("enter array elements");
	for(int i=0;i<size;i++){
		
		arr[i]=sc.nextInt();

		
	}

	disp(arr);

	}
		

static void disp(int[] arr){
	System.out.println("array elements are:");
	for(int x: arr){
	System.out.println(x);
	}

	}
	
}
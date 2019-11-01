
import java.util.Scanner;

 class PassException {
	
	Scanner inp=new Scanner(System.in);
	String name;
	int pass;
	void input()
	{
	System.out.println("Enter Username");
	name=inp.nextLine();
	
	try{
		System.out.println("Enter Password");
		pass=inp.nextInt();
	}
	catch(Exception e){
		System.out.println("Don't enter characters");
	}
	
	}

	
	public static void main(String[] args) {
		PassException out=new PassException();
		out.input();
		
	}

}

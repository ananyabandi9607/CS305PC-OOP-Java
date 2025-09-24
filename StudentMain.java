package Student;
import java.util.Scanner;
import java.io.*;
class StudentMain implements Operation{
	static String id,name,branch,password;
	static fname="student.txt";
	static Scanner s=new Scanner(System.in);
	public void registration(Student std){
		System.out.println("============");
		System.out.println("REGISTER");
		System.out.println("============");
		
		
	}
	public void logIn(String id,String password){
		try{
			BufferReader reader=new BufferReader(new FileReader(fname));
			String data;
			while((data=reader.readLine())!=null){
				String info
			}
		}
	}
	public void exit(){
		System.exit(0);
	}
	public static void main(String...args){
		StudentMain sm=new StudentMain();
		System.out.println("====================");
		System.out.println("WELCOME TO SMS");
		System.out.println("====================");
		
	}
}

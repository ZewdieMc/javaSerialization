import java.io.*;
public class Deserial{

	public static void main(String ...args){
		Employee e = null;
		try
		{
		FileInputStream fin = new FileInputStream("employee.ser");
		ObjectInputStream oin = new ObjectInputStream(fin);
		e = (Employee)oin.readObject();
		System.out.println("name:"+e.name);
		System.out.println("age:"+e.age);
		System.out.println("number:"+e.number);
		fin.close();//close the file input stream
		oin.close();//close the object input stream
		}
		catch(Exception x){
		x.printStackTrace();//print the exception
		}
	
	}
}

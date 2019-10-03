import java.io.*;
public class Serial{
       
	public static void main(String...args){ 
	Employee e = new Employee();//object to serialize
	e.name =  "Zewdie Habtie";
	e.age  = 27;
	e.number = 123456789;
	try{
	FileOutputStream fout = new FileOutputStream("employee.ser");
	ObjectOutputStream out = new ObjectOutputStream(fout);
	out.writeObject(e);
	fout.close();//close the file output stream
	out.close();//close the object output stream	
	System.out.println("Employee object has been serialized to employee.ser");
	}catch(IOException x){
		x.printStackTrace();
	}

}

}

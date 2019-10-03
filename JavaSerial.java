/*In java to Serialize an object, you have to first create a class for the object which implements a serializable interface.
and use FileOutputStream and ObjectOutputStream to write the object to a .ser file in your local disk.
you need to do something like the following:*/
//the object which needs to be serialized
import java.io.*;
public class Employee implements Serializable{
	private String name;
	private int age;

	public setAge(int age){this.age = age;}
	public setName(String name){this.name = name;}

	public getAge(){return this.age;}
	public getName(){return this.name;}
}

//serializing class

pulic class Serialize{
	public staic void main(String...args){
	Employee e  = new Employee();
	e.setName("zewdie"):
	e.setAge(23);
	try{
		FileOutputStream fout = new FileOutputStream("employee.ser");
		ObjectOutputStream out =new ObjectOuputStream(fout);
		out.writeObject(e);
		fout.close();//close the file output stream
		out.close();//close the object output stream
	}catch(Exception x) {x.printStackTrace();}
}

}
//deserializing class
public class Deserial{
	public static void main(String ...args){
		Employee e = null;
		try{
		 FileInputStream fin = new FileInputStream("employee.ser");
		ObjectInputStream in = new ObjectInputStream(fin);
		e = (Employee)in.readObject();//read the object from the .ser file and cast it to Employee object.
		}
		catch(Exception x){}
		System.out.println("name:"+e.getName());
		System.out.println("age:"+e.getAge());
	}
}

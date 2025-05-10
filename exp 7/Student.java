import java.io.*;
import java.util.Scanner;

class Student{
	public static void main(String[] args){
			String filename="stu.data";
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter name=");
			String name=sc.nextLine();
			
			System.out.println("Enter age=");
			int age=sc.nextInt();
			
			System.out.println("Enter height=");
			Float height=sc.nextFloat();
			
      System.out.println("Enter weight=");
			Float weight=sc.nextFloat();
			
			sc.nextLine();
			
			System.out.println("Enter city=");
			String city=sc.nextLine();
			
			System.out.println("Enter number=");
			long number=sc.nextInt();
			
			try(DataOutputStream dos=new DataOutputStream(new FileOutputStream(filename))){
			      dos.writeUTF(name);
			      dos.writeInt(age);
			      dos.writeFloat(height);
			      dos.writeFloat(weight);
			      dos.writeUTF(city);
			      dos.writeLong(number);
			}catch(IOException e){
			    e.printStackTrace();
			}
			
			try(DataInputStream dis=new DataInputStream(new FileInputStream(filename))){
			      System.out.println("Name="+dis.readUTF());
			      System.out.println("Age="+dis.readInt());
            System.out.println("Height="+dis.readFloat());
			      System.out.println("Weight="+dis.readFloat());
			      System.out.println("City="+dis.readUTF());
			       System.out.println("Number="+dis.readLong());
			    
			   
			}catch(IOException e){
			    e.printStackTrace();
			}
	}
}

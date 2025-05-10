import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile{
	public static void main(String[] args){
	String filePath = "/home/aryan/java/exp 7/output/result.txt";
		try(BufferedReader reader=new BufferedReader(new FileReader(filePath))){
		    String line;
		    	   
		    System.out.println("Contents of the file");
		    while((line=reader.readLine())!=null){
		        System.out.println(line);
		    }
		}catch(IOException e){
		    e.printStackTrace();
		}
	}
}

import java.util.Scanner;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FirstGit{
	public static void main(String []args){
		try{
			FileInputStream fis = new FileInputStream("d:/file/mydata.bin");
			DataInputStream dis = new DataInputStream(fis);
			String name = dis.readLine();
			fis.close();
			dis.close();
			System.out.print("Hello World I am " + name);
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}

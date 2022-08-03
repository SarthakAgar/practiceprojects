package practiceproject3;
import java.io.*;

public class Filehandlingproject {
File f;
FileWriter fw;
BufferedWriter bw;
FileReader fr;
BufferedReader br;
void createFile() throws IOException
{
	f =new File("inputfile.txt");
    if (!f.exists()) {
    	f.createNewFile();
    }
}
  void writeFile()  throws IOException
  {
	  fw =new FileWriter(f);
	  bw =  new BufferedWriter(fw);
	  bw.write("welcome to java");
	  bw.close();
	  System.out.println("file content written successfully");
  }
  void appendFile()  throws IOException
  {
	  fw =new FileWriter(f,true);
	  bw = new BufferedWriter(fw);
	  bw.newLine();
	  bw.write("welcome to java world ");
	  bw.close();
	//  bw.newLine();
	  System.out.println("file content appended successfully");
  }
  void readFile() throws IOException
  {
	  fr = new FileReader(f);
	  br = new BufferedReader(fr);
	  String s="";
	  String data="";
	  while((s=br.readLine())!=null)
	  {
		  data=data+s;
	  }
	  System.out.println(data);
  }
  public static void main(String[] args) throws IOException
  {
	  Filehandlingproject obj = new Filehandlingproject();
	  obj.createFile();
	  obj.writeFile();
	  obj.appendFile();
	  obj.readFile();
  }
}

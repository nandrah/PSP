import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FilesLibrary {

public void readFile(List list) {
	FileReader file_reader = null;
	try{
		file_reader = new FileReader("C:\\Users\\alevi\\OneDrive\\Documents\\Maestria\\Espec_Reqs_Mod_SW\\Programas\\PSP-master\\PSP-master\\proyecto_01\\data_1.txt");
	}catch(FileNotFoundException e) {
		System.out.println("File not found: " + e);
	}
	BufferedReader buffered_reader = new BufferedReader(file_reader);
	try{
		String line = buffered_reader.readLine();
		float value;
		Node new_node = null;
		while (line != null) {
			value = Float.parseFloat(line);
			new_node = new Node(value);
			list.addNode(new_node);
			line = buffered_reader.readLine();
		}
	} catch(IOException e) {
		System.out.println("Read File Error: " + e);
	}
}

}

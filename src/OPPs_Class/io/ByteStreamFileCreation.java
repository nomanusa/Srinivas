package OPPs_Class.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamFileCreation {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fout = null;
		
		String outText = "My first byte stream file";
		try {
			fout = new FileOutputStream("ByteStreamFile.txt");
			fout.write(outText.getBytes());
			fout.write("\nSecond line of my byte stream file".getBytes());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			fout.close();      // to close the stream safely
		}
		System.out.println("Byte file created");
	}

}

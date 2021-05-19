package OPPs_Class.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStramCopyFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fin = null;
		FileOutputStream fout = null;
		
		try {
			fin = new FileInputStream("ByteStreamFile.txt");
			fout = new FileOutputStream("CopyByteStreamFile.txt");
			int b = fin.read();
			while(b!=-1) {
				fout.write(b);
				b = fin.read();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			fin.close();
			fout.close();
		}
		System.out.println("File copied");
	}

}

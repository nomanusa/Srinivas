package OPPs_Class.io;

import java.io.File;
import java.io.IOException;

public class UsingFileClass {

	public static void main(String[] args) throws IOException {
		fileRelated();
		//dirRelated();

	}
	
	public static void fileRelated() throws IOException {
		File file = new File("ByteStreamFile2.txt");
		System.out.println("Is exist : " + file.exists());
		System.out.println("Is file created : " + file.createNewFile());
		System.out.println("Is exist : " + file.exists());
		System.out.println("Absolute path : " + file.getAbsolutePath());
		System.out.println("Get Parent : " + file.getParent());
		System.out.println("Get Path : " + file.getPath());
		System.out.println("Get Name : " + file.getName());
		System.out.println("File length : " + file.length());
		System.out.println("File can read : " + file.canRead());
		System.out.println("File can write : " + file.canWrite());
		System.out.println("Set only read : " + file.setReadOnly());
		System.out.println("Can write : " + file.canWrite());
		System.out.println("Is file : " + file.isFile());
		System.out.println("Is directory : " + file.isDirectory());
		System.out.println("Renaming : " + file.renameTo(new File("ByteStreamFile3.txt"))); // Rename or move
		System.out.println("--------------------------------------------");
		
//		File f = new File("ByteStreamFile3.txt");
//		System.out.println("Delete : " + f.delete());
	}
	
//	public static void dirRelated() throws Exception {
		
//		File dir = new File("MyDirectory");
//		System.out.println("exist : " + dir.exists());
//		System.out.println("Created directory ? - > " + dir.mkdir());
//		System.out.println("exist  : " + dir.exists());
//		System.out.println("Is File : " + dir.isFile());
//		System.out.println("Is Directory : " + dir.isDirectory());
//		System.out.println("Absolute path : " + dir.getAbsolutePath());
//		System.out.println("-----------------");
//		File dir2 = new File(dir.getAbsolutePath() + "\\folder1\\folder2");
//		System.out.println("exist : " + dir2.exists());
//		System.out.println("Created directories ? - > " + dir2.mkdirs());
//		System.out.println("exist  : " + dir2.exists());
//		System.out.println("Is File : " + dir2.isFile());
//		System.out.println("Is Directory : " + dir2.isDirectory());
//		System.out.println("Absolute path : " + dir2.getAbsolutePath());
//		dir2.renameTo(new File(dir.getAbsolutePath() + "\\folder1\\RenamedFolder"));
		
//		File dir3 = new File( "D:\\SeleniumTraining\\8PMBatch\\JavaBasics\\MyDirectory\\folder1\\RenamedFolder");
//		dir3.delete();
		
//		File dir4 = new File( "D:\\SeleniumTraining\\8PMBatch\\JavaBasics\\MyDirectory\\folder1");
//		File[] fileArr = dir4.listFiles();
//		System.out.println("Files in the directory..");
//		for(File tFile : fileArr) {
//			System.out.println(tFile.getName());
//		}
//		
//	}

}

	
	


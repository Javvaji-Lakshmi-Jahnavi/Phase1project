import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
public class FileOperations {
	
	String directory="c:/users/laksh/documents/";
	
	public void showFiles()
	{
		
		File file=new File(directory);
		File[] fileList=file.listFiles();
		Arrays.sort(fileList);
		if(fileList!=null){
			System.out.println("list of files");
		for(File f:fileList)
		{
			System.out.println(f);
		}
		}
		else
			System.out.println("folder is empty");
	}
	public void deleteFile()
	{
	    System.out.println("enter file name");
	    @SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
	    String filename=s.nextLine();
	    File file1=new File(directory+filename);
		Boolean deleted=file1.delete();
		if(deleted)
		{
			System.out.println("successfully deleted");
		}
		else{
			System.out.println("file not found");
		}
	}
	public void searchFile() throws FileNotFoundException
	{
		System.out.println("enter file name");
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		String filename=s.nextLine();
		File filepath=new File(directory+"/"+filename);
		File file=new File(directory);
		File[] fileList=file.listFiles();
		
		for(File file1:fileList)
		{
			if(filepath.equals(file1))
				System.out.println("file found in"+directory);
				
		}
		
		
	}
		   
    public void addFile() {
    	@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
    	System.out.println("enter file name to add");
    	String filename=s.nextLine();
        File filepath = new File(directory +"/"+filename);
       
        try {
			filepath.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
        System.out.println("File "+filename+" added to "+ directory);
    }


	}


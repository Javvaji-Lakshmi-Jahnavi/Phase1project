
import java.io.FileNotFoundException;
import java .util.Scanner;
public class Main {
	static Scanner s=new Scanner(System.in);
	static FileOperations fo=new FileOperations();
	public static void mainMenu(){
		int n;
	System.out.println("LockedMe Application");
	System.out.println("Developed by : Jahnavi");
	
		System.out.println("1.Show List of files\n2.Show file option menu\n3.Close");
		
		
		System.out.println("Enter your choice:");
		n=s.nextInt();

	switch(n)
	{
	case 1:
	fo.showFiles();
	mainMenu();
	
	break;
	case 2:
		secondaryMenu();
	
	break;
	case 3:
		
	break;
	default:
		System.out.println("wrong choice");
	
	
	}
	}
	@SuppressWarnings("unused")
	public static void secondaryMenu() 
	{
		
		int x;
		System.out.println("1.Add a file\n2.Delete a file\n3.Search a file\n4.Return to mainmenu");
		System.out.println("enter your option");
		x=s.nextInt();
		switch(x){
		case 1:
			fo.addFile();
			secondaryMenu();
		break;
		case 2:fo.deleteFile();
		secondaryMenu();
		break;
		case 3:
			
			try {
				fo.searchFile();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
		secondaryMenu();
		break;
		case 4:mainMenu();
		break;
		default:
			System.out.println("wrong choice");
		}
		
        	
	}
	
public static void main(String[] args)
{
	mainMenu();
}
}




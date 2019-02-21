import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date; 

public class Task {
	
	private String title; 
	private String project; 
	private String dueDate; 
	private String status; 

	
	
	public Task(String title, String project, String date, String status) 
	{
		this.title = title;
		this.project = project;
		dueDate = date;
		this.status = status; 
		
		
	
	}
	
	public Task() 
	{ 
		  
		
		System.out.println( "Enter your the title of the task"); 
		  Scanner scanner = new Scanner (System.in); 
		  title = scanner.nextLine();
		  
		  System.out.println("Tilte of the project:  "+ title);
		  System.out.println();
		  
		  
		  System.out.println("Please Enter Duedate  dd-MM-yyyy at hh:mm:ss  "); 
		   boolean isDueDate= false; 

		    Scanner input = new Scanner(System.in); 
		    
		    
			
		     
		 do  {
			 dueDate  = input.nextLine(); 
		 
			SimpleDateFormat dateFormat = new SimpleDateFormat( "  dd-MM-yyyy 'at'  hh:mm:ss");
		    
		    
			try {
				Date date = dateFormat.parse(dueDate);
				System.out.println(date);
				isDueDate = true; 
				
			} 
			
			catch (ParseException e) {
				// TODO Auto-generated catch block
				System.out.println ( "please enter the correct date format dd-MM-yyyy");	
				
			}
			
		 }
			
			while (!isDueDate); 
			
		 
		 
		 
	}
		 
	
	
	
		
	
	
	
	public String getTitle()// this will return the task added
	
	{
		return title; 
	}
	
	
	
	
	public String getdueDate() // this will return the date
	
	{
		
		return dueDate;
	}
	
	

}

package JavaSession;

public class Loops {

	public static void main(String[] args) {
		//loops concepts//
		int p=1;
		while(p<20) 
		{
		System.out.println(p);
		p++;
		
		}
		System.out.println("using the  nested loop");
		        // Outer loop for number of rows
		        for (int i = 1; i  <= 5; i++) {
		            // Inner loop for number of stars in each row
		            for (int j = 1; j  <= i; j++) {
		                System.out.print("*");
		            }
		            // Move to the next line after printing stars in each row
		            System.out.println();
		        }
		        
		        System.out.println("Value of the Even NO=================>");
		        for(int i=1;i<100;i++)
		        	if(i%2 ==0)
		        	{
		        	System.out.println(i);
		        	}
		        
		        //dead code 
		        //not functional//which is not used $ ignored by a complier
		        
		        p=10;
		        int r=10;
		        if(p==r)
		        {
		        	System.out.println("both are aqual");
		        }
		        else
		        {
		        	System.out.println("both are not aqual");
		        }
		        	
		        
		        
		        
		    }
	
		
	
	

	}



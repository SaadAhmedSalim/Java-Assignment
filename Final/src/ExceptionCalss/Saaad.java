package ExceptionCalss;

class Saaaad{  
	  
	   static void validate(String name)throws Saad{  
	     if(name != "saad")  
	      throw new Saad("You wrote wrong");  
	     else  
	      System.out.println("It's right");  
	   }
	   
	   
	   
		 public static void main(String []args){
		    System.out.println("Check Name: ");
		     
		     
		      try{  
		        validate("saad");  
		        }
		        catch(Exception m){System.out.println("Exception occured: "+m);
		            
		        }  
		     }  

	
	}
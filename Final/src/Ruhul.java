
class Ruhul{  
	  
	   static void validate(String name)throws RuhulException{  
	     if(name != "Ruhul")  
	      throw new RuhulException("You wrote wrong");  
	     else  
	      System.out.println("right");  
	   }
	   
	   
	   
		 public static void main(String []args){
		    System.out.println("Check Name: ");
		     
		     
		      try{  
		        validate("Ruhul");  
		        }
		        catch(Exception m){System.out.println("Exception occured: "+m);
		            
		        }  
		     }  

	
	}
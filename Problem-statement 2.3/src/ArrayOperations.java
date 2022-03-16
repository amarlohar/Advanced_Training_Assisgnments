
public class ArrayOperations {
  
	    public static void main(String[] args) { 
	    	
	        //Initialize array  
	    	System.out.println("The Given Array"); 
	        int [] A = new int [] {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0};  
	       
	        for (int element: A) {
	            System.out.print(" "+element); 
	        } 
	        System.out.println("");
	        System.out.println("");
	        
	        A[15] = A[0]+A[14]; //the sum of elements from index 0 to 14 and stored at element 15
	      
	        System.out.println("The value of possition 15 is : " + A[15]); 
	        for (int element: A) {
	            System.out.print(" "+element); 
	        } 
	        System.out.println("");
	        System.out.println("");
	       
	            //calculate sum of all array elements
	        
	            int sum = 0;
	            for(int i=0; i < A.length ; i++)
	             sum = sum + A[i];
	            
	            //calculate average value
	             double average = sum / A.length;
	             A[16] = (int) average;
	             System.out.println("Average value of the array elements is : " + average); 
	             for (int element: A) {
	 	            System.out.print(" "+element); 
	 	        } 
	 	        System.out.println("");
	 	       System.out.println("");
	 	        
	 	        //Identifies the smallest value from the array and stores at element 17
	 	        
	 	       int smallest = Integer.MAX_VALUE;
	 	       
	 	        //find smallest element of array
	 	       
	 	       int index=0;
	 	        while(index<A.length) {
	 	        	
	 	            //check if smallest is greater than element
	 	        	
	 	            if(smallest>A[index]) {
	 	            	
	 	                //update smallest
	 	            	
	 	                smallest=A[index];
	 	            }
	 	            index++;
	 	        }
	 	        System.out.println("The smallest number is : "+ smallest);
	 	    
	 	       A[17]=smallest;
	 	     for (int element: A) {
	 	            System.out.print(" "+element); 
	 	        } 
	 	        System.out.println("");
	             
	    }  
	}  
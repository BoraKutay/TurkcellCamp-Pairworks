package pairwork.firstweek.third;

public class Main {

	public static void main(String[] args) {
		
		//ilk 2 arkadas sayi cifti || 220 ve 284
		
		int firstNumber = 2;
		int firstNumberSum = 0,secondNumberSum = 0;
		int count = 0;
		int numberOfPairs = 2;

		
		while(firstNumber>0) {
			
            for(int j = 1; j<firstNumber;j++) {
            	if(firstNumber % j == 0 ) {
            		firstNumberSum+= j;
            	}
            }
            
            for(int i = 1; i<firstNumberSum;i++) {
            	if(firstNumberSum % i == 0 ) {
            		secondNumberSum+= i;
            	}
            }
            
            if(firstNumber == secondNumberSum && firstNumber != firstNumberSum && firstNumber > firstNumberSum) {
            	System.out.println(firstNumber+"-"+firstNumberSum + " arkadas sayidir.");
            	count ++;
            }
            if(numberOfPairs == count) {
            	break;
            }
            firstNumber++;
    		firstNumberSum = 0;
    		secondNumberSum = 0;
            
		}
		
	}
}

        
        
        
        
        

	
	

	



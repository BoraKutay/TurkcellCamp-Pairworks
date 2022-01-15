package pairwork.firstweek.first;

public class Main {

	public static void main(String[] args) {
		
		int size = 1000;
		
		
		for(int i = 2; i < size; i++) {
			boolean flag = false;
			for(int j=2; j<i;j++) {
				
				if(i % j == 0) {
					flag = true;
					break;
				}
			}
			
			if(flag == false) {
				System.out.println(i);
				
			}

			
		}

	}

}

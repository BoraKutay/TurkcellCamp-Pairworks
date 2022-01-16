package pairwork.firstweek.second;

public class Main {

	public static void main(String[] args) {
		// ilk 5 süper sayı diziye aktar ve listele 28 süper sayı 
		// 28 __ 1 2 4 7 14
		// Kendisi hariç bölenlerinin toplamı
		// 5. sayı çok büyük olduğundan eklemedik
		// İlk 5 süper sayı -> 6, 28, 496, 8128, and 33550336.

		int[] superNumbers=new int[4];
		int sum=0;
		int sayi=2;
		int count=0;
		while(count!=4) {

		    for(int i=1;i<sayi;i++) {
			if(sayi%i==0) {
			    sum=sum+i;
			}
		    }
		    if(sayi==sum) {
			superNumbers[count]=sum;

			count++;
		    }
			sayi++;
			sum=0;
		}
		for (int i = 0; i < superNumbers.length; i++) {
		    System.out.println(superNumbers[i]);
		}
	}

}

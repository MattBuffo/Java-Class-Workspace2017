
public class arrayPractice {
	public static void main(String[] args){
		R61();
		P61();
	}
	public static void P61(){
		int array[] = new int[10];
		for(int i = 0; i <10; i++){
			
		}
	}
	public static void R61(){
		//array A
		int[] arrayA = new int [10];
		for(int i = 0; i < 10; i++){
			arrayA[i] = (i+1);
		}
		System.out.print("Array A:");
		for(int i = 0; i < 10; i++){
			System.out.print(" " + arrayA[i]);
		}
		System.out.println();
		
		
		//array B
		int[] arrayB = new int [11];
		for(int i = 0; i < 11; i++){
			arrayB[i] = (i*2);
		}
		System.out.print("Array B:");
		for(int i = 0; i < 11; i++){
			System.out.print(" " + arrayB[i]);
		}
		System.out.println();

		//array C
		int[] arrayC = new int [10];
		for(int i = 0; i < 10; i++){
			arrayC[i] = ((i+1)*(i+1));
		}
		System.out.print("Array C:");
		for(int i = 0; i < 10; i++){
			System.out.print(" " + arrayC[i]);
		}
		System.out.println();

		//array D
		int[] arrayD = new int [10];
		for(int i = 0; i < 10; i++){
			arrayD[i] = 0;
		}
		System.out.print("Array D:");
		for(int i = 0; i < 10; i++){
			System.out.print(" " + arrayD[i]);
		}
		System.out.println();
		
		//array E
		int[] arrayE = new int [9];
		for(int i = 0; i < 9; i++){
			switch(i){
			case 0: arrayE[0] = 1;
					break;
			case 1: arrayE[1] = 4;
					break;
			case 2: arrayE[2] = 9;
					break;
			case 3: arrayE[3] = 16;
					break;
			case 4: arrayE[4] = 9;
					break;
			case 5: arrayE[5] = 7;
					break;
			case 6: arrayE[6] = 4;
					break;
			case 7: arrayE[7] = 9;
					break;
			case 8: arrayE[8] = 11;
					break;
			}
		}
		System.out.print("Array E:");
		for(int i = 0; i < 9; i++){
			System.out.print(" " + arrayE[i]);
		}
		System.out.println();

		//array F
		int[] arrayF = new int [10];
		for(int i = 0; i < 10; i++){
			arrayF[i] = i%2;
		}
		System.out.print("Array F:");
		for(int i = 0; i < 10; i++){
			System.out.print(" " + arrayF[i]);
		}
		System.out.println();
		
		//array G
		int[] arrayG = new int [10];
		for(int i = 0; i < 10; i++){
			if( i <= 4){
				arrayG[i] = i;
			}
			else{
				arrayG[i] = i - 5;
			}
		}
		System.out.print("Array G:");
		for(int i = 0; i < 10; i++){
			System.out.print(" " + arrayG[i]);
		}
		System.out.println();
				
	}
}
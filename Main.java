public class Main {
	public static void main (String[] args){
		int[] A = {13, 11, 15, 12, 14, 15, 13, 11, 14};
		System.out.println(value(A));
		
		int[] arrA = {0, 5, 10, 5};
		int[] arrB = {3, 3, 5, 6};
		System.out.println(classification(arrA, arrB));
	}
	
	public static int value(int[] arr){
		int l = arr.length;
		int result = 0;
		int j = 0;
		for(int i = 0; i < l; i++){
			if(i == l - 1)
				return arr[i];
			for(j = 0; j < l; j++){
				if(i != j){
					if(arr[i] == arr[j])
						break;
					if(j == l - 1){
						return arr[i];
					}
				}
			}		
		}
		return result;
	}
	
	public static String classification(int[] A, int[] B){
		int Ax1, Ax2, Ay1, Ay2, Bx1, Bx2, By1, By2;
		Ax1 = A[0];
		Ax2 = A[0] + A[2];
		Ay1 = A[1];
		Ay2 = A[1] + A[3];
		
		Bx1 = B[0];
		Bx2 = B[0] + B[2];
		By1 = B[1];
		By2 = B[1] + B[3];
		
		if(A.equals(B))
			return "Bertumpukan";
		//Lepas
		if((Bx1 >= Ax2) || (Bx2 <= Ax1) || (By1 >= Ay2) || (By2 <= Ay1)){
			return "Lepas";
		}
		//Bertumpukan
		else if((Ax1 >= Bx1) && (Ay1 >= By1) && (Ax2 <= Bx2) && (Ay2 <= By2)){
			return "Bertumpukan";
		}
		else if((Bx1 >= Ax1) && (By1 >= Ay1) && (Bx2 <= Ax2) && (By2 <= Ay2)){
			return "Bertumpukan";
		}
		//Berisian
		else{
			return "Berisian";
		}
		
	}
}

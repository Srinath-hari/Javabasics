package week1.assignments;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,6,7,8};
        int length= arr.length;
		int total = (length+1)* (length+2)/2;
		for(int i=0;i<arr.length;i++) {
			total -= arr[i];	
		}
		System.out.println("Mising number is: "+total);
	}

}

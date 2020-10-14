package week1.day2.classroom;

public class PrintDuplicatesInArraywithoutcountvariable {
public static void main(String[] args) {
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		int count=0;
		for(int i=0;i<arr.length-1;i++) {
				for(int j=i+1;j<arr.length;j++) {
				    if(arr[i]==arr[j]) {
				    	System.out.print(arr[i]+" ");
				    	count+=1;
				    	}
				    }
				}
		System.out.println();
		System.out.println("Duplicate entries in the Array are: "+count);
		
	}

}

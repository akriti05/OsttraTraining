package MyPack;
import java.util.*;

public class Student {

	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int start= sc.nextInt(); int end= sc.nextInt();
	        int range = end-start;
	        range++;
	        int[] arr = new int[range];

	       
	        while(range-- >0){
	            char  c = sc.next().charAt(0);
	            if(c == 'A'){
	                int val = sc.nextInt();
	                arr[val% start] = val;
	            }
	            else if(c == 'X')  printAbsents(arr, start);
	            else if(c == 'Y')  printPresents( arr);
	            else if( c == 'Z') {sc.close();
	            System.out.println("No more inputs");}
	        }

	}
	  private static void printPresents(int[] arr) {
	        int [] sorted = new int[arr.length]; int i=0;
	        for( int a : arr) {
	            if(a != 0) sorted[i++] = a;
	        }
	        Arrays.sort(sorted);
	        for( int x : sorted) System.out.println(x);

	    }

	    private static void printAbsents(int[] arr, int start) {
	        int i=0;
	        for( int b : arr) {
	            if(b == 0) System.out.println(i+start); i++;
	        }
	    }
		

}

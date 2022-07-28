package MyPack;
import java.io.*;

public class Calc {

	public static void main(String[] args) {
		

		   
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    try {
		        //System.out.print("First number: ");
		        int num1 = Integer.parseInt(br.readLine());
		        //System.out.print("Second number: ");
		        int num2 = Integer.parseInt(br.readLine());
		        //System.out.print("Operator: ");
		        String operator = br.readLine();
		        double result = 0;
		        if (operator.equals ("+")) {
		            result = num1+num2;
		        } else if (operator.equals("-")){
		            result = num1-num2;
		        } else if (operator.equals("*")){
		            result = num1*num2;
		        } else if (operator.equals("/")){
		            result = num1/num2;
		        } else
		            System.out.println("Invalid operator");

		    System.out.println("Result is " + result);
		    }
		    catch (IOException ioe) {
		        System.out.println("Error Reading I/O");
		    }
		    catch (NumberFormatException nfe) {
		        System.out.println("wrong input provided");
		    }
		    catch (ArithmeticException ae) {
		        System.out.println("Can't divide by zero");
		    }}
		}


package tdd;

public class FizzBuzz {

	public String nextNumber(int i) {
		i++;
        int intNextNumber = i;
        int resultDivide3 = intNextNumber / 3;
        int resultMultiply3 = resultDivide3 * 3;
        int resultDivide5 = intNextNumber / 5;
        int resultMultiply5 = resultDivide5 * 5;
        boolean dividable3 = false;
        boolean dividable5 = false;
        
        String myNextNumber = Integer.toString(intNextNumber);
        if (myNextNumber.contains("3")){
        	return "Fizz";
        }
        if (myNextNumber.contains("5")){
        	return "Buzz";
        }
      
        if (intNextNumber == resultMultiply3){
        	dividable3 = true;
        }
        
        if (intNextNumber == resultMultiply5){
        	dividable5 = true;
        }
        if (dividable3 && dividable5){
        	return "FizzBuzz";
        }
        if (dividable3){
        	return "Fizz";
        }
        if (dividable5){
        	return "Buzz";
        }
		
		return Integer.toString(intNextNumber);
	}
	
	public String[] createFizzBuzz(int maxCount){
		String[] myStrings = new String[maxCount];
		for (int ii=0; ii<maxCount;ii++){
			myStrings[ii]=nextNumber(ii);
			System.out.println(nextNumber(ii));
		}
		return myStrings;
		
	}

}

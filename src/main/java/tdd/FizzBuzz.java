package tdd;

public class FizzBuzz {
	
	private boolean dividable(int inValue, int divider){
		int resultDivide = inValue / divider;
		int resultMultiply = resultDivide * divider;
		if (resultMultiply == inValue){
			return true;
		}
		
		return false;
		
	}

	public String nextNumber(int i) {
		i++;
        int intNextNumber = i;
        
        boolean dividable3 = false;
        boolean dividable5 = false;
        
        String myNextNumber = Integer.toString(intNextNumber);
        if (myNextNumber.contains("3")){
        	return "Fizz";
        }
        if (myNextNumber.contains("5")){
        	return "Buzz";
        }
        if (dividable(intNextNumber,3)) {
        	dividable3 = true;
        }
        if (dividable(intNextNumber,5)) {
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

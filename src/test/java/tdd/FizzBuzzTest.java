package tdd;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;


public class FizzBuzzTest {

	public FizzBuzzTest() {
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void fizzbuzzWhen3ThenFizz(){
		// Arrange
		final FizzBuzz testee = new FizzBuzz();
		
		// Act
		final String thirdNumber = testee.nextNumber(2);
		
		// Assert
		assertThat(thirdNumber,is(equalTo("Fizz")));
		
	}
	@Test
	public void fizzbuzzWhen5ThenBuzz(){
		// Arrange
		final FizzBuzz testee = new FizzBuzz();
		
		// Act
		final String thirdNumber = testee.nextNumber(4);
		
		// Assert
		assertThat(thirdNumber,is(equalTo("Buzz")));
		
	}
	@Test
	public void fizzbuzzWhen4Then4(){
		// Arrange
		final FizzBuzz testee = new FizzBuzz();
		
		// Act
		final String thirdNumber = testee.nextNumber(3);
		
		// Assert
		assertThat(thirdNumber,is(equalTo("4")));
		
	}
	@Test
	public void fizzbuzzWhen20ThenBuzz(){
		// Arrange
		final FizzBuzz testee = new FizzBuzz();
		
		// Act
		final String thirdNumber = testee.nextNumber(19);
		
		// Assert
		assertThat(thirdNumber,is(equalTo("Buzz")));
		
	}

	@Test
	public void testCreateFizzBuzz()  {
		final FizzBuzz testee = new FizzBuzz();
		
		testee.createFizzBuzz();
		
	}
	
	

}

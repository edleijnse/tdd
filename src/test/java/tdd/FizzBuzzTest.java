package tdd;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;
import java.util.Iterator;
import org.junit.Test;

import java.util.Iterator;

import org.junit.Test;

public class FizzBuzzTest {

	public FizzBuzzTest() {
		// TODO Auto-generated constructor stub
	}

	@Test
	public void fizzbuzzWhen3ThenFizz() {
		// Arrange
		final FizzBuzz testee = new FizzBuzz();

		// Act
		final String thirdNumber = testee.nextNumber(2);

		// Assert
		assertThat(thirdNumber, is(equalTo("Fizz")));

	}

	@Test
	public void fizzbuzzWhen5ThenBuzz() {
		// Arrange
		final FizzBuzz testee = new FizzBuzz();

		// Act
		final String thirdNumber = testee.nextNumber(4);

		// Assert
		assertThat(thirdNumber, is(equalTo("Buzz")));

	}

	@Test
	public void fizzbuzzWhen4Then4() {
		// Arrange
		final FizzBuzz testee = new FizzBuzz();

		// Act
		final String thirdNumber = testee.nextNumber(3);

		// Assert
		assertThat(thirdNumber, is(equalTo("4")));

	}

	@Test
	public void fizzbuzzWhen20ThenBuzz() {
		// Arrange
		final FizzBuzz testee = new FizzBuzz();

		// Act
		final String thirdNumber = testee.nextNumber(19);

		// Assert
		assertThat(thirdNumber, is(equalTo("Buzz")));

	}

	@Test
	public void testCreateFizzBuzz() {
		final FizzBuzz testee = new FizzBuzz();

		testee.createFizzBuzz(100);

	}

	@Test
	public void createFizzBuzzWhen3ThenReturn3() {
		final FizzBuzz testee = new FizzBuzz();

		
		// arrange
		Iterator i = mock(Iterator.class);
		when(i.next()).thenReturn("1").thenReturn("2").thenReturn("Fizz").thenReturn(4).thenReturn("Buzz");
		// act
		int arraySize = 5;
		String[] myString = testee.createFizzBuzz(arraySize);
		String predict = "";
		String result = "";
		for (int ii=0;ii<arraySize;ii++){
			predict += i.next() + " ";
			result += myString[ii] + " ";
		}
		
		// assert
		assertEquals(predict, result);
	}

}

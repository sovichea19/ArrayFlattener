package edu.mum.cs.cs425.ArrayFlattener.lab9q1;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.mum.cs.cs425.ArrayFlattener.lab9q1.ArrayFlattener;
import junit.framework.Assert;

public class ArrayFlattenerTest {

	private ArrayFlattener flattener = null;

	@Before
	public void setUp() throws Exception {
		this.flattener = new ArrayFlattener();
	}

	@After
	public void tearDown() throws Exception {
		this.flattener = null;
	}

	@Test
	public void testFlattenArray() {
		//Question 1: When the input is a legit 2-D nested array, [[1,3], [0], [4,5,9]].
		int[][] input = {{1,3}, {0}, {4,5,9}};
		int[] expected = {1, 3, 0, 4, 5, 9};
		int[] actual = this.flattener.flattenArray(input);
		assertArrayEquals(expected, actual);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testFlattenArrayNull() {
		//Question 2: When the input is a null.
		int[][] input = null;
		Assert.assertNull("Input is null",flattener.flattenArray(input)
        );
	}
	

}

package sv.CodingChallenge;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import sv.CodingChallenge.ChildrensGame;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class TestEliminationOrder {
	
	@Test
	public void test5and2() {

        List<Integer> actual = ChildrensGame.getEliminationOrder(2, 5);
        List<Integer> expected = Arrays.asList(2,4,1,5,3);

        assertThat(actual, is(expected));	
        
	}	
	
	@Test
	public void test6and3() {

        List<Integer> actual = ChildrensGame.getEliminationOrder(3, 6);
        List<Integer> expected = Arrays.asList(3,6,4,2,5,1);

        assertThat(actual, is(expected));	
        
	}	
	
	@Test
	public void test5and1() {

        List<Integer> actual = ChildrensGame.getEliminationOrder(1, 5);
        List<Integer> expected = Arrays.asList(1,2,3,4,5);

        assertThat(actual, is(expected));	
        
	}	
	
	@Test
	public void test6and0() {

        List<Integer> actual = ChildrensGame.getEliminationOrder(0, 6);
        List<Integer> expected = Arrays.asList();

        assertThat(actual, is(expected));	
        
	}	

}

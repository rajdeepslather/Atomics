package in.rslather.atomics.impl;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AtomicCounterTest {

	AtomicCounter counter = new AtomicCounter();

	@Test
	public void test() {
		assertTrue(0 == counter.getAndIncrement());
		assertTrue(1 == counter.getAndIncrement(1));
		assertTrue(2 == counter.getAndIncrement(2));
		assertTrue(4 == counter.getCount());
	}

}

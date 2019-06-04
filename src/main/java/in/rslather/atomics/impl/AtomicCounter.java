package in.rslather.atomics.impl;

import in.rslather.atomics.AtomicWrite;

public class AtomicCounter {
	private final AtomicWrite<Integer> counter;

	public AtomicCounter() {
		this.counter = new AtomicWrite<Integer>(0);
	}

	public AtomicCounter(Integer initialValue) {
		this.counter = new AtomicWrite<Integer>(initialValue);
	}

	public Integer getCount() {
		return counter.get();
	}

	public Integer getAndIncrement() {
		return counter.getAndUpdate(() -> counter.get() + 1);
	}

	public Integer getAndIncrement(int step) {
		return counter.getAndUpdate(() -> counter.get() + step);
	}
}

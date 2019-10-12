package com.servletCoding;

public class TrackCounter {
	public static int counter;

	public synchronized int incrementCounter() {
		return ++counter;
	}
}

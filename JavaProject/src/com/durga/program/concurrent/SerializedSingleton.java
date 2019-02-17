package com.durga.program.concurrent;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6349993677024175587L;

	private SerializedSingleton() {
	}

	private static class SingletonHelper {
		private static final SerializedSingleton instance = new SerializedSingleton();
	}

	public static SerializedSingleton getInstance() {
		return SingletonHelper.instance;
	}

	protected Object readResolve() {
		return getInstance();
	}
}

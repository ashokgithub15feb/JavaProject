package com.ds.adapter;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter{

	@Override
	public Volt get120Volt() {
		return getVolt();
	}

	@Override
	public Volt get12Volt() {

		Volt v = getVolt();
		
		return convertVolt(v, 10);
	}

	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts()/i);
	}

	@Override
	public Volt get3Volt() {
		return null;
	}

	public Volt getVolt() {
		return super.getVolt();
	}
}

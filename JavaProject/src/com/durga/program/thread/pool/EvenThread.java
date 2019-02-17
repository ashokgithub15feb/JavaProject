package com.durga.program.thread.pool;

public class EvenThread implements Runnable
{
	private int value = 20;
	
	private Integer number = new Integer(value);
	
	private String evenThreadname;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((evenThreadname == null) ? 0 : evenThreadname.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		result = prime * result + value;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EvenThread other = (EvenThread) obj;
		if (evenThreadname == null) {
			if (other.evenThreadname != null)
				return false;
		} else if (!evenThreadname.equals(other.evenThreadname))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		if (value != other.value)
			return false;
		return true;
	}

	public EvenThread(int number) {
		this.number = number;
	}
	
	@Override
	public void run() {

		synchronized (number) {

			for(int i=0; i<value; i++)
			{
				if(i % 2 == 0)
				{
					System.out.println("Even Numver: "+i);
				}
				
				try {
					number.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

	@Override
	public String toString() {
		return "EvenThread [value=" + value + ", number=" + number + ", evenThreadname=" + evenThreadname + "]";
	}
	
}

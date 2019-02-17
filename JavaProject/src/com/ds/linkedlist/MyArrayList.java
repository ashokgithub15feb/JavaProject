package com.ds.linkedlist;

import java.util.Arrays;

public class MyArrayList {

	private Object[] myStore;
	private int actSize = 0;
	private final int DEFAULT_SIZE = 10;
	
	public MyArrayList() {
		
		myStore = new Object[DEFAULT_SIZE];
	}
	
	public Object get(int index)
	{
		if(index < actSize)
		{
			return myStore[index];
		}
		else
		{
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
	public void add(Object obj)
	{
		if(myStore.length - actSize <= 5)
		{
			increaseSize();
		}
		myStore[actSize++] = obj;
	}

	public Object remove(int index)
	{
		if(index < actSize)
		{
			Object o = myStore[index];
			myStore[index] = null;
			
			int tmp  = index;
			
			while(tmp < actSize)
			{
				myStore[tmp] = myStore[tmp+1];
				myStore[tmp+1] = null;
				tmp++;
			}
			
			actSize--;
			if(null == null)
				System.out.println("lf,v");
			return o;
		}
		else
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		
	}
	
	public int size()
	{
		return actSize;
	}
	
	private void increaseSize() {
		
		myStore = Arrays.copyOf(myStore, myStore.length*2);
		System.out.println("\nNew Length: "+myStore.length);
		
	}
	
	public static void main(String[] args) {
		
		MyArrayList mal = new MyArrayList();
        mal.add(new Integer(2));
        mal.add(new Integer(5));
        mal.add(new Integer(1));
        mal.add(new Integer(23));
        mal.add(new Integer(14));
        for(int i=0;i<mal.size();i++){
            System.out.print(mal.get(i)+" ");
        }
        mal.add(new Integer(29));
        System.out.println("Element at Index 4:"+mal.get(4));
        System.out.println("List size: "+mal.size());
        System.out.println("Removing element at index 2: "+mal.remove(2));
        for(int i=0;i<mal.size();i++){
            System.out.print(mal.get(i)+" ");
        }
        
	}
}

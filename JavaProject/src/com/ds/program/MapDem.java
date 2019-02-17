package com.ds.program;

import java.util.HashMap;

public class MapDem {

	 final HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

	 public HashMap<Integer,Integer> getMap(){
	     return map;
	 }
	 public void putValue(int key,int value){
	     map.put(key,value);
	 }

	 public static void main(String args[]){
		 
	    MapDem demo = new MapDem();
	    new Thread(new Runnable(){

	        @Override
	        public void run() {
	                demo.putValue(1, 10);

	        }

	    }).start();

	    new Thread(new Runnable(){

	        @Override
	        public void run() {
	            demo.putValue(1, 10);

	        }

	    }).start();

	System.out.println(demo.getMap().size());

	}
}

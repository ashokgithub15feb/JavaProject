package com.durga.program.map;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class BinaryAndLinerSearchSerialize {

	public static void main(String[] args) {
		
		BinerySeachDemo binerySeachDemo = new BinerySeachDemo();
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("E:\\Workspace\\new_workspare\\DurgaSoftApp\\src\\com\\durga\\program\\map\\abc.ser");
			
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(binerySeachDemo);
			
			System.out.println("Serialozation Done");

		} catch (IOException e) {
			e.printStackTrace();
		}
		finally
		{
			if(fos != null)
			{
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if(oos != null)
			{
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

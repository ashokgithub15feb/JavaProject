package com.program.coding.round.sg2019;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MapRead {

	public MapRead()
    {
        try {
            File file = new File("F:\\Workspace\\CoreJava\\src\\Hash.txt");
            @SuppressWarnings("resource")
			FileChannel c = new RandomAccessFile(file,"r").getChannel();

            MappedByteBuffer buffer = c.map(FileChannel.MapMode.READ_ONLY, 0,c.size()).load();

            for(int i=0;i<buffer.limit();i++)
            {
                System.out.print((char)buffer.get());
            }

            System.out.println();
            System.out.print(buffer.isLoaded());
            System.out.print("\n"+buffer.capacity());
            System.out.println();


        } catch (IOException ex) {
            Logger.getLogger(MapRead.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
	
	public static void main(String[] args) {
		
		MapRead m = new MapRead();
		
		System.out.println("=====End=====");
		
	}
}

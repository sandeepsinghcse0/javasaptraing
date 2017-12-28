package com.pack3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.GatheringByteChannel;

public class WriterDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("sap1.txt");
		FileChannel fc = fos.getChannel();
		ByteBuffer buff = ByteBuffer.allocate(1024);
		buff.put("sapient technology".getBytes());
		buff.put("sapient razorfish".getBytes());
		
		buff.flip();
		fc.write(buff);
		System.out.println("File created");
		
	}

}

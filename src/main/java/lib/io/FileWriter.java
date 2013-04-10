package lib.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import org.apache.log4j.Logger;

public class FileWriter {
	
	private String filename;
	
	private FileOutputStream fos;
	
	private FileChannel outfc;
	
	private static final Logger LOGGER = Logger.getLogger(FileWriter.class);

	public FileWriter(String name) {
		filename = name;
		try {
			fos = new FileOutputStream(filename);
			outfc = fos.getChannel();
		} catch(IOException e) {
			LOGGER.error(e.getMessage(), e);
		}
	}

	public void write(String content) { 
		try {
			// Convert content String into ByteBuffer and write out to file
			ByteBuffer bb = ByteBuffer.wrap(content.getBytes());
			// outfc.position(0);
			outfc.write(bb);
		} catch(IOException e) {
			LOGGER.error(e.getMessage(), e);
		}
	}
	
	public void close() {
		try {
			outfc.close();
			fos.close();
		} catch(IOException e) {
			LOGGER.error(e.getMessage(), e);
		}
	}
}

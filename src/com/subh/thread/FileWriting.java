package com.subh.thread;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {

	public static void main(String[] args) throws IOException{
	
		String s = "D:\\filewrite.txt";
		String wr = "winter season has been started";
		try(FileReader fr = new FileReader(s))
		{
//			f.write(wr);
			System.out.println("file writing has been completed");
//			ByteArrayOutputStream st = new  ByteArrayOutputStream();
			BufferedReader br = new BufferedReader(fr);
			String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
		}
		catch(FileNotFoundException ft)
		{
			ft.printStackTrace();
		}
		
		
		 try (FileReader reader = new FileReader(s);
	             BufferedReader br = new BufferedReader(reader)) {
	            String line;
	            System.out.println("Reading from file:");
	            while ((line = br.readLine()) != null) {
	                System.out.println(line);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}

}

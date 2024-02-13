package com.ra.your;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchFinally {
	
	static String FILENAME = "Readme2.txt";
	static BufferedReader br= null;
	static FileReader fr= null;
	
	public static void main(String[] args) {
				// TODO Auto-generated method stub
		try {
			fr= new FileReader(FILENAME);
			br= new BufferedReader(fr);
			
			String sCurrentLine;
			
			While ((sCurrentLine =br.readLine()) !=null); {
				System.out.println(sCurrentLine);
			}
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}finally {
			try {
				if (br !=null)
					br.close();
				if (fr !=null)
					fr.close();
			}catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

	private static void While(boolean b) {
		// TODO Auto-generated method stub
		
	}

}

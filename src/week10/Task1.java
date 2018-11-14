package week10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Task1 {
	public static List<String>getAllFunctions(String path) throws IOException{
		FileInputStream fis = new FileInputStream(path);
		DataInputStream dis = new DataInputStream(fis);
		String a = dis.readLine();
		List<String> list = new ArrayList<String>();
		do{
				if(a.length() >6) {
					
					for(int i = 0; i < a.length()-6;i++)
					{
						if(a.substring(i, i+6).equals("static"))
						{
							//System.out.println(a);
							for(int j = 0; j < a.length(); j++)
							{
								if(a.charAt(j) == ')') {
									//System.out.println(a.substring(0,j+1));
									list.add(a.substring(0,j+1));
								}
								
							}
						}						
					}	
					
			}
		}while((a = dis.readLine()) != null);
		return list;
		
	}
	public static String findFunctionByName(String name) throws IOException {		
		String path = "E:/Github/oop2018/oop2018/oop2018/src/week9/Utils.java";
		List<String> a = getAllFunctions(path);
		String result = null;
		for(int i = 0 ; i < a.size(); i++)
		{
			//System.out.println(a.get(i));
			String b = a.get(i);
				b = b.substring(1);
				b = b.replaceAll(" path", "");
				b = b.replaceAll(" folderPath", "");
				b = b.replaceAll(" fileName", "");
				System.out.println(b);
				if(name.equals(b)) result = b;
		}
		
		return result;
	}
	public static void main(String[] args) throws IOException {

		String path = "E:/Github/oop2018/oop2018/oop2018/src/week9/Utils.java";
		List<String> a = getAllFunctions(path);
		for(int i = 0 ; i < a.size(); i++)
		{
			System.out.println(a.get(i));
		}
//		System.out.println(findFunctionByName("public static String readContentFromFile(String)"));
//		
	}
}


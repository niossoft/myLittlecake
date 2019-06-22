package com.huan.date;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

public class SystemTimeUtil {
	
	static final String yyyyMMddHHmmss = "yyyy-MM-dd HH:mm:ss";
	
	public static String getCurrentTime() {
		TimeZone timeZone = TimeZone.getTimeZone("Asia/Shanghai");
		TimeZone.setDefault(timeZone);
		long currentTime = System.currentTimeMillis();
		SimpleDateFormat format = new SimpleDateFormat(yyyyMMddHHmmss);
	    String times = format.format(currentTime);
		
		return times;
	}
	
	public static long getCurrentTimeBySecond() {
        long currentTime = System.currentTimeMillis() / 1000 / 60;
		
		return currentTime;
	}
	
	public static void testFileLooping() {
		
		List<File> fileList = new ArrayList<File>();

		File file1 = new File("D://var//html//A05//100//test1.txt");
		File file2 = new File("D://var//html//A05//200//test2.txt");
		File file3 = new File("D://var//html//A05//300//test3.txt");
		
		fileList.add(file1);
		fileList.add(file2);
		fileList.add(file3);

		for (File file : fileList) {
			String str4PavXml = "/var/www/html/eas/";
			String AbsolutePath = file.getAbsolutePath();
			System.out.println("AbsolutePath : " + AbsolutePath);
			String subPath = 
					AbsolutePath.substring(AbsolutePath.indexOf("A") + 4, AbsolutePath.length());
			
			System.out.println("subPath : " + subPath);
			str4PavXml += subPath;
			
			System.out.println("final : " + str4PavXml);
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testFileLooping();
		//System.out.println(getCurrentTime());
	}

}

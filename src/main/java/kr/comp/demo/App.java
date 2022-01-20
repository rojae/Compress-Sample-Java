package kr.comp.demo;

import kr.comp.demo.compression.Compress;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

public class App {
	public static void main(String[] args) {
		// testNum : 0 => 압축 진행
		// testNum : 1 => 압축 해제
		int testNum = 0;

		Compress compress = new Compress();
		System.out.println("Default Charactor Set : " + Charset.defaultCharset().name());

		if (testNum == 0) {
			try {
				compress.zip(new File("D:\\temp\\test1"), true);
				compress.zip(new File("D:\\temp\\test2"), false); // 압축시 루트디렉터리에 파일이 들어감
//                compress.zip( new File( "D:\\temp\\test1" ) , true ,  "UTF-8" );
//                compress.zip( new File( "D:\\temp\\test2" ) , false , "UTF-8" ); // 압축시 루트디렉터리에 파일이 들어감
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else if (testNum == 1) {
			try {
				compress.unzip(new File("D:\\temp\\test1.zip"), new File("D:\\temp\\unzip\\"));
				compress.unzip(new File("D:\\temp\\test2.zip"), new File("D:\\temp\\unzip\\"));
//                compress.unzip( new File( "D:\\temp\\test1.zip" ) , new File("D:\\temp\\unzip\\" ) , "UTF-8" );
//                compress.unzip( new File( "D:\\temp\\test2.zip" ) , new File("D:\\temp\\unzip\\" ) , "UTF-8" );
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}

package com.kh.b_tcp;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.kh.b_tcp.model.vo.Music;

public class MusicDatMaker {
	
	//artist : 여러분의 최애가수
	//title : 여러분의 최애곡 제목
	//을 가지는 Music 인스턴스를 music.dat 파일로 저장하는 메서드
	public static void main(String[] args) {
		
		Music music = new Music("이소라","바람이분다.");
		
		try(ObjectOutputStream oos 
				= new ObjectOutputStream(new FileOutputStream("music.dat"))){
			oos.writeObject(music);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

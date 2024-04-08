package com.javaex.ex02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
    	ArrayList<Friend> lst = new ArrayList<Friend>();
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("친구 3명을 등록해 주세요");
    	
    	for(int i = 0; i < 3; i++) {
    		String line = scanner.nextLine();  // nextline 은 한줄
    		String[] data = line.split(" ");   // 공백으로 분할
    		
    	// Friend 객체 생성
    		Friend friend = new Friend(data[0], data[1],  data[2]); // 3개 짜리 리스트에 각각 데이터 넣어주기
    		
    	// list에 추가
    		lst.add(friend);
    	}
    	
    	// 친구정보 출력
    	Iterator<Friend> it = lst.iterator();
    	while(it.hasNext()) {
    		Friend item = it.next();
    		item.showInfo();
    	}
    	
    	
    	

    	
    
    }
}

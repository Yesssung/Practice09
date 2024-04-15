package com.javaex.ex03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	
    	// goods 클래스를 담을 수 있는 arrayList
    	ArrayList<Goods> lst = new ArrayList<Goods>(); 
    	
    	// 스캐너 열기
    	Scanner sc = new Scanner(System.in);
    	int countOfGoods = 0; 					// 상품이 몇개가 입력될지 모르기 때문에 일단 선언만 해놓음
    	System.out.println("상품을 입력해주세요(종료q)");

    	while(true) {
    		// 상품 정보 입력받기
    		String line = sc.nextLine();
    		// q면 종료하기
        	if(line.equals("q")) {
        		System.out.println("[입력완료]");
        		System.out.println("========================");
        		break;
        	}
        	// 상품명, 가격, 개수 기준을 콤마(,)를 기준으로 분할해서 객체생성
        	String[] data = line.split(",");
        	String name = data[0].trim(); // trim 여백 삭제
        	int price = Integer.parseInt(data[1].trim());
        	int count = Integer.parseInt(data[2].trim());
        	
        	// goods 객체(인스턴스) 생성
        	Goods goods = new Goods(name, price, count);
        	
        	// list에 추가하기
        	lst.add(goods);
        	
    	}
    	Iterator<Goods> it = lst.iterator();
    	while(it.hasNext()) {
    		Goods item = it.next();
    		countOfGoods += item.getCount(); // 상품 개수 합산
        	item.showInfo();
    		
    	}

    	System.out.println("\n모든 상품의 개수는 " + countOfGoods + "개 입니다.");

    	sc.close();
    }

}

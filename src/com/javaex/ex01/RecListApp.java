package com.javaex.ex01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RecListApp {

	public static void main(String[] args) {

		List<Rectangle> rList = new ArrayList<Rectangle>();
		double sum = 0;		
		
		Rectangle r01 = new Rectangle(1,1); // 괄호 안에 숫자가 rectangle 클래스의 int width와 int height값이야!
		Rectangle r02 = new Rectangle(2,2);
		Rectangle r03 = new Rectangle(3,3);
		Rectangle r04 = new Rectangle(4,5);
		
		
		System.out.println("#사각형 4개 리스트에 추가=========================================");
		//사각형4개 리스트에 추가 코드 작성
		rList.add(r01);
		rList.add(r02);
		rList.add(r03);
		rList.add(r04);
	
		//리스트 모두를 draw하는 메소드 실행
		// 밑에다가 만든거 불러줘야지
		listAllDraw(rList);
		
		

		System.out.println("#3번째 사각형(3, 3) 삭제==========================================");
		//사각형(3,3) 삭제 코드 작성
		rList.remove(2); //-> 참조주소를 null로 바꾼다
		
		//리스트 모두를 draw하는 메소드 실행
		listAllDraw(rList);
		
		
		System.out.println("#4번째 사각형(4, 5)-->(9, 5)로 width 값 변경======================");
		// 사각형(4,5) 수정 코드 작성
		// 1. 찾아서(참조, 검색 해라. 한마디로 get 써라) 2. 변경해주기
		Rectangle r = rList.get(2); // list에 2번째를 찾아서
		r.setWidth(9);				// 2번째에 있는 width를 변경해라
		
		//리스트 모두를 draw하는 메소드 실행
		listAllDraw(rList);
		
		
		
		System.out.println("#모든 사각형의 넓이 합 출력=======================================");
		//모든 사각형의 넓이 합 구하기 코드 작성
		Iterator<Rectangle> it = rList.iterator();
		while(it.hasNext()) {
			Rectangle rec = it.next();
			sum += rec.area();
			}

		
		
		//모든 사각형의 합 출력
		System.out.println("모든 사각형의 넓이는 " + sum + " 입니다.");
		
		
	}
	
	
	//리스트 모두를 draw하는 메소드 // void 이기 때문에 return이 없다.
	public static void listAllDraw(List<Rectangle> list) {
		// 리스트 순회 : 리스트 순회를 돌면서 각 부분에 들어있는 모든 값을 출력
		// 순회지만 for문 보다 Iterator사용
		//내용작성 
		Iterator<Rectangle> it = list.iterator(); // 리스트 1번째 추출
		while(it.hasNext()) {	// 추출후 뒤에 요소가 더 있어?
			Rectangle item = it.next();
			item.draw(); // class에 있는 draw메소드 실행시켜줘
		}
		
	
	}
	
}

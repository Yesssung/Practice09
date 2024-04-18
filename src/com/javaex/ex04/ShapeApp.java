package com.javaex.ex04;

import java.util.ArrayList;
import java.util.List;

public class ShapeApp {

    public static void main(String[] args) {
        List<Shape> sList = new ArrayList<Shape>(); // List안에 <Shape>라는 부모클래스를 상속받고 있는 모든게 들어갈 수 있다는 뜻. -> List 안에 Shape가 담긴다.
        
        Shape r= new Rectangle( 5, 6 );
        Shape t= new RectTriangle( 6, 2 );
        sList.add(r);
        sList.add(t);
        
        
        for( int i=0; i<sList.size(); i++ ) { // slist의 size(개수)만큼
            
            System.out.println( "area: " + sList.get(i).getArea() ); // 여기서 get한 i는 ArrayList의 0번 -> Rectangle을 호출하게 되는것 -> Rectangle안에 있는 Area를 호출해주세요
            System.out.println( "perimeter: " + sList.get(i).getPerimeter() );
            
            if( sList.get(i) instanceof Resizeable ) { // sList.get(i)가 Resizeable의 instanceof(객체)인가?
                ((Resizeable)sList.get(i)).resize( 0.5 ); // resize는 interface에 선언되어 있고, sList는 Shape의 ArrayList이기 때문에 sList에서는 resize를 구현할 수 없다.
                										  // 그래서 (Resizeable)로 바꿔주는것(다운캐스팅) 그래야 구현할 수 있기 때문(instansof사용한다는건 다운캐스팅 이라는것)
                
                System.out.println( "new area: " + sList.get(i).getArea() );
                System.out.println( "new perimeter: " + sList.get(i).getPerimeter() );
            }
        }
        
    }
}

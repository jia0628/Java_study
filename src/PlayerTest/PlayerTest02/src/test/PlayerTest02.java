package test;

import player.PortablePlayer;
import player.Skinnable;

// 문제) portablePlayer의 인스턴스를 생성하여, 정보를 출력하시오.
public class PlayerTest02 {
	public static void main(String[] args) {
		// 인스턴스 생성
		PortablePlayer p = new PortablePlayer();
		
		// 출력
		p.play();
		p.stop();
		p.changeSkin(Skinnable.LEOPARD); //● 여긴 사용하는 지점이라 인터페이스명. 생략을 할 수 없다
		System.out.println();
		
		
	}
}

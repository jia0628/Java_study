package test;

//import player.Player;
//import player.CDPlayer;
//import player.VideoPlayer;

import player.*;

/*
문제) 아래의 작업 지시 사항을 준수하여 다형성을 구현하시오.
 	1. Player 인터페이스를 구현한 클래스의 인스턴스를 각 2개씩 담는 배열을 생성하시오. (2가지 방법)
 	2. 반복문을 사용하여 인스턴스의 정보를 출력하시오. (2가지 방법)
 	3. 각 인스턴스만 가지는 기능도 함께 출력하시오.
*/
public class PlayerTest01 {
	public static void main(String[] args) {
		
		// 다형성 구현 1번
		Player[] players = new Player[4];
		players[0] = new CDPlayer();
		players[1] = new CDPlayer();
		players[2] = new VideoPlayer();
		players[3] = new VideoPlayer();

		// 다형성 구현 2번
		/*
		Player[] players = new Player[] {
				new CDPlayer(),
				new CDPlayer(),
				new VideoPlayer(),
				new VideoPlayer(),
		};
		*/
		
		// 출력 1번 - 기본 for문
		for(int i=0; i<players.length; i++) {
			players[i].play();
			players[i].stop();
			// players[i]가 CDPlayer를 참조하고 있다면, players[i]가 CDPlayer의 인스턴스라면
			if(players[i] instanceof CDPlayer) { //● instanceof ~안에 -> CDPlayer클래스 안에 해당하는 players[i]
				((CDPlayer)players[i]).clean();  //● 캐스팅하여 해당 메소드 호출
			}
			if(players[i] instanceof VideoPlayer) {
				((VideoPlayer)players[i]).printInfo();
			}
			System.out.println("");
		}
		
		// 출력 2번 - 확장 for문, for-in문
		/*
		for(Player p : players) {
			p.play();
			p.stop();
			if(p instanceof CDPlayer) {
				((CDPlayer) p).clean();
			}
			if(p instanceof VideoPlayer) {
				((VideoPlayer) p).printInfo();
			}
			System.out.println("");
		}
		*/
		
	}
}

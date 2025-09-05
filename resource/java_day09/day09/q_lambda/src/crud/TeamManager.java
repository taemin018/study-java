package crud;

import java.util.ArrayList;

public class TeamManager {
	private ArrayList<Player> players = new ArrayList<Player>();
	
    // 1. 선수 추가
	public void addPlayer(Player player) {
		for (Player player : players) {
			if(player.getName().equals(player.getName())) {
				System.out.println("이미 등록된 선수입니다.");
				return;
			}
			
		}
		players.add(player);
		System.out.println("선수 추가 완료");
	}
	
	
	
    // 2. 전체 선수 출력
	public void showAllPlayers() {
		if(players.isEmpty()) {
			System.out.println("등록된 선수가 없습니다.");
			return;
		}
		for (Player player : players) {
			System.out.println(player);
			
		}
	}
	
	
    // 3. 선수 삭제
	
	public void deletePlayer(String name) {
		for (Player player : players) {
			if(player.getName().equals(name)) {
				players.remove(player);
				System.out.println("선수 삭제 완료: " + name);
				return;
			}
			
		}
		System.out.println("해당 선수는 존재하지 않습니다.");
	}
	
	
	
    // 4. 최다 득점 선수 출력
	
	public void printTopScorer() {
		if(players.isEmpty()) {
			System.out.println("등록된 선수가 없습니다.");
			return;
		}
		Player topScorer = players.get(0);
		for (Player player : players) {
			if(player.getScore() > topScorer.getScore()) {
				topScorer = player;
			}
		}
		System.out.println("최다 득점 선수: " + topScorer);
	}
	
	
	
	
	

}

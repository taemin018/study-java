package mytest;

import java.util.ArrayList;
import java.util.Arrays;

public class TeamManager {
	
	private ArrayList<Player> players = new ArrayList<Player>();
    private final ArrayList<String> validPositions = new ArrayList<>(Arrays.asList("FW", "MF", "DF", "GK"));
	
    // 1. 선수 등록 (Create)
	
	public void addPlayer(Player player) {
		for (Player p : players) {
			if(p.getName().equals(player.getName())) {
				System.out.println("이미 등록된 선수입니다.");
				return;
		}
	}
		players.add(player);
		System.out.println("선수 등록이 완료되었습니다.");
		
}
	
	
	
    // 2. 전체 선수 목록 출력 (Read)
	
	public void printAll() {
		if(players.isEmpty()) {
			System.out.println("등록된 선수가 없습니다.");
			return;
		}
		for (Player player : players) {
			System.out.println(player);
		}
	}
	
	
	
	
    // 3. 이름으로 선수 정보 수정 (Update)
    // 나이, 포지션, 골 수 수정
	
	public void updatePlayer(String name, String newPosition, int newAge, int newGoals) {
		for (Player player : players) {
			if(player.getName().equals(name)) {
				if(!validPositions.contains(newPosition)) {
					System.out.println("올바르지 않은 포지션입니다.");
					return;
				}
				
				if(newGoals < 0) {
					System.out.println("골 수는 0이상이어야 합니다.");
					return;
				}
				
				player.setPosition(newPosition);
				player.setAge(newAge);
				player.setGoals(newGoals);
				System.out.println("선수 정보가 수정되었습니다.");
				return;
			}
		}
		System.out.println("해당 이름의 선수를 찾을 수 없습니다.");
		
	}
	
	
	
	
	
	
    // 4. 이름으로 선수 삭제 (Delete)
	
	public void deletePlayer(String name) {
		for (int i = 0; i < players.size(); i++) {
			if(players.get(i).getName().equals(name)) {
				players.remove(i);
				System.out.println("선수가 삭제 되었습니다.");
				return;
		}
	}
		System.out.println("해당 이름의 선수를 찾을 수 없습니다.");
}
	
	
	
//		5. 최다 득점자 출력 
	public void printTopScorer() {
		if(players.isEmpty()) {
			System.out.println("등록된 선수가 없습니다.");
			return;
		}
		
		Player topScorer = players.get(0);
		
		for (Player player : players) {
			if(player.getGoals() > topScorer.getGoals()) {
				topScorer = player;
			}
		} 
		System.out.println("최대 득점자");
		System.out.println(topScorer);
		
	}
	
	

	
	
	
	
}

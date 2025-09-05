package crudTest;

import java.util.ArrayList;

public class TeamManager {
    private ArrayList<Player> players = new ArrayList<>();

    // 1. 선수 추가
    public void addPlayer(Player player) {
        for (Player p : players) {
            if (p.getName().equals(player.getName())) {
                System.out.println("이미 등록된 선수입니다.");
                return;
            }
        }
        players.add(player);
        System.out.println("선수 추가 완료");
    }

    // 2. 전체 선수 출력
    public void showAllPlayers() {
        if (players.isEmpty()) {
            System.out.println("등록된 선수가 없습니다.");
            return;
        }
        for (Player p : players) {
            System.out.println(p);
        }
    }

    // 3. 선수 삭제
    public void deletePlayer(String name) {
        for (Player p : players) {
            if (p.getName().equals(name)) {
                players.remove(p);
                System.out.println("선수 삭제 완료: " + name);
                return;
            }
        }
        System.out.println("해당 선수는 존재하지 않습니다.");
    }

    // 4. 포지션으로 검색
    public void searchByPosition(String position) {
        boolean found = false;
        for (Player p : players) {
            if (p.getPosition().equalsIgnoreCase(position)) {
                System.out.println(p);
                found = true;
            }
        }
        if (!found) {
            System.out.println("해당 포지션의 선수가 없습니다.");
        }
    }

    // 5. 최다 득점 선수 출력
    public void printTopScorer() {
        if (players.isEmpty()) {
            System.out.println("등록된 선수가 없습니다.");
            return;
        }

        Player topScorer = players.get(0);
        for (Player p : players) {
            if (p.getGoals() > topScorer.getGoals()) {
                topScorer = p;
            }
        }
        System.out.println("최다 득점 선수: " + topScorer);
    }
}

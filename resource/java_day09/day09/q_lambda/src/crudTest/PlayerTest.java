package crudTest;

public class PlayerTest {
    public static void main(String[] args) {
        TeamManager manager = new TeamManager();

        manager.addPlayer(new Player("손흥민", "공격수", 31, 23));
        manager.addPlayer(new Player("이강인", "미드필더", 23, 5));
        manager.addPlayer(new Player("김민재", "수비수", 27, 1));
        manager.addPlayer(new Player("손흥민", "공격수", 31, 25)); 

        System.out.println("\n[전체 선수 목록]");
        manager.showAllPlayers();

        System.out.println("\n[선수 삭제 테스트]");
        manager.deletePlayer("황희찬"); 
        manager.deletePlayer("이강인"); 

        System.out.println("\n[공격수 검색]");
        manager.searchByPosition("공격수");

        System.out.println("\n[최다 득점자]");
        manager.printTopScorer();
    }
}

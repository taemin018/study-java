package mytest;

public class TeamManagerTest {
	public static void main(String[] args) {
		
		TeamManager manager = new TeamManager();
		
        manager.addPlayer(new Player("손흥민", "FW", 31, 23));
        manager.addPlayer(new Player("이강인", "MF", 23, 5));
        manager.addPlayer(new Player("김민재", "DF", 28, 2));
		
        System.out.println("\n -- 선수 등록 명단 -- ");
        manager.printAll();
        
        System.out.println("\n -- 이강인 선수 정보 수정 --");
        manager.updatePlayer("이강인","MF",24, 7);
        
        System.out.println("\n -- 김민재 선수 삭제 -- ");
        manager.deletePlayer("김민재");
        
        System.out.println("\n -- 최종 선수 목록 -- ");
        manager.printAll();
        
        System.out.println("\n -- 최대 득점자 출력 -- ");
        manager.printTopScorer();
        
        
        
        
        
        
        
        
        
		
	
		
	}

}

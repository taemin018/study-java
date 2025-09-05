package mytest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Soccer {
	
	public static void main(String[] args) {
		
		
        List<Player1> players = Arrays.asList(
                new Player1("손흥민", "FW"),
                new Player1("이강인", "MF"),
                new Player1("김민재", "DF"),
                new Player1("조현우", "GK"),
                new Player1("이재성", "FW")
            );
        
        

//        포지션 "FW"인 선수 이름만 출력
		players.stream().filter(player -> player.getPosition().equals("FW")).map(player -> player.getName())
		.forEach(System.out::println);
		
		
		
		
		
		
	}

}

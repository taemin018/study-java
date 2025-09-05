package streamTest;

import java.util.ArrayList;

public class ContectManager {
	private ArrayList<Contect> contects = new ArrayList<Contect>();
	
//	연락처 등록 (Create)
//	이름과 전화번호를 받아 등록
//	같은 이름이 있으면 등록 불가
//
	public void addContect(Contect contect) {
		for (Contect c : contects) {
			if(c.getName().equals(contect.getName())) {
				System.out.println("이미 등록된 이름입니다.");
				return;
			}
		}
		contects.add(contect);
		System.out.println(contect.getName() + "등록 왼료");
	}
	
	
	
//	전체 연락처 목록 조회 (Read)
//	등록된 연락처 모두 출력
//
	
	public void printAll() {
		if(contects.isEmpty()) {
			System.out.println("등록된 연락처가 없습니다.");
			return;
		}
		for (Contect contect : contects) {
			System.out.println(contect);
			
		}
	}
	
//	연락처 수정 (Update)
//	이름으로 전화번호 수정
//
	public void updateContect(String name, String newPhone) {
		for (Contect contect : contects) {
			if(contect.getName().equals(name)) {
				contect.setPhone(newPhone);
				System.out.println("수정완료");
				return;
			}
		}
		System.out.println("해당 이름의 연락처가 없습니다.");
	}
	
	
	
//	연락처 삭제 (Delete)
//	이름으로 삭제
	
	public void deleteContect(String name) {
		for (int i = 0; i < contects.size(); i++) {
			if(contects.get(i).getName().equals(name)) {
				contects.remove(i);
				System.out.println(name + "삭제완료");
				return;
			}
		}
		System.out.println("해당 이름의 연락처가 없습니다.");
	}
	
	
	
	
	
	
	
	
	
	
	

}

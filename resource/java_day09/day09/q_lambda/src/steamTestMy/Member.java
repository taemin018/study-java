package steamTestMy;

import java.util.Objects;

public class Member {
	
	private String name;
	private int point;
	

	public Member(String name, int point) {
		super();
		this.name = name;
		this.point = point;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", point=" + point + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, point);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(name, other.name) && point == other.point;
	}
	
	
	
	
	
	
	

}

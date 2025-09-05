package list.task;

import java.util.ArrayList;

import list.task.fruit.Fruit;
import list.task.user.User;

public class DBConnecter {
	
	protected DBConnecter() {;}
	
	public static ArrayList<User> users = new ArrayList<User>();
	public static ArrayList<Fruit> fruits = new ArrayList<Fruit>();
}

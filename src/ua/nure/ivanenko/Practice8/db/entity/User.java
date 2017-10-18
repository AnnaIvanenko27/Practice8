package ua.nure.ivanenko.Practice8.db.entity;

public class User {
	private int id;
	private String login;
	
	private User() {}
	
	public static User createUser(String login) {
		User user = new User();
		user.setLogin(login);
		return user;
	}
	
	public String toString() {
		return id + " : " + login;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	
	public boolean equals(Object o) {
		if(o instanceof User) {
			return id == ((User)o).getId();
		}
		return false;
	}
	
	public int hashCode() {
		return id*47 + 11;
	}

}

package Serialization;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable{
	private String userName;
	transient private String password;
	private String email;
	Date regDate;
	
	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + ", email=" + email + ", regDate=" + regDate
				+ "]";
	}

	public User(String userName, String password, String email, Date regDate) {
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.regDate = regDate;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	User u1= new User("ankit","asdf@345","ankit@gmail",new Date("09-2023"));
		ArrayList<User>userList=new ArrayList<>();
		userList.add(u1);
		userList.add(new User("Rohit","poiu#567","Rohit@rediffmail",new Date("06-2023")));
		userList.add(new User("Sagar","sagar#987","sagar@hotmail",new Date("12-2022")));	*/
		
		
	}

}

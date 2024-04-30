package Serialization;

import java.io.Serializable;

public class Date implements Serializable {
	private String regDate;
	
	public Date() {
		super();
	}

	public Date(String regDate) {
		super();
		this.regDate = regDate;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package Serialization;

import java.io.Serializable;

public class Course implements Serializable {
	int cid;
	String cName;
	transient double fees;

	public Course(int cid, String cName, double fees) {
		super();
		this.cid = cid;
		this.cName = cName;
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cName=" + cName + ", fees=" + fees + "]";
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

}

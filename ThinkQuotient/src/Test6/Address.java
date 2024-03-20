package Test6;

public class Address {
	String addr,  City,  State;

	@Override
	public String toString() {
		return "Address [addr=" + addr + ", City=" + City + ", State=" + State + "]";
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public Address(String addr, String city, String state) {
		super();
		this.addr = addr;
		City = city;
		State = state;
	}
	
}

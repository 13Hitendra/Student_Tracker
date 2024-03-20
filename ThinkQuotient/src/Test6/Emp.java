package Test6;

import java.util.LinkedList;

/*3.	WAP to create a LinkedList<Emp> and search for
 *  Emp object whose eno=10 and delete all the records whose dept is same as  eno 10.
 *  Emp(int id, String name Dept d)*/
class Emp {
	int eno;
	String name;
	Dept dept;

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public Emp(int eno, String name, Dept dept) {
		this.eno = eno;
		this.name = name;
		this.dept = dept;
	}

	public static void main(String[] asdf) {
		LinkedList<Emp> emplist = new LinkedList<>();
		emplist.add(new Emp(10, "Sanket", new Dept("HR")));
		emplist.add(new Emp(20, "Sagar", new Dept("Sales")));
		emplist.add(new Emp(30, "Nishant", new Dept("HR")));
		emplist.add(new Emp(40, "Hitendra", new Dept("Development")));

		int enoSearch = 10;

		for (Emp emp : emplist) {
			if (emp.getEno() == enoSearch) {
				String depName = emp.getDept().deptName;
				System.out.println("Employee details for id " + enoSearch + " = " + emp);

			}
		}

		deleteDept(emplist, 10);
		for (Emp emp : emplist) {
			System.out.println(emp);
		}

	}

	public static void deleteDept(LinkedList<Emp> emplist, int eno) {
		LinkedList<Emp> remove = new LinkedList<>();
		String deptToremove = null;
		for (Emp emp : emplist) {

			if (emp.getEno() == eno) {
				deptToremove = emp.getDept().deptName;
				if (emp.getDept().getDeptName().equals(deptToremove)) {
					remove.add(emp);
				}

			}
			emplist.removeAll(remove);
		}

	}

	@Override
	public String toString() {
		return "Emp [eno=" + eno + ", name=" + name + ", dept=" + dept + "]";
	}
}

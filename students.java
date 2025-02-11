package student;

public class students {
	
	private String name;
	private int id;
	private int sal;
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getSal() {
		return sal;
	}



	public void setSal(int sal) {
		this.sal = sal;
	}
	
	public void stuele() {
		
		System.out.println("name of the student : "+getName());
		System.out.println("student id : "+getId());
		System.out.println("employee salary : "+getSal());
		System.out.println("--------------------------------");
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		students s = new students();
		stu1 s1 = new stu1();
		s1.stuele();
		stu2 s2 = new stu2();
		s2.stuele();
		
		
	}

}

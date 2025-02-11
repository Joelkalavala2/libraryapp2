package student;

public class stu1 extends students {
	
	private String hob;

public void stuele() {
		
		this.setName("john");
		this.setId(1);
		this.setSal(15000);
		super.stuele();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stu1 s1 = new stu1();
		s1.stuele();
		
	}

}

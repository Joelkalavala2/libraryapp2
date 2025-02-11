package student;

public class stu2 extends students{
	
 public void stuele() {
		
		this.setName("joel");
		this.setId(1);
		this.setSal(15000);
		super.stuele();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stu2 s2 = new stu2();
		s2.stuele();
	}

}

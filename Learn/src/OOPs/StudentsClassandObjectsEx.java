package OOPs;

public class StudentsClassandObjectsEx {

	int rno;
	String name;
	float marks;
	
	
	
	public StudentsClassandObjectsEx(int rno, String name, float marks) {
		this.rno = rno;
		this.name = name;
		this.marks = marks;
	}
	
	
	//calliing one constructor from another constructor..
	public StudentsClassandObjectsEx() {
		this(19,"jamsi",89.9f);
	}

	public StudentsClassandObjectsEx(StudentsClassandObjectsEx neistam) {
		// TODO Auto-generated constructor stub
		this.rno=neistam.rno;
		this.name=neistam.name;
		this.marks=neistam.marks;
	}



	public static void main(String[] args) {
		/*Students hari = new Students(15,"Harsha",23.3f);
		System.out.println(hari.rno + "\n"+hari.name+"\n"+hari.marks );
		
		Students chandu = new Students(hari);
		System.out.println("\n");
		System.out.println(chandu.rno + "\n"+chandu.name+"\n"+chandu.marks );*/
		StudentsClassandObjectsEx rand1=new StudentsClassandObjectsEx();
		rand1.name="sfdf";
		rand1.rno=23;
		rand1.marks=222;
		StudentsClassandObjectsEx rand=new StudentsClassandObjectsEx(rand1);
		System.out.println(rand.rno +"\t"+rand.name+"\t"+rand.marks );
	}
	
}

package home_Work_2;

public class Teacher {
	
	String teacherName;
	String gender;
	int id;
	public static String institute="PeopleNTech";
	
	public Teacher(){
		
	}
	
	Teacher(String t,String g){
		
		teacherName=t;
		gender=g;
	}
	
	Teacher(String name,String g,int i){
		teacherName=name;
		gender=g;
		id=i;
	}
	
	public void display1() {
		String teacherName="Matiur Rahman";
		String gender= "male";
		int i=101;
		
		System.out.println("TeacherName :"+teacherName );
		System.out.println("gender :"+gender);
		System.out.println("TeacherId :" +i );
	}
	
	public static void display2() {
		System.out.println("institute:"+institute);
		System.out.println();
	}
  
	
   void displayinformation() {
		System.out.println("TeacherName :"+teacherName);
        System.out.println("Gender :"+gender);
		System.out.println("id :"+id);
		System.out.println("institute name :"+institute);
		System.out.println("");
		}
	
}



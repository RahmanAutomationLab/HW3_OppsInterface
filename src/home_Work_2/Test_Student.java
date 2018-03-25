	package home_Work_2; //Project--Class_Assignment
	
	public class Test_Student {
	
		public static void main(String[]args) {
			
		   Teacher s1=new Teacher("male ","md");
		   Teacher s2=new Teacher("Kaniz","female",101);
			
		
			Teacher obj1=new Teacher();
			obj1.display1();
			
			Teacher.display2(); //related to teacher class  that'
			                     //why no need to create any object
			s1.displayinformation();
			s2.displayinformation();
		}	
	}

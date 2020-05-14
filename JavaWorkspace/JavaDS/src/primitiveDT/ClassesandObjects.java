package primitiveDT;
class Student{
	String name=null; //by default null
	int rollNo=0;
}
public class ClassesandObjects {
	int x =5;
	int y=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();//Instantiation or Creating Object
		System.out.println("Name is: "+ s.name);
		System.out.println("Roll No. is: "+ s.rollNo);
		s.name = "Abhinav";
		s.rollNo = 1;
		System.out.println("Name is: "+ s.name);
		System.out.println("Roll No. is: "+ s.rollNo);
		
		Student s2 = new Student();
		s2.name = "Ananya";
		s2.rollNo = 2;
		System.out.println("Name is: "+ s2.name);
		System.out.println("Roll No. is: "+ s2.rollNo);
		ClassesandObjects c = new ClassesandObjects();//object created within same class
		System.out.println(c.x + c.y);
	}

}

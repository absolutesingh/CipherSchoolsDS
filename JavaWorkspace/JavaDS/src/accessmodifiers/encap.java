package accessmodifiers;
class ImplementEncapsulation
{
	private String name=null;
	private int age=0;
//	public String getName()
//	{
//		System.out.println("Getter for name called");
//		return this.name;
//	}
//	public int getAge(){
//		return this.age;
//	}
//	public void setName(String name)
//	{
//		this.name=name;
//	}
//	public void setAge(int age)
//	{
//		if(age<18)
//		{
//			System.out.println("Failed");
//			return;
//		}
//		this.age = age;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
public class encap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

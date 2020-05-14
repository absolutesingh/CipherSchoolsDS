package primitiveDT;
class A{
	void fun(){
		System.out.println("Hi I am declared in A");
	}
}
class B extends A
{
	void fun2(){
		System.out.println("Hi I am declared in B");
	}
}
class C extends B
{
	void fun3(){
		System.out.println("Hi I am declared in C");
	}
}
public class multiinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj1 = new B();
		C obj2 = new C();
		
		obj2.fun();
		obj2.fun2();
		obj2.fun3();

	}

}

package primitiveDT;
abstract class sampleAbstract
{
	abstract void print(); //This is an abstract method
	abstract void second();
	void concrete(){
		System.out.println("Hi, I'm a concrete method in an Abstract Class");
	}
}
abstract class subclass extends sampleAbstract{
	void print(){
		System.out.println("Implemented Abstract Method");
	}
}
class grandChild extends subclass
{
	void second(){
		System.out.println("Implemented Second Abstract Method");	
	}
}
//abstract class sample{
//	
//}
public class AbstractStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		sampleAbstract obj = new sampleAbstract(); cannot create object of abstract class
//		subclass sc = new subclass();
//		sc.print();
		grandChild gc = new grandChild();
		gc.print();
		gc.second();
		gc.concrete();
	}

}

package OopsInheritance;

class poly1 {
	void house() {
		System.out.println("house is big");
	}
}
class engg extends poly1 {                              
	void house() {                                     // here engg class(child class) have override to poly1 class(parent class) this is the overridding
		System.out.println("house is big");
	}
	void yard() {
		System.out.println("the yard is spacious");
	}
}
class btech extends engg{                        // this all the inherritance .........means this is the example of polymorphism BCOZ polymorphism have must thre thing
	void house() {                                               //1. inherritance   2. overriding  3. up casting
		System.out.println("house is big");
	}
	void yard() {
		System.out.println("the yard is spacious");
	}
	void gallary(){
		System.out.println("our gallary is airy or ventilated");// ->haweshir
	}
}
class mtech extends btech{
	void work () {
		super.house();
		yard();
		gallary();
		System.out.println("work method () is mtech class");
		
	}
}
public class Polymorphism {
	public static void main(String[] args) {
		mtech m = new mtech();
		m.work();
		poly1 m1 = new mtech();// this is the up casting (implisitly)     poly1 m1 = (parent) mtech();(explicitly)
	        m1.house();
	        
	    mtech m2 = (mtech)m1;// this is the down casting explicitly ...down casting happen only explicitly, never happen by compiler(implisit)BCOZ parent class does not have  
	        // child class member or behavior
	    engg d = new mtech();
	    engg e = m;//we can also do up casting    
	}

}

package OopsInheritance;


class A1 {                      // super class, base class, parent class 
	int a = 10;
	double b = 20.3;
}



  class B1 extends A1 { //child class , sub class , derived class 
	  int c = 30;
  double d = 40.4; }
  
   class C1 extends B1 { 
	   int e = 50; }
 
 /********************************************************************/
 
abstract class Apple {
	abstract void fruit();
		}

	class Orange extends Apple {

		void fruit() {
			System.out.println("fruit are sweet");
			System.out.println("orange are sweet");
		}
		}
class Banana extends Apple {
			void straight() {
				System.out.println("Banana are straight");
			}
			void fruit()
			{
				System.out.println("fruit are sweet");
			
			
				System.out.println("orange are sweet");
			}
		}

public class Inheritance1 {

public static void main(String args[]) {
		C1 c1 = new C1();
		System.out.println("C1 class refer to A1= " + c1.a);
		System.out.println("C1 class refer to A1= " + c1.b);
		System.out.println("C1 class refer to B1= " + c1.c);
		System.out.println("C1 class refer to B1= " + c1.d);
		System.out.println("C1 class refer to C1= " + c1.e);
		/**************************************************************************/
                 Banana b1 = new Banana();
                   b1.straight();
	               b1.fruit();
	               Apple f1 = new Banana();
	               f1.fruit();
	               Orange a= new Orange();
	               System.out.println("orange are sweet");
	               Apple f2 = new Orange ();
                   f2.fruit();
	}
	} 



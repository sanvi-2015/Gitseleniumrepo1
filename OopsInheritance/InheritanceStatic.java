package OopsInheritance;

class D1{
	static int a=10;
}
/******************************************/
class E1 extends D1{
	static int b=20;
}
/*****************************************/
class F1 extends E1{
	static int c= 30;
}
/***************************************/




public class InheritanceStatic {

	public static void main(String[] args) {
		System.out.println( " D1 class static member  ="+D1.a);
		System.out.println( " E1 class static member  ="+E1.b);
		System.out.println( " F1 class static member  ="+F1.c);
	}

}

package OopsInheritance;

class age{
	static int a=10;
	int b= 20;
	double c=30;
}


class hei extends age{
	static int e=30;
	int f= 40;
	double g=50;
}


class black extends hei{
	static int x=60;
	int y =20;
	double z =40.22;
}



public class InheritanceStaticNonstatic {

	public static void main(String[] args) {
		//we can acess static member directly but static member not allow to inherisment
		System.out.println("A1 class have static member= "+ age.a);
		System.out.println("B1 class have static member ="+hei.e);
		System.out.println("C1 class have static member = "+black.x);
		System.out.println("*************************static number finish*********************");
		
		black c1=new black();
		System.out.println("C1 class refer to A1= "+c1.b);
	    System.out.println("C1 class refer to A1= "+c1.c);
	    System.out.println("C1 class refer to B1= "+c1.f);
	    System.out.println("C1 class refer to B1= "+c1.g);
	    System.out.println("C1 class refer to c1= "+c1.y);
	    System.out.println("C1 class refer to c1= "+c1.z);

	
	
	
	
	
	
	
	
	}}

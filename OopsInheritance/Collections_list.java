package OopsInheritance;

import java.util.ArrayList;


public class Collections_list {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		list.add("monika");
		list.add(123);
		list.add('c');
		list.add(true);
		list.add(20.2);
		list.add(null);

		System.out.println("Element list= " + list);// which of the element // eka line mde
		System.out.println("Element size = " + list.size());// no.of element
		System.out.println("Elementlist= " + list.get(2));// perticuler element
		list.set(1, "Dates");// change elment ==123 chya jagi Dates
		System.out.println("Element size = " + list.size());
		System.out.println("Element list= " + list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println("one by one print=" + list.get(i));// eka khali ek
		}
		// for (object fruit : list) {
		// System.out.println(fruit);
		ArrayList b = new ArrayList();
		b.add(123);
		b.add("vijay");
		System.out.println("is there empty collectin= " + b.isEmpty());
		System.out.println("a object size=" + b.size());
		System.out.println("how many element in object a =" + b);
		ArrayList<String> a = new ArrayList<String>();
		a.add("pooja");
		a.add("Sawan");
		a.add("Sanvi");
		System.out.println("a object size=" + a.size());
		System.out.println("how many element in object a =" + a);
		for(int i=0; i<=a.size(); i++) {
			System.out.println("Printing Element by for loop = "+ a.get(i));
			}
		a.add(1, "sanu");
		b.addAll(a);
		b.add(0, "Rahul");
		a.add(0, "Ram");
		System.out.println("how many element in object b =" + b);
		 //Iterator itr =  list.iterator();
		//a.remove("sawan");
		System.out.println("After using remove() a =" + a);
		System.out.println("how many element in object a =" + a);
		b.removeAll(a);
		b.removeIf(str -> b.contains("ram"));// here using lambda expression
		System.out.println("after removeIf =" + b);
		b.clear();// delet all the element in b method
		System.out.println("After using clear() b =" + b);
	}
}

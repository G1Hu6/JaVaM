import java.util.*;
class Animals{
	int legs = 0;
	String name = null;

	Animals(String name,int legs){
		this.name=name;
		this.legs=legs;
	}
	public String toString(){
		return name +" = "+legs;
	}
}

class VectorDemo{
	public static void main(String[] args){
		Vector v = new Vector();	//vector with initial capacity 10 and zero capicity increment.

		v.addElement(new Animals("Dog",4));
		v.addElement(new Animals("Human",2));
		v.addElement(10);
		v.addElement(new Animals("Cat",4));

		System.out.println(v);
		System.out.println(v.capacity());	//10

		v.addElement(20);
		v.addElement(20);
		v.addElement(20);
		v.addElement(20);
		v.addElement(20);
		v.addElement(20);
		v.addElement(20);
		
		System.out.println(v.capacity());	//20

		//v.removeElement();
		/*
		 VectorDemo.java:37: error: method removeElement in class Vector<E> cannot be applied to given types;
			v.removeElement();
		 	               ^
  		  required: Object
                  found:    no arguments

		 */

		v.removeElement(2);	//No error Because it is Legacy class.
		v.removeElement(20);
		System.out.println(v);

	
		//Vector(int initialCapacity, int capacityIncrement)	//Constructs an empty vector with the specified initial capacity and capacity increment.
		Vector v1=new Vector(4,10);
		
		v1.add(10);
		v1.add(20);
		
		System.out.println("Capacity ="+v1.capacity());		//4
		System.out.println("Size ="+v1.size());

		v1.add(30);
		v1.add(20);
		v1.add(40);
		
		System.out.println("Capacity ="+v1.capacity());		//4+capacityIncrement
		System.out.println("Size ="+v1.size());

		v1.add(30);
                v1.add(20);
                v1.add(40);
		v1.add(40);
		v1.add(30);
                v1.add(20);
                v1.add(40);
                v1.add(40);
		v1.add(30);
                v1.add(20);
		
		System.out.println("Capacity ="+v1.capacity());         //4+capacityIncrement
                System.out.println("Size ="+v1.size());
	}
}

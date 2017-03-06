class Parent{
	private void method1(){
 		System.out.println ("Parent's method1()");
	}
	public void method2() {
 		System.out.println ("Parent's method2()");
		method1();			//This invoking private method of method1
	}
	}
class Child extends Parent {
	public void method1() {
 		System.out.println ("Child's method1()");
	} 
	 	
	public static void main(String args[]) {
		Parent p = new Child();
		p.method2();			//this will call public method of parent class method2
	}
	
}

/*

Output:
Parent's method2()
Parent's method1()

C. Prints : Parent's method2()
 	    Parent's method1()
*/


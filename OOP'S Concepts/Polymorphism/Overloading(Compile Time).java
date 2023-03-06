
/* Polymorphism means polu means many forms means many forms.
 * Below is the example of compile time polymorphism which is also known as Overloading
 * method in java. It's happens when method have same name but we given the diff. 
 * type parameters in it. 
 */

class Student{
	String name;
	int age;
	
	
	public static void printInfo(String name) {
		System.out.println(name);
	}
	
	public static void printInfo(int age) {
		System.out.println(age);
	}
	
	public static void printInfo(String name, int age) {
		System.out.println(name+" "+age);
	}

}

public class LC {
    public static void main(String[] args) {
	    Student s = new Student();
	    s.printInfo("Atul Kumar");
	    s.printInfo(23);
	    s.printInfo("atul", 23);
    }	
}

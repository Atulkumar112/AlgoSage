/*
Encapsulation in Java is a process of wrapping code and data together into a single unit, for example, a capsule which is
mixed of several medicines.

We can create a fully encapsulated class in Java by making all the data members of the class private. Now we can use setter and 
getter methods to set and get the data in it.
*/

//For Example::-----
class Student{
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

}

class Encapsulation{
	public static void main(String args[]) {
		Student s = new Student();
		s.setName("Atul Kumar Saini");
		System.out.println(s.getName());
	}
}


//Output:-
//Atul Kumar Saini

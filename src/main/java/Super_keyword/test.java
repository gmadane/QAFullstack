package Super_keyword;
class Person {
	Person()
	{
		System.out.println("Person class Constructor");
	}
}

// subclass Student extending the Person class
class Student extends Person {
	Student()
	{
		// invoke or call parent class constructor
		//super();

		System.out.println("Student class Constructor");
	}
}

// Driver Program
class test {
	public static void main(String[] args)
	{
		Student s = new Student();
	}
}

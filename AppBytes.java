class AppBytes {
	int number1 = 10;




	public static void main(String[] a) {
		Student student1 = new Student("Marjan", 21);
		
		System.out.println(student1);
		System.out.println(student1.name);
		System.out.println(student1.roll);
		System.out.println(student1.age);

	}
}

class Student {
   String name;
   int age;
   int roll;

   public Student(String n, int a, int r) {
	   name = n;
	   age = a;
	   roll = r;
   }

    public Student(String n {
	   name = n
   }
    public Student(String n, int a) {
	   name = n;
	   age = a;
   }
   

   public String toString() {
	   return name;
   }
}
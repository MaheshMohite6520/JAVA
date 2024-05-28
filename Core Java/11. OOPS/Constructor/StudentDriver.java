// Method Chaining

class StudentDriver 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student("Mahesh", 40, 'A', 7030116520l, 22);

		s1.showName().showId().showDivision().showPhone().showAge();
	}
}

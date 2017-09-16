import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 *
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;

	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}


	public Student[] getStudents() {
		// Add your implementation here
		return students;
	}


	public void setStudents(Student[] students) {
		// Add your implementation here
		//students[0]= new Student(14,"abc","9/5/97",14.688888);
		Date d = new Date("1997-05-09");
		students[0].setId(143);
		students[0].setFullName("veda");
		students[0].setBirthDate(d);
		students[0].setAvgMark(30.123456);
	}


	public Student getStudent(int index) {
		// Add your implementation here
		return students[index];
	}


	public void setStudent(Student student, int index)
	{
	    Date d = new Date("1997-05-09");
		students[index].setId(143);
		students[index].setFullName("veda");
		students[index].setBirthDate(d);
		students[index].setAvgMark(30.123456);
		// Add your implementation here
	}


	public void addFirst(Student student) {
		// Add your implementation here




	}


	public void addLast(Student student) {
		// Add your implementation here

	}


	public void add(Student student, int index) {
		// Add your implementation here
	}


	public void remove(int index) {
		// Add your implementation here
	}


	public void remove(Student student) {
		// Add your implementation here
	}


	public void removeFromIndex(int index) {
		// Add your implementation here
	}


	public void removeFromElement(Student student) {
		// Add your implementation here
	}


	public void removeToIndex(int index) {
		// Add your implementation here
	}


	public void removeToElement(Student student) {
		// Add your implementation here
	}


	public void bubbleSort() {
		// Add your implementation here
	}


	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}


	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}


	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}


	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}


	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}


	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}


	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}

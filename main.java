/*
 * Author:		Tyler Blanchard
 * Date:		2/2/2018
 * 
 * Description:		This program adds and removes objects to a list. It adds and
 * 					removes an object at a specific point. It also calls for an 
 * 					object at a specific point.
 */
public class main {
	static StudentLinkedList studentList;

	public static void main(String[] args) {
		Student student = new Student("John", "Doe", "doe1j");				
		studentList = new StudentLinkedList(student);
		System.out.println(studentList.size());
		System.out.println(studentList.toString());
		student = new Student("John", "Deer", "deer1j");				
		studentList.add(student);
		System.out.println(studentList.size());
		System.out.println(studentList.toString());
		studentList.remove();
		System.out.println(studentList.size());
		System.out.println(studentList.toString());
		student = new Student("Tyler", "Blanchard", "baka1j");
		studentList.addSpecificLocation(student, 0);
		System.out.println(studentList.size());
		System.out.println(studentList.toString());
		student = new Student("Zack", "Bill", "billZ1", 333);
		studentList.addSpecificLocation(student, 5);
		System.out.println(studentList.size());
		System.out.println(studentList.toString());
		studentList.add(student);
		System.out.println(studentList.size());
		System.out.println(studentList.toString());
		studentList.removeSpecificPostion(-1);
		System.out.println(studentList.size());
		System.out.println(studentList.toString());
		studentList.getElement(1);
		studentList.getElement(-1);
		studentList.removeSpecificPostion(1);
		System.out.println(studentList.size());
		System.out.println(studentList.toString());
	}
}

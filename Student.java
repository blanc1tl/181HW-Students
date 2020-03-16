
public class Student {
	private String fname;
	private String lname;
	private String id;
	private long rnumber;
	Student next; // this is the pointer to the next Student node in the list

	Student(String FirstName, String LastName, String ID) {
		fname = FirstName;
		lname = LastName;
		id = ID.toLowerCase();
		rnumber = 0;
	}

	Student(String FirstName, String LastName, String ID, long RandomNumber) {
		fname = FirstName;
		lname = LastName;
		id = ID.toLowerCase();
		rnumber = RandomNumber;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public String getId() {
		return id;
	}

	public long getRnumber() {
		return rnumber;
	}

	public String toString() {
		return fname + "," + lname + "," + id + "," + String.valueOf(rnumber) + " ";
	}

	public Student getNext() {
		return next;
	}

	public void setNext(Student nextStudent) {
		next = nextStudent;
	}
}

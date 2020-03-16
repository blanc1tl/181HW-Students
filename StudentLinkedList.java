/*
 * Example for a linked list with willful omissions of some error and logic checks (like empty list etc.)
 *  
 */
public class StudentLinkedList {
	private Student firstNode;
	private static int listCounter;

	// Constructor: must provide a "head" node for us
	public StudentLinkedList(Student student) {
		firstNode = student;
		listCounter = 1;
	}

	// Returns number of elements in list to the outside
	public int size() {
		return listCounter;
	}

	public void add(Student student) {
		Student tempNode = student;
		Student currentNode = firstNode; // start at the beginning

		while (currentNode.getNext() != null) { // not at the end yet, move node by node
			currentNode = currentNode.getNext();
		}

		// the last node.next currently is null, needs to point to our newly added node
		currentNode.setNext(tempNode);

		// all done, now update our counter
		listCounter++;
	}

	public void addSpecificLocation(Student student, int position) {
		Student tempNode = student;
		Student currentNode = firstNode;
		Student Previous = null;
		int i = 0;

		// if position is out of bounds
		if (position < 0 || position > size()) {
			System.out.println("Index out of bounds, addSpecificLocation doesn't activate");
		}
		// for adding anywhere else
		else {
			while (i < position) {
				Previous = currentNode;
				currentNode = currentNode.getNext();
				i++;
			}
			// add at beginning
			if (i == 0) {
				tempNode.next = firstNode;
				firstNode = tempNode;
			} else {
				// the last node.next currently is null, needs to point to our newly added node
				Previous.setNext(tempNode);
				tempNode.next = currentNode;
			}

			// update our counter
			listCounter++;
		}
	}

	public void remove() {
		Student lastNode = null;
		Student currentNode = firstNode;

		// if list is empty
		if (listCounter == 0) {
			System.out.println("linked list has no elements to remove");
			return;
		}

		while (currentNode.getNext() != null) {
			// put currentNode into lastNode
			lastNode = currentNode;
			// make currentNode equal the next node
			currentNode = currentNode.getNext();
		}

		// lastNode make null
		lastNode.setNext(null);
		// subtract from counter
		listCounter--;
	}

	public void removeSpecificPostion(int position) {
		Student currentNode = firstNode;
		Student Previous = null;

		// if position doesn't exist
		if (position > size() - 1 || position < 0) {
			System.out.println("Index is out of bounds, removeSpecificPosition doesn't activate");
		}
		// remove beginning of linked list
		else if (position == 0) {
			firstNode = firstNode.getNext();
			listCounter--;
		}
		// remove given place
		else {
			for (int i = 0; i < position; i++) {
				Previous = currentNode;
				currentNode = currentNode.getNext();
			}
			Previous.setNext(currentNode.getNext());
			listCounter--;
		}
	}

	public void getElement(int specificElement) {
		int i = 0;
		Student currentNode = firstNode;
		// if user ask for element that is out of bounds
		if (specificElement > size() - 1 || specificElement < 0) {
			System.out.println("Index " + specificElement + " does not exist.");
			return;
		}
		while (i < specificElement) {
			currentNode = currentNode.getNext();
			i++;
		}
		// prints out desired element
		System.out.println("Element " + specificElement +" is " + currentNode);

	}

	public String toString() {
		String dummy = "";
		Student currentNode = firstNode;
		// locates the first item in the linked list
		dummy += currentNode.toString();
		while (currentNode.getNext() != null) {
			// locates the rest of the linked list
			currentNode = currentNode.getNext();
			dummy += currentNode.toString();
		}
		// prints out the linked list items
		return dummy;
	}
}

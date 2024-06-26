
public class APrrayList<T> implements IList<T> {

	private Object[] container;
	private int size;

	public APrrayList() {
		container = new Object[10];
		size = 0;
	}

	public APrrayList(int capacity) {
		container = new Object[capacity];
		size = 0;
	}

	// TODO implement IList<T>

	// IMPORTANT
	// Each method you implement must state the big O time complexity
	// If the best or worst case time complexity is different from the average case, state those as well

	// FURTHERMORE
	// Note the preconditions in IList<T>
	// If the parameters passed to any method violate the preconditions, throw a new IllegalArgumentException

	@SuppressWarnings("unchecked")
	public T get(int index) {
		if(index < 0 || index >= size) {
			throw new IllegalArgumentException("precondition violated: valid index in list");
		}
		// TODO finish this method
		return (T)container[index];
	}


	public static void main(String[] args) {
		// TODO add test cases here for each method in APrrayList
	}

}
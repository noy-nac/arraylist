
public interface IList<T> {

	/**
	 * return the value at index in the list
	 * pre: index is a valid index in list
	 */
	public T get(int index);

	/**
	 * set the value at index to element
	 * return element
	 * pre: element is nonnull, index is a valid index in list
	 */
	public T set(T element, int index);

	/**
	 * append element to the end of the list
	 * return element
	 * pre: element is nonnull
	 */
	public T add(T element);

	/**
	 * remove first instance of element in the list
	 * return element or null if element is not present in the list
	 * pre: element is nonnull
	 */
	public T remove(T element);

	/**
	 * remove the value at index in the list
	 * return the removed value
	 * pre: index is a valid index in list
	 */
	public T remove(int index);

	/**
	 * insert element at index in the list
	 * return element
	 * pre: element is nonnull, index is a valid index in list
	 */
	public T insert(T elemnt, int index);

	/**
	 * returns true if element is in the list, false otherwise
	 * pre: element is nonnull
	 */
	public boolean contains(T element);

	/**
	 * return the number of values in the list
	 */
	public int size();

	/**
	 * return true if the list is empty, otherwise false
	 */
	public boolean isEmpty();
}
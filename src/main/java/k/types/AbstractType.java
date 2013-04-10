package k.types;

public abstract class AbstractType<T> implements IType<T> {

	protected T value;

	public void value(T value) {
		this.value = value;
	}
	
	public T value() {
		return value;
	}
	
	@Override
	public String toString() {
		return value.toString();
	}
	
}

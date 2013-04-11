package k.memory;

public interface IStorable<T> {

	void value(T t);
	
	T value();
	
	IStorable<T> copy();

}

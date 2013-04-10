package k.types;

import k.memory.IStorable;

public interface IType<T> extends IStorable<T> {

	void value(T value);
	
	 T value();
	 
}

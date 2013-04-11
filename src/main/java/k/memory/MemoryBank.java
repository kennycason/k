package k.memory;

import java.util.HashMap;
import java.util.Map.Entry;

import k.types.KFunction;

public class MemoryBank {

	private HashMap<String, IStorable<?>> mem;
	
	public MemoryBank() {
		mem = new HashMap<String, IStorable<?>>();
	}
	
	public void write(String var, IStorable<?> value) {
		mem.put(var, value);
	}
	
	public IStorable<?> read(String storable) {
		return mem.get(storable);
	}
	
	public int size() {
		return mem.size();
	}
	
	@Override
	public String toString() {
		return toString(0);
	}
	
	public String toString(int depth) {
		String tabs = "";
		for(int i = 0; i < depth; i++) {
			tabs += "\t";
		}
		StringBuilder sb = new StringBuilder();
		for(Entry<String, IStorable<?>> entry : mem.entrySet()) {

			if(entry.getValue() instanceof KFunction) {
				sb.append(tabs + entry.getKey() + "\t: FUNC()\n");
				if(((KFunction)entry.getValue()).memory().size() > 0) {
					sb.append(((KFunction)entry.getValue()).toString(depth + 1));
				}
			} else {
				sb.append(tabs + entry.getKey() + "\t: " + entry.getValue() + "\n");
			}
		}
		sb.append("\n");
		return sb.toString();
	}
	
	
}

package k.memory;

import java.util.HashMap;
import java.util.Map.Entry;

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
		StringBuilder sb = new StringBuilder();
		sb.append("Memory Dump:\n");
		for(Entry<String, IStorable<?>> entry : mem.entrySet()) {
			sb.append(entry.getKey() + "\t: " + entry.getValue() + "\n");
		}
		sb.append("\n");
		return sb.toString();
	}
	
}

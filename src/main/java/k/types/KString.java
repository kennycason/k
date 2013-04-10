package k.types;

public class KString extends AbstractType<String> {
	
	public KString() {
		this.value = new String("");
	}
	
	public KString(String value) {
		this.value = value;
	}

}

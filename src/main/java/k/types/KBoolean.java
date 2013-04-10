package k.types;

public class KBoolean extends AbstractType<Boolean> {
	
	public KBoolean() {
		this.value = new Boolean(false);
	}
	
	public KBoolean(Boolean value) {
		this.value = value;
	}
	
	public KBoolean(boolean value) {
		this.value = value;
	}
	
}

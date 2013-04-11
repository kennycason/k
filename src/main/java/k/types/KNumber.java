package k.types;

public class KNumber extends AbstractType<Double> {
	
	public KNumber() {
		this.value = new Double(0);
	}
	
	public KNumber(Double value) {
		this.value = value;
	}
	
	public KNumber(double value) {
		this.value = value;
	}
	
	public KNumber(Long value) {
		this.value = (double)value;
	}
	
	public KNumber(long value) {
		this.value = (double)value;
	}
	
	public KNumber(Integer value) {
		this.value = (double)value;
	}
	
	public KNumber(int value) {
		this.value = (double)value;
	}
	
	@Override
	public KNumber copy() {
		return new KNumber(value);
	}
	
}

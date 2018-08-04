package fft;

/**
 * 
 * @author StaticNull
 *
 */
public class Frequency {
	private static final Integer MIN_FREQUENCY = 1;
	private static final Integer MAX_FREQUENCY = 22050;
	
	private final int frequency;
	
	public Frequency(final int frequency) throws Exception {
		if(frequency < MIN_FREQUENCY || frequency > MAX_FREQUENCY) {
			throw new Exception("frequency: " + frequency + " is not allowed!");
		}
		this.frequency = frequency;
	}
	
	public int getFrequency() {
		return frequency;
	}
	
	public String toString() {
		return getFrequency() + "Hz";
	}
	
	public boolean equals(final Object other) {
		if(other instanceof Frequency) {
			if(((Frequency) other).getFrequency() == this.getFrequency()) {
				return true;
			}
		}
		return false;
	}
}

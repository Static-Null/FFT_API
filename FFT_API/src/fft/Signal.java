package fft;

import java.util.ArrayList;

/**
 * 
 * @author StaticNull
 *
 */
public class Signal {
	private static final Double MAX_SAMPLE_VALUE = 1.0;
	private static final Double MIN_SAMPLE_VALUE = -1.0;
	
	private ArrayList<Double> sampleData;
	private Integer sampleRate;
	
	public Double getSample(final Integer index) {
		if(index < 0 || index >= sampleData.size()) {
			return 0.0;
		} else {
			return new Double(sampleData.get(index));
		}
	}
	
	public void appendSample(final Double sample) throws Exception {
		if(sample < MIN_SAMPLE_VALUE || sample > MAX_SAMPLE_VALUE) {
			throw new Exception("Sample value " + sample + " is not allowed!");
		}
		sampleData.add(sample);
	}
	
	public Integer getSampleRate() {
		return new Integer(sampleRate);
	}
}

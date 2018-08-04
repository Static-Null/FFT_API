package fft;

import java.util.HashMap;
import java.util.ArrayList;

/**
 * 
 * @author StaticNull
 *
 */

public class SignalAnalysisFrame {
	private HashMap<Frequency, Double> frequencyStrengths;
	
	public SignalAnalysisFrame(final ArrayList<Frequency> frequencyList) {
		frequencyStrengths = new HashMap<Frequency, Double>();
		for(Frequency f : frequencyList) {
			frequencyStrengths.put(f, new Double(0.0));
		}
	}
	
	public double getFrequencyStrength(final Frequency f) {
		if(frequencyStrengths.containsKey(f)) {
			return frequencyStrengths.get(f);
		} else {
			return 0.0;
		}
	}
	
	public void setFrequencyStrength(final Frequency f, final Double strength) {
		if(frequencyStrengths.containsKey(f)) {
			frequencyStrengths.put(f, strength);
		}
	}
}

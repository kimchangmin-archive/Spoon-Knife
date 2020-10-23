package observer;

import java.util.ArrayList;
import java.util.Random;

public class Singer implements Talent {
	private ArrayList<Fan> fanList;
	public Singer() {
		fanList = new ArrayList<Fan>();
	}
	
	@Override
	public void addFan(Fan o) {
		fanList.add(o);
	}

	@Override
	public void deleteFan(Fan o) {
		if(fanList.indexOf(o) <= 0) {
			fanList.remove(o);
		}
	}

	@Override
	public void speak() {
		String[] voices = {"사랑합니다. 여러분!", "악플 좀 그만 다세요!"};
		Random r = new Random();
		int index = r.nextInt(voices.length);
		for(int i = 0 ; i < fanList.size() ; i++) {
			Fan o = (Fan)fanList.get(i);
			o.hear(voices[index]);
		}
	}
}

package com.vnr.tddtask;

public class RemoveFirst2Ch {

	public String remove(String string) {
		int StringLength=string.length();
		char first=string.charAt(0);
		char second=string.charAt(1);
		String remainingChars=string.substring(2,StringLength);
		if(first=='A')
			if(second=='A')
				return remainingChars;
			else
				return second + remainingChars;
		else
			if(second=='A')
				return first + remainingChars;
			else
				return string;
	}
	

}

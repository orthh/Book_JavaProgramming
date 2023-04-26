package chap05_Dictionary;

public class Dictionary extends PairMap{

	int cnt = 0;
	public Dictionary(int num) {
		keyArray = new String[num];
		valueArray = new String[num];
	}
	
	@Override
	String get(String key) {
		String result = "";
		boolean isDuplicate = false;
		int index = 0;
		for(int i=0;  i < cnt; i++) {
			if(keyArray[i].equals(key)) {
				isDuplicate = true;
				index = i;
				break;
			}
		}
		if(isDuplicate) {
			result = valueArray[index];
		}else {
			result = null;
		}
		return result;
	}

	@Override
	void put(String key, String value) {
		boolean isDuplicate = false;
		int index = 0;
		for(int i=0;  i < cnt; i++) {
			if(keyArray[i].equals(key)) {
				index = i;
				isDuplicate = true;
				break;
			}
			
		}
		if(isDuplicate) {
			valueArray[index] = value;
		}else {
			keyArray[cnt] = key;
			valueArray[cnt] = value;
			cnt++;
		}
		
	}

	@Override
	String delete(String key) {
		boolean isDuplicate = false;
		int index = 0;
		for(int i=0;  i < valueArray.length; i++) {
			if(keyArray[i].equals(key)) {
				index = i;
				isDuplicate = true;
				break;
			}
			
		}
		if(isDuplicate) {
			keyArray[index] = "";
			valueArray[index] = "";
		}else {

		}
		return null;
	}

	@Override
	int length() {
		
		return cnt;
	}

}

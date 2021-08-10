package study_04;
import java.util.HashMap;
import java.util.Objects;

public class KeyTest {

	public static void main(String[] args) {
		
		HashMap<Key, String> map = new HashMap<Key, String>();
		
		map.put(new Key(1),"Hong Gil Dong");
		
		String v = map.get(new Key(1));
		System.out.println(v);
	}

}

class Key {
	
	public int num;

	@Override
	public int hashCode() {
		return Objects.hash(num);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		return num == other.num;
	}

	public Key(int num) {
		super();
		this.num = num;
	}


}
package homework03;

public class QuestionTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Track t = new Track(); //Track
		Track t2 = new SubTrack(); //Track
		SubTrack subt = (SubTrack) t2; //SubTrack
		SubTrack subt2 = new SubTrack(); //SubTrack
//		SubTrack subt3 = (SubMember) t;
	}

}

class Track {
	String name = "Track";
}

class SubTrack extends Track {
	String name = "SubTrack";
}
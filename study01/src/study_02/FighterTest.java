package study_02;

public class FighterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fighter f = new Fighter();
		if (f instanceof Unit) {
			System.out.println("f is a child class of the Unit class");
		}
		if (f instanceof Fightable) {
			System.out.println("f is an implementation of the interface Fighter");
		}
		if (f instanceof Movable) {
			System.out.println("f is an implementaion of the interface Moveable");
		}
		if (f instanceof Attackable) {
			System.out.println("f is an implementaion of the interface Attackable");
		}
		if (f instanceof Object) {
			System.out.println("f is an implementaion of the interface Object");
		}
	}

}

class Fighter extends Unit implements Fightable {

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack(Unit u) {
		// TODO Auto-generated method stub
		
	}
//	public void move(int x, int y) {};
//	public void attack(Unit u) {};
}

class Unit {
	int currentHp;
	int x;
	int y;
}

interface Fightable extends Movable, Attackable { }
interface Movable { void move(int x, int y); }
interface Attackable { void attack(Unit u); }
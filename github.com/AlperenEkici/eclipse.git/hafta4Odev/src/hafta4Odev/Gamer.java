package hafta4Odev;

public class Gamer extends User {
	private int id;
	
	public Gamer() {
		
	}
	
	public Gamer(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}

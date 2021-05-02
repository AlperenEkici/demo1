package hafta4Odev;

public class GameStoreManager {
	
	private GameStore game;
	
	public GameStoreManager(GameStore game) {
		this.game = game;
	}

	public void add() {
		System.out.println(game.getName() + " isimli oyun magazaya eklendi.");
	}	
	
	public void delete() {
		System.out.println(game.getName() + " isimli oyun magazadan silindi.");
	}	
	
	public void update() {
		System.out.println(game.getName() + " isimli oyun baþarýyla güncellendi.");
	}
}

package hafta4Odev;

public class GamerManager implements UserManager{
	
	@Override
	public void add(User user) {
		E_devlet e_devlet = new E_devlet(user); 
		e_devlet.verification();
		System.out.println("Id :" + user.getId() + " kay�t ba�ar�l�.");	
	}
	
	@Override
	public void delete(User user) {
		System.out.println("Id :" + user.getId() + " kullan�c�s� silindi");
	}
	
	@Override
	public void update(User user) {
		System.out.println("Id :" + user.getId() + " kullan�c� g�ncellendi");
	}
	

}

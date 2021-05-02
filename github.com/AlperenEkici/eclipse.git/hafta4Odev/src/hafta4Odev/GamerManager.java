package hafta4Odev;

public class GamerManager implements UserManager{
	
	@Override
	public void add(User user) {
		E_devlet e_devlet = new E_devlet(user); 
		e_devlet.verification();
		System.out.println("Id :" + user.getId() + " kayýt baþarýlý.");	
	}
	
	@Override
	public void delete(User user) {
		System.out.println("Id :" + user.getId() + " kullanýcýsý silindi");
	}
	
	@Override
	public void update(User user) {
		System.out.println("Id :" + user.getId() + " kullanýcý güncellendi");
	}
	

}

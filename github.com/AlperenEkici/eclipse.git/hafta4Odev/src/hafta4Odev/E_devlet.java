package hafta4Odev;

public class E_devlet {
	
	User user;
	
	public E_devlet(User user) {
		this.user = user;
	}	
	public void verification(){
		System.out.print("Id :" + user.getId() + " Bilgiler Dogrulandý ");
	}
	
}

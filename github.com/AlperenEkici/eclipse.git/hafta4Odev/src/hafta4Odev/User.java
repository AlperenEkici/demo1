package hafta4Odev;

public class User {
	private int id;
	private String tcNo;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String E_posta;
	private String Passaword;
	
	public User() {
		
	}
	
	public User(String tcNo, String firstName, String lastName, String dateOfBirth) {
		this.tcNo = tcNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getE_posta() {
		return E_posta;
	}

	public void setE_posta(String e_posta) {
		E_posta = e_posta;
	}

	public String getPassaword() {
		return Passaword;
	}

	public void setPassaword(String passaword) {
		Passaword = passaword;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTcNo() {
		return tcNo;
	}
	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
}

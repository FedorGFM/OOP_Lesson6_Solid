public class Persistence extends User implements Save{
	private User user;

	public Persistence(String name) {
		super(name);
		this.user = new User(name);
	}

	public void save() {
		System.out.println("Save user: " + user.getName());
	}
}
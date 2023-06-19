public class Main{
	public static void main(String[] args){
		Persistence user = new Persistence("Bob");
		user.report();
		user.save();
	}
}
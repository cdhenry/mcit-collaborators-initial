import java.util.ArrayList;

public class Collaborators {
	public ArrayList<String> names = new ArrayList<String>();

	public Collaborators(String... args) {
		for (String name: args) {
			this.names.add(name);
		}
	}

	public static void main(String[] args) {
		Collaborators collaborators = new Collaborators("Chris", "Wendy");
		System.out.println("These are the collaborators: ");
		for(String name: collaborators.names) {
			System.out.println(name);
		}
	}
}

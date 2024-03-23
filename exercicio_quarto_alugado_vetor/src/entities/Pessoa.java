package entities;

public class Pessoa {
	private String name;
	private String email;
	private int room;
	
	public Pessoa(String name, String email, int room) {
		this.name = name;
		this.email = email;
		this.room = room;
	}

	@Override
	public String toString() {
		return String.format("%d: %s, %s", room, name, email);
	}
	
	
	
}

package id.ac.polinema.notesapp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import id.ac.polinema.notesapp.models.Note;
import id.ac.polinema.notesapp.models.User;

public class Data {

	private static List<User> users;
	private static List<Note> notes;

	static {
		users = new ArrayList<>();
		users.add(new User("owen", "rahasia"));
		users.add(new User("beni", "rahasia"));
		users.add(new User("cindy", "rahasia"));

		notes = new ArrayList<>();
		notes.add(new Note("Sushi", new Date(), "Pada suatu hari hiduplah sepasang kekasih...."));
		notes.add(new Note("Sashimi", new Date(), "Pada suatu hari hiduplah sepasang kekasih...."));
		notes.add(new Note("Onigiri", new Date(), "Pada suatu hari hiduplah sepasang kekasih...."));
		notes.add(new Note("Mochi", new Date(), "Pada suatu hari hiduplah sepasang kekasih...."));
		notes.add(new Note("Takoyaki", new Date(), "Pada suatu hari hiduplah sepasang kekasih...."));
		notes.add(new Note("Mie Udon", new Date(), "Pada suatu hari hiduplah sepasang kekasih...."));
		notes.add(new Note("Dorayaki", new Date(), "Pada suatu hari hiduplah sepasang kekasih...."));
		notes.add(new Note("Yakiniku", new Date(), "Pada suatu hari hiduplah sepasang kekasih...."));
		notes.add(new Note("Mie Soba", new Date(), "Pada suatu hari hiduplah sepasang kekasih...."));
		notes.add(new Note("Mie Ramen", new Date(), "Pada suatu hari hiduplah sepasang kekasih...."));
		notes.add(new Note("Edamame", new Date(), "Pada suatu hari hiduplah sepasang kekasih...."));
		notes.add(new Note("Chirashizushi", new Date(), "Pada suatu hari hiduplah sepasang kekasih...."));
		notes.add(new Note("Nasi Kari Jepang", new Date(), "Pada suatu hari hiduplah sepasang kekasih...."));
		notes.add(new Note("Okonomiyaki", new Date(), "Pada suatu hari hiduplah sepasang kekasih...."));
		notes.add(new Note("Sukiyaki", new Date(), "Pada suatu hari hiduplah sepasang kekasih...."));
	}

	public static List<User> getUsers() {
		return users;
	}

	public static List<Note> getNotes() {
		return notes;
	}
}

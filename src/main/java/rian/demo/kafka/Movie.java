package rian.demo.kafka;

public class Movie {

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", director=" + director + ", genre=" + genre + "]";
	}

	public int id;
	public String name;
	public String director;
	public String genre;

	public Movie(int id, String name, String director, String genre) {
		this.id = id;
		this.name = name;
		this.director = director;
		this.genre = genre;
	}
	
	
	

}
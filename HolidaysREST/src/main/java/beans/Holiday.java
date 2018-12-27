package beans;

import java.time.LocalDate;

public class Holiday {

	public Holiday(String name, LocalDate date) {
		super();
		this.name = name;
		this.date = date;
	}
	private String name; 
	private LocalDate date;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Holiday [name=" + name + ", date=" + date + "]";
	}
	

}

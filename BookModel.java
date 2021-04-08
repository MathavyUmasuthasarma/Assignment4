package com.example.demo.bookmodel;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="books")
public class BookModel {
@Id
private String id;
private String title;
private String author;
private String isbnNumber;
private long price;
private String language;
private String coverPhotoURL;
private String genre;

public BookModel(String id, String title, String author, String isbnNumber, long price, String language, String coverPhotoURL,
		String genre) {
	super();
	this.id = id;
	this.title = title;
	this.author = author;
	this.isbnNumber = isbnNumber;
	this.price = price;
	this.language = language;
	this.coverPhotoURL = coverPhotoURL;
	this.genre = genre;
}



public String getId() {
	return id;
}



public void setId(String id) {
	this.id = id;
}



public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

public String getIsbnNumber() {
	return isbnNumber;
}

public void setIsbnNumber(String isbnNumber) {
	this.isbnNumber = isbnNumber;
}

public long getPrice() {
	return price;
}

public void setPrice(long price) {
	this.price = price;
}

public String getLanguage() {
	return language;
}

public void setLanguage(String language) {
	this.language = language;
}

public String getCoverPhotoURL() {
	return coverPhotoURL;
}

public void setCoverPhotoURL(String coverPhotoURL) {
	this.coverPhotoURL = coverPhotoURL;
}

public String getGenre() {
	return genre;
}

public void setGenre(String genre) {
	this.genre = genre;
}

}

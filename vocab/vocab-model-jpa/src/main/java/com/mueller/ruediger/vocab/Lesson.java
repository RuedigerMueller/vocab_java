package com.mueller.ruediger.vocab;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import com.mueller.ruediger.vocab.Vocable;
import java.util.Collection;
import javax.persistence.OneToMany;

@Entity
@NamedQuery(name = "AllLessons", query = "select l from Lesson l")
public class Lesson implements Serializable {

	private static final long serialVersionUID = 1L;

	public Lesson() {
	}

	@Id
	@GeneratedValue
	private long id;
	private String learnedLanguage;
	private String knownLanguage;
	private String title;
	@OneToMany(mappedBy = "lesson")
	private Collection<Vocable> vocable;
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLearnedLanguage() {
		return learnedLanguage;
	}

	public void setLearnedLanguage(String param) {
		this.learnedLanguage = param;
	}

	public String getKnownLanguage() {
		return knownLanguage;
	}

	public void setKnownLanguage(String param) {
		this.knownLanguage = param;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String param) {
		this.title = param;
	}

	public Collection<Vocable> getVocable() {
	    return vocable;
	}

	public void setVocable(Collection<Vocable> param) {
	    this.vocable = param;
	}

}
package com.mueller.ruediger.vocab;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.mueller.ruediger.vocab.Lesson;
import javax.persistence.ManyToOne;

@Entity
@NamedQuery(name = "AllVocables", query = "select v from Vocable v")
@Table(name = "T_VOCABLE")
public class Vocable implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private long id;
	
	@Column(length = 50)
	private String learned;
	
	@Column(length = 50)
	private String known;
	
	private Integer level;
	
	@Basic
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dueDate;

	@ManyToOne
	private Lesson lesson;

	public Vocable() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLearned() {
		return learned;
	}

	public void setLearned(String param) {
		this.learned = param;
	}

	public String getKnown() {
		return known;
	}

	public void setKnown(String param) {
		this.known = param;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer param) {
		this.level = param;
	}

	public Calendar getDueDate() {
		return dueDate;
	}

	public void setDueDate(Calendar param) {
		this.dueDate = param;
	}

	public Lesson getLesson() {
	    return lesson;
	}

	public void setLesson(Lesson param) {
	    this.lesson = param;
	}


}
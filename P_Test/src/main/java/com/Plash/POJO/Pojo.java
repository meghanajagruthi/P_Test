package com.Plash.POJO;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.google.gson.annotations.Expose;


@Entity
@Table(name="P_TEST_DATA")
public class Pojo implements Serializable{
	
	@Id
	@Expose
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="SAMPLETEXT")
	@Expose
	private String text;
	
	@Transient
	@Expose
	private String randomString;
	
	
	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}


	public String getRandomString() {
		
		UUID random=UUID.fromString(getText());
		return random.toString();
	}

}

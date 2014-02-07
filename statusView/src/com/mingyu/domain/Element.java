package com.mingyu.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "element")
public class Element {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "type")
	private int type;

	@Column(name = "propertys")
	private String propertys;

	@Column(name = "name")
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getPropertys() {
		return propertys;
	}

	public void setPropertys(String propertys) {
		this.propertys = propertys;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

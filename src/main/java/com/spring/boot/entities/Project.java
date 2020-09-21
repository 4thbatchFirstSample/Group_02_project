package com.spring.boot.entities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private long id;
	@Column(name = "name")
	private String name;
	@Column(name = "status")
	private String status;
	@Column(name = "type")
	private String type;
	@Column(name = "startDate")
	private Date startDate;
	@Column(name = "endDate")
	private Date endDate;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "p_id", referencedColumnName = "id")
	List<Defect> Defect;
	
	public Project() {
		
	}
	
	public Project(String name, String status, String type, Date startDate, Date endDate) {
		super();
		this.name = name;
		this.status = status;
		this.type = type;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public List<Defect> getDefect() {
		return Defect;
	}
	public void setDefect(List<Defect> defect) {
		Defect = defect;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
}

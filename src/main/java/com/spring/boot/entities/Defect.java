package com.spring.boot.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Defect {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private long id;
	private int submoduleid;
	private String name;
	private String status;
	private String type;
	private String action;
	private String assignto;
	private String description;
	private String enteredby;
	private String severity;
	private String priority;
	
	public Defect() {
		
	}
	
	public Defect(int submoduleid, String name, String status, String type, String action, String assignto,
			String description, String enteredby, String severity, String priority) {
		super();
		this.submoduleid = submoduleid;
		this.name = name;
		this.status = status;
		this.type = type;
		this.action = action;
		this.assignto = assignto;
		this.description = description;
		this.enteredby = enteredby;
		this.severity = severity;
		this.priority = priority;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getSubmoduleid() {
		return submoduleid;
	}
	public void setSubmoduleid(int submoduleid) {
		this.submoduleid = submoduleid;
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
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getAssignto() {
		return assignto;
	}
	public void setAssignto(String assignto) {
		this.assignto = assignto;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getEnteredby() {
		return enteredby;
	}
	public void setEnteredby(String enteredby) {
		this.enteredby = enteredby;
	}
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	
	
}

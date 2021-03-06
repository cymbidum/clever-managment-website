package edu.zju.bme.clever.website.entity;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "ARCHETYPE_FILE")
@DynamicUpdate(true)
public class ArchetypeFile implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5901980017608693553L;
	
	@Id
	@GeneratedValue
	@Column(name="ID")
	private Integer id;
	@Column(name="NAME", unique = true)
	private String name;
	@Lob
	@Column(name="CONTENT")
	private String content;
	@Lob
	@Column(name="DESCRIPTION")
	private String description;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "MODIFY_TIME")
	private Calendar modifyTime;
	@ManyToOne
	private CommitSequence commitSequence;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Calendar getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(Calendar modifyTime) {
		this.modifyTime = modifyTime;
	}
	public CommitSequence getCommitSequence() {
		return commitSequence;
	}
	public void setCommitSequence(CommitSequence commitSequence) {
		this.commitSequence = commitSequence;
	}
}

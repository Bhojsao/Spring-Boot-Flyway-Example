package com.bhoj.springboot.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * Entity class for Channel 
 * 
 * @author Bhoj
 *
 */
@Entity
@Table(name = "CHANNEL")
@Data
public class Channel implements Serializable{

	private static final long serialVersionUID = 4910225916550731446L;
	
	@Id
	@Column(name = "CHANNEL_ID", unique = true, nullable = false)
	private String channelId;

	@Column(name = "CHANNEL_NAME", length = 50)
	private String channelName;

	@Column(name = "CHANNEL_DESC")
	private String channelDesc;

}

package com.bhoj.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bhoj.springboot.domain.Channel;
import com.bhoj.springboot.repository.ChannelRepository;

/**
 * Rest API for Channel
 * 
 * @author Bhoj
 *
 */
@RestController
public class ChannelController {

	@Autowired
	private ChannelRepository channelRepository;

	@RequestMapping(value = "/channel/getAllChannel", method = RequestMethod.GET)
	@CrossOrigin
	public ResponseEntity<?> getAllChannel() {
		List<Channel> Channels = channelRepository.findAll();
		return new ResponseEntity<List<Channel>>(Channels, HttpStatus.OK);
	}
}

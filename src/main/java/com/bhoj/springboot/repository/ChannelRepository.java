package com.bhoj.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bhoj.springboot.domain.Channel;

/**
 * ChannelRepository
 * 
 * @author Bhoj
 *
 */
@Repository
public interface ChannelRepository extends JpaRepository<Channel, String> {

}

package com.artqiyi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.artqiyi.redis.service.RedisService;

import lombok.extern.slf4j.Slf4j;

@RestController()
@Slf4j
@RequestMapping("/redis")
public class RedisController {
	@Autowired
	private RedisService redisService;
	
	@GetMapping("/get")
	public String get(@RequestParam("key") String key) {
		log.info("RedisController.get()");
		return redisService.get(key);
	}
}

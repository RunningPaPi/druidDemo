package com.artqiyi;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.artqiyi.dao.model.User;
import com.artqiyi.redis.service.RedisService;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class RedisServiceTest {

	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	
	//@Autowired
	private RedisTemplate<String, Object> redisTemplate;
	
	@Autowired
	private RedisService redisService;
	
//	@Autowired
//	public void setRedisTemplate(RedisTemplate<String, Object> redisTemplate) {
//	    RedisSerializer<String> stringSerializer = new StringRedisSerializer();
//	    redisTemplate.setKeySerializer(stringSerializer);
//	    redisTemplate.setValueSerializer(stringSerializer);
//	    redisTemplate.setHashKeySerializer(stringSerializer);
//	    redisTemplate.setHashValueSerializer(stringSerializer);
//	    this.redisTemplate = redisTemplate;
//	}

	@Test
	public void save() {
//		stringRedisTemplate.opsForValue().set("zzp", "big z");
//		Assert.assertEquals("big z", stringRedisTemplate.opsForValue().get("zzp"));
		
		User user = new User();
		user.setEmail("");
		user.setId(2L);
		user.setIsRobot(false);
		user.setNickName("xmg");
		user.setPhone("110");
		user.setRegisteType((short)1);
		user.setToken("fdsafkdjslafj-dsfelkdsa");
		user.setStatus((short)1);
		user.setUnionId("sdfslajkf");
		stringRedisTemplate.opsForHash().put("user:2", "user_2", JSON.toJSON(user).toString());;
	}
	
	@Test
	public void hashSave() {
		User user = new User();
		user.setEmail("");
		user.setId(2L);
		user.setIsRobot(false);
		user.setNickName("xmg");
		user.setPhone("110");
		user.setRegisteType((short)1);
		user.setToken("fdsafkdjslafj-dsfelkdsa");
		user.setStatus((short)1);
		user.setUnionId("sdfslajkf");
		//JSONUtils.toJSONString(user);
		redisTemplate.opsForHash().put("user:2", "user_2", JSON.toJSON(user));
	}
	
	@Test
	public void get() {
		System.out.println(redisTemplate.opsForHash().get("user:1", "user_1"));
//		Jedis
	}
	
	@Test
	public void del() {
		redisTemplate.opsForHash().delete("USER", "user_1");
	}
	
	
	@Test
	public void hset() {
		User user = new User();
		user.setEmail("");
		user.setId(2L);
		user.setIsRobot(false);
		user.setNickName("xmg2");
		user.setPhone("1102");
		user.setRegisteType((short)1);
		user.setToken("dsafalafj-dsfelkdsa");
		user.setStatus((short)1);
		user.setUnionId("asdfdsafdsaf-dsaff");
		redisService.hset("user:2", "user_2", JSON.toJSON(user).toString());
		redisService.expire("user:2", 10);
	}
	

}

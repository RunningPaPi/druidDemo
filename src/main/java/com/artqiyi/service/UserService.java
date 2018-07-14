package com.artqiyi.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.artqiyi.dao.mapper.UserInfoMapper;
import com.artqiyi.dao.mapper.UserMapper;
import com.artqiyi.dao.model.User;
import com.artqiyi.dao.model.UserExample;
import com.artqiyi.dao.model.UserInfo;
import com.artqiyi.dao.model.UserInfoExample;
import com.artqiyi.vo.UserVo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {

	@Autowired
	private UserMapper userMapper;
	@Autowired
	private UserInfoMapper userInfoMapper;

	public UserVo findUserById(long id) {
		User user = userMapper.selectByPrimaryKey(id);
		UserInfoExample example = new UserInfoExample();
		example.or().andUserIdEqualTo(id);
		List<UserInfo> userInfos = userInfoMapper.selectByExample(example);
		UserVo uv = new UserVo();
		if (userInfos != null) {
			UserInfo userInfo = userInfos.get(0);
			BeanUtils.copyProperties(userInfo, uv);
		}
		BeanUtils.copyProperties(user, uv);
		log.info("user={}", user);
		return uv;
	}

	public UserVo findUserByRandomId(int id) {
		UserInfoExample example = new UserInfoExample();
		example.or().andUserRandomNoEqualTo(id);
		List<UserInfo> userInfos = userInfoMapper.selectByExample(example);
		UserVo uv = new UserVo();
		if (userInfos != null) {
			UserInfo userInfo = userInfos.get(0);
			BeanUtils.copyProperties(userInfo, uv);
			User user = userMapper.selectByPrimaryKey(userInfo.getUserId());
			if (user != null)
				BeanUtils.copyProperties(user, uv);
		}
		return uv;
	}

	public UserVo findUserByPhone(String phone) {
		UserExample ue = new UserExample();
		ue.or().andPhoneEqualTo(phone);
		List<User> users = userMapper.selectByExample(ue);
		UserVo uv = new UserVo();
		if (users != null && users.isEmpty()) {
			User user = users.get(0);
			BeanUtils.copyProperties(user, uv);
			UserInfoExample example = new UserInfoExample();
			example.or().andUserIdEqualTo(user.getId());
			List<UserInfo> userInfos = userInfoMapper.selectByExample(example);

			if (userInfos != null) {
				UserInfo userInfo = userInfos.get(0);
				BeanUtils.copyProperties(userInfo, uv);
			}

		}
		return uv;
	}

	@Transactional
	public boolean delUser(long id) {
		log.warn("【删除id={}的用户】", id);

		userMapper.deleteByPrimaryKey(id);
		UserInfoExample example = new UserInfoExample();
		example.or().andUserIdEqualTo(id);
		int count = userInfoMapper.deleteByExample(example);
		return count > 0;
	}

	@Transactional
	public boolean modifyUser(UserVo uv) {
		User user = userMapper.selectByPrimaryKey(uv.getId());
		BeanUtils.copyProperties(uv, user);
		userMapper.updateByPrimaryKeySelective(user);
		UserInfo userInfo = getByUserId(user.getId());
		BeanUtils.copyProperties(uv, userInfo);
		userInfoMapper.updateByPrimaryKeySelective(userInfo);
		return true;
	}

	public UserInfo getByUserId(long userId) {
		UserInfoExample example = new UserInfoExample();
		example.or().andUserIdEqualTo(userId);
		List<UserInfo> userInfos = userInfoMapper.selectByExample(example);
		UserInfo userInfo = null;
		if (userInfos != null) {
			userInfo = userInfos.get(0);
		}
		return userInfo;
	}
}

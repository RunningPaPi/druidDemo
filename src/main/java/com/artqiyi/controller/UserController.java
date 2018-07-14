package com.artqiyi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.artqiyi.service.UserService;
import com.artqiyi.util.ResultVOUtil;
import com.artqiyi.vo.ResultVO;
import com.artqiyi.vo.UserVo;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping
	public ResultVO getUser(@RequestParam(value = "userId", required = false) Long userId,
			@RequestParam(value = "randomId", required = false) Integer randomId,
			@RequestParam(value = "phone", required = false) String phone) {
		UserVo userVo = null;
		if (userId != null && !StringUtils.isEmpty(userId)) {
			userVo = userService.findUserById(userId);
		}else
		if (randomId != null && !StringUtils.isEmpty(randomId)) {
			userVo = userService.findUserByRandomId(randomId);
		} else
		if (phone != null && !StringUtils.isEmpty(phone)) {
			userVo = userService.findUserByPhone(phone);
		}
		log.info("userId={}",userId);
		log.info("randomId={}",randomId);
		log.info("phone={}",phone);
		ResultVO resultVO = new ResultVO<UserVo>();
		resultVO.setData(userVo);
		resultVO.setCode(200);
		resultVO.setMsg("heihei");
		return resultVO;
	}
	
	@PutMapping
	public ResultVO modifyUser(UserVo uv) {
		if(userService.modifyUser(uv)) {
			return ResultVOUtil.success(uv);
		}
		return ResultVOUtil.error(400, "error");
	}
	
	@DeleteMapping
	public ResultVO delUser(long id) {
		if (userService.delUser(id)) {			
			return ResultVOUtil.success();
		}
		return ResultVOUtil.error(400, "error");
	}
	
}

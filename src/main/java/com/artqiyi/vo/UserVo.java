package com.artqiyi.vo;

import java.util.Date;

import lombok.Data;

@Data
public class UserVo {
	private Long id;

    private String nickName;

    private String password;

    private String phone;

    private String email;

    private String token;

    private String unionId;

    private String tokenId;

    private Short registeType;

    private Short status;

    private Boolean isRobot;
    private Integer userRandomNo;

    private String headPicUrl;

    private Short gender;

    private String birthday;

    private String provinceCode;

    private String cityCode;

    private String areaCode;

    private String invaiteCode;

    private String level;

    private Integer coin;

    private Integer point;

    private Long balance;

    private Long balanceWithdrawable;

    private Long balanceFreezed;

    private String alipayAccount;

    private String alipayRealname;

    private Boolean phoneValidated;

    private Boolean realnameValidated;

    private Boolean alipayAccountValidated;

    private Date lastLoginTime;
}

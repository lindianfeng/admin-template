package com.freejoy.giftcode.mapper;


import com.freejoy.giftcode.model.SysUser;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;

public interface SysUserMapper {
    SysUser selectByUserName(String username);
}
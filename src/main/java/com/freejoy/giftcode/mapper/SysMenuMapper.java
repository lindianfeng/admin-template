package com.freejoy.giftcode.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysMenuMapper {
    List<String> selectRoleNamesByUrl(String url);
}
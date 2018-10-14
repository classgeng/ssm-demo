package com.dreamer.service;


import com.dreamer.entity.UserInfo;

import java.util.List;

/**
 * Created by xfgeng on 2018/10/11S.
 */
public interface UserInfoService {

    void insert(UserInfo record);

    void deleteByPrimaryKey(Integer id);

    void updateByPrimaryKey(UserInfo record);

    UserInfo selectByPrimaryKey(Integer id);

    List<UserInfo> selectAll();

}

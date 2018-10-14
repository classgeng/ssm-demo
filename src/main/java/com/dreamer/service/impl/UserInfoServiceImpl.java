package com.dreamer.service.impl;

import com.dreamer.dao.UserInfoMapper;
import com.dreamer.entity.UserInfo;
import com.dreamer.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xfgeng on 2018/10/11.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public void insert(UserInfo record) {
        userInfoMapper.insert(record);
    }

    @Override
    public void deleteByPrimaryKey(Integer id) {
        userInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateByPrimaryKey(UserInfo record) {
        userInfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public UserInfo selectByPrimaryKey(Integer id) {
        return userInfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<UserInfo> selectAll() {
        return userInfoMapper.selectAll();
    }

}

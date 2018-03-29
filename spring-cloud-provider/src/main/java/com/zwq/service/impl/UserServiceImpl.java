package com.zwq.service.impl;

import com.zwq.dao.IUserDao;
import com.zwq.entity.UserInf;
import com.zwq.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by DELL on 2018/3/28.
 */
@Service
public class UserServiceImpl implements IUserService{
    @Resource
    private IUserDao iUserDao;
    @Override
    public UserInf get(long id) {
        return iUserDao.findOne(id);
    }

    @Override
    public boolean add(UserInf userInf) {
        UserInf userInf1 = iUserDao.save(userInf);
        return userInf1!=null;
    }

    @Override
    public List<UserInf> list() {
        return iUserDao.findAll();
    }
}

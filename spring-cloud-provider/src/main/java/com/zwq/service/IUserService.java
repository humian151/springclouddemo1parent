package com.zwq.service;

import com.zwq.entity.UserInf;

import java.util.List;

public interface IUserService {
    public UserInf get(long id) ;
    public boolean add(UserInf userInf) ;
    public List<UserInf> list() ;
}

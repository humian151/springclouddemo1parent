package com.zwq.dao;

import com.zwq.entity.UserInf;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserDao extends JpaRepository<UserInf,Long> {

}

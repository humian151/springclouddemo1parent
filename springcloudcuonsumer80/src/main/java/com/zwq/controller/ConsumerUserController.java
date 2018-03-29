package com.zwq.controller;

import com.zwq.entity.UserInf;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ConsumerUserController {
    public static final String USER_GET_URL = "http://DELL-PC:8001/user/get/";
    public static final String USER_LIST_URL = "http://DELL-PC:8001/user/list/";
    public static final String USER_ADD_URL = "http://DELL-PC:8001/user/add";

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private HttpHeaders headers;

    @RequestMapping(value = "/consumer/user/get")
    public Object getDept(long id) {
      /*  UserInf userInf = this.restTemplate.getForObject(USER_GET_URL + id,
                UserInf.class);
        return userInf;*/
        UserInf dept = this.restTemplate
                .exchange(USER_GET_URL + id, HttpMethod.GET,
                        new HttpEntity<Object>(this.headers), UserInf.class)
                .getBody();
        return dept;
    }
    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/consumer/user/list")
    public Object listDept() {
       /* List<UserInf> allUser = this.restTemplate.getForObject(USER_LIST_URL,
                List.class);
        return allUser;*/
        List<UserInf> allUser = this.restTemplate
                            .exchange(USER_LIST_URL, HttpMethod.GET, new HttpEntity<Object>(this.headers), List.class)
                            .getBody();
        return allUser;
    }
    @RequestMapping(value = "/consumer/user/add")
    public Object addDept(UserInf userInf) {
        /*Boolean flag = this.restTemplate.postForObject(USER_ADD_URL, userInf,
                Boolean.class);
        return flag;*/
        Boolean flag = this.restTemplate
                .exchange(USER_ADD_URL,HttpMethod.POST,new HttpEntity<Object>(userInf,this.headers), Boolean.class)
                .getBody();
        return flag;
    }

}

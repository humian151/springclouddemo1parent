package com.zwq.rest;

import com.zwq.entity.UserInf;
import com.zwq.service.IUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
public class UserController {
    @Resource
    private IUserService iUserService ;
    @RequestMapping("/user/sessionId")
    public Object id(HttpServletRequest request) {
        return request.getSession().getId() ;
    }
    @RequestMapping(value="/user/get/{id}",method= RequestMethod.GET)
    public Object get(@PathVariable("id") long id) {
        return this.iUserService.get(id) ;
    }
    @RequestMapping(value="/user/add",method=RequestMethod.POST)
    public Object add(@RequestBody UserInf userInf) {
        return this.iUserService.add(userInf) ;
    }
    @RequestMapping(value="/user/list",method=RequestMethod.GET)
    public Object list() {
        return this.iUserService.list() ;
    }
}

package com.dreamer.controller;

import com.dreamer.entity.UserInfo;
import com.dreamer.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by xfgeng on 2018/10/11.
 */
@Controller
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/home")
    public String home(HttpServletRequest request){
        List<UserInfo> list = userInfoService.selectAll();
        System.out.println("count:"+list.size());
        request.setAttribute("userInfos",list);
        return "list";
    }

    @RequestMapping("/toSave")
    public String toSave(){
        return "edit";
    }

    @RequestMapping("/delete/{id}")
    public void delete(@PathVariable("id")  int id){
        userInfoService.deleteByPrimaryKey(id);
    }

    @RequestMapping("/save")
    public String save(HttpServletRequest request, UserInfo userInfo){
        if(null == userInfo.getId()) {
            userInfoService.insert(userInfo);
        }else{
            userInfoService.updateByPrimaryKey(userInfo);
        }
        return home(request);
    }
    @RequestMapping("/select/{id}")
    public String select(@PathVariable("id") int id, HttpServletRequest request){
        UserInfo userInfo = userInfoService.selectByPrimaryKey(id);
        request.setAttribute("userInfo",userInfo);
        return "edit";
    }

    @RequestMapping("/selectAll")
    public List<UserInfo> selectAll(){
        return userInfoService.selectAll();
    }

}

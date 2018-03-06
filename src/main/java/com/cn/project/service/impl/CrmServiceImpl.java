package com.cn.project.service.impl;

import java.util.List;

import javax.jws.WebService;

import com.cn.project.bean.Items;
import com.cn.project.bean.User;
import com.cn.project.service.CrmService;
import com.cn.project.service.UserService;
@WebService(endpointInterface="com.cn.project.service.CrmService"
           ,serviceName="CrmWS" )
/**
 * 
 * endpointInterface:可写可不写 是发布服务的接口
 * serviceName:可写可不写 名字随便起
 */
public class CrmServiceImpl implements CrmService {

	@Override
	public String getInfoById(int id) {
		System.out.println("B系统调用方法1...");
		String str=null;
		if(id>1){
			str="你的号码为"+id;
		}
		return str;
	}

	@Override
	public int getMessageByName(String name) {
		System.out.println("B系统调用方法2...");
		int a=0;
		if(name.equals("song")&&name.equals("fu")){
			a=1;
		}
		return a;
	}

	@Override
	public List<Items> getItemsByUser(User user) {
		// 模拟从数据库查询
		UserService userService=new UserServiceImpl();
		System.out.println(userService.getUserItems(user));
		return userService.getUserItems(user);
	}

}

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
 * endpointInterface:��д�ɲ�д �Ƿ�������Ľӿ�
 * serviceName:��д�ɲ�д ���������
 */
public class CrmServiceImpl implements CrmService {

	@Override
	public String getInfoById(int id) {
		System.out.println("Bϵͳ���÷���1...");
		String str=null;
		if(id>1){
			str="��ĺ���Ϊ"+id;
		}
		return str;
	}

	@Override
	public int getMessageByName(String name) {
		System.out.println("Bϵͳ���÷���2...");
		int a=0;
		if(name.equals("song")&&name.equals("fu")){
			a=1;
		}
		return a;
	}

	@Override
	public List<Items> getItemsByUser(User user) {
		// ģ������ݿ��ѯ
		UserService userService=new UserServiceImpl();
		System.out.println(userService.getUserItems(user));
		return userService.getUserItems(user);
	}

}

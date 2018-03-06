package com.cn.project.service;

import java.util.List;

import javax.jws.WebService;

import com.cn.project.bean.Items;
import com.cn.project.bean.User;

@WebService
public interface CrmService {
  
	public String getInfoById(int id);
	
	public int  getMessageByName(String name);
	
	//webservice∑µªÿlist¿‡–Õ
	public List<Items> getItemsByUser(User user);
}

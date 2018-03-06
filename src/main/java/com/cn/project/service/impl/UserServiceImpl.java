package com.cn.project.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cn.project.bean.Items;
import com.cn.project.bean.User;
import com.cn.project.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public List<Items> getUserItems(User user) {
		List<Items> items=new ArrayList<Items>();
		items.add(new Items("����", "��ɫ", 250.0f));
		items.add(new Items("��Ь", "��ɫ", 200.0f));
		items.add(new Items("��ʿ����", "��ɫ", 350.0f));
		items.add(new Items("������", "���", 72.0f));
		return items;
	}

}

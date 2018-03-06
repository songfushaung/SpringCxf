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
		items.add(new Items("包包", "红色", 250.0f));
		items.add(new Items("男鞋", "棕色", 200.0f));
		items.add(new Items("男士外套", "黑色", 350.0f));
		items.add(new Items("避孕套", "邦德", 72.0f));
		return items;
	}

}

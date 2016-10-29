package com.demo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.demo.dao.UserDao;
import com.demo.model.User;


@Service
public class UserService {
	@Resource
	private UserDao userdao;
	
		
	public int loginCheck(User user){
		int o = userdao.checklogin(user);
		return o;
	}
	
	public void regist(User user){
		userdao.insert(user);
	}
		
	public List<User> select_user() {
		List<User> selectedUser = userdao.select_user2();
		return selectedUser;
	}
	public List<User> select_user(int user_id) {
		List<User> selectedUser = userdao.select_user2(user_id);
		return selectedUser;
	}
	
	public void info_update(User user){
		userdao.info_update(user);
	}
	
	public void password_save(User user){
		userdao.password_save(user);
	}
	// to do
}

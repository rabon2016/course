package com.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.model.User;


@Repository
public class UserDao extends BaseDao<User>{

	public List<User> list(){
		String list = getIbatisMapperNamespace() + ".list";
		return getSqlSessionTemplate().selectList(list, null);
	}

	@Override
	public Class<User> getEntityClass() {
		// TODO Auto-generated method stub
		return User.class;
	}
	
	public void update(User user){
		String statementName = getIbatisMapperNamespace() + ".update";
		getSqlSessionTemplate().update(statementName, user);
	}

	public void insert(User user){
		String statementName = getIbatisMapperNamespace() + ".insert";
		getSqlSessionTemplate().update(statementName, user);
	}
	public void user_delete(int user_id){
		String statementName = getIbatisMapperNamespace() + ".user_delete";
		getSqlSessionTemplate().delete(statementName, user_id);
	}
	
	public int checklogin(User user){
		String statementName = getIbatisMapperNamespace() + ".select_password";
		List<User> selectedUser = getSqlSessionTemplate().selectList(statementName, user);
		if(selectedUser.size() == 0) 
			return 0;
		else {
			if(user.getuser_password().equals(selectedUser.get(0).getuser_password()))
			{
				if(selectedUser.get(0).getuser_role() == 1){
					return 1;
				}
				else 
					return 2;				
			}
			return 0;
		}
	}

	public List<User> select_user(int info){
		String statementName = getIbatisMapperNamespace() + ".select_user";
		List<User> selectedUser = getSqlSessionTemplate().selectList(statementName, info);
		return selectedUser;
	}
	
	public List<User> select_user2(){
		String statementName = getIbatisMapperNamespace() + ".select_user2";
		List<User> selectedUser = getSqlSessionTemplate().selectList(statementName);
		return selectedUser;
	}
	
	public List<User> select_user2(int info){
		String statementName = getIbatisMapperNamespace() + ".select_user2_1";
		List<User> selectedUser = getSqlSessionTemplate().selectList(statementName, info);
		return selectedUser;
	}
	
	public void initialize(int user_id){
		String statementName = getIbatisMapperNamespace() + ".initialize";
		getSqlSessionTemplate().update(statementName, user_id);
	}
	
	public void info_update(User user){
		String statementName = getIbatisMapperNamespace() + ".info_update";
		getSqlSessionTemplate().update(statementName, user);
	}
	
	public void password_save(User user){
		String statementName = getIbatisMapperNamespace() + ".password_save";
		getSqlSessionTemplate().update(statementName, user);
	}

}

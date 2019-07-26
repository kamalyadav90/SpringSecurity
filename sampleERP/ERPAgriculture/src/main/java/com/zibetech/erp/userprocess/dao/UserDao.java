package com.zibetech.erp.userprocess.dao;

import com.zibetech.erp.userprocess.model.UserLogin;



public interface UserDao {

	UserLogin findById(int id);
	
	UserLogin findBySSO(String sso);
	
}


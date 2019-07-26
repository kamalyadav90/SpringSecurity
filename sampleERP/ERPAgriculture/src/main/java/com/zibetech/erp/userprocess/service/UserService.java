package com.zibetech.erp.userprocess.service;

import com.zibetech.erp.userprocess.model.UserLogin;



public interface UserService {

	UserLogin findById(int id);
	
	UserLogin findBySso(String sso);
	
}
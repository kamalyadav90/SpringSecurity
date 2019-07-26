package com.zibetech.erp.userprocess.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zibetech.erp.userprocess.dao.UserDao;
import com.zibetech.erp.userprocess.model.UserLogin;





@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao dao;

	public UserLogin findById(int id) {
		return dao.findById(id);
	}

	public UserLogin findBySso(String sso) {
		
		//System.out.println("user name entered is---"+sso);
		return dao.findBySSO(sso);
	}

}

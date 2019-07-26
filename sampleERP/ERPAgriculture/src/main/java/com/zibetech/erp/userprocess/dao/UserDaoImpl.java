package com.zibetech.erp.userprocess.dao;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.zibetech.erp.userprocess.model.UserLogin;





@Repository("userDao")
public class UserDaoImpl extends AbstractDao<Integer, UserLogin> implements UserDao {

	public UserLogin findById(int id) {
		return getByKey(id);
	}

	public UserLogin findBySSO(String sso) {
		
		System.out.println("entered username is:-"+sso);
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("username", sso));
		return (UserLogin) crit.uniqueResult();
	}

	
}

package com.homeo.restws.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.homeo.restws.dao.HomeoProdUserDao;
import com.homeo.restws.model.HomeoProdUser;
import com.homeo.restws.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	HomeoProdUserDao homeoProdUserDao;

	@Transactional(rollbackFor = Exception.class)
	@Override
	public String createUser(HomeoProdUser homeoProdUser) {
		try {
			Map outMap = homeoProdUserDao.create(homeoProdUser);
			if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
			String errorCode =	(String) outMap.get("errorCode"); 
			//in future all these msg will come from properties file 
			if("".equals(errorCode))
				return "User has been Created Successfully.";
			else
				return "System is unable to Sign Up.Please contact your Administrator.";
		}catch(Exception e) {
			return "System is unable to Sign Up.Please contact your Administrator.";
		}
	}

	@Transactional(rollbackFor = Exception.class)
	@Override
	public HomeoProdUser retrieveUserByUsername(String username) {
		try {
			Map outMap = homeoProdUserDao.retrieveByUsername(username);
			if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
			String errorCode =	(String) outMap.get("errorCode"); 
			//in future all these msg will come from properties file 
			if("".equals(errorCode) && outMap.get("object")!=null && (outMap.get("noOfRowsImpacted")!=null && (Integer)outMap.get("noOfRowsImpacted") == 1))
				return (HomeoProdUser)outMap.get("object");
			else
				return null;
		}catch(Exception e) {
			return null;
		}
	}

	@Transactional(rollbackFor = Exception.class)
	@Override
	//public ListOfObjectsModel retrieveAllUsers() {
	public List<HomeoProdUser> retrieveAllUsers() {
		try {
			Map outMap = homeoProdUserDao.retrieveAllHomeoProdUsers();
			if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
			String errorCode =	(String) outMap.get("errorCode"); 
			//in future all these msg will come from properties file 
			if("".equals(errorCode) && outMap.get("object")!=null && (outMap.get("noOfRowsImpacted")!=null && (Integer)outMap.get("noOfRowsImpacted") >0)) {
				//List<Object> listOfUsers = new ArrayList<Object>((List<HomeoProdUser>)outMap.get("object"));  
				//return new ListOfObjectsModel(listOfUsers);
				return (List<HomeoProdUser>)outMap.get("object");
			}else {
				return null;
			}
		}catch(Exception e) {
			return null;
		}
	}

	@Override
	public String updateUser(HomeoProdUser homeoProdUser) {
		try {
			Map outMap = homeoProdUserDao.updateUser(homeoProdUser);
			if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
			String errorCode =	(String) outMap.get("errorCode"); 
			//in future all these msg will come from properties file 
			if("".equals(errorCode))
				return "User has been Updated Successfully.";
			else
				return "System is unable to Update the User.Please contact your Administrator.";
		}catch(Exception e) {
			return "System is unable to Update the User.Please contact your Administrator.";
		}

	}

	@Override
	public String deleteUserByUsername(String username) {
		try {
			Map outMap = homeoProdUserDao.deleteByUsername(username);
			if(outMap.get("errorCode")!=null && !((String)outMap.get("errorCode")).equals(""))
				TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); 
			String errorCode =	(String) outMap.get("errorCode"); 
			//in future all these msg will come from properties file 
			if("".equals(errorCode))
				return "User has been Deleted Successfully.";
			else
				return "System is unable to Delete the User.Please contact your Administrator.";
		}catch(Exception e) {
			return "System is unable to Delete the User.Please contact your Administrator.";
		}
	}

}

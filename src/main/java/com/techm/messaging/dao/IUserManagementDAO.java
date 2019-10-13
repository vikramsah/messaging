package com.techm.messaging.dao;

import com.techm.message.common.model.User;

public interface IUserManagementDAO {
	//register
	public User registerUser(User registerUser);
	
	public User folloUser(String userIdFollowing, String userIdToBeFollowed);

}

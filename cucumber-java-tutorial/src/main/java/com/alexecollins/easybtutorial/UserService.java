package com.alexecollins.easybtutorial;

public class UserService {
	 
    private UserDao userDao;
 
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }
 
    public User findUser(int id){
        return null;
    }
}
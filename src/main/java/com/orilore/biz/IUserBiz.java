package com.orilore.biz;
import com.orilore.model.*;
import java.util.List;
public interface IUserBiz{
	public boolean save(User user);
	public boolean remove(int id);
	public User find(int id);
	public List<User> query();
}
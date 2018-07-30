package com.orilore.biz;
import com.orilore.model.*;
import java.util.List;
public interface IAdminBiz{
	public boolean save(Admin admin);
	public boolean remove(int id);
	public Admin find(int id);
	public List<Admin> query();
}
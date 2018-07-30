package com.orilore.biz;
import com.orilore.model.*;
import java.util.List;
public interface ICompanyBiz{
	public boolean save(Company company);
	public boolean remove(int id);
	public Company find(int id);
	public List<Company> query();
}
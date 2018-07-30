package com.orilore.biz;
import com.orilore.model.*;
import java.util.List;
public interface IHouseBiz{
	public boolean save(House house);
	public boolean remove(int id);
	public House find(int id);
	public List<House> query();
}
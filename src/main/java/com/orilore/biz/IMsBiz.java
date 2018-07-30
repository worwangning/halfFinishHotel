package com.orilore.biz;
import com.orilore.model.*;
import java.util.List;
public interface IMsBiz{
	public boolean save(Ms ms);
	public boolean remove(int id);
	public Ms find(int appid);
	public List<Ms> query();
}
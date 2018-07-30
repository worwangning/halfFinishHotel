package com.orilore.biz;
import com.orilore.model.*;
import java.util.List;
public interface IHpriceBiz{
	public boolean save(Hprice hprice);
	public boolean remove(int id);
	public Hprice find(int id);
	public List<Hprice> query();
}
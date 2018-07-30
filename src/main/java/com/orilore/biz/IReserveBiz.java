package com.orilore.biz;
import com.orilore.model.*;
import java.util.List;
public interface IReserveBiz{
	public boolean save(Reserve reserve);
	public boolean remove(int id);
	public Reserve find(int id);
	public List<Reserve> query();
}
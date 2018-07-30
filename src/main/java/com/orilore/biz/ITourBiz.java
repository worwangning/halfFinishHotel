package com.orilore.biz;
import com.orilore.model.*;
import java.util.List;
public interface ITourBiz{
	public boolean save(Tour tour);
	public boolean remove(int id);
	public Tour find(int id);
	public List<Tour> query();
}
package com.orilore.biz;
import com.orilore.model.*;
import java.util.List;
public interface IPhotoBiz{
	public boolean save(Photo photo);
	public boolean remove(int id);
	public Photo find(int id);
	public List<Photo> query();
}
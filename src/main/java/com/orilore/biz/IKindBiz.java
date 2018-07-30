package com.orilore.biz;
import com.orilore.model.*;
import java.util.List;
public interface IKindBiz{
	public boolean save(Kind kind);
	public boolean remove(int id);
	public Kind find(int id);
	public List<Kind> query();
}
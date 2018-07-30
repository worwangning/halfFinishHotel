package com.orilore.biz;
import com.orilore.model.*;
import java.util.List;
public interface IRecordBiz{
	public boolean save(Record record);
	public boolean remove(int id);
	public Record find(int id);
	public List<Record> query();
}
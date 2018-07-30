package com.orilore.biz;
import com.orilore.model.*;
import java.util.List;
public interface IMessageBiz{
	public boolean save(Message message);
	public boolean remove(int id);
	public Message find(int id);
	public List<Message> query();
}
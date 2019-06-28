package com.space.service;

import java.util.List;
import com.github.pagehelper.PageInfo;

public interface BaseService<T,ID> {
	public T getById(ID id);
	public int delete(T t);
	public int deleteByKey(ID id);
	public int save(T t);
	public int update(T t);
	public List<T> select(T t);
	public List<T> selectAll();
	public PageInfo<T> selectPage(int pageNum,int pageSize);
	public PageInfo<T> selectPage(int pageNum,int pageSize, T t);
	
}


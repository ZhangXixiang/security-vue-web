package com.space.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import tk.mybatis.mapper.common.Mapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author ThinkPad
 *
 */
@Service
public abstract class BaseServiceImpl<T,ID> {

	@Autowired
	protected Mapper<T> mapper;
	
	public void setMapper(Mapper<T> mapper) {
		this.mapper = mapper;
	}

	public T getById(ID id){
    	return mapper.selectByPrimaryKey(id);
    }

    public int save(T entity){
        return mapper.insert(entity);
    }

    public int delete(T entity){
    	
        return mapper.delete(entity);
    }
    public int deleteByKey(ID id){
    	
        return mapper.deleteByPrimaryKey(id);
    }
    public int update(T entity){
        return mapper.updateByPrimaryKeySelective(entity);
    }
    /**
     * 单表分页查询
     * 
     * @param pageNum
     * @param pageSize
     * @return
     */
    public PageInfo<T> selectPage(int pageNum,int pageSize){
        PageHelper.startPage(pageNum, pageSize);
        //Spring4支持泛型注入
        List<T> ts = mapper.select(null);
        if (CollectionUtils.isEmpty(ts)) {
			return null;
		}
		return new PageInfo<T>(ts);
    }
    public PageInfo<T> selectPage(int pageNum,int pageSize, T t){
        PageHelper.startPage(pageNum, pageSize);
        //Spring4支持泛型注入
        List<T> ts = mapper.select(t);
        if (CollectionUtils.isEmpty(ts)) {
			return null;
		}
		return new PageInfo<T>(ts);
         
    }
    public int selectCount(T entity){
    	 return mapper.selectCount(entity);
    }
    
    public List<T> select(T entity){
    	
    	return mapper.select(entity);
    }
    public List<T> selectAll(){
    	return mapper.selectAll();
    }
    
    protected String getStreamBase64String(InputStream in){
        try {
			byte[] buff = IOUtils.toByteArray(in);
			return new String(Base64.encodeBase64(buff));
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
    protected String getStreamString(InputStream in){
		try {
			byte[] buff = IOUtils.toByteArray(in);
			return new String(buff,"UTF-8");
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
    
    
    
}


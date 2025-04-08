package com.entity.view;

import com.entity.DaikuanshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 贷款申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-16 21:30:13
 */
@TableName("daikuanshenqing")
public class DaikuanshenqingView  extends DaikuanshenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DaikuanshenqingView(){
	}
 
 	public DaikuanshenqingView(DaikuanshenqingEntity daikuanshenqingEntity){
 	try {
			BeanUtils.copyProperties(this, daikuanshenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

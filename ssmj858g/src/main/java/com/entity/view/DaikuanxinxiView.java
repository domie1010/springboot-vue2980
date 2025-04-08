package com.entity.view;

import com.entity.DaikuanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 贷款信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-16 21:30:13
 */
@TableName("daikuanxinxi")
public class DaikuanxinxiView  extends DaikuanxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DaikuanxinxiView(){
	}
 
 	public DaikuanxinxiView(DaikuanxinxiEntity daikuanxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, daikuanxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

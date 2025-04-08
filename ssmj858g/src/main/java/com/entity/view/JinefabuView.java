package com.entity.view;

import com.entity.JinefabuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 金额发布
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-16 21:30:13
 */
@TableName("jinefabu")
public class JinefabuView  extends JinefabuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JinefabuView(){
	}
 
 	public JinefabuView(JinefabuEntity jinefabuEntity){
 	try {
			BeanUtils.copyProperties(this, jinefabuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

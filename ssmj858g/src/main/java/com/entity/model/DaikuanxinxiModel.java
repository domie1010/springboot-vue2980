package com.entity.model;

import com.entity.DaikuanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 贷款信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-16 21:30:13
 */
public class DaikuanxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 贷款额度
	 */
	
	private Integer daikuanedu;
		
	/**
	 * 还款利率
	 */
	
	private String haikuanlilv;
		
	/**
	 * 贷款要求
	 */
	
	private String daikuanyaoqiu;
		
	/**
	 * 还款要求
	 */
	
	private String haikuanyaoqiu;
		
	/**
	 * 还款时间
	 */
	
	private String haikuanshijian;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
				
	
	/**
	 * 设置：贷款额度
	 */
	 
	public void setDaikuanedu(Integer daikuanedu) {
		this.daikuanedu = daikuanedu;
	}
	
	/**
	 * 获取：贷款额度
	 */
	public Integer getDaikuanedu() {
		return daikuanedu;
	}
				
	
	/**
	 * 设置：还款利率
	 */
	 
	public void setHaikuanlilv(String haikuanlilv) {
		this.haikuanlilv = haikuanlilv;
	}
	
	/**
	 * 获取：还款利率
	 */
	public String getHaikuanlilv() {
		return haikuanlilv;
	}
				
	
	/**
	 * 设置：贷款要求
	 */
	 
	public void setDaikuanyaoqiu(String daikuanyaoqiu) {
		this.daikuanyaoqiu = daikuanyaoqiu;
	}
	
	/**
	 * 获取：贷款要求
	 */
	public String getDaikuanyaoqiu() {
		return daikuanyaoqiu;
	}
				
	
	/**
	 * 设置：还款要求
	 */
	 
	public void setHaikuanyaoqiu(String haikuanyaoqiu) {
		this.haikuanyaoqiu = haikuanyaoqiu;
	}
	
	/**
	 * 获取：还款要求
	 */
	public String getHaikuanyaoqiu() {
		return haikuanyaoqiu;
	}
				
	
	/**
	 * 设置：还款时间
	 */
	 
	public void setHaikuanshijian(String haikuanshijian) {
		this.haikuanshijian = haikuanshijian;
	}
	
	/**
	 * 获取：还款时间
	 */
	public String getHaikuanshijian() {
		return haikuanshijian;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
			
}

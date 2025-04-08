package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 贷款信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-16 21:30:13
 */
@TableName("daikuanxinxi")
public class DaikuanxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DaikuanxinxiEntity() {
		
	}
	
	public DaikuanxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 银行名称
	 */
					
	private String yinxingmingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：银行名称
	 */
	public void setYinxingmingcheng(String yinxingmingcheng) {
		this.yinxingmingcheng = yinxingmingcheng;
	}
	/**
	 * 获取：银行名称
	 */
	public String getYinxingmingcheng() {
		return yinxingmingcheng;
	}
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

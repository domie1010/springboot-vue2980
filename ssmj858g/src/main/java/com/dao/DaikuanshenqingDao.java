package com.dao;

import com.entity.DaikuanshenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DaikuanshenqingVO;
import com.entity.view.DaikuanshenqingView;


/**
 * 贷款申请
 * 
 * @author 
 * @email 
 * @date 2021-05-16 21:30:13
 */
public interface DaikuanshenqingDao extends BaseMapper<DaikuanshenqingEntity> {
	
	List<DaikuanshenqingVO> selectListVO(@Param("ew") Wrapper<DaikuanshenqingEntity> wrapper);
	
	DaikuanshenqingVO selectVO(@Param("ew") Wrapper<DaikuanshenqingEntity> wrapper);
	
	List<DaikuanshenqingView> selectListView(@Param("ew") Wrapper<DaikuanshenqingEntity> wrapper);

	List<DaikuanshenqingView> selectListView(Pagination page,@Param("ew") Wrapper<DaikuanshenqingEntity> wrapper);
	
	DaikuanshenqingView selectView(@Param("ew") Wrapper<DaikuanshenqingEntity> wrapper);
	
}

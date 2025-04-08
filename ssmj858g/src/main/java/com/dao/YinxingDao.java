package com.dao;

import com.entity.YinxingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YinxingVO;
import com.entity.view.YinxingView;


/**
 * 银行
 * 
 * @author 
 * @email 
 * @date 2021-05-16 21:30:13
 */
public interface YinxingDao extends BaseMapper<YinxingEntity> {
	
	List<YinxingVO> selectListVO(@Param("ew") Wrapper<YinxingEntity> wrapper);
	
	YinxingVO selectVO(@Param("ew") Wrapper<YinxingEntity> wrapper);
	
	List<YinxingView> selectListView(@Param("ew") Wrapper<YinxingEntity> wrapper);

	List<YinxingView> selectListView(Pagination page,@Param("ew") Wrapper<YinxingEntity> wrapper);
	
	YinxingView selectView(@Param("ew") Wrapper<YinxingEntity> wrapper);
	
}

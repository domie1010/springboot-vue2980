package com.dao;

import com.entity.JinefabuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JinefabuVO;
import com.entity.view.JinefabuView;


/**
 * 金额发布
 * 
 * @author 
 * @email 
 * @date 2021-05-16 21:30:13
 */
public interface JinefabuDao extends BaseMapper<JinefabuEntity> {
	
	List<JinefabuVO> selectListVO(@Param("ew") Wrapper<JinefabuEntity> wrapper);
	
	JinefabuVO selectVO(@Param("ew") Wrapper<JinefabuEntity> wrapper);
	
	List<JinefabuView> selectListView(@Param("ew") Wrapper<JinefabuEntity> wrapper);

	List<JinefabuView> selectListView(Pagination page,@Param("ew") Wrapper<JinefabuEntity> wrapper);
	
	JinefabuView selectView(@Param("ew") Wrapper<JinefabuEntity> wrapper);
	
}

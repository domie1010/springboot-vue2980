package com.dao;

import com.entity.HaikuanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HaikuanxinxiVO;
import com.entity.view.HaikuanxinxiView;


/**
 * 还款信息
 * 
 * @author 
 * @email 
 * @date 2021-05-16 21:30:13
 */
public interface HaikuanxinxiDao extends BaseMapper<HaikuanxinxiEntity> {
	
	List<HaikuanxinxiVO> selectListVO(@Param("ew") Wrapper<HaikuanxinxiEntity> wrapper);
	
	HaikuanxinxiVO selectVO(@Param("ew") Wrapper<HaikuanxinxiEntity> wrapper);
	
	List<HaikuanxinxiView> selectListView(@Param("ew") Wrapper<HaikuanxinxiEntity> wrapper);

	List<HaikuanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<HaikuanxinxiEntity> wrapper);
	
	HaikuanxinxiView selectView(@Param("ew") Wrapper<HaikuanxinxiEntity> wrapper);
	
}

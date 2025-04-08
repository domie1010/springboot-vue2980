package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DaikuanshenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DaikuanshenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DaikuanshenqingView;


/**
 * 贷款申请
 *
 * @author 
 * @email 
 * @date 2021-05-16 21:30:13
 */
public interface DaikuanshenqingService extends IService<DaikuanshenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DaikuanshenqingVO> selectListVO(Wrapper<DaikuanshenqingEntity> wrapper);
   	
   	DaikuanshenqingVO selectVO(@Param("ew") Wrapper<DaikuanshenqingEntity> wrapper);
   	
   	List<DaikuanshenqingView> selectListView(Wrapper<DaikuanshenqingEntity> wrapper);
   	
   	DaikuanshenqingView selectView(@Param("ew") Wrapper<DaikuanshenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DaikuanshenqingEntity> wrapper);
   	
}


package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JinefabuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JinefabuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JinefabuView;


/**
 * 金额发布
 *
 * @author 
 * @email 
 * @date 2021-05-16 21:30:13
 */
public interface JinefabuService extends IService<JinefabuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JinefabuVO> selectListVO(Wrapper<JinefabuEntity> wrapper);
   	
   	JinefabuVO selectVO(@Param("ew") Wrapper<JinefabuEntity> wrapper);
   	
   	List<JinefabuView> selectListView(Wrapper<JinefabuEntity> wrapper);
   	
   	JinefabuView selectView(@Param("ew") Wrapper<JinefabuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JinefabuEntity> wrapper);
   	
}


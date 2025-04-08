package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HaikuanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HaikuanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HaikuanxinxiView;


/**
 * 还款信息
 *
 * @author 
 * @email 
 * @date 2021-05-16 21:30:13
 */
public interface HaikuanxinxiService extends IService<HaikuanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HaikuanxinxiVO> selectListVO(Wrapper<HaikuanxinxiEntity> wrapper);
   	
   	HaikuanxinxiVO selectVO(@Param("ew") Wrapper<HaikuanxinxiEntity> wrapper);
   	
   	List<HaikuanxinxiView> selectListView(Wrapper<HaikuanxinxiEntity> wrapper);
   	
   	HaikuanxinxiView selectView(@Param("ew") Wrapper<HaikuanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HaikuanxinxiEntity> wrapper);
   	
}


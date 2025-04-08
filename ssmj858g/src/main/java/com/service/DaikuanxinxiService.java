package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DaikuanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DaikuanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DaikuanxinxiView;


/**
 * 贷款信息
 *
 * @author 
 * @email 
 * @date 2021-05-16 21:30:13
 */
public interface DaikuanxinxiService extends IService<DaikuanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DaikuanxinxiVO> selectListVO(Wrapper<DaikuanxinxiEntity> wrapper);
   	
   	DaikuanxinxiVO selectVO(@Param("ew") Wrapper<DaikuanxinxiEntity> wrapper);
   	
   	List<DaikuanxinxiView> selectListView(Wrapper<DaikuanxinxiEntity> wrapper);
   	
   	DaikuanxinxiView selectView(@Param("ew") Wrapper<DaikuanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DaikuanxinxiEntity> wrapper);
   	
}


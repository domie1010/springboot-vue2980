package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.HaikuanxinxiDao;
import com.entity.HaikuanxinxiEntity;
import com.service.HaikuanxinxiService;
import com.entity.vo.HaikuanxinxiVO;
import com.entity.view.HaikuanxinxiView;

@Service("haikuanxinxiService")
public class HaikuanxinxiServiceImpl extends ServiceImpl<HaikuanxinxiDao, HaikuanxinxiEntity> implements HaikuanxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HaikuanxinxiEntity> page = this.selectPage(
                new Query<HaikuanxinxiEntity>(params).getPage(),
                new EntityWrapper<HaikuanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HaikuanxinxiEntity> wrapper) {
		  Page<HaikuanxinxiView> page =new Query<HaikuanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HaikuanxinxiVO> selectListVO(Wrapper<HaikuanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HaikuanxinxiVO selectVO(Wrapper<HaikuanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HaikuanxinxiView> selectListView(Wrapper<HaikuanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HaikuanxinxiView selectView(Wrapper<HaikuanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

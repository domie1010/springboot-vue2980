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


import com.dao.DaikuanxinxiDao;
import com.entity.DaikuanxinxiEntity;
import com.service.DaikuanxinxiService;
import com.entity.vo.DaikuanxinxiVO;
import com.entity.view.DaikuanxinxiView;

@Service("daikuanxinxiService")
public class DaikuanxinxiServiceImpl extends ServiceImpl<DaikuanxinxiDao, DaikuanxinxiEntity> implements DaikuanxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DaikuanxinxiEntity> page = this.selectPage(
                new Query<DaikuanxinxiEntity>(params).getPage(),
                new EntityWrapper<DaikuanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DaikuanxinxiEntity> wrapper) {
		  Page<DaikuanxinxiView> page =new Query<DaikuanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DaikuanxinxiVO> selectListVO(Wrapper<DaikuanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DaikuanxinxiVO selectVO(Wrapper<DaikuanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DaikuanxinxiView> selectListView(Wrapper<DaikuanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DaikuanxinxiView selectView(Wrapper<DaikuanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

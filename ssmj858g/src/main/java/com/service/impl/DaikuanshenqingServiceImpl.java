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


import com.dao.DaikuanshenqingDao;
import com.entity.DaikuanshenqingEntity;
import com.service.DaikuanshenqingService;
import com.entity.vo.DaikuanshenqingVO;
import com.entity.view.DaikuanshenqingView;

@Service("daikuanshenqingService")
public class DaikuanshenqingServiceImpl extends ServiceImpl<DaikuanshenqingDao, DaikuanshenqingEntity> implements DaikuanshenqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DaikuanshenqingEntity> page = this.selectPage(
                new Query<DaikuanshenqingEntity>(params).getPage(),
                new EntityWrapper<DaikuanshenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DaikuanshenqingEntity> wrapper) {
		  Page<DaikuanshenqingView> page =new Query<DaikuanshenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DaikuanshenqingVO> selectListVO(Wrapper<DaikuanshenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DaikuanshenqingVO selectVO(Wrapper<DaikuanshenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DaikuanshenqingView> selectListView(Wrapper<DaikuanshenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DaikuanshenqingView selectView(Wrapper<DaikuanshenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

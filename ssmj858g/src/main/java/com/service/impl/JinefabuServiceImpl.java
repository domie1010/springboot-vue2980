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


import com.dao.JinefabuDao;
import com.entity.JinefabuEntity;
import com.service.JinefabuService;
import com.entity.vo.JinefabuVO;
import com.entity.view.JinefabuView;

@Service("jinefabuService")
public class JinefabuServiceImpl extends ServiceImpl<JinefabuDao, JinefabuEntity> implements JinefabuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JinefabuEntity> page = this.selectPage(
                new Query<JinefabuEntity>(params).getPage(),
                new EntityWrapper<JinefabuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JinefabuEntity> wrapper) {
		  Page<JinefabuView> page =new Query<JinefabuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JinefabuVO> selectListVO(Wrapper<JinefabuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JinefabuVO selectVO(Wrapper<JinefabuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JinefabuView> selectListView(Wrapper<JinefabuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JinefabuView selectView(Wrapper<JinefabuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

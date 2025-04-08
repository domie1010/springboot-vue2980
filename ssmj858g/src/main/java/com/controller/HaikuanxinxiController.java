package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.HaikuanxinxiEntity;
import com.entity.view.HaikuanxinxiView;

import com.service.HaikuanxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 还款信息
 * 后端接口
 * @author 
 * @email 
 * @date 2021-05-16 21:30:13
 */
@RestController
@RequestMapping("/haikuanxinxi")
public class HaikuanxinxiController {
    @Autowired
    private HaikuanxinxiService haikuanxinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,HaikuanxinxiEntity haikuanxinxi, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yinxing")) {
			haikuanxinxi.setZhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			haikuanxinxi.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<HaikuanxinxiEntity> ew = new EntityWrapper<HaikuanxinxiEntity>();
		PageUtils page = haikuanxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, haikuanxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,HaikuanxinxiEntity haikuanxinxi, 
		HttpServletRequest request){
        EntityWrapper<HaikuanxinxiEntity> ew = new EntityWrapper<HaikuanxinxiEntity>();
		PageUtils page = haikuanxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, haikuanxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( HaikuanxinxiEntity haikuanxinxi){
       	EntityWrapper<HaikuanxinxiEntity> ew = new EntityWrapper<HaikuanxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( haikuanxinxi, "haikuanxinxi")); 
        return R.ok().put("data", haikuanxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(HaikuanxinxiEntity haikuanxinxi){
        EntityWrapper< HaikuanxinxiEntity> ew = new EntityWrapper< HaikuanxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( haikuanxinxi, "haikuanxinxi")); 
		HaikuanxinxiView haikuanxinxiView =  haikuanxinxiService.selectView(ew);
		return R.ok("查询还款信息成功").put("data", haikuanxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        HaikuanxinxiEntity haikuanxinxi = haikuanxinxiService.selectById(id);
        return R.ok().put("data", haikuanxinxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        HaikuanxinxiEntity haikuanxinxi = haikuanxinxiService.selectById(id);
        return R.ok().put("data", haikuanxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HaikuanxinxiEntity haikuanxinxi, HttpServletRequest request){
    	haikuanxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(haikuanxinxi);

        haikuanxinxiService.insert(haikuanxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody HaikuanxinxiEntity haikuanxinxi, HttpServletRequest request){
    	haikuanxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(haikuanxinxi);

        haikuanxinxiService.insert(haikuanxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody HaikuanxinxiEntity haikuanxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(haikuanxinxi);
        haikuanxinxiService.updateById(haikuanxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        haikuanxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<HaikuanxinxiEntity> wrapper = new EntityWrapper<HaikuanxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yinxing")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuming", (String)request.getSession().getAttribute("username"));
		}

		int count = haikuanxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}

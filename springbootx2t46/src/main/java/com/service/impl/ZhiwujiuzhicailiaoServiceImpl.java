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


import com.dao.ZhiwujiuzhicailiaoDao;
import com.entity.ZhiwujiuzhicailiaoEntity;
import com.service.ZhiwujiuzhicailiaoService;
import com.entity.vo.ZhiwujiuzhicailiaoVO;
import com.entity.view.ZhiwujiuzhicailiaoView;

@Service("zhiwujiuzhicailiaoService")
public class ZhiwujiuzhicailiaoServiceImpl extends ServiceImpl<ZhiwujiuzhicailiaoDao, ZhiwujiuzhicailiaoEntity> implements ZhiwujiuzhicailiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhiwujiuzhicailiaoEntity> page = this.selectPage(
                new Query<ZhiwujiuzhicailiaoEntity>(params).getPage(),
                new EntityWrapper<ZhiwujiuzhicailiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhiwujiuzhicailiaoEntity> wrapper) {
		  Page<ZhiwujiuzhicailiaoView> page =new Query<ZhiwujiuzhicailiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhiwujiuzhicailiaoVO> selectListVO(Wrapper<ZhiwujiuzhicailiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhiwujiuzhicailiaoVO selectVO(Wrapper<ZhiwujiuzhicailiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhiwujiuzhicailiaoView> selectListView(Wrapper<ZhiwujiuzhicailiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhiwujiuzhicailiaoView selectView(Wrapper<ZhiwujiuzhicailiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

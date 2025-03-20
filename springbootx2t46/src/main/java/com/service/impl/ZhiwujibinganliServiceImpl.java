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


import com.dao.ZhiwujibinganliDao;
import com.entity.ZhiwujibinganliEntity;
import com.service.ZhiwujibinganliService;
import com.entity.vo.ZhiwujibinganliVO;
import com.entity.view.ZhiwujibinganliView;

@Service("zhiwujibinganliService")
public class ZhiwujibinganliServiceImpl extends ServiceImpl<ZhiwujibinganliDao, ZhiwujibinganliEntity> implements ZhiwujibinganliService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhiwujibinganliEntity> page = this.selectPage(
                new Query<ZhiwujibinganliEntity>(params).getPage(),
                new EntityWrapper<ZhiwujibinganliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhiwujibinganliEntity> wrapper) {
		  Page<ZhiwujibinganliView> page =new Query<ZhiwujibinganliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhiwujibinganliVO> selectListVO(Wrapper<ZhiwujibinganliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhiwujibinganliVO selectVO(Wrapper<ZhiwujibinganliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhiwujibinganliView> selectListView(Wrapper<ZhiwujibinganliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhiwujibinganliView selectView(Wrapper<ZhiwujibinganliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

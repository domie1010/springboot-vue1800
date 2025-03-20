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


import com.dao.PutongyuangongDao;
import com.entity.PutongyuangongEntity;
import com.service.PutongyuangongService;
import com.entity.vo.PutongyuangongVO;
import com.entity.view.PutongyuangongView;

@Service("putongyuangongService")
public class PutongyuangongServiceImpl extends ServiceImpl<PutongyuangongDao, PutongyuangongEntity> implements PutongyuangongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PutongyuangongEntity> page = this.selectPage(
                new Query<PutongyuangongEntity>(params).getPage(),
                new EntityWrapper<PutongyuangongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PutongyuangongEntity> wrapper) {
		  Page<PutongyuangongView> page =new Query<PutongyuangongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PutongyuangongVO> selectListVO(Wrapper<PutongyuangongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PutongyuangongVO selectVO(Wrapper<PutongyuangongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PutongyuangongView> selectListView(Wrapper<PutongyuangongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PutongyuangongView selectView(Wrapper<PutongyuangongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

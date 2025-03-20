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


import com.dao.ZhiwuzhongleiDao;
import com.entity.ZhiwuzhongleiEntity;
import com.service.ZhiwuzhongleiService;
import com.entity.vo.ZhiwuzhongleiVO;
import com.entity.view.ZhiwuzhongleiView;

@Service("zhiwuzhongleiService")
public class ZhiwuzhongleiServiceImpl extends ServiceImpl<ZhiwuzhongleiDao, ZhiwuzhongleiEntity> implements ZhiwuzhongleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhiwuzhongleiEntity> page = this.selectPage(
                new Query<ZhiwuzhongleiEntity>(params).getPage(),
                new EntityWrapper<ZhiwuzhongleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhiwuzhongleiEntity> wrapper) {
		  Page<ZhiwuzhongleiView> page =new Query<ZhiwuzhongleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhiwuzhongleiVO> selectListVO(Wrapper<ZhiwuzhongleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhiwuzhongleiVO selectVO(Wrapper<ZhiwuzhongleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhiwuzhongleiView> selectListView(Wrapper<ZhiwuzhongleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhiwuzhongleiView selectView(Wrapper<ZhiwuzhongleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

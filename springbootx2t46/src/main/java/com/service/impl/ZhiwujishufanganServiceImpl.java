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


import com.dao.ZhiwujishufanganDao;
import com.entity.ZhiwujishufanganEntity;
import com.service.ZhiwujishufanganService;
import com.entity.vo.ZhiwujishufanganVO;
import com.entity.view.ZhiwujishufanganView;

@Service("zhiwujishufanganService")
public class ZhiwujishufanganServiceImpl extends ServiceImpl<ZhiwujishufanganDao, ZhiwujishufanganEntity> implements ZhiwujishufanganService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhiwujishufanganEntity> page = this.selectPage(
                new Query<ZhiwujishufanganEntity>(params).getPage(),
                new EntityWrapper<ZhiwujishufanganEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhiwujishufanganEntity> wrapper) {
		  Page<ZhiwujishufanganView> page =new Query<ZhiwujishufanganView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhiwujishufanganVO> selectListVO(Wrapper<ZhiwujishufanganEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhiwujishufanganVO selectVO(Wrapper<ZhiwujishufanganEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhiwujishufanganView> selectListView(Wrapper<ZhiwujishufanganEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhiwujishufanganView selectView(Wrapper<ZhiwujishufanganEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

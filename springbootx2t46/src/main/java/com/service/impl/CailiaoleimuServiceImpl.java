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


import com.dao.CailiaoleimuDao;
import com.entity.CailiaoleimuEntity;
import com.service.CailiaoleimuService;
import com.entity.vo.CailiaoleimuVO;
import com.entity.view.CailiaoleimuView;

@Service("cailiaoleimuService")
public class CailiaoleimuServiceImpl extends ServiceImpl<CailiaoleimuDao, CailiaoleimuEntity> implements CailiaoleimuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CailiaoleimuEntity> page = this.selectPage(
                new Query<CailiaoleimuEntity>(params).getPage(),
                new EntityWrapper<CailiaoleimuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CailiaoleimuEntity> wrapper) {
		  Page<CailiaoleimuView> page =new Query<CailiaoleimuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CailiaoleimuVO> selectListVO(Wrapper<CailiaoleimuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CailiaoleimuVO selectVO(Wrapper<CailiaoleimuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CailiaoleimuView> selectListView(Wrapper<CailiaoleimuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CailiaoleimuView selectView(Wrapper<CailiaoleimuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

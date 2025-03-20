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


import com.dao.PutongzhiwujianchadengjiDao;
import com.entity.PutongzhiwujianchadengjiEntity;
import com.service.PutongzhiwujianchadengjiService;
import com.entity.vo.PutongzhiwujianchadengjiVO;
import com.entity.view.PutongzhiwujianchadengjiView;

@Service("putongzhiwujianchadengjiService")
public class PutongzhiwujianchadengjiServiceImpl extends ServiceImpl<PutongzhiwujianchadengjiDao, PutongzhiwujianchadengjiEntity> implements PutongzhiwujianchadengjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PutongzhiwujianchadengjiEntity> page = this.selectPage(
                new Query<PutongzhiwujianchadengjiEntity>(params).getPage(),
                new EntityWrapper<PutongzhiwujianchadengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PutongzhiwujianchadengjiEntity> wrapper) {
		  Page<PutongzhiwujianchadengjiView> page =new Query<PutongzhiwujianchadengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PutongzhiwujianchadengjiVO> selectListVO(Wrapper<PutongzhiwujianchadengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PutongzhiwujianchadengjiVO selectVO(Wrapper<PutongzhiwujianchadengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PutongzhiwujianchadengjiView> selectListView(Wrapper<PutongzhiwujianchadengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PutongzhiwujianchadengjiView selectView(Wrapper<PutongzhiwujianchadengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

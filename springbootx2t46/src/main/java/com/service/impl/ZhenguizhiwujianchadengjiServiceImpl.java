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


import com.dao.ZhenguizhiwujianchadengjiDao;
import com.entity.ZhenguizhiwujianchadengjiEntity;
import com.service.ZhenguizhiwujianchadengjiService;
import com.entity.vo.ZhenguizhiwujianchadengjiVO;
import com.entity.view.ZhenguizhiwujianchadengjiView;

@Service("zhenguizhiwujianchadengjiService")
public class ZhenguizhiwujianchadengjiServiceImpl extends ServiceImpl<ZhenguizhiwujianchadengjiDao, ZhenguizhiwujianchadengjiEntity> implements ZhenguizhiwujianchadengjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhenguizhiwujianchadengjiEntity> page = this.selectPage(
                new Query<ZhenguizhiwujianchadengjiEntity>(params).getPage(),
                new EntityWrapper<ZhenguizhiwujianchadengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhenguizhiwujianchadengjiEntity> wrapper) {
		  Page<ZhenguizhiwujianchadengjiView> page =new Query<ZhenguizhiwujianchadengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhenguizhiwujianchadengjiVO> selectListVO(Wrapper<ZhenguizhiwujianchadengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhenguizhiwujianchadengjiVO selectVO(Wrapper<ZhenguizhiwujianchadengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhenguizhiwujianchadengjiView> selectListView(Wrapper<ZhenguizhiwujianchadengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhenguizhiwujianchadengjiView selectView(Wrapper<ZhenguizhiwujianchadengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

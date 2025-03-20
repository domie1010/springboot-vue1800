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


import com.dao.JishurenyuanDao;
import com.entity.JishurenyuanEntity;
import com.service.JishurenyuanService;
import com.entity.vo.JishurenyuanVO;
import com.entity.view.JishurenyuanView;

@Service("jishurenyuanService")
public class JishurenyuanServiceImpl extends ServiceImpl<JishurenyuanDao, JishurenyuanEntity> implements JishurenyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JishurenyuanEntity> page = this.selectPage(
                new Query<JishurenyuanEntity>(params).getPage(),
                new EntityWrapper<JishurenyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JishurenyuanEntity> wrapper) {
		  Page<JishurenyuanView> page =new Query<JishurenyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JishurenyuanVO> selectListVO(Wrapper<JishurenyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JishurenyuanVO selectVO(Wrapper<JishurenyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JishurenyuanView> selectListView(Wrapper<JishurenyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JishurenyuanView selectView(Wrapper<JishurenyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

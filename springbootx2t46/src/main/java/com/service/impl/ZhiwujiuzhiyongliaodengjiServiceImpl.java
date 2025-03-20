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


import com.dao.ZhiwujiuzhiyongliaodengjiDao;
import com.entity.ZhiwujiuzhiyongliaodengjiEntity;
import com.service.ZhiwujiuzhiyongliaodengjiService;
import com.entity.vo.ZhiwujiuzhiyongliaodengjiVO;
import com.entity.view.ZhiwujiuzhiyongliaodengjiView;

@Service("zhiwujiuzhiyongliaodengjiService")
public class ZhiwujiuzhiyongliaodengjiServiceImpl extends ServiceImpl<ZhiwujiuzhiyongliaodengjiDao, ZhiwujiuzhiyongliaodengjiEntity> implements ZhiwujiuzhiyongliaodengjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhiwujiuzhiyongliaodengjiEntity> page = this.selectPage(
                new Query<ZhiwujiuzhiyongliaodengjiEntity>(params).getPage(),
                new EntityWrapper<ZhiwujiuzhiyongliaodengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhiwujiuzhiyongliaodengjiEntity> wrapper) {
		  Page<ZhiwujiuzhiyongliaodengjiView> page =new Query<ZhiwujiuzhiyongliaodengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhiwujiuzhiyongliaodengjiVO> selectListVO(Wrapper<ZhiwujiuzhiyongliaodengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhiwujiuzhiyongliaodengjiVO selectVO(Wrapper<ZhiwujiuzhiyongliaodengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhiwujiuzhiyongliaodengjiView> selectListView(Wrapper<ZhiwujiuzhiyongliaodengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhiwujiuzhiyongliaodengjiView selectView(Wrapper<ZhiwujiuzhiyongliaodengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

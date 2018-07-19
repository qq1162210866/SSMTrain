package com.psq.ssmtrain.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psq.ssmtrain.bean.Stu;
import com.psq.ssmtrain.bean.StuExample;
import com.psq.ssmtrain.dao.StuMapper;
import com.psq.ssmtrain.service.IStuService;

@Service
public class StuServiceImpl implements IStuService {

	@Autowired
	private StuMapper stuMapper;
	
	@Override
	public List<Stu> findall() throws Exception {
		//利用模板查询，具体的可以看看mybatis的描述
		StuExample example=new StuExample();
		return stuMapper.selectByExample(example);
	}

}

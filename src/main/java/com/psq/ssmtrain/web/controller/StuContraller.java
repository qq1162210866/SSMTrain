package com.psq.ssmtrain.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.psq.ssmtrain.bean.Stu;
import com.psq.ssmtrain.service.IStuService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description = "学生相关接口")
@RestController
@RequestMapping("/stu")
public class StuContraller {
	
	@Autowired
	private IStuService stuService;
	
	@ApiOperation(value = "查询所有学生")
	@GetMapping("findall")
	public List<Stu> findall() {
		
		List<Stu> list=null;
		try{
			list=stuService.findall();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}

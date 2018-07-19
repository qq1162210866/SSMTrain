package com.psq.ssmtrain.service;

import java.util.List;

import com.psq.ssmtrain.bean.Stu;

public interface IStuService {
	
	List<Stu> findall() throws Exception;
}

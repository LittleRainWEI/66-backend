package com.littlerain.liuliu.service.impl;

import com.littlerain.liuliu.dao.TestGenerateMapper;
import com.littlerain.liuliu.model.TestGenerate;
import com.littlerain.liuliu.service.TestGenerateService;
import com.littlerain.liuliu.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by LittleRain on 2017/12/19.
 */
@Service
@Transactional
public class TestGenerateServiceImpl extends AbstractService<TestGenerate> implements TestGenerateService {
    @Resource
    private TestGenerateMapper testGenerateMapper;

}

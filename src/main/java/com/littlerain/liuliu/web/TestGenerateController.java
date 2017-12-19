package com.littlerain.liuliu.web;
import com.littlerain.liuliu.core.Result;
import com.littlerain.liuliu.core.ResultGenerator;
import com.littlerain.liuliu.model.TestGenerate;
import com.littlerain.liuliu.service.TestGenerateService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by LittleRain on 2017/12/19.
*/
@RestController
@RequestMapping("/test/generate")
public class TestGenerateController {
    @Resource
    private TestGenerateService testGenerateService;

    @PostMapping("/add")
    public Result add(TestGenerate testGenerate) {
        testGenerateService.save(testGenerate);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        testGenerateService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(TestGenerate testGenerate) {
        testGenerateService.update(testGenerate);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        TestGenerate testGenerate = testGenerateService.findById(id);
        return ResultGenerator.genSuccessResult(testGenerate);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<TestGenerate> list = testGenerateService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}

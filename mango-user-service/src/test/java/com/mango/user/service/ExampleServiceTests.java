package com.mango.user.service;

import com.mango.user.MangoUserServiceApplicationTests;
import com.mango.user.domain.model.Example;
import com.mango.user.domain.param.AddExampleParam;
import com.mango.user.domain.param.ModifyExampleParam;
import com.mango.user.domain.param.QueryExampleListParam;
import com.mango.user.service.impl.ExampleServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 示例接口单元测试类
 *
 */
@Slf4j
public class ExampleServiceTests extends MangoUserServiceApplicationTests {

    @Autowired
    private ExampleServiceImpl exampleService;

    /**
     * 根据示例ID获取示例
     */
    @Test
    void getExampleById() {
        Example example = this.exampleService.getExampleById(430809380267626496L);
        log.info("根据ID获取到的示例信息：{}", example.toString());
    }

    /**
     * 查询示例集合
     */
    @Test
    void listExample() {
        QueryExampleListParam queryExampleListParam = new QueryExampleListParam();
        List<Example> exampleList = this.exampleService.listExample(queryExampleListParam);
        log.info("查询示例信息列表结果：{}", exampleList.toString());
    }

    /**
     * 添加示例
     */
    @Test
    void addExample() {
        AddExampleParam addExampleParam = new AddExampleParam();
        addExampleParam.setExampleName("示例名称");
        Long exampleId = this.exampleService.addExample(addExampleParam);
        log.info("添加示例信息返回的ID：{}", exampleId);
    }

    /**
     * 修改示例
     */
    @Test
    void modifyExample() {
        ModifyExampleParam modifyExampleParam = new ModifyExampleParam();
        modifyExampleParam.setExampleId(430809380267626496L);
        modifyExampleParam.setExampleName("修改后的示例名称");
        this.exampleService.modifyExample(modifyExampleParam);
    }

}

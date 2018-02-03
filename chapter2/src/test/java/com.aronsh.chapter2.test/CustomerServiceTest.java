/*
* Copyright (c) 2017 Hinew. All Rights Reserved.
 * ============================================================================
 * 版权所有 海牛(上海)电子商务有限公司，并保留所有权利。
 * ----------------------------------------------------------------------------
 * ----------------------------------------------------------------------------
 * 官方网站：http://www.hinew.com.cn
 * ============================================================================
*/
package com.aronsh.chapter2.test;

import com.aronsh.chapter2.helper.DatabaseHelper;
import com.aronsh.chapter2.model.Customer;
import com.aronsh.chapter2.service.CustomerService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wangyakun
 * @email yakun0622@gmail.com
 * @date 2018/1/25 00:27
 */
public class CustomerServiceTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerServiceTest.class);
    private final CustomerService customerService;

    public CustomerServiceTest() {
        this.customerService = new CustomerService();
    }

    @Before
    public void init() throws IOException {
        DatabaseHelper.excuteSqlFile("sql/customer-init.sql");
    }

    @Test
    public void getCustomerListTest(){
        List<Customer> customerList = customerService.getCustomerList(null);
        for (Customer customer : customerList){
            LOGGER.info(customer.toString());
        }
        Assert.assertEquals(2, customerList.size());
    }

    @Test
    public void getCustomerTest(){
        long id =1;
        Customer customer = customerService.getCustomer(id);
        LOGGER.info(customer.toString());
        Assert.assertNotNull(customer);
    }

    @Test
    public void createCustomerTest(){
        Map<String, Object> fieldMap = new HashMap<>();
        fieldMap.put("name", "customer100");
        fieldMap.put("contact", "John");
        fieldMap.put("telephone", "13512345678");
        boolean result = customerService.createCustomer(fieldMap);
        Assert.assertTrue(result);
    }

    @Test
    public void updateCustomerTest(){
        long id = 1;
        Map<String, Object> fieldMap = new HashMap<>();
        fieldMap.put("contact", "Eric");
        boolean result = customerService.updateCustomer(id, fieldMap);
        Assert.assertTrue(result);
    }

    @Test
    public void deleteCustomerTest(){
        long id = 1;
        boolean result = customerService.deleteCustomer(id);
        Assert.assertTrue(result);
    }
}

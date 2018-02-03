/*
* Copyright (c) 2017 Hinew. All Rights Reserved.
 * ============================================================================
 * 版权所有 海牛(上海)电子商务有限公司，并保留所有权利。
 * ----------------------------------------------------------------------------
 * ----------------------------------------------------------------------------
 * 官方网站：http://www.hinew.com.cn
 * ============================================================================
*/
package com.aronsh.chapter2.service;

import com.aronsh.chapter2.helper.DatabaseHelper;
import com.aronsh.chapter2.model.Customer;
import com.aronsh.chapter2.util.PropsUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @author wangyakun
 * @email yakun0622@gmail.com
 * @date 2018/1/25 00:20
 */
public class CustomerService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);

    /**
     * 获取客户列表
     *
     * @param keyword
     * @return
     */
    public List<Customer> getCustomerList(String keyword) {
        String sql = "select * from customer";
        return DatabaseHelper.queryEntityList(Customer.class, sql);
    }

    /**
     * 获取客户信息
     *
     * @param id
     * @return
     */
    public Customer getCustomer(Long id) {
        String sql = "select * from customer where id = ?";
        return DatabaseHelper.queryEntity(Customer.class, sql, id);
    }

    /**
     * 创建客户
     *
     * @param fieldMap
     * @return
     */
    public boolean createCustomer(Map<String, Object> fieldMap) {
        return DatabaseHelper.insertEntity(Customer.class, fieldMap);
    }

    /**
     * 更新客户
     *
     * @param id
     * @param fieldMap
     * @return
     */
    public boolean updateCustomer(long id, Map<String, Object> fieldMap) {
        return DatabaseHelper.updateEntity(Customer.class, id, fieldMap);
    }

    /**
     * 删除客户
     *
     * @param id
     * @return
     */
    public boolean deleteCustomer(long id) {
        return DatabaseHelper.deleteEntity(Customer.class, id);
    }
}

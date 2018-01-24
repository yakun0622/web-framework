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

import com.aronsh.chapter2.model.Customer;

import java.util.List;
import java.util.Map;

/**
 * @author wangyakun
 * @email yakun0622@gmail.com
 * @date 2018/1/25 00:20
 */
public class CustomerService {
    /**
     * 获取客户列表
     * @param keyword
     * @return
     */
    public List<Customer> getCustomerList(String keyword){
        // Todo
        return null;
    }

    /**
     * 获取客户信息
     * @param id
     * @return
     */
    public Customer getCustomer(Long id){
        // Todo
        return null;
    }

    /**
     * 创建客户
     * @param fieldMap
     * @return
     */
    public boolean createCustomer(Map<String, Object> fieldMap){
        // Todo
        return false;
    }

    /**
     * 更新客户
     * @param id
     * @param fieldMap
     * @return
     */
    public boolean updateCustomer(long id, Map<String, Object> fieldMap){
        // Todo
        return false;
    }

    /**
     * 删除客户
     * @param id
     * @return
     */
    public boolean deleteCustomer(long id){
        // Todo
        return false;
    }
}

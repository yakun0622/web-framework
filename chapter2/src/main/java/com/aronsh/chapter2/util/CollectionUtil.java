/*
* Copyright (c) 2017 Hinew. All Rights Reserved.
 * ============================================================================
 * 版权所有 海牛(上海)电子商务有限公司，并保留所有权利。
 * ----------------------------------------------------------------------------
 * ----------------------------------------------------------------------------
 * 官方网站：http://www.hinew.com.cn
 * ============================================================================
*/
package com.aronsh.chapter2.util;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;

import java.util.Collection;
import java.util.Map;

/**
 * @author wangyakun
 * @email yakun0622@gmail.com
 * @date 2018/2/3 16:52
 */
public class CollectionUtil {

    /**
     * 判断Collection是否为空
     * @param collection
     * @return
     */
    public static boolean isEmpty(Collection<?> collection) {
        return CollectionUtils.isEmpty(collection);
    }
    /**
     * 判断Collection是否非空
     * @param collection
     * @return
     */
    public static boolean isNotEmpty(Collection<?> collection) {
        return !isEmpty(collection);
    }


    /**
     * 判断Map是否为空
     * @param map
     * @return
     */
    public static boolean isEmpty(Map<?, ?> map) {
        return MapUtils.isEmpty(map);
    }

    /**
     * 判断Map是否非空
     * @param map
     * @return
     */
    public static boolean isNotEmpty(Map<?, ?> map) {
        return !isEmpty(map);
    }
}

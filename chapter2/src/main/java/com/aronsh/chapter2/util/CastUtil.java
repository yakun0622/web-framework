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

import org.apache.commons.lang3.StringUtils;

/**
 * @author wangyakun
 * @email yakun0622@gmail.com
 * @date 2018/1/29 23:53
 */
public class CastUtil {
    /**
     * 转为String型
     * @param object
     * @return
     */
    public static String castString(Object object) {
        return castString(object, "");
    }

    public static String castString(Object object, String defaultValue) {
        return object != null ? String.valueOf(object) : defaultValue;
    }

    /**
     * 转为double型
     * @param object
     * @return
     */
    public static double castDouble(Object object) {
        return castDouble(object, 0);
    }

    public static double castDouble(Object object, double defaultVaule) {
        double value = defaultVaule;
        if (object != null) {
            String strValue = String.valueOf(object);
            if (StringUtils.isNotEmpty(strValue)) {

                try {
                    value = Double.valueOf(strValue);
                } catch (NumberFormatException e) {
                    value = defaultVaule;
                }
            }
        }
        return value;
    }

    /**
     * 转为long型
     * @param object
     * @return
     */
    public static long castLong(Object object) {
        return castLong(object, 0);
    }

    public static long castLong(Object object, long defaultVaule) {
        long value = defaultVaule;
        if (object != null) {
            String strValue = String.valueOf(object);
            if (StringUtils.isNotEmpty(strValue)) {
                try {
                    value = Long.valueOf(strValue);
                } catch (NumberFormatException e) {
                    value = defaultVaule;
                }
            }
        }
        return value;
    }

    /**
     * 转为int型
     * @param object
     * @return
     */
    public static int castInt(Object object) {
        return castInt(object, 0);
    }

    public static int castInt(Object object, int defaultVaule) {
        int value = defaultVaule;
        if (object != null) {
            String strValue = String.valueOf(object);
            if (StringUtils.isNotEmpty(strValue)) {
                try {
                    value = Integer.valueOf(strValue);
                } catch (NumberFormatException e) {
                    value = defaultVaule;
                }
            }
        }
        return value;
    }

    /**
     * 转为boolean型
     * @param object
     * @return
     */
    public static boolean castBoolean(Object object) {
        return castBoolean(object, false);
    }

    public static boolean castBoolean(Object object, boolean defaultVaule) {
        boolean value = defaultVaule;
        if (object != null) {
            value = Boolean.parseBoolean(castString(object));
        }
        return value;
    }


}

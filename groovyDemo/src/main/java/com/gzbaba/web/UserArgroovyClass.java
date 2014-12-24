/**
 * Project: GroovyStartTwo
 * 
 * File Created at 2014Äê12ÔÂ22ÈÕ
 * $Id$
 * 
 * Copyright 2008 Alibaba.com Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Alibaba Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Alibaba.com.
 */
package com.gzbaba.web;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import com.gzbaba.script.AGroovyClass;

/**
 * TODO Comment of UserArgroovyClass
 * 
 * @author guangzhong.wgz
 */
public class UserArgroovyClass {
    
   private static Logger LOGGER = LogManager.getLogger(UserArgroovyClass.class);

    public static void main(String args[]) {
        AGroovyClass instance = new AGroovyClass();
        Object result = instance.userClosure(new Object() {
            public String call() {
                return "You call groovy!";
            }
        });
        LOGGER.info(result);
    }
}

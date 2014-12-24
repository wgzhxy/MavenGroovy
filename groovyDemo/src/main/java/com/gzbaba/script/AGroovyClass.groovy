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
package com.gzbaba.script

/**
 * TODO Comment of AGroovyClass
 * @author guangzhong.wgz
 *
 */
class AGroovyClass {

    def userClosure(closure) {
        println "userClosure call!";
        closure();
    }

    def passToUserClosure(int value, closure) {
        println "passToUserClosure call";
        closure(value);
    }
}

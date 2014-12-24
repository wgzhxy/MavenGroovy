/**
 * Project: GroovyStartTwo
 * 
 * File Created at 2014年12月22日
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

    public def getString() {
        sayHello();
        def str = "回来吧, ";
        str.concat("我是个中国人,来吧,相约在北京!");
    }

    private def sayHello() {
        println "sayHello, dong wang!"
    }

    public def userClosure(closure) {
        println "userClosure call!";
        println getString();
        closure();
    }

    public def passToUserClosure(int value, closure) {
        println "passToUserClosure call";
        closure(value);
    }
}

/*
*  2019 
*/
package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wangdan Date: 2019/2/27 Time: 16:47
 * @version $Id$
 */

@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping("/test")
    public String test(){
        return "hello";
    }
}
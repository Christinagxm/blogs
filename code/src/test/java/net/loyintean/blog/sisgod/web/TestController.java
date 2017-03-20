/**
 * Copyright(c) 2011-2017 by YouCredit Inc.
 * All Rights Reserved
 */
package net.loyintean.blog.sisgod.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import net.loyintean.blog.sixgod.web.springmvc.BasicDbController4SpringMvc;

/**
 * @author linjun
 */
@Controller
@RequestMapping(path = "/test")
public class TestController
        extends BasicDbController4SpringMvc<String, String> {
}

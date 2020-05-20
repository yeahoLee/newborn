package com.yeaho.newborn.portal.controller.pagecontroller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.thymeleaf.util.DateUtils;

import java.util.Date;
import java.util.Locale;

/**
 * @author : yeaho_lee
 * @Description : TODO
 * @createTime : 2020年05月20日 09:31
 */
@Controller
@Slf4j
public class UserPageController {

    @GetMapping("login")
    public String goLogin() {
        log.info("Go Login Page Where Time = {}", DateUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss", Locale.CHINA));
        return "login";
    }
}

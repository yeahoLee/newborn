package com.yeaho.newborn.photo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author : yeaho_lee
 * @Description : TODO
 * @createTime : 2020年05月06日 14:40
 */
@Controller
@Slf4j
public class PhotoHtmlController {
    @GetMapping("login")
    public String goLogin() {
        return "photo/login";
    }
}

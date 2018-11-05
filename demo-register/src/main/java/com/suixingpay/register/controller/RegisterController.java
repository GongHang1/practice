package com.suixingpay.register.controller;

import com.suixingpay.register.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @Author gonghang[gong_hang@suixingpay.com]
 * @Date 2018年11月05日  16时54分
 * @Copyright ©2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
@RestController
public class RegisterController {

    @Autowired
    UserService userService;
}

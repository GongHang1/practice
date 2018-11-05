package com.suixingpay.register.domain;

import lombok.Data;

/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @Author gonghang[gong_hang@suixingpay.com]
 * @Date 2018年11月05日  16时41分
 * @Copyright ©2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
@Data
public class User {

    private Integer id;

    private String email;

    private String password;

    private String username;

    private String telephone;
}

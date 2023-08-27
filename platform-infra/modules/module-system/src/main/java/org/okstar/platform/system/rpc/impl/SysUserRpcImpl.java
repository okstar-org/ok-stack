/*
 * * Copyright (c) 2022 船山科技 chuanshantech.com
 * OkStack is licensed under Mulan PubL v2.
 * You can use this software according to the terms and conditions of the Mulan
 * PubL v2. You may obtain a copy of Mulan PubL v2 at:
 *          http://license.coscl.org.cn/MulanPubL-2.0
 * THIS SOFTWARE IS PROVIDED ON AN "AS IS" BASIS, WITHOUT WARRANTIES OF ANY KIND,
 * EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO NON-INFRINGEMENT,
 * MERCHANTABILITY OR FIT FOR A PARTICULAR PURPOSE.
 * See the Mulan PubL v2 for more details.
 * /
 */

package org.okstar.platform.system.rpc.impl;

import org.okstar.platform.common.core.utils.bean.OkBeanUtils;
import org.okstar.platform.system.domain.SysUser;
import org.okstar.platform.system.dto.SignUpForm;
import org.okstar.platform.system.dto.SignUpResultDto;
import org.okstar.platform.system.dto.SysUserDto;
import org.okstar.platform.system.rpc.SysUserRpc;
import org.okstar.platform.system.service.SysUserService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class SysUserRpcImpl implements SysUserRpc {

    @Inject
    SysUserService userService;

    @Override
    public SignUpResultDto signUp(SignUpForm signUpDto) {
        return userService.signUp(signUpDto);
    }

    @Override
    public SysUserDto findByUsername(String username) {
        SysUser sysUser = userService.selectUserByUserName(username);
        SysUserDto dto = new SysUserDto();
        OkBeanUtils.copyPropertiesTo(sysUser, dto);
        return dto;
    }
}

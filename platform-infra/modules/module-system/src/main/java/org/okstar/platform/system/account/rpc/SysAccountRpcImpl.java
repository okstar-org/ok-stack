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

package org.okstar.platform.system.account.rpc;

import org.okstar.platform.common.core.defined.AccountDefines;
import org.okstar.platform.common.core.utils.bean.OkBeanUtils;
import org.okstar.platform.common.rpc.RpcResult;
import org.okstar.platform.system.account.service.SysAccountService;
import org.okstar.platform.system.rpc.SysAccountRpc;
import org.okstar.platform.system.sign.SignUpForm;
import org.okstar.platform.system.sign.SignUpResult;
import org.okstar.platform.system.vo.SysAccount0;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class SysAccountRpcImpl implements SysAccountRpc {

    @Inject
    SysAccountService userService;

    @Override
    public RpcResult<SignUpResult> signUp(SignUpForm signUpForm) {
        try {
            SignUpResult resultDto = userService.signUp(signUpForm);
            return RpcResult.<SignUpResult>builder().success(true).data(resultDto).build();
        } catch (Exception e) {
            return RpcResult.<SignUpResult>builder().success(false).msg(e.getMessage()).build();
        }
    }

    @Override
    public RpcResult<SysAccount0> findByBind(String iso, AccountDefines.BindType type, String bindValue) {
        var sysUser = userService.findByBind(iso, type, bindValue);
        if (sysUser == null)
            return RpcResult.<SysAccount0>builder().success(true).build();

        SysAccount0 dto = new SysAccount0();
        OkBeanUtils.copyPropertiesTo(sysUser, dto);
        return RpcResult.<SysAccount0>builder().data(dto).success(true).build();
    }

    @Override
    public RpcResult<SysAccount0> findByUsername(String username) {
        var sysUser = userService.findByUsername(username);
        if (sysUser.isEmpty())
            return RpcResult.<SysAccount0>builder().success(true).build();

        SysAccount0 dto = new SysAccount0();
        OkBeanUtils.copyPropertiesTo(sysUser.get(), dto);
        return RpcResult.<SysAccount0>builder().data(dto).success(true).build();
    }
}
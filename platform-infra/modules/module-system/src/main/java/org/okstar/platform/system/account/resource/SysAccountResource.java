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

package org.okstar.platform.system.account.resource;

import io.quarkus.security.Authenticated;
import org.okstar.platform.common.core.defined.AccountDefines;
import org.okstar.platform.common.core.web.bean.Req;
import org.okstar.platform.common.core.web.bean.Res;
import org.okstar.platform.common.resource.OkCommonResource;
import org.okstar.platform.system.account.domain.SysAccount;
import org.okstar.platform.system.account.service.SysAccountService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import java.util.List;
import java.util.Optional;


/**
 * 账号信息
 */
@Path("/account")
@Authenticated
public class SysAccountResource extends OkCommonResource {

    @Inject
    SysAccountService sysAccountService;

    @GET
    @Path("findAll")
    public Res<List<SysAccount>> findAll() {
        List<SysAccount> all = sysAccountService.findAll();
        return Res.ok(Req.empty(), all);
    }

    @GET
    @Path("username/{bindType}/{value}")
    public Res<String> getUsername(@PathParam("bindType") AccountDefines.BindType bindType,
                                   @PathParam("value") String value,
                                   @QueryParam("iso") String iso) {

        var account = sysAccountService.findByBind(
                Optional.ofNullable(iso).orElse(AccountDefines.DefaultISO),
                bindType,
                value);

        return account == null ? Res.error(Req.empty()) : Res.ok(Req.empty(), account.getUsername());
    }

}

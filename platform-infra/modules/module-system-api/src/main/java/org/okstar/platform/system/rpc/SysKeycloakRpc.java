/*
 * * Copyright (c) 2022 船山信息 chuanshaninfo.com
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

package org.okstar.platform.system.rpc;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.okstar.platform.system.dto.SysKeycloakConfDTO;

/**
 * KC RPC
 */
@RegisterRestClient
@Path("rpc/SysKeycloakRpc")
public interface SysKeycloakRpc {
    /**
     * 获取`KC`配置
     * @return SysKeycloakConfDTO
     */
    @GET
    @Path("/getConf")
    SysKeycloakConfDTO getConf();

    /**
     * 获取`KC Admin`配置
     * @return SysKeycloakConfDTO
     */
    @GET
    @Path("/adminConf")
    SysKeycloakConfDTO getAdminConf();
}

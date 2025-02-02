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

package org.okstar.platform.core.handler;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;
import org.okstar.platform.common.exception.OkCloudException;
import org.okstar.platform.common.web.bean.Res;

/**
 * OkCloud 异常处理器
 */
@Provider
public class OkCloudExceptionHandler implements ExceptionMapper<OkCloudException> {

    @Override
    public Response toResponse(OkCloudException exception) {
        Res<Object> error = Res.error("无法连接到OkCloud，原因：%s！".formatted(exception.getMessage()));
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(error).build();
    }
}

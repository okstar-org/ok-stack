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

package org.okstar.platform.org.sync.connect.connector.feishu.proto.access.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.okstar.platform.common.json.OkJsonUtils;

/**
 * 获取token请求数据
 * {
 * "app_id": "cli_slkdjalasdkjasd",
 * "app_secret": "dskLLdkasdjlasdKK"
 * }
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FSAccessTokenReq {
    @JsonProperty("app_id")
    private String appId;
    @JsonProperty("app_secret")
    private String appSecret;

    public String asJson() {
        return OkJsonUtils.asString(this);
    }
}

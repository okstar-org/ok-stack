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

package org.okstar.platform.org.sync.connect;

import org.okstar.platform.org.sync.connect.connector.feishu.proto.access.req.FSAccessTokenReq;

public class RestTemplate {
    public <T> T getForObject(String requestUrl, Class<T> tClass) {
        return null;
    }

    public <T> T postForObject(String requestUrl,
                                          FSAccessTokenReq appCert,
                                          Class<T> tClass) {
        return null;
    }
}
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

package org.okstar.platform.org.connect.api;


import lombok.*;
import org.okstar.platform.common.date.OkDateUtils;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

/**
 * 访问Token（连接第三方平台）
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AccessToken {
    /**
     * 创建时间
     */
    private Instant createdAt = Instant.now();

    /**
     * access token
     */
    private String accessToken;

    /**
     * 过期时间 单位秒
     */
    private Long expiresIn;

    public boolean isValid() {
        return getCreatedAt()
                //减去十秒存在网络延时
                .plus(expiresIn - 10, ChronoUnit.SECONDS)
                .isAfter(OkDateUtils.now().toInstant());
    }
}

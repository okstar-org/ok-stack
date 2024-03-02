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

package org.okstar.platform.common.core.web.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.okstar.platform.common.core.utils.OkDateUtils;

/**
 * 请求实体
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Req extends VO {
    //请求时间戳
    protected Long ts = OkDateUtils.getTime();

    public static Req empty(){
        return new Req();
    }
}

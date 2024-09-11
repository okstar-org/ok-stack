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

package org.okstar.platform.org.sync.connect.dto;

import lombok.Data;
import org.okstar.platform.org.defined.StaffDefines;

/**
 * 组织架构、部门信息
 */
@Data
public class SysOrgDept  {
    /**
     * 组织ID
     */
    private String orgId;

    /**
     * 上级ID
     */
    private String parentId;


    /**
     * 部门名称
     */
    private String name;

    /**
     * 是否禁用
     */
    private Boolean isDisabled;

    /**
     * 等级（0为顶级，每级增加1）
     */
    private Integer level;

    /**
     */
    private StaffDefines.Source sources;
}
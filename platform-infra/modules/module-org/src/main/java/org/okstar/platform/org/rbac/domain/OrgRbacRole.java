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

package org.okstar.platform.org.rbac.domain;

import lombok.Data;
import org.okstar.platform.org.domain.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * RBAC-Role
 */
@Data
@Table
@Entity
public class OrgRbacRole extends BaseEntity
{

    /** 角色名称 */
    private String name;

    /**
     * 绑定到岗位 [OrgPost]
     */
    private Long postId;
}
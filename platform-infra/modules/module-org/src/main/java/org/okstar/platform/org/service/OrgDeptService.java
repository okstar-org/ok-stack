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

package org.okstar.platform.org.service;


import org.okstar.platform.common.datasource.OkJpaService;
import org.okstar.platform.org.domain.OrgDept;

import java.util.List;
import java.util.Optional;

/**
 * 部门管理 服务层
 */
public interface OrgDeptService extends OkJpaService<OrgDept>
{

    List<OrgDept> children(Long parentId);

    Optional<OrgDept> getRootByOrgId(Long orgId);

    OrgDept loadRootByOrgId(Long orgId);

    long getCount();

    OrgDept findByNameLevel(String name, int level);
}

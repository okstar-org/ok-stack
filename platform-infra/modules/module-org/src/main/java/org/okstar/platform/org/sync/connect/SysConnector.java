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

package org.okstar.platform.org.sync.connect;


import org.okstar.platform.org.connect.ConnectorDefines;
import org.okstar.platform.org.connect.exception.ConnectorException;
import org.okstar.platform.org.sync.connect.domain.OrgIntegrateConf;
import org.okstar.platform.org.sync.connect.dto.SysConUser;
import org.okstar.platform.org.sync.connect.proto.SysConnAccessToken;
import org.okstar.platform.org.connect.api.Department;
import org.okstar.platform.org.sync.connect.proto.SysConnUserInfo;

import java.util.List;

public interface SysConnector {

    ConnectorDefines.Type getType();

    String getBaseUrl();

    String getRequestUrl(String url);

    /**
     * 获取AccessToken
     * @return SysConnAccessToken
     */
    SysConnAccessToken fetchAccessToken() throws ConnectorException;

    /**
     * 获取部门列表
     * @param parentId
     * @return
     */
    List<Department> getDepartmentList(String parentId) throws ConnectorException;

    /**
     * 获取部门下的用户
     * @param app
     * @param deptId
     * @return
     */
    List<SysConUser> getUserIdList(OrgIntegrateConf app, String deptId);

    /**
     * 获取部门用户信息
     * @param app
     * @param userId
     * @return
     */
    SysConnUserInfo getUserInfoList(OrgIntegrateConf app, String userId);
}

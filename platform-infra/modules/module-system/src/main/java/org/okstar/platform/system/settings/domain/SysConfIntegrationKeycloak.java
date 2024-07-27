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

package org.okstar.platform.system.settings.domain;

import com.google.common.collect.Maps;
import lombok.Data;
import org.okstar.platform.common.string.OkStringUtil;
import org.okstar.platform.system.settings.SysConfDefines;

import java.util.Map;


/**
 * 系统管理-集成设置-IM设置
 */
@Data
public class SysConfIntegrationKeycloak implements SysConfItem {
    Map<String, SysProperty> properties = Maps.newHashMap();

    String serverUrl;
    String realm;
    String clientId;
    String username;
    String password;
    String clientSecret;

    @Override
    public String getGroup() {
        return SysConfDefines.CONF_GROUP_INTEGRATION_PREFIX + ".keycloak";
    }

    @Override
    public void addProperty(SysProperty property) {
        properties.put(property.getK(), property);

        if (OkStringUtil.equals(property.getK(), "server-url")) {
            this.serverUrl = property.getV();
        } else if (OkStringUtil.equals(property.getK(), "realm")) {
            this.realm = property.getV();
        } else if (OkStringUtil.equals(property.getK(), "client-id")) {
            this.clientId = property.getV();
        } else if (OkStringUtil.equals(property.getK(), "username")) {
            this.username = property.getV();
        } else if (OkStringUtil.equals(property.getK(), "password")) {
            this.password = property.getV();
        } else if (OkStringUtil.equals(property.getK(), "client-secret")) {
            this.clientSecret = property.getV();
        }
    }
}
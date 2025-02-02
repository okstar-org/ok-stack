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

package org.okstar.platform.auth.keycloak;

import lombok.*;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BackResourceDTO {
    private String id;
    private String name;
    private String displayName;
    private String type;
    private Set<String> uris;
    private String iconUri;
    private String scopes;
    private Map<String, List<String>> attributes;

    public String getUri() {
        return uris == null || uris.isEmpty() ? null : uris.iterator().next();
    }
}

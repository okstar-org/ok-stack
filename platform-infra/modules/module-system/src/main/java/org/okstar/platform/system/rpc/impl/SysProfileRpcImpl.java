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

package org.okstar.platform.system.rpc.impl;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.okstar.platform.common.bean.OkBeanUtils;
import org.okstar.platform.system.account.domain.SysProfile;
import org.okstar.platform.system.account.service.SysProfileService;
import org.okstar.platform.system.dto.SysProfileDTO;
import org.okstar.platform.system.rpc.SysProfileRpc;


@ApplicationScoped
public class SysProfileRpcImpl implements SysProfileRpc {

    @Inject
    SysProfileService profileService;

    @Override
    public SysProfileDTO getByAccount(Long accountId) {
        SysProfileDTO dto = new SysProfileDTO();
        SysProfile profile = profileService.loadByAccount(accountId);
        OkBeanUtils.copyPropertiesTo(profile, dto);
        return dto;
    }

    @Override
    public Long save(Long accountId, SysProfileDTO req) {
        SysProfile profile = profileService.loadByAccount(accountId);
        OkBeanUtils.copyPropertiesTo(req, profile);
        profileService.update(profile, 1L);
        return profile.id;
    }
}

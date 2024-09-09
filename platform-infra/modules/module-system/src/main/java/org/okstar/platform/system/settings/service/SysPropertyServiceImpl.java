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

package org.okstar.platform.system.settings.service;

import io.quarkus.panache.common.Page;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.okstar.platform.common.core.web.page.OkPageResult;
import org.okstar.platform.common.core.web.page.OkPageable;
import org.okstar.platform.system.settings.domain.SysProperty;
import org.okstar.platform.system.settings.domain.SysProperty_;
import org.okstar.platform.system.settings.mapper.SysPropertyMapper;

import java.util.List;

@Transactional
@ApplicationScoped
public class SysPropertyServiceImpl implements SysPropertyService {

    @Inject
    SysPropertyMapper sysPropertyMapper;

    @Override
    public void save(SysProperty property) {
        sysPropertyMapper.persist(property);
    }

    @Override
    public List<SysProperty> findAll() {
        return sysPropertyMapper.findAll().stream().toList();
    }

    @Override
    public OkPageResult<SysProperty> findPage(OkPageable page) {
        var all = sysPropertyMapper.findAll();
        var query = all.page(Page.of(page.getPageIndex(), page.getPageSize()));
        return OkPageResult.build(
                query.list(),
                query.count(),
                query.pageCount());
    }

    @Override
    public SysProperty get(Long id) {
        return sysPropertyMapper.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        sysPropertyMapper.deleteById(id);
    }

    @Override
    public void delete(SysProperty property) {
        sysPropertyMapper.delete(property);
    }

    @Override
    public SysProperty get(String uuid) {
        return sysPropertyMapper.find(SysProperty_.UUID, uuid).firstResult();
    }

    @Override
    public void deleteByGroup(String group) {
        sysPropertyMapper.deleteByGroup( group);
    }

    @Override
    public List<SysProperty> findByGroup(String group) {
        return sysPropertyMapper.findByGroup(group);
    }

    @Override
    public List<SysProperty> findByKey(String group, String domain, String k) {
        return sysPropertyMapper.findByKey(group, domain, k);
    }
}
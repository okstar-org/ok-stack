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

package org.okstar.platform.org.resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import org.okstar.platform.common.web.bean.Res;
import org.okstar.platform.org.domain.OrgPost;
import org.okstar.platform.org.service.OrgPostService;

import java.util.List;

/**
 * 获取岗位信息接口
 */
@Path("post")
public class OrgPostResource {

    @Inject
    OrgPostService postService;

    @GET
    @Path("findByDept/{deptId}")
    public Res<List<OrgPost>> findByDept(@PathParam("deptId") Long deptId) {
        List<OrgPost> list = postService.findByDept(deptId);
        return Res.ok(list);
    }

    @POST
    @Path("save")
    public Res<Boolean> save(OrgPost post) {
        postService.saveOrUpdate(post);
        return Res.ok(true);
    }

    @DELETE
    @Path("deleteById/{id}")
    public Res<Boolean> deleteById(@PathParam("id") Long id) {
        postService.deleteById(id);
        return Res.ok(true);
    }

    @GET
    @Path("count")
    public Res<Long> count() {
        var count = postService.getCount();
        return Res.ok(count);
    }
}

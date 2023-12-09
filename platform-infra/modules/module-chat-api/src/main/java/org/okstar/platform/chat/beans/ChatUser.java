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
package org.okstar.platform.chat.beans;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.okstar.platform.common.core.web.bean.DTO;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ChatUser extends DTO {

    /** The username. */
    private String username;

    /** The name. */
    private String name;

    /** The email. */
    private String email;

    private boolean online;

}

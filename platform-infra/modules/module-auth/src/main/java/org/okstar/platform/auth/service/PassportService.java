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

package org.okstar.platform.auth.service;


import org.okstar.platform.system.sign.*;
import org.okstar.platform.system.dto.SysAccountDTO;


public interface PassportService {

    SignUpResult signUp(SignUpForm signUpForm);

    void signDown(Long accountId);

    AuthorizationResult signIn(SignInForm signInForm);

    AuthorizationResult refresh(String refreshToken);

    void signOut(String accessToken);

    SysAccountDTO getAccount(String account);

    void updatePassword(PasswordUpdateForm updateForm);

    void forgot(ForgotForm form);
}

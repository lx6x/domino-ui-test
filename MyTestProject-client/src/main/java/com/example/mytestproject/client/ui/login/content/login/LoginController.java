package com.example.mytestproject.client.ui.login.content.login;

import com.example.mytestproject.client.MyTestProjectContext;
import com.github.nalukit.nalu.client.component.AbstractComponentController;
import com.github.nalukit.nalu.client.component.annotation.Controller;
import elemental2.dom.HTMLElement;
import java.lang.Override;
import java.lang.String;

/**
 * Copyright (C) 2018 - 2019 Frank Hossfeld <frank.hossfeld@googlemail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
@Controller(
    route = "/login/login",
    selector = "content",
    componentInterface = ILoginComponent.class,
    component = LoginComponent.class
)
public class LoginController extends AbstractComponentController<MyTestProjectContext, ILoginComponent, HTMLElement> implements ILoginComponent.Controller {
  public LoginController() {
  }

  @Override
  public void doLogin(String userId, String password) {
    // we are always happy with the credential ...
    this.context.setLoggedIn(true);
    this.router.route("/application/screen01");
  }
}

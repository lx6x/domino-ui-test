package com.example.mytestproject.client.filter;

import com.example.mytestproject.client.MyTestProjectContext;
import com.github.nalukit.nalu.client.filter.AbstractFilter;
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
public class LoginFilter extends AbstractFilter<MyTestProjectContext> {
  @Override
  public boolean filter(String route, String... parms) {
    if (!"/login/login".equals(route)) {
      if (!this.context.isLoggedIn()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public String redirectTo() {
    return "/login/login";
  }

  @Override
  public String[] parameters() {
    return new String[]{};
  }
}

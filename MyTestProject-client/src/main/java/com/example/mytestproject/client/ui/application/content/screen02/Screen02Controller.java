package com.example.mytestproject.client.ui.application.content.screen02;

import com.example.mytestproject.client.MyTestProjectContext;
import com.example.mytestproject.client.event.StatusChangeEvent;
import com.example.mytestproject.shared.model.MyModel;
import com.github.nalukit.nalu.client.component.AbstractComponentController;
import com.github.nalukit.nalu.client.component.annotation.Controller;
import elemental2.dom.HTMLElement;
import java.lang.Override;

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
    route = "/application/screen02",
    selector = "content",
    componentInterface = IScreen02Component.class,
    component = Screen02Component.class
)
public class Screen02Controller extends AbstractComponentController<MyTestProjectContext, IScreen02Component, HTMLElement> implements IScreen02Component.Controller {
  private MyModel model;

  public Screen02Controller() {
  }

  @Override
  public void start() {
    // Here we simulate the creation of a model.
    // In the real world we would do a server call or
    // something else to get the data.
    model = new MyModel("This value is set using the edit method! The value is >>" + "Screen02" + "<<");
    // 
    // now, move the data out of the model into the widgets - that's what we do next
    component.edit(model);
    // update the statusbar at the bottom of the screen
    eventBus.fireEvent(new StatusChangeEvent("active screen: >>Screen02<<"));
  }
}

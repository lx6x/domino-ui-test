package com.example.mytestproject.client;

import com.github.nalukit.nalu.plugin.elemental2.client.NaluPluginElemental2;
import com.google.gwt.core.client.EntryPoint;
import org.dominokit.domino.rest.DominoRestConfig;

/**
 * TODO 算是个启动类
 */
public class MyTestProject implements EntryPoint {

    public void onModuleLoad() {
        /*
         * 全局服务根:
         *   默认情况下，domino-rest 假定将其余点部署到正在运行的应用程序的同一主机和端口，因此，如果该应用程序 localhost 在端口上运行，8080则所有服务都将映射到：
         *   http://localhost:8080/service/{path to service}
         *   我们可以使用 DominoRestConfigclass 全局更改所有服务的默认服务根目录：如下
         *   更改服务根目录后，所有服务都将映射到新的服务根目录
         */
        DominoRestConfig.initDefaults();
        DominoRestConfig instance = DominoRestConfig.getInstance();
        instance.setDefaultServiceRoot("http://localhost:8080");
        MyTestProjectApplication application = new MyTestProjectApplicationImpl();
        application.run(new NaluPluginElemental2());
    }
}

要运行项目，请使用以下命令：
将目录更改为您生成的项目，然后发出以下命令：
*在一个终端窗口中运行： 
    - mvn clean install

*在客户端模块中运行：
    - mvn gwt:codeserver
      or
      mvn gwt:devmode

*在另一个终端窗口中：
*在服务器模块中运行：
    - mvn spring-boot:run -P env-dev

要启动该应用程序，请访问：
    -> http://localhost:8080/MyTestProject.html

*打包运行
    - mvn clean install
在 "MyTestProject-server" 模块中, 使用
    java -jar MyTestProject-server\target\MyTestProject-server-1.0.0.war

----------------------------------------------------------------------------------------------
使用 dominokit 自建文档地址：http://www.liujf.xyz/MyDocument.html

------------------------------------------------------------------------

使用 Domino-ui 所搭建的文档：http://www.liujf.xyz/MyDocument.html



:rocket:搬砖必备，常用工具:rocket:
--

1. 项目结构
	
	> java_note       
	> 所有项目的父项目

	> app	
	> webapp 存放静态文件&jsp 等页面

	> app_tools	    
	> 工具类项目，提供各种快捷开发的工具
	
	> app_assembly    
	> 打包项目为zip等格式的压缩包，具体方法可查看 app_assembly/pom.xml
	
	> app_client      
	> 前端controller 层代码
	
	> app_jetty       
	> 集成jetty，可使用jetty 运行项目

2. 项目运行

        cd java_note
    
        mvn -DskipTests=true clean install -P dev
    
        cd  app_jetty
        
        mvn clean install jetty:run
        
        在浏览器输入： http://127.0.0.1:8581/
    
        出现如下：
    
        Hello World! jetty

3. 发布的版本

    > [1.0.0][v1.0.0]
    > 集成简单的项目骨架，maven + spring mvc + jetty + velocity
    
    
4.  注意事项
    > a)
       maven新的模块，需要在`app_assembly`的`artifactItems`中添加`artifactItem`在打包时
       新增的jar包才会在lib 目录下面



[v1.0.0]:https://github.com/web1992/java_note/releases/tag/1.0.0
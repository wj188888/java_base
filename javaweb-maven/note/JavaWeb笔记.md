## JavaWeb

### 1.基本概念

#### 1.1 web应用程序

分为静态web和动态web

在java中，动态web资源开发的技术统称为JavaWeb；



#### 1.2 web应用程序

web应用程序：可以提供浏览器访问的程序；

- a.html丶b.html......多个web资源，这些web资源可以被外界访问，对外界提供服务；
- 你们能访问到的任何的页面或者资源，都存在于这个世界的某一个角落的计算机上；
- URL：
- 这个统一的web资源会被放在同一文件夹下，web应用程序--->tomcat：服务器
- 一个web应用由多个部分组成（静态和动态）
  - html,js,css
  - jsp,servlet
  - jar包
  - 配置文件(properties)

web应用程序编写完毕后；若想提供给外界访问：需要一个服务器来统一管理;

#### 1.3 静态web

- *.html这些是网页的后缀，如果服务器上一直存在，就会被请求到


静态web缺点：

1.web页面无法更新，都是统一页面

2.轮播图，伪动态

3.JavaScript

4.VBScript

动态web优点：

#### 1.4 动态web

web页面因人而异；

缺点：

- 假如服务器的动态web资源出现错误，我们需要重新编写我们的后台程序，重新发布；

- 可以与数据库交互（数据持久化：注册）


### 2.web服务器

#### 2.1 基本技术

- ASP(微软：国内最早流行的就是ASP，在html中嵌入了VB脚本ASP+COM)，在ASP开发中，基本一个页面

- C#(IIS)

- PHP:开发速度很快，功能强大，跨平台，代码简单

  - 无法承载大访问量的情况（局限性）

- JSP/Servlet：

  - Sun公司主推的B/S架构

  - 基于Java语言的

  - 可以承载三高问题带来的影响；

  - 语法像ASP，ASP--->JSP,加强市场强度；




......



#### 2.2 web服务器

服务器是一种被动操作，用来处理用户的一些请求和给用户的一些响应信息；

**IIS**:微软的;ASP...,Windows自带的

**Tomcat**

Tomcat是Apache 软件基金会（Apache Software Foundation）的Jakarta 项目中的一个核心项目，由[Apache](https://baike.baidu.com/item/Apache/6265)、Sun 和其他一些公司及个人共同开发而成。由于有了Sun 的参与和支持，最新的Servlet 和JSP 规范总是能在Tomcat 中得到体现，Tomcat 5支持最新的Servlet 2.4 和JSP 2.0 规范。因为Tomcat 技术先进、性能稳定，而且免费，因而深受Java 爱好者的喜爱并得到了部分软件开发商的认可，成为比较流行的Web 应用服务器。

Tomcat 服务器是一个免费的开放源代码的Web 应用服务器，属于轻量级应用[服务器](https://baike.baidu.com/item/%E6%9C%8D%E5%8A%A1%E5%99%A8)，在中小型系统和并发访问用户不是很多的场合下被普遍使用，是开发和调试JSP 程序的首选。对于一个java初学web者来说，它是最佳的选择

Tomcat 实际上运行JSP 页面和Servlet。另外，Tomcat和[IIS](https://baike.baidu.com/item/IIS)等Web服务器一样，具有处理HTML页面的功能，另外它还是一个Servlet和JSP容器，独立的Servlet容器是Tomcat的默认模式。不过，Tomcat处理静态[HTML](https://baike.baidu.com/item/HTML)的能力不如Apache服务器。



**工作3-5之后，可以尝试手写Tomcat服务器;**

下载tomcat：

1.安装和解压

2.了解配置文件和目录结构

3.这个东西的作用

### 3.tomcat

[tomcat下载地址](https://tomcat.apache.org/)

#### 3.1 解压使用

文件夹作用：

![文件资料](D:\3_helloworld\typora_images\tomcatfiles.png)



bin目录下的启动和start.bat和shutdown.bat下的关闭;

可能遇到的问题：

1. java环境变量没有配置
2. 闪退问题：需要配置兼容性
3. 乱码问题：


在conf中server.xml，可以配置端口号，可以配置域名;

```xml
<Connector connectionTimeout="20000" port="8080" protocol="HTTP/1.1" redirectPort="8443"/>
```

- tomcat默认端口：8080
- mysql：3306
- http：8080
- http：443

```xml
<Connector connectionTimeout="20000" port="8080" protocol="HTTP/1.1" redirectPort="8443"/>
```

可以配置主机的名称

- 默认的主机名为：localhost--->127.0.0.1


```xml
<Host name="www.qinqiang.com" appBase="webapps" 
			autoDeploy="true" unpackWARs="true">
```

- 默认网站应用存放的位置：webapps

有难度的面试题：

请你谈谈网站是如何进行访问的；

1.输入一个域名；回车

2.检查本机的hosts配置文件下有没有这个域名的映射；

有：直接返回这个域名对应的IP地址

```xml
127.0.0.1	www.qinqiang.com
```

无：去DNS服务器去找（全世界的所有域名都在这里寻找）

#### 3.2 发布一个网站

先模仿

- 将自己写的网站，放在服务器中，webapps下，就可以访问，网站应该有的结构；


```java
webapps:tomcat服务器的web目录
	--RooT
	--kuangstudy:网站的目录名
		- index.html
		-- web-INF
			--web.xml
			--classes:java程序
			--lib
		--static
            --css
            	--style.css
            --html
            --js
```

### 4.HTTP

### 4.1什么是http

请求响应协议，通常运行在TCP上

- 文本，字符串
- 超文本
- 80

#### 4.2 两个时代

- http1.0
  - HTTP/1.0（客户端可以与web服务器连接,只能获得一个web资源）
- http2.0
  - HTTP、1.1

#### 4.4HTTP请求

- 客户端---发请求---》服务器


```java
Request URL: https://www.baidu.com/home/xman/data/tipspluslist?indextype=manht&_req_seqid=0xf79d0c1e0051a77c&asyn=1&t=1654434882180&sid=36429_36455_31253_34813_36420_36166_36487_36517_36519_26350_36469_22157
Request Method: GET
Status Code: 200 OK
Remote Address: 39.156.66.18:443
Referrer Policy: unsafe-url
```



#### 4.5响应

服务器）——》客户端

```java
Cache-Control: private	缓存控制
Connection: keep-alive	连接：保持
Content-Encoding: gzip
Content-Length: 78
Content-Type: text/html;charset=utf-8	编码类型
Date: Sun, 05 Jun 2022 13:14:43 GMT
Expires: Sun, 05 Jun 2022 13:14:43 GMT
Server: BWS/1.0
Vary: Accept-Encoding
```

1.请求行

- 请求行中的请求方式：GET

- 请求方式：GET，Post，HEAD，DELETE，PUT，TRACT


get：请求能够携带的参数比较少，大小也会有限制；不安全，但高效

post：请求能够携带的参数没有限制，大小没有限制，不会在浏览器的URL地址栏显示数据内容，安全，但是不高效；

2.消息头

```java
Accept: 告诉浏览器，它所支持的数据类型
Accept-Encoding:支持哪种编码格式 GBK UTF-8 GB2312 ISO8859-1
Accept-Language: 告诉浏览器的语言环境
Cache-Control: 缓存控制
Reflush: 刷新
Location: 让网页重新定位；
```

2.响应的状态码

200：请求响应成功

3xx：请求重定向

- 重定向：你重新到我给你的新地址；

4xx：请求找不到资源

- 资源不存在

5xx：服务器代码错误 500 502：网关错误

常见面试题：

当你的浏览器地址栏输入地址一瞬间能够展示出来的，经历了什么？

### 5.Maven

**为什么要学习Maven**

1.在javaweb开发中，需要使用大量的jar包，然后大部分是需要手动导入；

2.如何能够让一个东西自动帮我们导入和配置这个jar包；

由此，Maven诞生了；

#### 5.1Maven项目架构管理工具

我们目前用来就是方便导入jar包的！

Maven的核心思想：**约定大于配置**

- 有约束不要去违反

下载完成后，解压即可；

建议：电脑所有的环境都放在一个文件夹中去；

#### 5.2下载Maven

apache下载maven压缩包

#### 5.4 配置环境变量

1.M2_HOME 配置环境变量

2.Maven_HOME 配置环境变量

3.%Maven_home%\bin;

查看是否安装成功:`mvn -version`

#### 5.4本地仓库

本地仓库，远程仓库；

**建立一个本地仓库：localRepository**

```xml
<localRepository>D:\env\java8\apache-maven-3.3.9\maven_repo</localRepository>
```

#### 5.6 在IDEA中使用Maven

4.观察maven本地仓库是否有东西；

![maven设置](D:\3_helloworld\typora_images\maven1.png)

6.这里，Maven在配置就对了；

#### 5.7创建一个普通的Maven项目

makrs as ...标记为

maven 的项目结构：

- maven的命令行操作
- 插件，甚至可以删掉
- 项目依赖，jar包

#### 5.8 pom文件

略...

#### 5.9 遇到的问题

1.Maven3.6.2,,, jdk1.8

解决方法：降级为Maven 3.6.1

`Unable to import maven new project :See logs for details `

2.Tomcat闪退

3.IDEA中每次都要配置Maven

在IDEA中全局默认配置中去配置



### 6.Servlet

#### 6.1Servlet简介

- Service就是sun公司开发动态web的一门技术
- Sun在这些Api中提供一个接口叫做：Servlet，如果逆向开发一个Servlet程序，只需要完成两个步骤；
  - 编写一个类，实现Servlet
  - 把开发好的java类部署到web服务器中

**把实现了Servlet接口的程序的java程序叫做，servlet**

#### 6.2HelloServlet

Servlet有两个默认实现的类：httpservlet,

1.构建一个普通的Maven项目，删掉里面的src项目，以后我们的学习就在这个项目里面建立Model；空工程就是maven的主工程；

2.关于Maven父子工程的理解：

父项目中会有：

```xml
<modules>
  <module>servlet-01</module>
</modules>
```

子项目会有：

```xml
<parent>
  <artifactId>javaweb_servlet</artifactId>
  <groupId>com.wangjie</groupId>
  <version>1.0-SNAPSHOT</version>
</parent>
```

父项目中的java子项目可以直接使用

#### 3.maven环境优化

1.修改web.xml为最新的

2.将maven的结构搭建完成

3.Maven环境优化

4.编写一个Servlet程序

1.编写一个普通类

2.实现Servlet接口，这里我们直接继承Httpservlet

Servlet接口 -》GenericServlet---> HttpServlet--->>我们自己的类只需要继承HttpServlet即可

```java
public class HelloServlet extends HttpServlet {

    // 由于get或者post只是请求实现的方式不同，可以相互调用，业务逻辑都一样！
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // ServletOutputStream outputStream = resp.getOutputStream();
        PrintWriter writer = resp.getWriter(); // 响应流
        writer.print("Hello Servlet!!!");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
    
}
```

5.编写Servlet的映射

为什么需要映射：我们写的是java程序，但是要通过浏览器访问；需要连接web服务器，所以我们需要在web服务中心注册我们写的servlet，还需给他浏览器可以访问

```xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xmlns="http://xmlns.jcp.org/xml/ns/javaee"
        xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee
						http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd"
        id="WebApp_ID" version="4.0">
    <servlet>
        <servlet-name>hello</servlet-name>
        <servlet-class>com.wangjie.servlet.HelloServlet</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>hello</servlet-name>
        <url-pattern>/hello</url-pattern>
    </servlet-mapping>
</web-app>

```

6.配置tomcat

注意项目发布的路径；

7.启动测试

### 6.3 Servlet原理

Servlet是由web服务器调用，web服务器在收到浏览器请求之后，去调用service去调用这个方法，然后返回给response，接着发给浏览器;

我们要去做：自己去编写这个类

1.接收发过来的参数，经过逻辑处理给出响应结果；

### 6.4Mapping问题

1.一个servlet可以指定1到多个映射路径

2.一个Servlet可以指定一个通配符路径

3.一个Servlet可以指定一些后缀

```xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xmlns="http://xmlns.jcp.org/xml/ns/javaee"
        xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee
						http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd"
        id="WebApp_ID" version="4.0">
    <servlet>
        <servlet-name>hello</servlet-name>
        <servlet-class>com.wangjie.servlet.HelloServlet</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>hello</servlet-name>
        <url-pattern>/hello/wangjie/wangjie/wangjie</url-pattern>
    </servlet-mapping>
    <servlet-mapping>
        <servlet-name>hello</servlet-name>
        <url-pattern>/hello/*</url-pattern>
    </servlet-mapping>
    

</web-app>
```

*.wangjie，，，，，，星丶路劲前面不加任何东西；

```xml
<servlet-mapping>
        <servlet-name>hello</servlet-name>
        <url-pattern>*.wangjie</url-pattern>
    </servlet-mapping>
```

6.优先级问题

指定了固有的映射路径优先级最高，找不到才去默认处理

```xml
    <!--404-->
    <servlet>
        <servlet-name>error</servlet-name>
        <servlet-class>com.wangjie.servlet.ErrorServlet</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>error</servlet-name>
        <url-pattern>/*</url-pattern>
    </servlet-mapping>
```

### 6.5 ServletContext

web容器在启动的时候，它会为每个web程序都创建一个对应的ServletContext对象，它代表了当前的web应用；

每个子模块的servlet之间相互通信；

ServletContext凌驾于所有的servlet子模块之上的东西；

- 共享数据


```java
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // this.getServletConfig(); 配置
        // this.getInitParameter(); 初始化参数

        ServletContext context = this.getServletContext();// 上下文对象
        System.out.println("调用HelloServlet");
        context.setAttribute("username","javk"); // 将数据保存到ServletContext中，名字为Username,值username

    }
}
```

**GetServlet:**

```java
package com.wangjie.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GetServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = this.getServletContext();
        String username = (String) context.getAttribute("username");

        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");
        resp.getWriter().print("名字"+username);
    }
}
```

**配置web.xml**

```xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xmlns="http://xmlns.jcp.org/xml/ns/javaee"
        xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee
						http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd"
        id="WebApp_ID" version="4.0">
    <servlet>
        <servlet-name>hello</servlet-name>
        <servlet-class>com.wangjie.servlet.HelloServlet</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>hello</servlet-name>
        <url-pattern>/hello/wangjie</url-pattern>
    </servlet-mapping>

    <servlet>
        <servlet-name>getc</servlet-name>
        <servlet-class>com.wangjie.servlet.GetServlet</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>getc</servlet-name>
        <url-pattern>/getc</url-pattern>
    </servlet-mapping>

</web-app>
```

**获取初始化参数：**

```xml
<!--配置一些web应用初始化参数-->
    <context-param>
        <param-name>url</param-name>
        <param-value>jdbc:mysql://localhost:3306/mybatis</param-value>
    </context-param>
```

获取：

```java
@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = this.getServletContext();

        String url = context.getInitParameter("url");
        resp.getWriter().print(url);
    }
```

**请求转发**

```java
public class ServletDemo04 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("进入了ServletDemo04");
        ServletContext context = this.getServletContext();
        RequestDispatcher dispatcher = context.getRequestDispatcher("/gp"); // 转发的请求路径
        dispatcher.forward(req,resp); // 调用forward实现请求转发；
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
```

**获取配置资源文件**

Properties在java下新建properties，在resources目录下新建properties

发现们都被打包成，db.properties配置文件，都能被识别

### 6.6 HttpServletResponse

web服务器接收到客户端的http请求，针对这个请求，分别创建一个代表的HttpServletReuest对象，响应是HttpServletResponse

- 如果要获取客户端请求过来的参数：找HttpServletRequest

- 如果要给客户端响应一些信息：找HttpServletResponse


1.简单分类

负责向浏览器发送数据

```java
package com.wangjie.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        InputStream is = this.getServletContext().getResourceAsStream("/WEB-INF/classes/db.properties");

        Properties prop = new Properties();
        prop.load(is);
        String user = prop.getProperty("username");
        String pwd = prop.getProperty("password");

        // 编译转换
        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");
        resp.getWriter().print("账号："+user+"\r"+"密码："+pwd);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    public static void main(String[] args) {
    }
}
```

**响应的状态码:setStatus()**

```java
    int SC_CONTINUE = 100;
    int SC_SWITCHING_PROTOCOLS = 101;
    int SC_OK = 200;
    int SC_CREATED = 201;
    int SC_ACCEPTED = 202;
    int SC_NON_AUTHORITATIVE_INFORMATION = 203;
    int SC_NO_CONTENT = 204;
    int SC_RESET_CONTENT = 205;
    int SC_PARTIAL_CONTENT = 206;
    int SC_MULTIPLE_CHOICES = 300;
    int SC_MOVED_PERMANENTLY = 301;
    int SC_MOVED_TEMPORARILY = 302;
    int SC_FOUND = 302;
    int SC_SEE_OTHER = 303;
    int SC_NOT_MODIFIED = 304;
    int SC_USE_PROXY = 305;
    int SC_TEMPORARY_REDIRECT = 307;
    int SC_BAD_REQUEST = 400;
    int SC_UNAUTHORIZED = 401;
    int SC_PAYMENT_REQUIRED = 402;
    int SC_FORBIDDEN = 403;
    int SC_NOT_FOUND = 404;
    int SC_METHOD_NOT_ALLOWED = 405;
    int SC_NOT_ACCEPTABLE = 406;
    int SC_PROXY_AUTHENTICATION_REQUIRED = 407;
    int SC_REQUEST_TIMEOUT = 408;
    int SC_CONFLICT = 409;
    int SC_GONE = 410;
    int SC_LENGTH_REQUIRED = 411;
    int SC_PRECONDITION_FAILED = 412;
    int SC_REQUEST_ENTITY_TOO_LARGE = 413;
    int SC_REQUEST_URI_TOO_LONG = 414;
    int SC_UNSUPPORTED_MEDIA_TYPE = 415;
    int SC_REQUESTED_RANGE_NOT_SATISFIABLE = 416;
    int SC_EXPECTATION_FAILED = 417;
    int SC_INTERNAL_SERVER_ERROR = 500;
    int SC_NOT_IMPLEMENTED = 501;
    int SC_BAD_GATEWAY = 502;
    int SC_SERVICE_UNAVAILABLE = 503;
    int SC_GATEWAY_TIMEOUT = 504;
    int SC_HTTP_VERSION_NOT_SUPPORTED = 505;
```

2.常见应用：

- 1.下载文件是啥？
- 2.向浏览器输出内容
- 3.设置想办法让浏览器支持下载我们需要的东西
- 4.获取下载文件的输入流
- 5.创建缓存区域
- 6.获取OutputStream对象
- 7.将FileOutputStream写入到buffer缓冲区
- 使用OutputStream将缓冲区数据输出到客户端

3.验证码功能

验证码怎么来？

- 前端实现
- 后端实现，需要利用java的图片类，生成一个图片


重定向：

一个web资源B受到客户端A请求后，B会通知A客户端去访问另外一个web资源C，这个过程叫做重定向；

常见场景：



### 6.7 HttpServletRequest

代表客户端请求，用户通过http协议访问服务器；

1.获取前端参数

2.请求转发
面试题：请你聊聊重定向和转发的区别？
相同点：
- 页面都会实现跳转

---
不同点：
- 请求转发的时候，url不会产生变化 307
- 重定向的时候，url地址会变化。 302











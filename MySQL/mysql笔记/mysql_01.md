# mysql基础
JavaEE:企业级java开发 Web
前端（页面：展示数据！）
后台（连接点：连接数据库JDBC，连接前端（控制试图跳转和给前端传递数据））
数据库（存数据，TXT，excel，word）

```
只会写代码,基本混饭吃
操作系统，数据结构与算法，当一个不错的程序员
离散数学，数字电路，体系结构，编译原理，+实战经验，高级程序员~优秀的程序员
```

## 1.1为什么学习数据库
1. 岗位需求趋势学习
2. 现在世界，大数据时代，得数据者得天下
3. 被迫需求， 存数据，去IOE
4. 数据库是所有软件体系中最核心的存在 DBA

## 1.2.什么是数据库
数据库（DB,DataBase）
概念：数据仓库，软件，安装在操作系统之上的。SQL,可以存储大量的数据,500完以下
作用： 存储数据，管理数据

## 1.3 DBMS数据库管理系统
数据库分类：
关系分类：
1. 关系型数据库：(SQL)
    - mysql,sql server,Oracle,DB2, SQLite
    - 通过表和表之间，行和列之间的关系进行数据的存储，学员信息表，考情表，。。。。..
2. 非关系型数据库(NoSQL) Not Only
    - Redis,MangoDB
    - 非关系型数据库，对象存储，通过对象的自身的属性来决定
   
**DBMS(数据库管理系统)**
- 数据库管理软件
- Mysql来了 

## mysql的安装
省略---

## SQLyog安装和使用
每一个操作都对应一组sql的操作
- 修改密码的其他方式
    - `update mysql.user set authentication_string=password('123456') where user='root' and Host='localhost'; -- 修改用户密码`
    - `flush privileges; -- 刷新权限`
---

- 所有的语句都使用：结尾
`show databases;`

- 切换数据库
    - use database
- 查看数据库中的所有的表
    - show tables
- 显示数据库中所有的表的信息
    - describe student

- 退出连接
    - exit
- 单行注释
    - `-- wangjie`
- 多行注释
    - `/*hello,wangjie*/`

数据库分为:
- DDL
- DML
- DQL
- DCL

1. CRUD增删查改
2. CV程序员
3. API程序猿，CRUD程序猿! (业务！)
### 操作数据库
1. 创建数据库
    - `create database [if not exists] westos`
2. 删除数据库
    - `drop database [if exists] hello`
3. 使用数据库
    - `use databaseName`

## 数据库的列类型
- tinyint 1个字节
- smallint 较小的数据 2个字节
- mediumint 中等大小的数据 3个字节
- int 标准的整数 4个字节
- bigint 较大的数据 8个字节
- float 浮点数 4个字节
- double 浮点数 8个字节
- decimal 字符串形式的浮点数 金融计算的时候，一般是应用decimal
### 字符串类型
- char 字符串固定大小的 0-255
- varchar 可变字符串 0-65535
- tinytext 微型文本 2^8 - 1
- text 文本串 2^16 - 1 保存大文本
### 时间和日期
java.util.Date
- date YYYY-MM-DD,日期格式
- time HH:mm:ss, 时间格式
- timestamp 时间戳，1970.1.1到现在的毫秒数
- year 年份表示
### null
- 没有值，未知
- 注意，不建议使用NULL

数据库的字段属性（重点）
- Unsigned:
    - 无符号的整数
    - 声明了该列不能声明为负数
-zerofill
    - 0填充的
    - 不足的位数，使用0来填充，int（3），5 。。。 005
- 自增：
    - 通常理解为自增，自动在上一条记录的基础上+1（默认）
    - 通常用来设计唯一的主键-index，必须是整数类型
    - 可以自定义设计主键自增的初始值和步长
- 非空 Null not null
    - 不给赋值就报错
**拓展：每一个表都存在以下五个字段**
    - id，主键
    - `version` 乐观锁
    - is_delete 伪删除
    - gmt_create 创建时间
    - gmt_update 修改时间





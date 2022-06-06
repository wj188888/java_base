## 1.初始MySQL

javaEE：企业级java开发丶web

前端

后台（连接点：连接数据库JDBC，连接前端（控制，控制视图跳转，和给前端传递数据））

数据库（存数据，Txt，Excel，word）

> 只会写代码，学好数据库，基本混饭吃！
>
> 操作系统，数据结构算法！，当个不错的程勋元
>
> 离散数学，数字电路，体系结构丶编译原理丶实战经验，高级程序员！优秀程序员

### 1.1 为什么要学习数据库

1.岗位需求

2.大数据时代，得数据者得天下

3.被迫需求;存数据

4.数据库是所有软件体系最核心的存在 DBA

### 1.2 什么是数据库

数据库（DB）

概念：数据仓库，软件，安装在操作系统之上的！

数据库：存数据和管理数据

### 1.7连接数据库

```mysql
sql -- 单行注释
/*
多行注释
*/
```

**数据库 XXX 语言** 

==CRUD增删改查！丶CV程序员 丶api程序员丶（业务！）==

DDL(定义)丶DML（操作）丶DQL（查询）丶DCL（控制）



使用数据库

```mysql
-- tab键上面,如果你的表民或者字段名是一个特殊字符，就需要带``
USE `school`;

SELECT `user` FROM student;
```

查看所有的数据库

```mysql
show databases -- 查看所有的数据库
```

学习思路:

- 对照sqlyog的可视化
- 固定的语法关键字必须要强行

### 2.2 数据库的列类型

> 数值

- tinyint 十分小的数据 1字节

- smallint 较小的数据 2字节

- mediumint 中等大小的数据 3字节

- int （标准的整数）4字节

- bigint 较大的数据 8个字节

- float 浮点数 4个字节

- double 双精度数 8个字节

- decimal 字符串形式的浮点数 金融计算的时候，一般是使用decimal




> 字符串

- char 字符串 0-255

- varchar 字符串 可变字符串 0-65535

- tinytext 微型文本 2*8 - 1

- text 文本串 2*16 - 1

  ​

> 时间日期

- date YYYY-MM-DD 日期
- time HH:mm:ss 时间格式
- **datetime YYYY-MM-DD HH:mm:ss 最常用的时间格式**
- timestamp 时间戳 1970.01.01 到现在的毫秒数！也较为常用!
- year 年份表示



> null

- 没有值，未知
- 注意，不要使用NULL进行运算，结果为NULL



### 2.3数据库的字段属性

Unsigned:

- 无符号的整数

- 声明了该列不能声明为负数




zerofill:

- 0填充的

- 不足的位数，使用0来填充， int(3), 5 -- 005


自增：
- 通常理解为自增，自动在上一条记录的基础上加1；（）默认
- 通常用来设计唯一的主键 ~ index ，必须是整数类型
- 可以自定义设计住建的起始值和步长



==非空== NOT NULL

- 不赋值就报错，默认就是null
- ​

==默认：==

- 设置默认的值

- sex，默认的值为男，如果不指定该列的值，则会有默认的值；




---

==每个表都有这5个字段==

```mysql
- id 主键
- version 乐观锁
- is delete 伪删除
- gmt_create 创建时间
- gmt_update 修改时间

```

### 2.4 创建数据库表

```mysql
CREATE IF NOT EXISTS TABLE `student` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '学号',
  `name` VARCHAR(30) NOT NULL DEFAULT '匿名' COMMENT '姓名',
  `pwd` VARCHAR(20) NOT NULL DEFAULT '123456' COMMENT '密码',
  `sex` VARCHAR(2) NOT NULL DEFAULT '女' COMMENT '性别',
  `birthday` DATETIME DEFAULT NULL COMMENT '出生日期',
  `address` VARCHAR(100) DEFAULT NULL COMMENT '家庭住址',
  `email` VARCHAR(50) DEFAULT NULL COMMENT '邮箱',
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8; -- 可以改成charset=UTF8MB4;
```

公式： 

```mysql
create table [if not exists] `表名` (
    '字段名' 列类型 [属性] [索引] [注释]，
    '字段名' 列类型 [属性] [索引] [注释]，
  ......
    '字段名' 列类型 [属性] [索引] [注释]，
  primary key (`字段`)
)engine=innodb default charset=utf8;
```

常用命令

```mysql
-- 查看创建数据库的语句
SHOW CREATE DATABASE school;

-- 查看student数据表的定义语句;
SHOW CREATE TABLE student;

-- 显示表的结构
DESC student;
```



### 2.5数据库引擎类型

```mysql
-- 数据引擎

/*
默认INNODB，
早些年的使用的MYISAM 
*/

```

|        | MYISAM | INNODB  |
| ------ | ------ | ------- |
| 事务支持   | 不支持    | 支持      |
| 数据行锁定  | 不支持    | 支持      |
| 外键约束   | 不支持    | 支持      |
| 全文索引   | 支持     | 不支持     |
| 表空间的大小 | 较小     | 较大，约为2倍 |

常规使用操作：

- MYISAM 节约空间，速度很快
- INNODB 安全性更高，支持事务，多表多用户操作



> 在物理空间存在的位置

所有的数据库文件都存在data目录下

本质还是文件的存储~

MYsql 引擎在物理文件上的区别

- INNODB在数据库表中只有一个*.frm文件，以及上级目录下的ibdata1文件
- MYISAM对应文件
  - *.frm -表结构的定义文件
  - *.MYD 数据文件 （data）
  - *.MYI 索引文件（index）



> 设置数据库表的字符集编码

```mysql
charset=utf8

```

不设置的话，会是mysql默认的字符集编码（不支持中文）

Mysql默认的是latin1，不支持中文

在my.ini中配置默认的编码

```mysql
character-set-server=utf8
```

### 2.6表基本操作

```mysql
-- 修改表名：
ALTER TABLE `teacher` RENAME AS `teacher1`;
-- 增加表的字段
ALTER TABLE `teacher1` ADD age INT(10);
-- 修改表的字段（重命名，修改字段的类型和修改约束！）
ALTER TABLE `teacher1` MODIFY age VARCHAR(10); -- 修改约束
ALTER TABLE `teacher1` CHANGE age age1 INT(10); -- 字段重命名
-- 删除表的字段
ALTER TABLE `teacher1` DROP age1;

-- 删除表
DROP TABLE IF EXISTS teacher1;
-- 所有的创建和删除操作尽量加上判断，以免报错！
```

**所有的创建和删除操作尽量加上判断，以免报错！**

注意点：

- `` 所有的字段名使用这个包裹
- 注释 使用 -- 
- sql 关键字大小写不敏感，建议写小写；
- 所有的符号都使用英文;




## 3.mysql数据管理

### 3.1外键（了解）

> 方式一： 在创建表的时候，给表新增外键

```mysql
-- 学生表的gradeid 字段 要去引用年级表的 gradeid
-- 定义外键key
-- 给这个外键添加约束 （执行引用） reference 引用
CREATE IF NOT EXISTS TABLE `student` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '学号',
  `name` VARCHAR(30) NOT NULL DEFAULT '匿名' COMMENT '姓名',
  `pwd` VARCHAR(20) NOT NULL DEFAULT '123456' COMMENT '密码',
  `sex` VARCHAR(2) NOT NULL DEFAULT '女' COMMENT '性别',
  `birthday` DATETIME DEFAULT NULL COMMENT '出生日期',
  `address` VARCHAR(100) DEFAULT NULL COMMENT '家庭住址',
  `email` VARCHAR(50) DEFAULT NULL COMMENT '邮箱',
  PRIMARY KEY (`id`)
  KEY `FK_gradeid` (`gradeid`),
  CONSTRAINT `FK_gradeid` FOREIGN KEY (`gradeid`) REFERENCES `grade`(`gradeid`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

-- 给存在的表新增外键
ALTER TABLE `student` ADD CONSTRAINT `FK_gradeid` FOREIGN KEY(`gradeid`) REFERENCES grade(`gradeid`);`student`
```

删除有外键关系的表的时候，必须要先删除引用别人的表（从表），再删除被引用的表（主表）

以上操作都还是物理外键，数据库级别的外键，我们不建议使用！（避免数据库过多造成困扰）

最佳实践

- 数据库就是单纯的表，只用来存数据，只有行（数据）和列（字段）

- 我们想使用多张表的数据，想使用外键（程序去实现）



### 3.2DML语言（全部记住）

**数据库意义**：数据存储，数据管理

DML语言：数据操作语言

- insert
- update
- delete

### 3.3 修改

> update 修改谁 （条件） set 原来的值 = 新值

```mysql
-- 修改学员的名字
UPDATE `student` SET `name` = '万界' WHERE id IN (1,2,3);
UPDATE `student` SET `sex` = '男' WHERE id IN (1,2,3);
-- 修改多个属性
UPDATE `student` SET `name` = '王杰',`email`='123@qq.com' WHERE id IN (1,2,3);
-- 语法：
-- update 表名 set `字段` = '新值1' where (条件)
```

条件：where子句 运算符 id等于某个值，大于某个值，在某个值区间；

| 操作符              | 含义      | 范围           | 结果     |
| ---------------- | ------- | ------------ | ------ |
| =                | 等于      | 5=6          | false  |
| <> 或 !=          | 不等于     | 5<>6         | true   |
| between...and... | 在某个范围内  |              | [2,10] |
| and              | 我和你&&   | 5>1and 1 > 2 |        |
| or               | 我或你\|\| |              |        |
|                  |         |              |        |
|                  |         |              |        |
|                  |         |              |        |
|                  |         |              |        |

```mysql
-- 通过多个条件定位数据
UPDATE `student` SET `name`='luoyao' WHERE id IN (1,2,3) AND sex = '男';
UPDATE `student` SET `birthday`=CURRENT_TIME WHERE `name`='luoyao' AND sex='男'；


```

注意：

- colunm_name 是数据库的列，尽量带上``
- 条件，帅选的条件，如果没有指定，则会修改所以后的列
- value,是一个具体的值，也可以是一个变量
- 多个设置，用英文的逗号隔开

### 3.4 删除

> delete

语法:`delete from 表名`

```mysql
-- 删除指定数据
DELETE FROM student WHERE id=1;

-- 删除全部数据
DELETE FROM student;
```

> truncate命令

作用：完全清空一个数据库表，

```mysql
-- 清空 student 表
TRUNCATE `student`;
```

> delete 和 truncate的区别？

- 相同点：都能删除数据，都不会删除表结构
- 不同：
   - truncate 重新设置 自增列
   - truncate 不会影响事务

```mysql
-- delete from 不会影响自增
DELETE FROM `test`;

-- 删除 自增会归零
TRUNCATE `test`;
```

delete 删除问题，重启数据库，现象

- innodb 自增列会从1开始（存在内存当中，断电即失）

- MyISAM 继续从上一个自增开始（存在文件中，不会丢失）



### 3.5 插入


> insert

```mysql
-- 插入语句（添加）
INSERT INTO 表名 ([`字段1`,`字段2`]) VALUES(`值1`,`值2`,`值3`);

USE school;
INSERT INTO `grade`(`gradename`) VALUES('大四');

-- 由于逐渐自增我们可以省略,(如果不写表的字段，他就会一一匹配)
INSERT INTO `grade`) VALUES('大三');
-- 一般写入插入语句，我们一定要数据和字段一一对应；

-- 插入字段
INSERT INTO `grade`(`gradename`) VALUES('大二'),('大一');

-- 学生表插入,
INSERT INTO `student`(`name`) VALUES('张三');

INSERT INTO `student`(`name`, `pwd`) VALUES('张三','asqwez'), ('理发师','123szz');
```

语法： `INSERT INTO 表名 ([`字段1`,`字段2`]) VALUES(`值1`,`值2`,`值3`); 表名（）`

注意事项：

1.字段和字段之间使用英文逗号隔开；

2.字段是可以省略的，但是后面的值要一一对应；

3.可以同时插入多条数据，values后面的值，需要使用，隔开即可 values(),(),(),...



## 4. DQL查询数据（重点）

### 4.1 DQL

(Data Query LANGUAGE:数据查询语言)

- 所有的查询操作都用它 select
- 简单的查询，复杂的查询它都能做；
- ==数据库中最核心的语言==
- 使用频率最高的语句


### 4.2指定查询字段

```mysql
-- 查询全部的学生;
select * from `student`;

select `SubjectNo` from result;

-- 别名，给结果起一个名字，as 可以给字段起别名，也可以给表起别名
select `StudentNo` as 学号, `StudentName` as 学生姓名 from as s;

-- 函数 Concat(a, b)
select concat('姓名:',StudentName) as 新名字 from student;
```

语法： `select 字段1,字段2,... from 表名`



> 有的时候，列名字不是那么的见名知意。我们起别名；



> 去重 distinct

作用：去除select查询出来的结果中重复的数据，重复的数据只显示一条

```mysql
-- 查询一下有哪些同学参加了考试
SELECT * FROM result;
-- 查询有哪些同学参加了考试
SELECT `StudentNo` FROM result;

-- 发现重复数据
SELECT DISTINCT `StudentNo` FROM result;
```

> 数据库的列(表达式)

```mysql
-- 查询系统的版本
SELECT VERSION() -- 查询系统的版本
SELECT 100*3 -1 AS 计算结果 -- 用来计算
SELECT @@auto_increment_increment -- 查询自增的步长 (变量)

-- 学员考试成绩 + 1分查看
SELECT `StudentNo`,`StudentResult`+1 AS 提分 FROM result;
```

数据库中的表达式: 文本的值，列，Null，函数，计算表达式，系统变量；

`select 表达式 from 表名`

### 4.3 where条件子句

作用：检索数据中`符合条件`的值

> 逻辑运算符

| 运算符     | 语法             | 描述           |
| ------- | -------------- | ------------ |
| and &&  | a and b, a&&b  | 逻辑与，都真为真     |
| or \|\| | a or b, a\|\|b | 逻辑或，一真为真     |
| Not !   | not a  !a      | 逻辑非，真为假，假为真！ |

尽量使用英文字母

```mysql
-- 查询所有的学号成绩
SELECT `StudentNo` AS 编号,`StudentResult` FROM result;

-- 查询成绩80-100的
SELECT `StudentNo` AS 编号,`StudentResult` FROM result 
WHERE `StudentResult`>= 80 AND `StudentResult`<=100;

-- 模糊查询
SELECT `StudentNo`,`StudentResult` FROM result WHERE `StudentResult` BETWEEN 80 AND 100;

SELECT `StudentNo`,`StudentResult` FROM result WHERE NOT `StudentNo`=1000;
```

> 模糊查询： 比较运算符

| 运算符         | 语法                    | 描述                   |
| ----------- | --------------------- | -------------------- |
| IS NULL     | a is null             | 如果操作符为Null，结果为真      |
| is not null | a is not null         | 如果操作符为not null ,结果为真 |
| between     | a between b and c     | 若a在b，c之间结果为真         |
| like        | a like b              | SQL匹配，如果a匹配b，则结果为真   |
| in          | a in (a1, a2, a3,...) | 假设a在a1，a2,a3...结果为真  |

```mysql
-- 模糊查询
SELECT `StudentNo`,`StudentResult` FROM result WHERE `StudentResult` BETWEEN 80 AND 100;

SELECT `StudentNo`,`StudentResult` FROM result WHERE NOT `StudentNo`=1000;

-- -------------------------------------------
-- like 结合 %（代表0到任意个字符）

SELECT `StudentNo`,`StudentName` FROM student 
WHERE `StudentName` LIKE '%西%';

-- 查询名字中间有西字的同学
SELECT `StudentNo`,`StudentName` FROM student 
WHERE `StudentName` LIKE '_西___';

-- -------in---------------------------------
SELECT `StudentNo`,`StudentName` FROM student 
WHERE `StudentNo` IN (1001,1002);

-- 查询在北京的学生
SELECT `StudentNo`,`StudentName` FROM `student`
WHERE `Address` IN ('成都市','北京市');

-- ------null not null -------
-- 查询地址为空的学生 Null
SELECT `StudentNo`,`StudentName` FROM `student`
WHERE address='' OR address='成都市';

-- 查询没有出生日期的同学 为空
SELECT `StudentNo`,`StudentName` FROM `student`
WHERE `BornDate` IS NULL;

```

### 4.4 连表查询

> join对比

![img](https://img-blog.csdnimg.cn/img_convert/f73d4cbe2108b1aa98e26e653c616541.png)

> A的独有+AB的公有
> B的独有+AB的公有
> AB的公有
> A的独有
> B的独有
> A的独有+B的独有+AB的公有
> A的独有+B的独有

| 操作         | 描述                     |
| ---------- | ---------------------- |
| inner join | 如果表中至少有一个匹配，就返回结果      |
| left join  | 即使右表中没有匹配，也会从左表中返回所有的值 |
| right join | 即使左表中没有匹配，也会从右表中返回所有的值 |

```mysql
-- --------联表查询----------------
-- 查询参加了考试的同学（学号，姓名，科目编号，分数）
SELECT * FROM student;
SELECT * FROM result;

/*
思路：1.分析需求，分析查询的字段来自哪些表，（连接查询，确定使用那种连接查询）
2.确定使用哪种连接查询？7种 student,result,subject
    确定一个交叉点，哪些数据是相同的；
    判断的条件：学会表的中 studentNo = 成绩表 studentNo
    
*/

-- join on 连接查询
-- where 等值查询

SELECT s.studentNo,s.studentName,r.SubjectNo,r.StudentResult 
FROM student AS s
INNER JOIN result AS r 
WHERE s.studentNo=r.studentNo
AND r.studentResult > 60;

-- ---------right join---------------------
SELECT s.studentNo,s.studentName,r.SubjectNo,r.StudentResult 
FROM student s
RIGHT JOIN result r 
ON s.studentNo=r.studentNo;

-- ---------left join --------------------
SELECT s.studentNo,s.studentName,r.SubjectNo,r.StudentResult 
FROM student s
LEFT JOIN result r 
ON s.studentNo=r.studentNo;

-- 查询缺考的同学
ALTER TABLE `result` MODIFY `StudentResult` INT COMMENT '考试成绩';

SELECT s.studentNo,s.studentName,r.SubjectNo,r.StudentResult 
FROM student s 
LEFT JOIN result r 
ON s.studentNo=r.studentNo 
WHERE StudentResult IS NULL;

-- 思考题（查询参加了考试的同学信息，学号，学生姓名，科目名，分数）
SELECT s.studentNo,s.studentName,su.SubjectName,r.StudentResult 
FROM student s 
RIGHT JOIN result r 
ON s.studentNo=r.studentNo 
INNER JOIN `subject` su 
ON r.subjectNo=su.subjectNo 
WHERE r.StudentResult IS NOT NULL;

-- 我要查询哪些数据 select 。。
-- 从那几个表中查 from 表名 XXX join 连接的表 on 交叉条件
-- 假设存在一种多张表查询，慢慢来，先查询两张表然后再慢慢的增加

-- from a left join b
-- from a right join b
```

> 自连接

自己的表和自己的表连接，核心：一张表拆为两张一样的表；

| categoryid | categoryName |
| ---------- | ------------ |
| 2          | 信息技术         |
| 3          | 软件开发         |
| 5          | 美术设计         |



子类

| pid  | categoryid | categoryName |
| ---- | ---------- | ------------ |
| 3    | 4          | 数据库          |
| 2    | 8          | 办公信息         |
| 3    | 6          | web开发        |
| 5    | 7          | 美术设计         |

操作：查询父类对应的子类关系

| 父类           | 子类           |
| ------------ | ------------ |
| categoryName | categoryName |
| 信息技术         | 办公信息         |
| 软件开发         | 数据库丶web开发    |
| 美术设计         | 美术设计         |

多表联表查询：

```mysql
-- 查询了参加  数据结构-1 考试的同学信息：学号，学生姓名，科目名，分数）
SELECT s.`StudentNo`,`StudentName`,r.`SubjectNo`,`StudentResult` 
FROM `student` s 
INNER JOIN `result` r 
ON s.`StudentNo`=r.`StudentNo` 
INNER JOIN `subject` sub 
ON r.`SubjectNo`=sub.`SubjectNo` 
WHERE sub.`SubjectName`='数据结构-1';
```

### 4.5 分页和排序

> 排序

```mysql
-- 查询了参加  数据结构-1 考试的同学信息：学号，学生姓名，科目名，分数）
SELECT s.`StudentNo`,`StudentName`,r.`SubjectNo`,`StudentResult` 
FROM `student` s 
INNER JOIN `result` r 
ON s.`StudentNo`=r.`StudentNo` 
INNER JOIN `subject` sub 
ON r.`SubjectNo`=sub.`SubjectNo` 
WHERE sub.`SubjectName`='数据结构-1' 
ORDER BY StudentResult DESC;
```



> 分页

```mysql
-- 100万？
-- 为什么要分页？
-- 缓解数据库压力，给人的体验更好，瀑布流
-- 分页，每页显示五条数据,limit 其实值页，页面大小
SELECT s.`StudentNo`,`StudentName`,r.`SubjectNo`,`StudentResult` 
FROM `student` s 
INNER JOIN `result` r 
ON s.`StudentNo`=r.`StudentNo` 
INNER JOIN `subject` sub 
ON r.`SubjectNo`=sub.`SubjectNo` 
WHERE sub.`SubjectName`='数据结构-1' 
ORDER BY StudentResult DESC 
LIMIT 0,5 -- 1,5条数据

-- 第一页， limit 0, 5
-- 第二页， limit 5, 5
-- 第三页， limit 10, 5
-- 第n页，  limit （n-1）* pagesize, pagesize
-- [pageSize: 页面大小， n是当前页，，  （n-1）* pagesize 起始值]
-- 【数据总数/页面大小 = 总页数】
```

语法： `limit（查询其实下标，pagesize） `



### 4.6 子查询

where (值是固定的, 假如这个值是计算出来的)

本质：`在where语句中嵌套一个子查询语句`

```mysql
where (select * from)
```

```mysql
-- -------------where---------------
-- 1.查询数据库结构-1的所有考试结果（学号，科目编号，成绩），降序排序
-- 方式一：使用连接查询
SELECT `StudentNo`,`SubjectName`,`StudentResult` 
FROM `result` r 
INNER JOIN `subject` sub 
ON sub.`subjectNo`=r.`subjectNo` 
WHERE `subjectName` = '数据结构-1' 
ORDER BY `StudentResult` DESC;

-- 方式二：使用子查询(由里及外)
SELECT `StudentNo`,`SubjectNo`,`StudentResult` 
FROM `result` 
WHERE `subjectNo` = (
SELECT `SubjectNo`  
FROM `subject` 
WHERE `SubjectName`='数据结构-1' 
)
ORDER BY `StudentResult` DESC;

-- 查询所有数据结构-1 的学生学号
SELECT `SubjectNo`  
FROM `subject` 
WHERE `SubjectName`='数据结构-1' 

-- 分数不小于80分的学生的学号和姓名
SELECT DISTINCT s.`StudentNo`,`StudentName` 
FROM `student` s 
INNER JOIN `result` r 
ON r.`StudentNo` = s.`StudentNo` 
WHERE `StudentResult` >= 80 

-- 在这个基础上增加一个科目，高等数学-2
SELECT DISTINCT s.`StudentNo`,`StudentName` 
FROM `student` s 
INNER JOIN `result` r 
ON r.`StudentNo` = s.`StudentNo` 
WHERE `StudentResult` >= 80 
AND `SubjectNo` = (
SELECT `SubjectNo` 
FROM `subject` 
WHERE `SubjectName` = '高等数学-2'
)

-- 查询课程为 高等数学-2 且分数不小于80 的同学的学号和姓名
SELECT s.`StudentNo`,`StudentName` 
FROM `student` s 
INNER JOIN result r 
ON s.`StudentNo`=r.`StudentNo` 
INNER JOIN `subject` sub 
ON r.`SubjectNo`=sub.`SubjectNo` 
WHERE `SubjectName` ='高等数学-2' 
AND StudentResult >= 80

-- 改造（由里及外）
SELECT `StudentNo`,`StudentName` 
FROM `student` 
WHERE `StudentNo` IN (
SELECT `StudentNo` FROM `result` WHERE `Studentresult`>=80 
AND `subjectNo` = (
        SELECT `subjectNo` FROM `subject` WHERE `SubjectName`='高等数学-2'
    )
)
```



## 5.MySQL函数

官网：https://www.mysql.com/

### 5.1 常用函数

```mysql
-- ---------------常用函数--------
-- 数学运算
SELECT ABS(-8) -- 绝对值
SELECT CEILING(9.4) -- 向上取整
SELECT FLOOR(11.4) -- 向下取整
SELECT RAND() -- 返回一个 0~1 之间的随机数
SELECT SIGN(123) -- 判断一个数的符号， 负数返回-1 ，正数返回 1

-- 字符串函数
SELECT CHAR_LENGTH('即使再小的帆也能远航') -- 字符串长度
SELECT CONCAT('我','爱','你们') -- 拼接字符串
SELECT INSERT('我爱编程helloworld',1,2,'超级热爱') -- 查询，从某个位置开始替换某个长度
SELECT LOWER('UDSAd') -- 小写字母
SELECT UPPER('KuangShen') -- 大写字母
SELECT INSTR('kuangshen','h') -- 返回第一次出现的子串的索引
SELECT REPLACE('狂神说坚持就能成功','坚持','努力') -- 替换出现的指定字符串

SELECT SUBSTR('狂神说坚持就能成功啊', 4,6) AS a -- 返回指定的子字符串(源字符串,截取的位置，截取的长度)
SELECT REVERSE('狂神说坚持就能成功啊') -- 反转字符串

-- 查询姓周的同学,名字 邹
SELECT REPLACE(`studentname`,'王','邹') AS 名字 FROM student 
WHERE studentname LIKE '王%';

-- 时间和日期
SELECT CURRENT_DATE() -- 获取当前日期
SELECT CURRENT_TIME() -- 获取当前时间
SELECT CURDATE() -- 获取当前日期
SELECT NOW() -- 获取当前时间
SELECT LOCALTIME() -- 本地时间
SELECT SYSDATE() AS 弥补 -- 系统十几件

SELECT YEAR(NOW());
SELECT MONTH(NOW());
SELECT DAY(NOW());
SELECT HOUR(NOW());
SELECT MINUTE(NOW());
SELECT SECOND(NOW());

-- 系统
SELECT SYSTEM_USER();
SELECT USER();
SELECT VERSION();
```



### 5.2 聚合函数（常用）



| 函数名称    | 描述   |
| ------- | ---- |
| count() | 计数   |
| sum()   | 求和   |
| avg()   | 平均值  |
| max()   | 最大值  |
| min()   | 最小值  |
| ...     | ...  |

```mysql
-- ---------------常用函数--------
-- 数学运算
SELECT ABS(-8) -- 绝对值
SELECT CEILING(9.4) -- 向上取整
SELECT FLOOR(11.4) -- 向下取整
SELECT RAND() -- 返回一个 0~1 之间的随机数
SELECT SIGN(123) -- 判断一个数的符号， 负数返回-1 ，正数返回 1

-- 字符串函数
SELECT CHAR_LENGTH('即使再小的帆也能远航') -- 字符串长度
SELECT CONCAT('我','爱','你们') -- 拼接字符串
SELECT INSERT('我爱编程helloworld',1,2,'超级热爱') -- 查询，从某个位置开始替换某个长度
SELECT LOWER('UDSAd') -- 小写字母
SELECT UPPER('KuangShen') -- 大写字母
SELECT INSTR('kuangshen','h') -- 返回第一次出现的子串的索引
SELECT REPLACE('狂神说坚持就能成功','坚持','努力') -- 替换出现的指定字符串

SELECT SUBSTR('狂神说坚持就能成功啊', 4,6) AS a -- 返回指定的子字符串(源字符串,截取的位置，截取的长度)
SELECT REVERSE('狂神说坚持就能成功啊') -- 反转字符串

-- 查询姓周的同学,名字 邹
SELECT REPLACE(`studentname`,'王','邹') AS 名字 FROM student 
WHERE studentname LIKE '王%';

-- 时间和日期
SELECT CURRENT_DATE() -- 获取当前日期
SELECT CURRENT_TIME() -- 获取当前时间
SELECT CURDATE() -- 获取当前日期
SELECT NOW() -- 获取当前时间
SELECT LOCALTIME() -- 本地时间
SELECT SYSDATE() AS 弥补 -- 系统十几件

SELECT YEAR(NOW());
SELECT MONTH(NOW());
SELECT DAY(NOW());
SELECT HOUR(NOW());
SELECT MINUTE(NOW());
SELECT SECOND(NOW());

-- 系统
SELECT SYSTEM_USER();
SELECT USER();
SELECT VERSION();

-- ===========聚合函数===========
-- 都能够做统计 表中的数据(想查询一个表中有多少个记录就使用count())
SELECT COUNT(studentname) FROM student; -- count(指定列),会忽略所有的null值
SELECT COUNT(1) FROM student; -- count(1), 不会忽略null值,本质计算行数
SELECT COUNT(*) FROM student; -- count(*), 不会忽略null值，本质计算行数

SELECT SUM(`StudentResult`) AS 综合 FROM result;
SELECT AVG(`StudentResult`) AS 平均分 FROM result;
SELECT MAX(`StudentResult`) AS 最高分 FROM result;
SELECT MIN(`StudentResult`) AS 最低分 FROM result;


-- 查询不同课程的平均分，最高分，最低分
-- 核心：（根据不同的课程分组）
-- 通过什么字段来分组
SELECT sub.subjectName,AVG(studentresult),MAX(studentresult),MIN(studentresult) 
FROM `result` r 
INNER JOIN `subject` sub 
ON r.`subjectNo`=sub.`subjectNo` 
GROUP BY r.subjectNo 
HAVING AVG(studentresult)>80;
```



### 5.3 数据库级别的MD5加密（扩展）

>  什么是md5

主要增强算法复杂度和不可逆行；

MD5不可逆，具体的值得md5是一样的

MD5 破解网站的原理，背后有一个字典，MD5 加密后的值，加密的值；

```mysql
-- ------------测试MD5 加密-----------------
CREATE TABLE `testmd5`(
    `id` INT NOT NULL,
    `name` VARCHAR(20) NOT NULL,
    `pwd` VARCHAR(50) NOT NULL,
    PRIMARY KEY(`id`)
)ENGINE=INNODB DEFAULT CHARSET=UTF8MB4;

-- 明文密码
INSERT INTO `testmd5` VALUES(1,'zhangsan','123456'),
(2,'hello','123456'),
(3,'wangwu','123456')

-- 加密
UPDATE `testmd5` SET pwd=MD5(pwd) 
WHERE id=1

UPDATE `testmd5` SET pwd=MD5(pwd) WHERE id != 1 -- 加密全部的密码

-- 插入的时候加密
INSERT INTO `testmd5` VALUES(4,'xiaoming',MD5('123456'))

-- 如何校验:123456,将用户传递进来的密码，进行md5加密，然后对比加密后的值
SELECT * FROM `testmd5` 
WHERE `name`='xiaoming' 
AND pwd=MD5('123456');
```

select 总结，，，顺序很重要：

>select 去重 要查询的字段 from 表
>
>xxx join 要连接的表 on 等值判断 
>
>where （具体的值吗，子查询语句）
>
>group by (通过哪个字段来分组) 
>
>Having （过滤分组后的信息，条件和where是一样的，位置不同）
>
>Order by （通过哪个字段排序）【升序和降序】
>
>limit startindex, pagesize
>
>业务层面：
>查询：跨表，跨数据库



---

## 6.事务

### 6.1 什么是事务

==要么都成功，要么都失败==

---

1.sql执行 A 给 B 转账A1000 -->B 200 (B200;

将一组sql放在一个批次去执行中去执行~

> 事务原则： ACID原则 原子性， 一致性，隔离性，持久性。

**原子性**

事务的整个过程如原子操作一样，最终要么全部成功，或者全部失败，这个原子性是从最终结果来看的，从最终结果来看这个过程是不可分割的。

**一致性**

一个事务必须使数据库从一个一致性状态变换到另一个一致性状态。

**隔离性**

一个事务的执行不能被其他事务干扰。即一个事务内部的操作及使用的数据对并发的其他事务是隔离的，并发执行的各个事务之间不能互相干扰。

- 这里先提一下事务的隔离级别：
  - 读未提交：read uncommitted
  - 读已提交：read committed
  - 可重复读：repeatable read
  - 串行化：serializable

**持久性**

一个事务一旦提交，他对数据库中数据的改变就应该是永久性的。当事务提交之后，数据会持久化到硬盘，修改是永久性的。



==隔离性导致的问题==

1. 脏读、不可重复读和幻读


事务的隔离级别：

| 隔离级别  | 脏读   | 不可重复读 | 幻读   |
| ----- | ---- | ----- | ---- |
| 读 未提交 | 可能   | 可能    | 可能   |
| 读 已提交 | 不可能  | 可能    | 可能   |
| 可重复读  | 不可能  | 不可能   | 可能   |
| 可串行化  | 不可能  | 不可能   | 不可能  |

> 执行事务

`mysql自动开启事务自动提交的`

```mysql
-- mysql 是默认开启事务自动提交的
SET autocommit = 0 /*关闭*/
SET autocommit = 1 /*开启（磨人的）*/

-- ==============================
-- 手动处理事务
SET autocommit = 0
-- 事务开启
START TRANSACTION -- 标记一个事务的开始，从这个之后的sql 都在同一个事务内

INSERT xx
INSERT xx
-- 提交：持久化 (成功！)
COMMIT
-- 回滚：回到的原来的样子（失败！）
ROLLBACK
-- 事务结束
SET autocommit = 1 -- 开启自动提交

-- 了解
SAVEPOINT -- 保存点名 -- 设置一个事务的保存点
ROLLBACK TO SAVEPOINT -- 回滚到保存点
RELEASE SAVEPOINT -- 撤销保存点

-- 转账
CREATE DATABASE shop 
CHARSET=UTF8 
COLLATE utf8_general_ci;
USE shop;

CREATE TABLE `account` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(30) NOT NULL,
    `money` DECIMAL(9,2) NOT NULL,
    PRIMARY KEY (`id`)
)ENGINE=INNODB DEFAULT CHARSET=UTF8MB4;

-- 模拟转账：事务
SET autocommit = 0; -- 关闭自动提交
START TRANSACTION; -- 开启事务
UPDATE account SET money=money-500 
WHERE `name` = 'wj';
UPDATE `account`SET money=money+500 
WHERE `name` = 'zs';

COMMIT; -- 提交事务
ROLLBACK; -- 回滚

SET autocommit = 1; -- 恢复默认值
```



## 7.索引

> [索引](https://baike.baidu.com/item/%E7%B4%A2%E5%BC%95/5716853)是对[数据库](https://baike.baidu.com/item/%E6%95%B0%E6%8D%AE%E5%BA%93/103728)表中一列或多列的值进行排序的一种结构，使用索引可快速访问数据库表中的特定信息

### 7.1索引的分类 

> 在一个表中，主键索引只有一个，唯一索引可以有多个；

- 主键索引 （primary key）
  - 唯一标识，主键不可重复，只能用一个列作为主键
- 唯一索引 （unique）
  - 避免的重复的列出现，唯一索引可以重复，多个列都可以标识位 唯一索引
- 常规索引 （keyindex)
  - 默认的，index,key关键字设置
- 全文索引 （FullText）
  - 在特定的数据库引擎下才有，MyISAM
  - 快速定位数据

基础语法：

### 7.2 测试索引

```mysql
-- 索引的使用
-- 1.在创建表的时候给字段增加索引
-- 2.创建完毕后增加索引

-- 显示所有的索引信息
USE schooldql;
SHOW INDEX 
FROM `student`;

-- 增加一个索引
ALTER TABLE schooldql.`student` ADD FULLTEXT INDEX `studentName`(`studentName`);

-- EXPLAIN 分析sql执行的状况
EXPLAIN SELECT * FROM `student`; -- 非全文索引 

EXPLAIN SELECT * FROM schooldql.`student` 
WHERE MATCH(`StudentName`) 
AGAINST('王');


CREATE TABLE `app_user`(
    `id` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(50) DEFAULT '' COMMENT '用户昵称',
    `email` VARCHAR(50) NOT NULL COMMENT '用户邮箱',
    `phone` VARCHAR(20) DEFAULT '' COMMENT '手机号',
    `gender` TINYINT(4) DEFAULT '0' COMMENT '性别（0:男 1:女）',
    `password` VARCHAR(100) NOT NULL COMMENT '密码',
    `age` TINYINT(4) DEFAULT '0' COMMENT '年龄',
    `create_time` DATETIME DEFAULT CURRENT_TIMESTAMP,
    `update_time` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8mb4 COMMENT='app用户表';

USE `schooldql`;
-- 插入 100万数据,1 min 14 sec----
DELIMITER $$  -- 写函数之前，必须要写，标志
CREATE FUNCTION mock_data()
RETURNS INT
DETERMINISTIC -- 
BEGIN
  DECLARE num INT DEFAULT 1000000;
  DECLARE i INT DEFAULT 0;
  WHILE i<num DO -- 插入语句
    INSERT INTO app_user(`name`,`email`,`phone`,`gender`,`password`,`age`) VALUES(CONCAT('用户',i),'123456@qq.com',CONCAT('18',FLOOR(RAND()*((999999999-100000000)+100000000))),FLOOR(RAND()*2), UUID(), FLOOR(RAND()*100));
    SET i = i+1;
  END WHILE;
  RETURN i;
END;
-- 创建100万数据
SELECT mock_data();

-- 0.794 sec,0.527 sec->> 创建索引0.034 sec
SELECT * 
FROM app_user 
WHERE `name`='用户99999';

-- 0.002 sec
EXPLAIN SELECT * 
FROM app_user 
WHERE `name`='用户9999';

-- id_表名_字段名
CREATE INDEX id_app_user_name 
ON app_user(`name`);

-- 创建初始数据
INSERT INTO app_user(`name`,`email`,`phone`,`gender`,`password`,`age`) 
VALUES(CONCAT('用户',1),'123456@qq.com'
,CONCAT('18',FLOOR(RAND()*((999999999-100000000)+100000000)))
,FLOOR(RAND()*2), UUID(), FLOOR(RAND()*100))

TRUNCATE app_user; -- 清除表
```

有索引和没有索引的区别：

**索引在小数据量下没有啥用，数据量大的时候有效果，而且很明显**

### 7.3 索引原则

- 索引不是越多越好
- 不要对进程变动数据加索引
- 小数据量的表不需要加索引
- 索引一般加在常用来查询的字段上！

> 索引的数据结构

hash 类型的索引!!!!

Btree：InnoDB默认的索引数据结构

[学习索引](http://blog.codinglabs.org/articles/theory-of-mysql-index.html)

## 8.数据库备份

为什么要备份：

- 保证重要的数据不丢失
- 数据转义 A---> B;

Mysql 数据库备份的方式

- 直接拷贝数据库备份
- 在sqlyog这种可视化工具中手动导出
  - 在想要导出的表或者库中,有件，选择备份或导出
  - ​
- 使用命令行导出 mysqldump 命令行使用

> 公式：mysqldump -h 主机 -u 用户名 -p 密码 数据库 表名 > 物理磁盘位置/文件名

> 公式：mysqldump -h 主机 -u 用户名 -p 密码 数据库 表1 表2 表3  > 物理磁盘位置/文件名
```mysql
mysqldump -hlocalhost -uroot -p123456 school student >D:/a.sql

# 导入
# 登录的情况下，切换到指定的数据库
source 备份文件
source d:/a.sql

mysql -uroot -p密码 库名 < 备份文件

```

假设你要备份数据库，防止数据丢失

把数据库交朋友！sql文件给别人即可！



## 9.权限管理

> sqlyog数据库添加用户

sql命令：

用户表：mysql.user

本质：对这张表进行增删改查

```mysql
-- 创建用户
CREATE USER wangjie IDENTIFIED BY '123456';

-- 修改密码 （修改当前用户密码）
SET PASSWORD = PASSWORD('111111');
```

```mysql
`schooldql`-- 创建用户
CREATE USER wangjie IDENTIFIED BY '123456';

-- 修改密码 （修改当前用户密码）
SET PASSWORD = PASSWORD('111111');

-- 修改密码（修改指定用户密码）
SET PASSWORD FOR wangjie = PASSWORD('111111');

-- 重命名 RENAME USER 原名字 TO 新名字;
RENAME USER wangjie TO wangjie9;

-- 用户授予 all PRIVILEGES 全部权限,库，表
-- ALL PRIVILEGES 除了给别人授权，其他都能干
GRANT ALL PRIVILEGES ON *.* TO wangjie9;

-- 查询权限
SHOW GRANTS FOR wangjie9 -- 查看指定用户的权限
SHOW GRANTS FOR root@localhost; -- 查看root用户权限

-- root用户权限；
GRANT ALL PRIVILEGES ON *.* TO 'root'@'localhost' WITH GRANT OPTION;

-- 撤销权限,哪些权限，在哪个库撤销，给谁撤销
REVOKE ALL PRIVILEGES ON *.* FOR wangjie9;

-- 删除用户
DROP USER wangjie9;
```



## 10.数据库的归约，三大范式

### 10.1 为什么需要设计

==当数据库比较复杂的时候，我们就需要设计了==

糟糕的数据库设计：

- 数据冗余，浪费空间
- 数据库插入和删除都会麻烦丶异常【屏蔽使用物理外键】
- 程序的性能差



**良好的数据库设计：**

- 节省内存空间
- 保证数据库的完整性
- 方便我们开发系统

**软件开发中，关于数据库的设计**

- 分析需求：分析业务和需要处理的数据库的需求
- 概要设计：设计关系图E-R图

**设计数据库的步骤：（个人博客）**

- 收集信息，分析需求
  - 用户表（用户登录注销，用户的个人信息，写博客，创建分类）
  - 分类表（文章分类，谁创建的）
  - 文章表（文章的信息）
  - 友联表（友联信息）
  - 自定义表（系统信息，某个关键字，或者一些主字段） key:value
- 标识实体（把需求落地到每个字段）
- 标识实体之间的关系
  - 写博客：user -> blog
  - 创建分类：user -> category
  - 关注：user -> user
  - 友链：links
  - 评论：user-user-blog

### 10.2 为什么需要数据规范化？

- 信息重复
- 更新异常
- 插入异常

  - 无法正常显示信息
- 删除异常
  - 丢失有效的信息

> 三大范式

1. 第一范式：要求数据库的每一列都是不可分割的原子数据项

**原子性：保证每一列不可再分**



2. 第二范式： 满足第一范式前提

非码属性必须完全依赖于候选码，第二范式需要确保数据库表中的每一列都和主键相关，而不能只和主键的某一部分相关，，**每张表都描述一件事情;**

3. 第三范式的前提：满足第一范式和第二范式

**确保数据表中的每一列数据都和主键直接相关，而不能间接相关**

（规范数据库的设计）



**规范性和性能问题？**

关联查询的表不得超过三张表

- 考虑商业化的需求和目标（成本，用户体验）
- 在规范性能问题的时候，需要适当的考虑一下规范性！
- 故意给某表增加一些冗余字段，（多表查询中变为单表查询）
- 故意增加一些计算列（从大数据量降低为小数据量的查询：索引）



## 11.JDBC(重点)

### 11.1 数据库驱动

驱动：声卡丶显卡

应用程勋 -》jdbc（开发人员）-》mysql驱动（数据库厂商）-》数据库（数据库厂商），，，，交互流程

我们的程序会通过数据库驱动，和数据库打交道

### 11.2 JDBC

SUN公司为了简化开发人员（对数据库的统一）操作，提供一个（Java操作数据库的）规范，俗称JDBC，这些规范的实现由具体厂商去做！

对于开发人员，只需要学习JDBC即可！

java.sql

javax.sql

还需要导入一个数据库驱动包



### 11.3 第一个JDBC的程序

1.创建一个普通项目

2.新建一个lib目录，导入数据库驱动

as a library

==接着才算是作为一个lib文件夹==

3.编写测试代码

![JDBC概述](D:\3_helloworld\typora_images\QQ截图20220601223332.png)

```java
package com.wangjie.lesson01;

import java.sql.*;

public class JdbcFirstDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1.加载驱动
//        Class.forName("com.mysql.jdbc.Driver"); // 固定写法，加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver"); // 固定写法，加载驱动

        // 2.用户信息和url
        String url = "jdbc:mysql://localhost:3306/jdbcstudy?useUnicode=true&characterEncoding=utf8&&useSSL=true";
        String username = "root";
        String password="123456";

        // 3.连接成功，数据库对象 Connection 代表数据库
        Connection connection = DriverManager.getConnection(url, username, password);

        // 4.执行SQL的对象 Statement 执行SQL对象
        Statement statement = connection.createStatement();

        // 5.执行SQL的对象 去执行SQL，可能存在结果，查看返回结果
        String sql = "SELECT * from users";

        ResultSet resultSet = statement.executeQuery(sql); // 返回的结果集，结果集中封装了我们全部的查询出来的结果
        while (resultSet.next()){
            System.out.println("id="+resultSet.getObject("id"));
            System.out.println("name="+resultSet.getObject("name"));
            System.out.println("pwd="+resultSet.getObject("password"));
            System.out.println("email="+resultSet.getObject("email"));
            System.out.println("birthday="+resultSet.getObject("birthday"));
        }
        // 6.释放连接
        resultSet.close();
        statement.close();
        connection.close();
    }
}

```

步骤总结：

1.加载驱动

2.连接数据库DriverManager

3.获得执行SQL的对象 statement

4.获得返回的结果集

5.释放连接



> DriverManager

```java
// DriverManager.registerDriver(new Driver()); // 这是原来的写法
Class.forName("com.mysql.cj.jdbc.Driver"); // 固定写法，加载驱动
Connection connection = DriverManager.getConnection(url, username, password);

// connection 代表数据库
// 设置自动提交、事务回滚
connection.commit();
connection.setAutoCommit();
connection.rollback();

```

> URL

```java
String url = "jdbc:mysql://localhost:3306/jdbcstudy?useUnicode=true&characterEncoding=utf8&&useSSL=true";

//jdbc:mysql://localhost:3306/数据库名?参数1&参数2&参数3
//协议://主机地址:端口号/数据库名?参数1&参数2&参数3
// oracle --1521
//jdbc:oracle:thin:@localhost:1521:sid
```

> statement 执行sql的类（对象）

**和connection.prepareStatement();有区别**

```java
Statement statement = connection.createStatement();
statement.executeQuery(); // 查询操作返回 resultset
statement.execute(); // 执行任何SQL，效率稍低
statement.executeUpdate(); // 更新丶插入丶删除丶都是用这个，返回一个受影响的行数
statement.executeBatch(); // 批量执行SQL
```



> ResultSet 查询的结果集：封装了所有的查询结果

1.获得指定的`ResultSet.getInt` ,`ResultSet.getString`

2.不清楚什么类型`ResultSet.getObject`

遍历，指针：

```java
resultSet.beforeFirst(); // 光标移动到最前面
resultSet.afterLast(); // 光标移动到最后面
resultSet.next(); // 移动到下一个数据
resultSet.previous(); // 移动到前一行
resultSet.absolute(); // 移动到指定行
```



> 释放资源

```java
resultSet.close();
statement.close();
connection.close();
```



### 11.4 statement对象

==jdbc中的statement对象用于向数据库发送sql语句，想完成对数据库的增删查改，只需要通过这个对象向数据库发送增删改查的语句即可==

- executeQuery
- executeUpdate




> 代码实现

1.提取工具类

```java
package com.wangjie.lesson02.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JdbcUtils {
    private static String driver = null; // 提升作用域
    private static String url = null; // 提升作用域
    private static String username = null; // 提升作用域
    private static String password = null; // 提升作用域

    static {
        try {
            InputStream in = JdbcUtils.class.getClassLoader().getResourceAsStream("db.properties");
            Properties properties = new Properties();
            properties.load(in);

            driver = properties.getProperty("driver");
            url = properties.getProperty("url");
            username = properties.getProperty("username");
            password = properties.getProperty("password");

            // 1.驱动只要加载一次
            Class.forName(driver);
        }
         catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 获取连接
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

    // 释放连接资源
    public static void release(Connection conn, Statement st, ResultSet rs){
        if (rs!=null){
            try{
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (st!=null){
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn!=null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}

```



2.编写增删改查

增：

```java
package com.wangjie.lesson02.utils;

import com.wangjie.lesson01.JdbcTest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestInsert {
    public static void main(String[] args) {

        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            conn = JdbcUtils.getConnection(); // 获取数据库连接
            st = conn.createStatement();
            String sql = "INSERT INTO users(`id`,`NAME`,`PASSWORD`,`email`,`birthday`)" +
                    "VALUES(4,'kuangshen','123245','2460665525@qq.com','2022-6-2')";
            int i = st.executeUpdate(sql);
            if (i>0){
                System.out.println("插入成功!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.release(conn,st,rs);
        }

    }
}

```



删除：

```java
package com.wangjie.lesson02.utils;

import com.wangjie.lesson01.JdbcTest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDelete {
    public static void main(String[] args) {

        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            conn = JdbcUtils.getConnection();
            st = conn.createStatement();

            String sql = "Delete from users where id = 4";

            int i = st.executeUpdate(sql);
            if (i>0) {
                System.out.println("删除成功！");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.release(conn,st,rs);
        }

    }
}

```

更新

```java
package com.wangjie.lesson02.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestUpdate {
    public static void main(String[] args) {

        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            conn = JdbcUtils.getConnection();
            st = conn.createStatement();

            String sql = "UPDATE users SET `NAME`='kuangshen',`email`='12324@qq.com' WHERE id=1;";

            int i = st.executeUpdate(sql);
            if (i>0) {
                System.out.println("更新成功！");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.release(conn,st,rs);
        }

    }
}

```

3.查询

```java
package com.wangjie.lesson02.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestSelect {
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            conn = JdbcUtils.getConnection();
            st = conn.createStatement();

            // SQL
            String sql = "select * from users where id = 1";
            rs = st.executeQuery(sql); // 查询完毕会返回一个结果集

            while (rs.next()){
                System.out.println(rs.getString("NAME"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtils.release(conn,st,rs);
        }
    }
}

```


> SQL注入的问题

sql存在泄漏，会被攻击导致数据泄漏

```java
login(" 'or '1=1", "123456")
```

sql回去拼接SQL语句然后去注入新的查询内容;



### 11.5 PreparedStatement对象

PreparedStatement可以防止SQL注入。效率更好！

1.新增

2.删除

3.更新

4.查询

略......



### 11.6 IDEA连接数据库


> 1.mysql实现读写分离

1.一台mysql写，2台mysql读，实现读写分离
2.用户来调用redis缓存

> 2.Memcached(缓存)+mysql + 垂直拆分

网站80%的情况都是在读，每次都要去查询数据库的话比较麻烦，缓存就是用来做中间存储间的。

发展过程L:优化数据结构和索引--》文件缓存（IO）--》Memcached（当时最热门的技术！）

tips：你们的竞争对手并不是人才，而是那些图安稳又踏实（老实人）

>3.分库分表+水平拆分+mysql集群

实现集群，这样后端也会更加清晰

**（本质：数据库的读和写）；**

MyISAM：表锁（对这个表锁住，影响效率）

然后Innodb：是对某一行进行锁定；行锁

> 4.当前时代

BSON是JSON的二进制形式；

> 5.为什么药学NoSQL

泛指非关系型数据库，

表格，行，列（POI技术）;

很多的数据类型用户个人信息，社交网络，地理位置，这邪恶数据类型的存储不需要一个固定的格式！不需要多月的操作就可以横向扩展！Map<String, Object>使用键值对来控制！

> NoSQL特点

解耦：

1.方便拓展（数据之间没有关系，很好拓展！）

2.大数据量高性能（Redis一秒写8万次，读取11万次！）

3.数据类型是多样性的（不需要事先设计数据库），随取随用

```
传统的 RDBMS
- 结构化组织
- SQL
- 数据和关系都存在单独的表中
- 严格一致性
- 基础的事务
```

```
Nosql
- 不仅仅是数据
- 没有固定的查询语言
- 键值对存储，列存储，文档存储，图形数据库（社交关系）
- 最终一致性
- CAP定理 和 BASE （异地多服！）
```

> 3V： + 3高

大数据时代的3V：主要是描述问题

1.海量Volume，多样~(Volume)，实时~

1.高并发，高可扩展，高性能

真正的公司中的实践：Nosql+RDBMS

---

技术急不得，越是慢慢学，才能越扎实！

开源才是技术的王道！

**任何一家互联网的公司，都不可能只是简简单单让用户能用就好!**

大量公司做的都是相同的业务；（竞品协议）

随着这样的竞争，业务是越来越完善，然后对于开发者的要求也是越来越高！

```
# 1.商品的基本信息
名称/价格/商家信息；
关系型数据库就可以解决了！mysql。oracle
淘宝内部的MYSQL不是大家用的MYsql
# 2.商品的描述，评论
文档行数据库中
# 3.图片
分布式文件系统 FastDFS
- 淘宝自己的额 TFS
- Google的 GFS
- Hadoop HDFS
- 阿里云 oss
# 4.商品的关键词（搜索）
- solr elasticsearch
- ISerach： 多隆
# 5.商品热门的波段信息
- 内存数据库
- Redis Tair/Memache
# 6.商品交易，外部支付接口
- 三方应用
```

- 数据类型太多了！
- 数据源繁多，经常重构
- 数据要改造，重构

---

# NoSQL的四大分类：

## KV键值对：

- 新浪： redis

- 美团 Redis + Tair

- 阿里百度：Redis + memecache

## 文档行数据库

- MongoDB

  - MongoDB是一个基于分布式文件存储数据库，C++编写的

  - MongoDB是一个介于关系型数据库和非关系型数据中中间的产品，功能比较丰富，最想关系型数据库了

    




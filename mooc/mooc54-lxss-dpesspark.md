[toc]
# dailylog
## 20200514
 - [ ] esconfig in docker : install plugin
 - [ ] esconfig in docker :自定义分词器 同义词
 - [ ] esconfig
# 第1章 导学
##  1-1 导学
##  1-2 ***学前必读***（助你平稳踩坑，畅学无忧，课程学习与解决问题指南）
##  1-3 你真的会问问题吗？
# 第2章 项目设计【项目需求到技术方案的完美执行过程】
##  2-1 项目设计---业务需求
##  2-2 项目设计---技术分解&模块设计
##  2-3 阶段小结
# 第3章 项目基础搭建【业务系统之基础能力】
##  3-1 开发工具介绍
> mysql:5.6
##  3-2 springboot web搭建
service: interface + impl
##  3-3 service及mybatis接入（上）
druid: 管理数据库连接池
##  3-4 service及mybatis接入（下）
自动生成mybatis文件
##  3-5 通用返回和异常处理
面向切面的通用异常处理器
##  3-6 页面请求资源处理
模板文件中的变量替换
##  3-7 【阶段总结】项目基础搭建总结
# 第4章 基础服务之用户，运营，商户能力建设【业务系统主体实现】
##  4-1 用户服务搭建（上）
用户登录态的管理
事务性,数据闭环
##  4-2 用户服务搭建（下）
gochar: static files
##  4-3 用户模块前端页面接入
##  4-4 运营后台之metronic模版介绍
##  4-5 运营后台管理员模块（上）
##  4-6 运营后台管理员模块（下）
统一的登录状态管理
##  4-7 运营后台首页模块
复用一套代码区块
##  4-8 商家入驻流程（1）
##  4-9 商家入驻流程（2）
##  4-10 商家入驻流程（3）
##  4-11 商家入驻流程（4）
##  4-12 【阶段总结】基础服务之用户，运营，商户能力建设总结
# 第5章 基础服务之品类，门店能力建设【业务系统主体实现】
##  5-1 品类管理服务（上）
##  5-2 品类管理服务（中）
##  5-3 品类管理服务（下）
##  5-4 门店管理服务（上）
##  5-5 门店管理服务（中）
##  5-6 门店管理服务（下）
##  5-7 【阶段总结】基础服务之品类，门店能力建设总结
##  5-8 【勤于思考，夯实学习成果】基础服务之品类，门店能力建设习题
# 第6章 点评门店搜索推荐1.0时代【搜索业务初体验】
##  6-1 门店推荐V1.0接入（上）
##  6-2 门店推荐V1.0接入（中）
隐藏域,用来存储在页面上获取取的经纬度信息
完成dom

##  6-3 门店推荐V1.0接入（下）
球体表面距离计算公式
参数归一化方法
```xml
  <select id="recommend" resultMap="BaseResultMap">
    select
    <include refid="Base_Column_List" />
    ,ceil(1 + 1000*(2 * 6378.137* ASIN(SQRT(POW(SIN(PI() * (#{latitude} - latitude) / 360), 2) + COS(PI() * #{latitude} / 180)
    * COS(latitude* PI() / 180) * POW(SIN(PI() * (#{longitude} - longitude) / 360), 2))))) AS distance
    from shop order by (0.95*1/log10(distance)+ 0.05*remark_score/5)  DESC
</select>
```
##  6-4 门店搜索V1.0接入（1）
搜索框接收回车键
```javascript
        $('#keyword').on('keypress',function(event){
            if(event.keyCode == 13) {
                searchMethod();
            }
        });
```
##  6-5 门店搜索V1.0接入（2）
搜索结果二次筛选
排序自定义
##  6-6 门店搜索V1.0接入（3）
##  6-7 门店搜索V1.0接入（4）
##  6-8 【阶段总结】搜索推荐v1.0架构总结
##  6-9 【勤于思考，夯实学习成果】搜索推荐v1.0架构习题
# 第7章 引入搜索引擎ElasticSearch7【分布式搜索引擎基础学习】
##  7-1 本章目标
##  7-2 搜索的本质及原理（上）
分词 Word Segmentation
    - 搜索是以词为单位做最基本的搜索单元
    - 依靠分词器构建分词
    - 用分词构建倒排索引
倒排索引 inverted index
ES 对外能提供http协议搜索服务,对内做存储数据库

comparation

|Raliational Dababase | ElasticSearch
| --- | ---
| Database | Iindex
| Table | Type
| Row | Document
| Column | Field
| Schema | Mapping
| Index | Everything is indexed 
| SQL | Query DSL
| Select * From table | GET http://...
| UPDATE table SET | PUT http://...

** ES7之后Type被完全废弃,即只有index索引
##  7-3 搜索的本质及原理（下）
http://localhost:9200/_cat/health
http://localhost:9200/_cat/nodes
分片shards
主从
路由
集群: eS是集群是对称集群,全部都拥有路由副本的能力
主节点: 管理了所有写操作的metadata,负责路由所有写请求的操作
读请求各自处理:负载均衡+读写分离

##  7-4 ElasticSearch及Kibana环境搭建
```local install runbook

```
##  7-5 分布式搜索引擎的原理（上）
##  7-6 分布式搜索引擎的原理（中）
##  7-7 分布式搜索引擎的原理（下）
http:port: 9200 # 响应RESTful的接口请求
transport.tcp.port: 9300 # ES节点之前通信
##  7-8 ES基础语法（上）

非结构化创建索引
结构化创建索引
##  7-9 ES基础语法（中） 结构化方式
索引创建,更新,删除
索引简单查询
索引复杂查询
##  7-10 ES基础语法（下）
query:相当于select操作
sort: 相当于order by
aggs: 相当于group by
match是用来作关键字匹配算法的操作符,会作分词
ES默认分词器对中文字符是按字分, 比如兄弟,被分成"兄","弟",
term对输入不作分词analyse操作
stopword 停用词
```
GET /employee/_search
{
  "query":{
    "match": {"name":"ES"}
  },
  "sort":[
  	{"age":{"order":"desc"}}
  ],
  "aggs":{
  	"group_by_age":{
  		"terms":{
  			"field":"age"
  		}
  	}
  }
}
```
##  7-11 ES高级查询语法 更侧重分词相关的应用
analyze分析过程
相关性查询手段:tf-idf
tmdb实例,ecsv?

使用analyze API查看分词状态
```
//使用analyze api查看分词状态
GET /movie/_analyze
{
  "field":"name",
  "text":"Eating an apple a day"
}
//输出结果
{
  "tokens" : [
    {
      "token" : "eating",
      "start_offset" : 0,
      "end_offset" : 6,
      "type" : "<ALPHANUM>",
      "position" : 0
    },
    {
      "token" : "an",
      "start_offset" : 7,
      "end_offset" : 9,
      "type" : "<ALPHANUM>",
      "position" : 1
    },
    {
      "token" : "apple",
      "start_offset" : 10,
      "end_offset" : 15,
      "type" : "<ALPHANUM>",
      "position" : 2
    },
    {
      "token" : "a",
      "start_offset" : 16,
      "end_offset" : 17,
      "type" : "<ALPHANUM>",
      "position" : 3
    },
    {
      "token" : "day",
      "start_offset" : 18,
      "end_offset" : 21,
      "type" : "<ALPHANUM>",
      "position" : 4
    }
  ]
}
```
##  7-12 ES字段类型
 - Text:被分析索引的字符串类型
 - Keyword:不能被分析只能被精确匹配的字符串类型
 - Date
 - 数字类型:long, integer, short,double
 - boolean: true false
 - Array ["one","two"]
 - Object:json嵌套
 - Ip类型
 - Geo_point:地理位置
  
```
{
    "mappings": {
        "_doc": {
            "properties": {
                "location": {
                    "type": "geo_point"
                }
            }
        }
    }
}

"location": {
    "lat": 41.12,
    "lon":-71.34
}
```
##  7-13 【阶段总结】ES基础总结之原理&环境
##  7-14 【阶段总结】ES基础语法之索引&基础查询
##  7-15 【阶段总结】ES基础语法之进阶基础查询&field类型
##  7-16 【勤于思考，夯实学习成果】ES基础习题
# 第8章 ElasticSearch7高端进阶【分布式搜索引擎进阶学习】
##  8-1 tmdb介绍
数据下载
索引建立
文档导入
##  8-2 tmdb索引创建（上）
##  8-3 tmdb索引创建（下）
##  8-4 tmdb文档导入
##  8-5 查询语句进阶（1）
##  8-6 查询语句进阶（2）
##  8-7 查询语句进阶（3）多字段查询 multy_match 
TF: Token Frequency
IDF: Inverse Document frequency
##  8-8 查询语句进阶（4）
##  8-9 查询语句进阶（5）
##  8-10 查询语句进阶（6）
##  8-11 多字段查询进阶（1）
##  8-12 多字段查询进阶（2）
##  8-13 多字段查询进阶（3）
##  8-14 多字段查询进阶（4）
##  8-15 过滤与排序
##  8-16 自定义score计算（上）
##  8-17 自定义score计算（下）
##  8-18 【阶段总结】ES进阶之构建试验
##  8-19 【阶段总结】ES进阶之多字段查询
##  8-20 【阶段总结】ES进阶之自定义排序
##  8-21 【勤于思考，夯实学习成果】ES进阶之课后思考题
# 第9章 重回点评，搜索2.0架构之数据接入【使用ES工具升级数据接入】
##  9-1 IK分词器构建（1）安装
##  9-2 IK分词器构建（2）原理讲解
##  9-3 IK分词器构建（3）
##  9-4 IK分词器构建（4）
>analyzer
 - ik_smart 智能分词
 - ik_max_work 最大化智能分词

analyzer 指定的是构建索引的时候的分词
search_analyzer指定的是搜索关键字时的分词
最佳实践:索引的进修使用max_word, 但是查询的时候使用smartword
##  9-5 IK分词器构建（5）
##  9-6 门店索引构建（上）
##  9-7 门店索引构建（下）
##  9-8 logstash-input-jdbc构建索引（1）
构建方式
 - 全量索引构建
 - 增量索引构建
 - 增量构建方式


##  9-9 logstash-input-jdbc构建索引（2）
##  9-10 logstash-input-jdbc构建索引（3）
MySQL数据库中时间信息作为参考
##  9-11 logstash-input-jdbc构建索引（4）
##  9-12 【阶段总结】使用ES工具升级数据接入-IK中文分词器
##  9-13 【阶段总结】使用ES工具升级数据接入-索引构建
##  9-14 【勤于思考，夯实学习成果】使用ES工具升级数据接入-习题
# 第10章 重回点评，搜索2.0架构之搜索接入【使用ES升级点评搜索应用】
##  10-1 门店搜索（1）
##  10-2 门店搜索（2）
##  10-3 门店搜索（3）
##  10-4 门店搜索（4）
##  10-5 java搜索接入（1）
##  10-6 java搜索接入（2）
### gotchar
```log
***************************
APPLICATION FAILED TO START
***************************

Description:

The bean 'elasticsearchRestClient', defined in class path resource [org/springframework/boot/autoconfigure/elasticsearch/rest/RestClientConfigurations$RestHighLevelClientConfiguration.class], could not be registered. A bean with that name has already been defined in file [/Users/allenzhang/repo/azsanbox/xunke/target/classes/com/azwe/xunke/config/ElasticsearchRestClient.class] and overriding is disabled.

Action:

Consider renaming one of the beans or enabling overriding by setting spring.main.allow-bean-definition-overriding=true

Disconnected from the target VM, address: '127.0.0.1:52959', transport: 'socket'
```
##  10-7 java搜索接入（3）
##  10-8 java搜索接入（4）
##  10-9 java搜索接入（5）
##  10-10 java搜索接入（6）
##  10-11 java搜索接入（7）
##  10-12 遗留问题
##  10-13 【阶段总结】搜索2.0架构之搜索接入之基本调试
##  10-14 【阶段总结】搜索2.0架构之搜索接入之java接入
##  10-15 【勤于思考，夯实学习成果】搜索2.0架构之搜索接入
# 第11章 点评搜索进阶之相关性改造【相关性改造能力建设】
##  11-1 定制化分词器之扩展词库（上）
扩展词库
同义词处理
### 索引重新构建
```
POST /shop/_update_by_query
{
  "query":{
    "bool":{
      "must":[
        {"term":{"name":"凯"}},
        {"term":{"name":"悦"}}
      ]
    }
  }
}
```
定制化分词非常常见
##  11-2 定制化分词器之扩展词库（下） 热更新词库
<entry key=" ext_dic" > http://yoursite.com/getCustomDic</entry>
Http请求需要返回两个头部last-modified和etag
两者任何一个发生变化则会重新更新,ik一分钟检测一次
文件放在文件里

##  11-3 同义词扩展
英文逗号分开,同义词分词器
```
PUT /shop?include_type_name=false
{
   "settings" : {
      "number_of_shards" : 1,
      "number_of_replicas" : 1,
    "analysis": {
      "filter": {
        "my_synonym_filter":{
          "type":"synonym",
          "synonyms_path":"analysis-ik/synonyms.txt"
        }
      },
      "analyzer": {
        "ik_syno":{
          "type":"custom",
          "tokenizer":"ik_smart",
          "filter":["my_synonym_filter"]
        },
        "ik_syno_max":{
          "type":"custom",
          "tokenizer":"ik_max_word",
          "filter":["my_synonym_filter"]
        }
    }  }
   },
   "mappings": {
     "properties": {
       "id":{"type":"integer"},
       "name":{
        "type":"text",
        "analyzer": "ik_syno_max",
        "search_analyzer": "ik_syno" 
       },
       "tags":{"type":"text","analyzer": "whitespace","fielddata":true},
       "location":{"type":"geo_point"},
       "remark_score":{"type":"double"},
       "price_per_man":{"type":"integer"},
       "category_id":{"type":"integer"},
       "category_name":{"type":"keyword"},
       "seller_id":{"type":"integer"},
       "seller_remark_score":{"type":"double"},
       "seller_disabled_flag":{"type":"integer"}
     }
   }
}

```
##  11-4 相关性重塑（上）
相关性搜索->相关性工程->相关性工程师
让搜索引擎理解语义
影响召回及排序
> 采取词性影响召回模型
##  11-5 相关性重塑（中）
构造分词函数识别器
##  11-6 相关性重塑（下）
# 第12章 点评搜索进阶之准实时性索引【准实时索引能力建设】
##  12-1 canal索引构建进阶（1）
canal伪装成mysql从库
##  12-2 canal索引构建进阶（2）
##  12-3 canal索引构建进阶（3）
##  12-4 canal索引构建进阶（4）
##  12-5 canal索引构建进阶（5）
##  12-6 canal索引构建进阶（6）
##  12-7 canal自定义接入（1）
##  12-8 canal自定义接入（2）
##  12-9 canal自定义接入（3）
##  12-10 canal自定义接入（4）
##  12-11 搜索课程总结
##  12-12 【阶段总结】准实时索引能力建设
##  12-13 【勤于思考，夯实学习成果】准实时索引建设习题
# 第13章 点评推荐2.0架构进阶【基于spark mllib的机器学习推荐算法】
##  13-1 推荐原理（上）
##  13-2 推荐原理（下）
##  13-3 推荐系统架构
##  13-4 个性化召回als算法原理讲解
##  13-5 个性化排序lr算法原理讲解
##  13-6 spark原理讲解
##  13-7 als算法实现（上）
##  13-8 als算法实现（中）
##  13-9 als算法实现（下）
##  13-10 lr算法实现（上）
##  13-11 lr算法实现（中）
##  13-12 lr算法实现（下）
##  13-13 点评推荐接入（上）
##  13-14 点评推荐接入（下）
##  13-15 课程总结
##  13-16 【阶段总结】推荐系统总结
# 第14章 【补充章】点击率预估模型算法
##  14-1 点击率预估模型的介绍 
##  14-2 点击率预估模型算法讲解（上） 
##  14-3 点击率预估模型算法讲解（中） 
##  14-4 点击率预估模型算法讲解（下） 
##  14-5 点击率预估模型随机森林算法 
##  14-6 点击率预估模型GBDT算法 
##  14-7 点击率预估模型实现 
##  14-8 点击率预估ABtest 
# ref
## ES基础语法第7章
```javascript
ES基础语法
创建一个索引
PUT /test
{
   "settings" : {
      "number_of_shards" : 1,
      "number_of_replicas" : 1
   }
分布式节点建设
更新其replicas状态，但是不能更新shards状态
PUT /test/_settings
{
   "settings" : {
      "number_of_replicas" : 0
   }
}


创建索引，指定id建立索引
PUT /employee/_doc/1
{
    "name": "凯杰", 
    "age": 30
}

指定id全量修改索引
PUT /employee/_doc/1
{
    "name": "凯dsfsf32杰", 
    "age"
}

指定id部分字断修改
POST employee/_update/1
{
    "doc" : {
        "name" : "new_name"
    }
}

指定_create防止重复创建
POST /employee/_create/1/
{
    "name": "凯1213132杰", 
    "age": 30
}

使用搜索全部
GET /employee/_search

获取指定id
GET /employee/_doc/1

不指定id建立索引
POST /employee/_doc/
{
    "name": "dsfsfsf", 
    "age": 30
}



删除文档
delete /employee/_doc/1


删除索引
DELETE /employee




结构化创建
PUT /employee/
{
    "settings" : {
      "number_of_shards" : 1,
      "number_of_replicas" : 1
   },
    "mappings" : {
            "properties" : {
                "name" : { "type" : "text" },
                "age" : { "type" : "integer" }
            }

    }
}


es查询
简单查询：
（1）主键查询 GET /employee/_doc/1
 (2) 查询所有 
GET /employee/_search
{
  "query":{
    "match_all": {}
  }
}

（3）分页查询
GET /employee/_search
{
  "query":{
    "match_all": {}
  },
  "from":1,
  "size":1
}


复杂查询
（1）带条件
GET /employee/_search
{
  "query":{
    "match": {"name":"ES"}
  }
}
（2）带排序
GET /employee/_search
{
  "query":{
    "match": {"name":"ES"}
  },
  "sort":[
  	{"age":{"order":"desc"}}
  ]
}
//带filter 相当于where
GET /employee/_search
{
    "query":{
        "bool":{
            "filter":[
                {"match":{"name":"兄"}}
            ]
        }
    }
}

(3) 带聚合
GET /employee/_search
{
  "query":{
    "match": {"name":"ES"}
  },
  "sort":[
  	{"age":{"order":"desc"}}
  ],
  "aggs":{
  	"group_by_age":{
  		"terms":{
  			"field":"age"
  		}
  	}
  }
}



利用analyze api搜索
先建立索引
PUT /employee/_doc/1
{
    "name": "Eating an apple a day & keeps the doctor away", 
    "age": 30
}

然后搜索
GET /employee/_search
{
  "query":{
    "match": {"name":"eat"}
  }
}
没搜到后使用analyze api查看分析处理结果，可以看到没有分出eat，所以搜不到，改成用english分词器做
GET /employee/_analyze
{
  "field":"name",
  "text":"Eating an apple a day & keeps the doctor away"
}
重新创建索引
PUT /employee=
{
    "settings" : {
      "number_of_shards" : 1,
      "number_of_replicas" : 1
   },
    "mappings" : {
            "properties" : {
                "name" : { "type" : "text","analyzer": "english"},
                "age" : {"type":"integer"}
            }
    }
}
在用analyze api，可以看到eat
GET /employee/_analyze
{
  "field":"name",
  "text":"Eating an apple a day & keeps the doctor away"
}

```
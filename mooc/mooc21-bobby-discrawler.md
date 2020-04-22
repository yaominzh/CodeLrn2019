# 第1章 课程介绍
介绍课程目标、通过课程能学习到的内容、和系统开发前需要具备的知识
##  1-1 python分布式爬虫打造搜索引擎简介试看
# 第2章 windows下搭建开发环境
介绍项目开发需要安装的开发软件、 python虚拟virtualenv和 virtualenvwrapper的安装和使用、 最后介绍pycharm和navicat的简单使用
##  2-1 pycharm的安装和简单使用
##  2-2 mysql和navicat的安装和使用
##  2-3 windows和linux下安装python2和python3
##  2-4 虚拟环境的安装和配置
# 第3章 爬虫基础知识回顾
介绍爬虫开发中需要用到的基础知识包括爬虫能做什么，正则表达式，深度优先和广度优先的算法及实现、爬虫url去重的策略、彻底弄清楚unicode和utf8编码的区别和应用。
##  3-1 技术选型 爬虫能做什么
##  3-2 正则表达式-1
##  3-3 正则表达式-2
##  3-4 正则表达式-3
##  3-5 深度优先和广度优先原理
##  3-6 url去重方法
1. 将访问过的url保存到数据库
2. 保存到set 
3. url经过md5哈希后保存到set
4. bitmap
5. bloomfilter方法,多重hash
##  3-7 彻底搞清楚unicode和utf8编码
# 第4章 新： scrapy爬取知名技术文章网站
搭建scrapy的开发环境，本章介绍scrapy的常用命令以及工程目录结构分析，本章中也会详细的讲解xpath和css选择器的使用。然后通过scrapy提供的spider完成所有文章的爬取。然后详细讲解item以及item loader方式完成具体字段的提取后使用scrapy提供的pipeline分别将数据保存到json文件以及mysql数据库中。...
##  4-1 重录说明(很重要！！！)
##  4-2 scrapy安装和配置
##  4-3 需求分析
##  4-4 pycharm中调试scrapy源码
##  4-5 xpath基础语法
##  4-6 xpath提取元素
##  4-7 css选择器
##  4-8 编写spider完成抓取过程 - 1
##  4-9 编写spider完成抓取过程 - 2
##  4-10 scrapy中为什么要使用yield
##  4-11 提取详情页信息
##  4-12 提取详情页信息
##  4-13 items的定义和使用 - 1
##  4-14 items的定义和使用 - 2
##  4-15 scrapy配置图片下载
##  4-16 items数据写入到json文件中
##  4-17 mysql表结构设计
##  4-18 pipeline数据库保存
##  4-19 异步方式入库mysql
##  4-20 数据插入主键冲突的解决方法
##  4-21 itemloader提取信息
##  4-22 itemloader提取信息
##  4-23 大规模抓取图片下载出错的问题
# 第5章 scrapy爬取知名问答网站
本章主要完成网站的问题和回答的提取。本章除了分析出问答网站的网络请求以外还会分别通过requests和scrapy的FormRequest两种方式完成网站的模拟登录， 本章详细的分析了网站的网络请求并分别分析出了网站问题回答的api请求接口并将数据提取出来后保存到mysql中。...
##  5-1 session和cookie自动登录机制试看
##  5-2 . selenium模拟登录知乎 - 1new
##  5-3 . selenium模拟登录知乎-2new
##  5-4 . selenium模拟登录知乎-3new
##  5-5 . 知乎倒立文字识别 new
##  5-6 . selenium自动识别验证码完成模拟登录-1new
##  5-7 . selenium自动识别验证码完成模拟登录 - 2 new
##  5-8 requests模拟登陆知乎 - 1(可选观看)
##  5-9 requests模拟登陆知乎 - 2（可选观看）
##  5-10 requests模拟登陆知乎 - 3（可选观看）
##  5-11 scrapy模拟知乎登录（可选观看）
##  5-12 知乎分析以及数据表设计1
##  5-13 知乎分析以及数据表设计 - 2
##  5-14 item loder方式提取question - 1
##  5-15 item loder方式提取question - 2
##  5-16 item loder方式提取question - 3
##  5-17 知乎spider爬虫逻辑的实现以及answer的提取 - 1
##  5-18 知乎spider爬虫逻辑的实现以及answer的提取 - 2
##  5-19 保存数据到mysql中 -1
##  5-20 保存数据到mysql中 -2
##  5-21 保存数据到mysql中 -3
# 第6章 通过CrawlSpider对招聘网站进行整站爬取
本章完成招聘网站职位的数据表结构设计，并通过link extractor和rule的形式并配置CrawlSpider完成招聘网站所有职位的爬取，本章也会从源码的角度来分析CrawlSpider让大家对CrawlSpider有深入的理解。
##  6-1 数据表结构设计
##  6-2 CrawlSpider源码分析-新建CrawlSpider与settings配置
##  6-3 CrawlSpider源码分析
##  6-4 Rule和LinkExtractor使用
##  6-5 拉勾网302之后的模拟登录和cookie传递(网站需要登录时学习本视频教程)
##  6-6 item loader方式解析职位
##  6-7 职位数据入库-1
##  6-8 职位信息入库-2
##  6-9 网站反爬突破 
# 第7章 Scrapy突破反爬虫的限制
本章会从爬虫和反爬虫的斗争过程开始讲解，然后讲解scrapy的原理，然后通过随机切换user-agent和设置scrapy的ip代理的方式完成突破反爬虫的各种限制。本章也会详细介绍httpresponse和httprequest来详细的分析scrapy的功能，最后会通过云打码平台来完成在线验证码识别以及禁用cookie和访问频率来降低爬虫被屏蔽的可能性。...
##  7-1 爬虫和反爬的对抗过程以及策略试看
##  7-2 scrapy架构源码分析
##  7-3 Requests和Response介绍
##  7-4 通过downloadmiddleware随机更换user-agent-1
##  7-5 通过downloadmiddleware随机更换user-agent - 2
##  7-6 scrapy实现ip代理池 - 1
##  7-7 scrapy实现ip代理池 - 2
##  7-8 scrapy实现ip代理池 - 3
##  7-9 云打码实现验证码识别
##  7-10 cookie禁用、自动限速、自定义spider的settings
# 第8章 scrapy进阶开发
本章将讲解scrapy的更多高级特性，这些高级特性包括通过selenium和phantomjs实现动态网站数据的爬取以及将这二者集成到scrapy中、scrapy信号、自定义中间件、暂停和启动scrapy爬虫、scrapy的核心api、scrapy的telnet、scrapy的web service和scrapy的log配置和email发送等。 这些特性使得我们不仅只是可以通过scrapy来完成...
##  8-1 selenium动态网页请求与模拟登录知乎
##  8-2 selenium模拟登录微博， 模拟鼠标下拉
##  8-3 chromedriver不加载图片、phantomjs获取动态网页
##  8-4 selenium集成到scrapy中
##  8-5 其余动态网页获取技术介绍-chrome无界面运行、scrapy-splash、selenium-grid, splinter
##  8-6 scrapy的暂停与重启
##  8-7 scrapy url去重原理
##  8-8 scrapy telnet服务
##  8-9 spider middleware 详解
##  8-10 scrapy的数据收集
##  8-11 scrapy信号详解
##  8-12 scrapy扩展开发
# 第9章 scrapy-redis分布式爬虫
Scrapy-redis分布式爬虫的使用以及scrapy-redis的分布式爬虫的源码分析， 让大家可以根据自己的需求来修改源码以满足自己的需求。最后也会讲解如何将bloomfilter集成到scrapy-redis中。
##  9-1 分布式爬虫要点
##  9-2 redis基础知识 - 1
##  9-3 redis基础知识 - 2
##  9-4 scrapy-redis编写分布式爬虫代码
##  9-5 scrapy源码解析-connection.py、defaults.py-
##  9-6 scrapy-redis源码剖析-dupefilter.py-
##  9-7 scrapy-redis源码剖析- pipelines.py、 queue.py-
##  9-8 scrapy-redis源码分析- scheduler.py、spider.py-
##  9-9 集成bloomfilter到scrapy-redis中
# 第10章 cookie池系统设计和实现
为了让爬取代码和解析代码不会受到模拟登录的影响，将模拟登录独立成独立的服务变得很重要，cookie池就是为了解决这类问题而生，多账号登录管理、如何让网站接入变得容易都会是cookie池需要解决的问题。本章节就重点解决cookie池设计和开发的细节问题。 ...
##  10-1 什么是cookie池？ 
##  10-2 cookie池系统设计 
##  10-3 实现cookie池-1 
##  10-4 实现cookie池-2 
##  10-5 改造login方法 - 1 
##  10-6 改造login方法 - 2 
##  10-7 改造login方法-3 
##  10-8 改造login方法-4 
##  10-9 通过抽象基类实现网站轻松接入 
##  10-10 实现检测网站cookie是否有效 
##  10-11 如何选择redis的数据结构来保存cookie 
##  10-12 cookie管理器的实现 
##  10-13 启动cookie池服务 
##  10-14 将cookie集成到爬虫项目中 
##  10-15 cookie架构设计改进意见 
# 第11章 各种验证码的识别
滑动验证码变得越来越流行，如何解决滑动验证码就成为了模拟登录中重要的一个环节，本章节聚焦解决滑动验证码的各种细节问题。
##  11-1 滑动验证码的识别思路 
##  11-2 验证码截屏-1 
##  11-3 验证码截屏-2 
##  11-4 计算出滑动的距离 
##  11-5 计算滑动轨迹 
# 第12章 增量抓取
增量抓取和数据更新是爬虫运行中经常遇到的问题，比如当前爬虫正在运行，但是新增的数据如何及时发现，如何将后来的url先进行抓取，如何发现新数据都是实际开发中经常原道的问题，本章节通过修改scrapy-redis的源码以最小的代价来解决上诉问题，通过本章节的学习我们将会更加懂得如何去控制爬虫的运行环节。...
##  12-1 增量爬虫需要解决的问题 
##  12-2 通过修改scrapy-redis完成增量抓取 -1 
##  12-3 通过修改scrapy-redis完成增量抓取-2 
##  12-4 爬虫数据更新 
# 第13章 elasticsearch搜索引擎的使用
本章将讲解elasticsearch的安装和使用，将讲解elasticsearch的基本概念的介绍以及api的使用。本章也会讲解搜索引擎的原理并讲解elasticsearch-dsl的使用，最后讲解如何通过scrapy的pipeline将数据保存到elasticsearch中。
##  13-1 elasticsearch介绍
##  13-2 elasticsearch安装
##  13-3 elasticsearch-head插件以及kibana的安装
##  13-4 elasticsearch的基本概念
##  13-5 倒排索引
##  13-6 elasticsearch 基本的索引和文档CRUD操作
##  13-7 elasticsearch的mget和bulk批量操作
##  13-8 elasticsearch的mapping映射管理
##  13-9 elasticsearch的简单查询 - 1
##  13-10 elasticsearch的简单查询 - 2
##  13-11 elasticsearch的bool组合查询
##  13-12 scrapy写入数据到elasticsearch中 - 1
##  13-13 scrapy写入数据到elasticsearch中 - 2
# 第14章 django搭建搜索网站
本章讲解如何通过django快速搭建搜索网站， 本章也会讲解如何完成django与elasticsearch的搜索查询交互。
##  14-1 es完成搜索建议-搜索建议字段保存 - 1
##  14-2 es完成搜索建议-搜索建议字段保存 - 2
##  14-3 django实现elasticsearch的搜索建议 - 1
##  14-4 django实现elasticsearch的搜索建议 - 2
##  14-5 django实现elasticsearch的搜索功能 -1
##  14-6 django实现elasticsearch的搜索功能 -2
##  14-7 django实现搜索结果分页
##  14-8 搜索记录、热门搜索功能实现 - 1
##  14-9 搜索记录、热门搜索功能实现 - 2
# 第15章 scrapyd部署scrapy爬虫
本章主要通过scrapyd完成对scrapy爬虫的线上部署。
##  15-1 scrapyd部署scrapy项目
# 第16章 课程总结
重新梳理一遍系统开发的整个过程， 让同学对系统和开发过程有一个更加直观的理解
##  16-1 课程总结
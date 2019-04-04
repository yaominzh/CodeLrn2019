[toc]
# chap03 原则 
## 开闭原则
对扩展开放，对修改关闭。 方法，用抽象构建框架，用实现扩展细节
## 3-4依赖倒置原则
# chap19 策略模式
> 定义了算法簇，分别封闭起来，让它们之间可以互相替换，此模式让算法的变化独立于使用算法的客户。
> 优点：开闭原则， 避免多重条件语句，提高算法的保密性安全性
# chap21 观察者模式
定义了对象之间的一对多依赖，这样一来，当一个对象改变状态时，它的所有依赖者都会收到通知并自动更新。

> 松耦合 交互，但不太清楚彼此的细节
观察者模式提供了一种对象设计，让主题和观察者之间松耦合

cons
1. 观察者之间有过多的细节依赖

# chap19 装饰器模式

动态地将责任附加到对象上。 若要扩展功能， 装饰者提供了比继承更有弹性的替代方案。
attaches additional responsibilities to an object dynamically. Decorators provid a flexible alternative to subclassing for extending functionality. 

> 扩展一个类的功能或给一个类添加附加职责 
> 把类中的装饰功能分离出去**开闭原则**
git reset HEAD 
# 设计模式

[TOC]



## 基本原则

- 单一职责原则（Single Responsibility Principle）
- 开发-关闭原则（Open-Closed Principle）
- 里氏替换原则（Liskov Substitution Principle）
- 依赖倒转原则（Dependence Inversion Principle）
- 接口隔离原则（Interface Segregation Principle）
- 迪米特法则（Law Of Demeter）又称少知道原则
- 组合/聚合复用原则（Composite/Aggregate Reuse Principle）

## 工厂模式

解决new的过程中耦合的问题：当有很多子类，我们需要选择new哪个；如果新增一个ie子类怎么办

符合开闭原则：需要增加子类等，只需要在客户端增加新类和新的工厂，但是简单工厂还是需要修改工作类。

工厂可以放一个入参，返回制定的对象，但一般不这样。

管理了对象的创建

可以让客户端与类隔离，中间工厂负责建立对象。通过工厂，实现了面对接口编程：工厂与父类耦合，但与子类不耦合，遵循了依赖倒转原则。

变量不要持有具体类的引用：在使用对象时，尽量避免直接new，否则调用方会依赖这个对象。

类的最终父类是抽象类或者实现接口：依赖到转

当某个类可能新增种类，可以考虑工厂模式

工厂方法，继承基本的工厂，单一

抽象工厂，工作要实现抽象接口，多了很多过程，可以组合，或者产生多种对象

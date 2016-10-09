# sping-ioc 笔记
## ioc类型

* 主要有3个类型：构造函数注入、属性注入、接口注入、工厂方法注入

* 构造函数注入

    主要分为按类型匹配入参、按所引匹配入参、联合使用类型和所引匹配入参

* 属性注入

    通过set方法注入，必须提供一个默认的构造函数

* 接口注入

* 工厂方法注入

    非静态工厂方法、静态工厂方法

## BeanFactory

* spring最核心的接口，提供高级的IoC配置。BeanFactory启动IoC容器时,不全初始化配置文件中的bean 当第一次调用时初始化bean 对于单例(singleton)的Bean来说
* BeanFactory会缓存bean实例 第二次调用时 直接从缓存中获取bean DefaultSingletonBeanRegistry类中提供了用于缓存单例的bean缓存器 它是用HashMap实现的
* BeabFactory初始化时必须提供一种日志框架

## ApplicationContext

* 建立在BeanFactory之上，提供了很多面向应用的功能。让容器有了发布应用上下文的功能、提供了国际化访问的功能、可以用Ant风格的资源文件路径装载sping配置文件 

## WebApplicationContext

* WebApplicationContext是专门为Web应用准备的 它允许从Web根目录路径装载配置文件完成初始化
* 从WebApplicationContext可以获得 ServletContext的引用 可以用WebApplicationContextUtils工具类中的getWebApplicationContext(ServletContext sc)方法获取WebApplicationContext实例
* WebApplicationContext初始化必须拥有web容器的前提下才可以

## 两者区别

* BeanFactory是spring框架的基础面向spring本身 
* ApplicationContext面向使用spring的开发者
* ApplicationContext在初始化时就实例化所有单例的bean 所以ApplicationContext初始化时间要比BeanFactory要长
* ApplicationContext会利用java反射会自动识别出在配置文件中的BeanPostProcessor注册到应用上下文中 而BeanFactory需要手动在代码中调用addBeanPostProcessor方法进行注册

## Bean的作用域

#### request、session、globalSession web环境中的作用域
#### singleton、prototype 非web环境中的作用域

* singleton

    spring容器中只存在一个Bean实例，Bean以单例的方式存在

* prototype

    每次从spring容器中调用Bean时，都返回一个新的实例
    
* request

    每一次HTTP请求都会创建一个新的Bean
    
* session

    同一个HTTP Session共享一个Bean 不同的HTTP Session使用不同的Bean
    
* globalSession

    同一个全局Session共享一个Bean

## 自动装配

* autowire spring 提供了4种自动装配类型：byName、byType、constructor、autodetect

* byName

    根据名称进行自动装配。假设Boss有一个名为car的属性，容器中刚好有一个名为car的bean。spring就会自动装配给Boss的car属性

* byType

    根据类型进行启动装配。假设Boss中有一个Car类型的属性，容器中刚好有一个Car类型的Bean。spring就会自动装配给Boss的这个属性

* constructor

    与byType类似，只是constructor自动装配是针对构造函数的

* autodetect

    根据Bean的自省机制决定采用byType还是constructor进行自动装配。如果Bean中提供了默认的构造函数，则采用byType;否则采用constructor

    abstract="true" spring容器不实例化一个一个对应的Bean
    
    depends-on 前置依赖
    
* Autowired
    Autowired默认按类型匹配 在容器中查找匹配Bean 当只有一个匹配的Bean时 spring将其注入到@Autowired标识的变量中 当在容器中没有匹配的Bean时 spring容器将报
    NoSuchBeanDefinitionException异常
    
* Resource 
    Resource默认按名称匹配
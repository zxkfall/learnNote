Java基础学习

# [Java学习路线 77d](https://www.bilibili.com/read/cv5702420)

```mermaid
flowchart LR
id0(java学习路线) --> id1
	id1(JavaSE 18d) --> id1_2(Java简介)
	id1 --> id1_3(Java环境搭建)
	id1 --> id1_4(Hello World)
	id1 --> id1_5(基础语法)
		id1_5 --> id1_5_1(注释)
		id1_5 --> id1_5_2(标识符)
		id1_5 --> id1_5_3(数据类型)
			id1_5_3 --> id1_5_3_1(基本类型)
				id1_5_3_1 --> id1_5_3_1_1(整数类型)
					id1_5_3_1_1 --> id1_5_3_1_1_1(byte)
					id1_5_3_1_1 --> id1_5_3_1_1_2(short)
					id1_5_3_1_1 --> id1_5_3_1_1_3(int)
					id1_5_3_1_1 --> id1_5_3_1_1_4(long)
				id1_5_3_1 --> id1_5_3_1_2(浮点数类型)
					id1_5_3_1_2 --> id1_5_3_1_2_1(float)
					id1_5_3_1_2 --> id1_5_3_1_2_2(double)
				id1_5_3_1 --> id1_5_3_1_3(字符类型) --> id1_5_3_1_3_1(char)
				id1_5_3_1 --> id1_5_3_1_4(布尔类型) --> id1_5_3_1_4_1(boolean)
			id1_5_3 --> id1_5_3_2(引用类型)
				id1_5_3_2 --> id1_5_3_2_1(类)
				id1_5_3_2 --> id1_5_3_2_2(接口)
				id1_5_3_2 --> id1_5_3_2_3(数组)
	id1 --> id1_6(数组)
	id1 --> id1_7(面向对象)
		id1_7 --> id1_7_1(封装)
		id1_7 --> id1_7_2(继承)
		id1_7 --> id1_7_3(多态)
		id1_7 --> id1_7_4(抽象类)
		id1_7 --> id1_7_5(接口)
	id1 --> id1_8(异常)
		id1_8 --> id1_8_1(异常分类)
	id1 --> id1_9(常用类)
	id1 --> id1_10(集合框架)
	id1 --> id1_11(IO)
	id1 --> id1_12(多线程)
	id1 --> id1_13(GUI)
	id1 --> id1_14(网络编程)
	id1 --> id1_15(注解和反射)
	id1 --> id1_16(JUC)
	id1 --> id1_17(JVM)
	id1 --> id1_18(23种设计模式)
	id1 --> id1_19(XML)
	id1 --> id1_20(数据结构和算法)
	id1 --> id1_21(正则表达式)
id0 --> id2(数据库)
	id2 --> id2_1(基础语法)
id0 --> id3(前端)
id0 --> id4(JavaWeb)
id0 --> id5(Mybatis)
id0 --> id6(SSM)
id0 --> id7(Linux)
id0 --> id8(Spring)
id0 --> id9(SpringBoot)
id0 --> id10(SpringCloud)
id0 --> id11(Hadoop)
```



- Java SE 18d

  - Java简介
  - Java环境搭建
  - HelloWorld

  - 基础语法

    - 注释
    - 标识符
    - 数据类型

  - 数组

  - 面向对象
    - 封装
    - 继承
    - 多态
    - 抽象类
    - 接口
    
  - 异常

    - Throwable
      - Exception
      - Error
        - AWT错误
        - JVM错误

  - 常用类

    - Object类
      - hashcode()
      - toString()
      - clone()
      - getClass()
      - notify()
      - wait()
      - equals()
    - Math类
      - 常见数学运算
    - Random
      - 生成随机数 UUID
    - File
      - 创建文件
      - 查看文件
      - 修改文件
      - 删除文件
    - 包装类
      - 自动装箱和拆箱
    - Date类
      - Date
      - SimpleDateFormat  yyyy-MM-dd HH:mm:ss
      - Calendar(建议用)
    - String类
      - 不可变性 final
    - StringBuffer
      - 可变长 append
      - 线程安全
    - StringBuilder
      - 可变长

  - 集合框架

    - Iterator

    - Collection

      - List

        - 有序可重复

        - ArrayList
          - add
          - remove
          - contains
          - size
        - LinkedList
          - getFirst()
          - getLast()
          - removeFirst()
          - addFirst()
          - ...

      - Set

        - 无序不可重复

        - HashSet
        - TreeSet

    - Map

      - HashMap
        - 重点
        - JDK1.7 数组加链表
        - JDK1.8 hash表=数组+链表+红黑树
      - TreeMap
        - 不常用

    - Collections工具类

    - 泛型<>约束 避免类型转换的问题

  - IO

    - 字节流

      - 输出 OutputStream
      - 输入 InputStream

    - 字符流

      - Reader
      - Writer

    - 节点流

      - CharArrayReader、Writer、inputstream、outputStream
      - StringReader、Writer
      - pipe(管道流)、PipedOutputStream

    - 处理流

      - 序列化 反序列化 Serializable  transient

      - buffer 
        - bufferInputStream
        - bufferOutInputStream
        - bufferReader
        - bufferWriter
      - object流
      - data
        - DataInputStream
        - DataOutputStream
      - 转换流
        - InputStreamReader
        - OutPutStreamWriter
      - Filter
        - 四个
      - printer
        - PrintWriter
        - PrintStream

  - 多线程

    - 进程和线程
    - run() 、start()
    - 线程创建的方式
      - Thread  start() java无权调用，交给底层的c处理 private native void start()
      - Runnable 函数式接口 lambda
      - Callable 可以有返回值
    - 静态代理 new Thread(Runnable).start();
    - Lambda表达式
      - 函数式编程
      - 避免内部类定义过多
      - new Thread(()->{}).start();
      - 手动推导一遍lambda表达式
    - 线程的状态
      - 新建状态
      - 就绪
      - 运行
      - 阻塞
      - 死亡
    - 常用的方法
      - sleep
      - join
      - yield
      - isLive
      - start
      - setPriority
      - interrupt
    - 线程同步
      - 对各对象操作同一个资源，并发
      - 队列+锁
      - Synchronized
        - 同步方法 弊端 锁太多了
        - 同步代码块 常用
        - 第一个线程进来拿到锁，后面需要排队，直到这个人释放锁，后面才能拿到锁进去
        - 死锁 两个人都抱着对方的锁
          - 互斥
          - 请求与保持
          - 不剥夺条件
          - 循环等待条件
      - Lock 优先级高 ReentrantLock
        - lock
        - trylock
        - unlock
    - 线程通信
      - 缓冲区 消息队列
      - 标志位 红绿灯
      - wait()
      - notifyAll()
    - 线程池
      - 池化技术
      - 池的大小
      - 最大连接数
      - 保持时间

  - GUI

    - AWT
      - Frame
      - 监听事件
        - 鼠标
        - 键盘
        - 窗口
        - 动作事件
    - Swing
      - 文本框
      - 标签
      - 按钮
      - 文本域
      - 面板
      - 布局方式
      - 关闭窗口
      - 列表
    - 贪吃蛇
      - Timer
      - 键盘监听
      - 游戏帧的概念

  - 网络编程

    - IP
    - 端口
    - Socket编程
    - TCP
      - 三次握手
      - 四次握手
      - 面向连接
    - UDP
      - 无连接
      - Packet
    - URL
    - Tomcat
    - 聊天通信
    - 文件上传

  - 注解和反射

    - 注解
      - 元注解
      - 内置注解
      - 自定义注解
      - 反射读取注解
    - 反射
      - Class newInstance()
      - 类加载机制
      - Method
        - invoke(user,"ss");
        - 存在重载，也需要写参数的类型
      - Field set(user,"ss");
      - Construct
        - newInstance()
        - 获取时需要，传递参数的class类型
      - 破坏私有关键字 setAccessible(true)
      - 性能分析 正常>检查关闭的反射>默认的反射
      - 反射获得注解，泛型
    - 单例模式的探究
    - Stream
    - Fork Jion效率对比

  - JUC编程

  - JVM探究

  - 扩展 23种设计模式

  - 扩展 XML

  - 扩展 数据结构和算法

  - 扩展 正则表达式

- 数据库 4d

- 前端 7d
  - HTML
  - CSS
  - JS
  - JQuery
  - Layui/BootStrap
  - Vue
  
- Java Web 7d
  - Tomcat
  - http
  - Maven
  - Servlet
  - Session,Cookie
  - JSP
  - 三层架构
  - JSTL、EL表达式
  - 过滤器
  - 监听器
  - 文件上传
  - 邮件收发
  - 扩展 富文本编辑器
  
- SSM框架 9d
  - Git
  - Mybatis
  - Spring
  - SpringMVC
  
- Linux 7d
  - linux基础
  - Redis
  - Nginx
  - Docker
  
- Springboot 8d
  - Springboot基础
  - Springboot配置及原理
  - spring boot持久层操作
  - spring boot Web开发
  - springboot缓存
  - springboot消息
  - springboot检索
  - SpringBoot任务
  - Springboot安全
  - Dubbo+Zookeeper分布式开发
  
- SpringCloud 7d
  - 微服务及微服务架构
  - SpringCloud
  - Eureka服务注册与发现
  - Feign、Ribbon负载均衡
  - Hystrix熔断机制
  - Zuul路由网关
  - SpringCloud Config配置中心
  
- Hadoop 8d
  - 大数据时代
    - 概念
    - 特点
    - 应用
    - 前景
    - 技术发展
  - Hadoop简介
  - Hadoop环境搭建
  - HDFS
  - MapReduce
  - Yarn
  - Hive
  - Hbase

### Markdown

```markdown
# 一级标题
## 二级标题
### 三级标题
#### 四级标题
##### 五级标题
###### 六级标题
**粗体**
*斜体*
***斜体加粗***
~~划掉~~
> 引用
分割线
--- 
*** 
![图片名](本地或网络url)
[超链接](链接url)
有序列表
1. A
2. B
3. C
无序列表
- A
- B
- C
表格
|姓|名|
| -- | -- |
| 张 | 兴 |
代码
​```
引入的代码
​```

```

### 计算机简介

##### 应用领域

- 科学计算
- 数据处理
- 自动控制
- 计算机辅助设计(CAD)
- 人工智能
- 网络等

##### 计算机硬件组成

- CPU
- 主板
- 内存
- 电源、主机箱
- 硬盘
- 显卡
- 键盘鼠标
- 显示器
- ...

##### 冯诺依曼体系结构

- I/O设备
- 存储器
- **CPU** 运算器、控制器 
- 数据流、指令流、控制流

##### 计算机软件

- 系统软件
  - DOS、Windows、Linux、Mac、Android、IOS

- 应用软件
- 软件开发
  - IntelliJ IDEA
- 人机交互
  - 图形化界面
  - 命令行

##### 电脑常用快捷键

```
Ctrl+C 复制
Ctrl+V 黏贴
Ctrl+A 全选
Ctrl+X 剪切
Ctrl+Z 撤销
Ctrl+S 保存
Alt+F4 关闭当前窗口
Shift+Del 永久删除
Win+E 打开我的电脑
Win+R 打开运行
explorer 桌面
Ctrl+shift+esc 打开任务管理器
```

##### Dos命令

```bash
D: 切换盘符
dir 查看当前目录下所有文件
cd .. 返回上一级
cd tmp 进入tmp文件
cd /d E:\temp 跨盘符切换
cls 清理屏幕
exit 退出
ipconfig 查看ip
calc 打开计算器
mspaint 打开画图
notepad 打开记事本
ping www.baidu.com 测试网络是否正常
md test 创建test文件夹
rd  test 移除
cd> test.txt 创建test.txt文件
del test.txt 删除文件
```

##### 计算机语言发展

- 机器语言
  - 二进制
- 汇编语言
  - 指令代替二进制
  - 逆向工程
  - 机器人
  - 病毒
  - ...
- 摩尔定律
  - 18个月晶体管数目增加一倍
  - 已经接近瓶颈
- 高级语言
  - 面向过程和面向对象，二者通常相辅相成，各有侧重
  - C是典型面向过程
  - C++、Java典型面向对象的语言

##### 语言发展

- C
  - 贴近硬件、运行很快、效率很高
  - 操作系统、编译器、数据库、网络系统等
  - 指针和内存管理
- C++
  - 面向对象
  - 兼容C
  - 图形领域、游戏等
- Java
  - 语法像C
  - 没有指针
  - 没有内存管理
  - 一次编写，到处运行
  - 面向对象
  - 类型安全
  - 高质量类库
  - 不同版本
    - SE 桌面
    - ME 手机
    - EE 服务器
  - 构建工具
    - Ant、Maven、Jekins
  - 应用服务器
    - tomcat、jetty、Websphere、weblogic
  - Web开发
    - Struts、Spring、Hibernate、myBatis
  - 开发工具
    - Eclipse、Netbean、IntellijIDEA，Jbuilder
  - Hadoop 大数据领域
  - Android 手机版

## Java简介

##### Java特性和优势

- 简单性
- 面向对象
- 可移植性
- 高性能
- 分布式
- 动态性
- 多线程
- 安全性
- 健壮性

##### Java三大版本

- **SE 标准版 桌面程序、控制台开发**
- ~~ME 嵌入式开发 手机、小家电~~
- EE 企业级开发 Web端、服务器开发

##### JDK、JRE、JVM

- JDK Java Development Kit，包含JRE
- JRE 运行时环境，包含JVM
- JVM Java Virtual machine

## Java环境搭建

- [OpenJDK下载](http://jdk.java.net/archive)
- 配置PATH环境变量、指向JDK的bin目录
- 配置JAVA_HOME、指向JDK所在目录，自己下载的tomcat会用到
- ~~配置JRE_HOME、指向JDK的JRE所在目录~~
- 都是系统或者都是用户变量
- 卸载时，对应位置删除

## HelloWorld

###### 代码

```java
public class Hello{
     public static void main(String[] args) {
        System.out.print("Hello World!");
    }
}
```

###### 运行

```bash
javac hello.java
java hello
```

### Java程序运行机制

- 编译型

  - 全部编译成计算机可以理解的语言
  - C/C++等

- 解释型

  - 用到哪里编译哪里
  - 速度慢点

- 两种特征都有
  
  - java文件
  - Java编译器
  - 字节码class文件
  - 类装载器
  - 字节码校验器
  - 解释器
  - 操作系统平台

### [IDEA安装](https://www.jetbrains.com/idea/)

- linux、mac、windows
- 学生edu免费

## Java基础语法

#### 注释、标识符、关键字

##### 注释

- 注释不会被执行

- 单行注释

  ```java
  //这是单行注释
  ```

- 多行注释

  ```java
  /*
   这是多行注释 
  */
  ```

- 文档注释

  ```java
      /**
       * @Description
       * @param res
       * @return 
       */
  ```

##### 标识符

+ 48个关键字

| 1    | 2    | 3    | 4    | 5    | 6    |
| ---- | ---- | ---- | ---- | ---- | ---- |
|abstract|assert|boolean|break|byte|case|
|catch|char|class|continue|default|do|
|double|else|enum|extends|final|finally|
|float|for|if|implements|import|int|
|interface|instanceof|long|native|new|package|
|private|protected|public|return|short|static|
|strictfp|super|switch|synchronized|this|throw|
|throws|transient|try|void|volatile|while|

- 2个保留字（现在没用以后可能用到作为关键字）：goto、const。

- 3个特殊直接量：true、false、null

- 类名、变量名以及方法名都被称为标识符

##### 命名规则

- 所有标识符必须以A-Z、a-z，美元符$,或者下划线_开始

- 首字母之后可以是字母、美元符、下划线或任意数字的任意字符组合
- 可以使用中文变量名、但一般不会这么用
- 标识符大小写敏感
- 不能使用关键字作为变量名或者类名等
- 驼峰命名

### 数据类型

#### 数据类型

- 强类型语言
  - 变量先定义后使用
  - 安全性更好、速度慢些
- 弱类型语言
- Java数据类型分为两大类
  - 基本类型**primitive type**
  
    - 数值类型
  
      - 整数类型
  
        - byte 1个字节 -128~127
  
        - short 2个字节 -32768~32767
  
        - int 4个字节 -2<sup>32</sup>~-2<sup>32</sup>-1
  
        - long 8个字节 -2<sup>64</sup>~2<sup>64</sup>-1
  
          - ```java
            long l = 123L
            ```
  
      - 浮点类型
  
        - float 4个字节
  
          - ```java
            float m = 2.0f
            ```
  
        - double 8个字节
  
      - 字符类型
  
        - char 2个字节
  
    - boolean类型
  
      - 占一位，只有true和false
  
  - 引用类型**reference type**
  
    - 类
    - 接口
    - 数组

#### 什么是字节

- 位 bit
  - 计算机内部数据存储最小单位
- 字节 byte 
  - 数据处理最基本单位 B
- 1B = 8bit
- 字符 计算机中使用的字母、数字、字和符号
- 1024B = 1kB
- 1024kb = 1M
- 1024M = 1G

#### 整数拓展

##### 进制

- 二进制0b 、十进制、八进制0、十六进制0x

- ```java
  int i = 10;
  int ii = 010;
  int iii = 0x10;
  ```

#### 浮点数拓展

##### 银行业务等

- 使用BigDecimal数学工具类
- 浮点数存在舍入误差，接近不等于
- 最好完全避免使用浮点数比较

#### 字符拓展

```java
char m = 'a';
//所有字符本质还是数字，可以强转为数字
//编码Unicode 表 2字节 0-65536
//U0000 UFFFF
char mm = '\u0061';
```

转义字符

- \t
- \n
- ...

### 类型转换

- 强类型语言需要用到类型转换
- 低------------------------------>高
- byte->short,char->int->long->float->double
- 运算中，不同数据类型先转化为同一类型

#### 强制转换

- (类型)变量名  高->低

#### 自动转换

- 低->高

#### 转换注意

1. 不能对布尔值进行转换

2. 不能把对象类型转换为不相干的类型

3. 把高容量转换为低容量，强制转换，

4. 可能存在内存溢出，精度丢失

5. 数字自建可以用下划线分割，不影响真实数字

   - ```java
     int money = 1_22_222
     ```

6. 操作比较大的数，注意溢出，转换之前是否溢出

### 变量

- 可以变化的量
- 强类型语言，每个变量必须声明其类型
- Java变量是程序最基本的存储单元，包括变量名，变量类型和作用域
- 可以用逗号隔开来声明多个同类型变量
- 可以基本类型，可以引用类型
- 变量名必须是合法标识符
- 局部变量必须声明和初始化值
- 实例变量，从属于对象，对于基本类型，默认值为0或0.0
- 布尔值，默认false
- 其余都是null
- 类变量static
- 命名规则

### 常量

- final
- 常量一般使用大写字符
- 初始化后不能改变
- 修饰符不存在先后顺序

### 运算符

#### 支持的运算符

- 算术运算符

  - +、-、*、/、%、++、--

- 复制运算符

  - =

- 关系运算符

  - `>`、<、>=、==、!=、instanceof

- 逻辑运算符

  - &&、||、!

- 位运算符

  - &、|、^、~、>>、<< 了解

- 条件运算符

  - ? :

- 扩展赋值运算符

  - +=、-=、*=、/=

- 注意类型转换

  - ""+a+b
  - a+b+""

  

#### Math

- 幂运算
  - Math.pow

### 包机制

- 一般使用公司域名作为包名

- 语法格式

  - ```java
    package com.flywinter.demo2;
    import ai.djl.ModelException;
    ```

### JavaDoc

- [Java帮助文档](https://www.oracle.com/cn/java/technologies/java-se-api-doc.html)

- 参数信息

  - @author
  - @version
  - @since
  - @param
  - @return
  - @throws
  - ...

- ```bash
  javadoc -encoding UTF-8 -charset UTF-8 hello.java //生成javaDoc
  ```

- IDEA生成javaDoc

  - tool里面

## Java流程控制

### 用户交互

```java
//扫描器对象，用于接收键盘数据
  Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            String next = scanner.next(); //等待用户输入完毕
            System.out.println(next);
        }
        scanner.close();
```

- next以空格为结束符
- nextline以enter为结束符

```java
Scanner scanner = new Scanner(System.in);
double sum = 0;
int m = 0;
while (scanner.hasNextDouble()) {
    double x = scanner.nextDouble();
    m++;
    sum+=x;
}
System.out.println(sum);
System.out.println(sum/m);
scanner.close();
```

### 顺序结构

- 一行一行执行，依次执行
- 任何一个算法都离不开的一种基本算法结构

### 选择结构

- if单选

- if双选

- if多选

- 嵌套if

- switch多选

  - ```java
    switch (experssion) {
        case 1:
           System.out.println("ss");
           break;
        case 2:
           System.out.println("dd");
            break;
           default:                          System.out.println("default");
            }
    ```

  - byte\short\int或char

  - SE7开始支持String类型

  - case标签必须为字符串窗帘或字面量

### 循环结构

- while循环

  - 可能一次都不执行
  - 先判断后执行

- do while循环

  - 至少执行一次
  - 先执行后判断

- for循环

- java5引入增强for循环

  - ```java
     for (String s : stringList) {
                
            }
    ```

- 打印99乘法表

  - ```java
    public static void main(String[] args) {
            for (int i = 1; i <= 9; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i+"*"+j+"="+i*j+" ");
                }
                System.out.println();
            }
        }
    ```

- break、continue

  - break直接打破循环
  - continue跳过本次循环

### 打印三角形

```java
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
```

## Java方法

### 什么是方法

- Java方法是语句的集合，在一起执行一个功能
- 方法是解决一类问题的步骤的有序集合
- 方法包含于类和对象中
- 方法在程序中被创建，在其他地方被引用
- 设计方法的原则
  - 最好保持方法的原子性，就是一个方法只完成一个功能，有利于后期的扩展

### 方法的定义

- 方法包含一个方法头和方法体

  - 修饰符 可选

  - 返回值类型 

  - 方法名

  - 参数类型

    - 方法可以不包含任何参数

    - 形参 方法被调用时用于接收外界的数据
    - 实参 调用方法时传给方法的参数
    - 终止方法
      - return 0

  - 方法体

### 方法的重载

- 重载就是在一个类中有相同的方法名，但是参数不同
- 方法重载规则
  - **方法名必须相同**
  - **参数列表必须不同**(个数，类型，排列顺序)
  - 返回值可以相同可以不同
  - 仅仅返回类型不同不是方法重载
- 实现理论
  - 方法名称相同时，编译器会根据调用方法的参数个数，参数类型等去诸葛匹配，以选择对应的方法，如果匹配失败，则编译器报错

### 命令行传参

- 运行程序的时候再传递消息，通过命令行参数给main函数实现

  ```bash
  javac Hello.java
  //如果命令行运行，必须在src文件夹下
  java com.flywinter.demo.Hello this is hello
  //以空格为分隔
  ```

### 可变参数

- JDK1.5开始，Java支持传递同类型的可变参数给一个方法

- 在方法声明中，在指定参数类型后加一个省略号

- 一个方法中只能指定一个可变参数，它必须是方法的最后一个参数，任何普通的参数必须在它之前声明

- ```java
    public void print(double d,int... ints){
          for (int anInt : ints) {
              System.out.println(anInt);
          }
          System.out.println(d);
      }
  ```

- 本质是数组

### 递归

- 递归就是A方法调用A方法，自己调用自己

- 递归的能力在于用有限的语句来定义对象的无限集合

- 递归结构包括两个部分

  - 递归头
    - 什么时候不调用自身方法，如果没有头，将陷入死循环
  - 递归体
    - 什么时候需要调用自身方法

- ```java
  //递归计算阶乘
  public static int f(int n){
      if (n == 1) {
          return 1;
      }else {
          return n*f(n-1);
      }
  }
  ```

- 能不用就不用，递归次数太多会导致栈溢出

## 数组

### 数组概述

#### 数组的定义

- 数组是相同类型的有序集合
- 数组描述的是相同类型的若干个数据，按照一定的先后此项排列组合而成
- 其中，每一个数据称作一个数组元数，每个数组元素可以通过一个下标来访问它们

#### 数组声明创建

- 首先必须声明数组变量，才能在程序中使用数组

- ```java
  int[] list;//首选
  int list[];//效果相同，不是首选方法
  ```

- Java语言使用new操作符来创建数组

- ```java
  int[] ints = new int[10];
  ```

- 数组元素是通过索引访问的，索引从0开始

- 获取数组长度

- ```java
  ints.length
  ```

### 数组初始化

- 静态初始化

- ```java
  int[] ints = {1,2,3};
  String[] strings = {new String("22"),new String("36")};
  ```

- 动态初始化

- ```java
  int[] a= new int[2];
  a[0] = 1;
  a[1] = 2;
  ```

- 数组的默认初始化

  - 数组是引用类型，他的元素相当于类的实例变量，因此数组一经分配控件，其中的每个元素也被按照实例变量同样的方式被隐式初始化

#### 数组的四个基本特点

- 长度确定，数组一旦被创建，大小不可改变
- 其元素必须是相同类型，不允许出现混合类型
- 数组中的元素可以是任何数据类型，包括基本类型和引用类型
- 数组变量属引用类型，数组可以看成是对象，数组中的每个元素相当于该对象的成员变量，数组本身就是对象，Java中对象是在堆中的，因此数组无论保存原始类型还是其他对象类型，**数组对象本身是在堆中的**

#### 内存分析

##### Java内存分析

- Java内存
  - 堆
    - 存放new的对象和数组
    - 可以被所有的线程共享，不会存放别的对象引用
  - 栈
    - 存放基本变量类型(会包含这个基本类型的具体数值)
    - 引用对象的变量(会存放这个引用在堆里面的具体地址)
  - 方法区
    - 可以被所有的线程共享
    - 包含了所有的class和static变量

### 数组边界

- 下标合法区间[0,length-1]，如果越界就会报错
- ArrayIndexOutOfBoundsException 数组下标越界异常
- 小结
  - 数组是相同的数据类型(数据类型可以为任意类型)的有序集合
  - 数组也是对象，数组元素相当于对象的成员变量
  - 数组的长度是确定的，不可变的，如果越界，则报数组下标越界异常

### 数组使用

- for-each

- 数组作方法传参

- 数组作返回值

- ```java
   //反转数组
  public static int[] reverse(int[] arrays){
       int[] result = new int[arrays.length];
      for (int i = 0,j=result.length-1; i <arrays.length; i++) {
          result[j] = arrays[i];
      }
      return result;
  }
  ```

### 多维数组

- 多为数组可以看成是数组的数组，比如二维数组就是一个特殊的一维数组，其每一个元素都是一个一维数组

- 二维数组

- ```java
  int[][] a = new int[2][3];
  ```

- ```java
  int[][] a = {{2,3},{3,3}};
  ```

### Arrays类

- 是数组的工具类
  - java.util.Arrays
- 由于数组对象本身并没有什么方法可以供我们调用，但是API中提供了Arrays工具类可以使用，进行一些基本操作
- Arrays类中所有方法都是static修饰的静态方法，使用的时候可以直接使用类名进行调用，而一般不适用对象来调用
- 具有以下常用功能
  - 数组赋值 fill
  - 数组排序 sort 升序
  - 比较数组 equal
  - 查找数组元素 binarySearch 二分查找

### 排序算法

#### 冒泡排序

- 两层循环，外层冒泡轮数，里层依次比较

- 时间负载的为O(n2)

- ```java
  public int[] sort(int[] arrays) {
      int temp;
      for (int i = 0; i < arrays.length-1; i++) {
          for (int j = 0; j < arrays.length - 1- i; j++) {
              if (arrays[j+1] > arrays[j]) {
                  temp = arrays[j];
                  arrays[j] = arrays[j+1];
                  arrays[j+1] = temp;
              }
          }
      }
      return arrays;
  }
  ```

- 优化，如果已经排好了，就没必要再排了

- ```java
  public int[] sort(int[] arrays) {
      int temp;
      for (int i = 0; i < arrays.length-1; i++) {
          boolean flag = false;//减少无意义的比较
          for (int j = 0; j < arrays.length - 1- i; j++) {
              if (arrays[j+1] > arrays[j]) {
                  temp = arrays[j];
                  arrays[j] = arrays[j+1];
                  arrays[j+1] = temp;
                  flag = true;
              }
          }
          if (!flag) {
              break;
          }
      }
      return arrays;
  }
  ```

#### 选择排序

#### 插入排序

#### 快速排序

#### 归并排序

#### 希尔排序

#### 堆排序

#### 基数排序

#### 数组查找

##### 逐个查找

```java
//逐个遍历查找
private static int getIndexByArr(int[] arr,int search) {
    for (int i = 0; i < arr.length; i++) {
        if (search == arr[i]) {
            return i;
        }
    }
    return -1;
}
```

##### 二分查找

```java
//二分查找
//条件：数组必须有序
//原理：每次查找中间
private static int getIndexByArrT(int[] arr,int search) {
    int minIndex =0;
    int maxIndex = arr.length-1;
    int centerIndex = (minIndex+maxIndex)/2;

    while (minIndex<=maxIndex){
        if (search == arr[centerIndex]) {
            return centerIndex;
        }else if (search>arr[centerIndex]){
            minIndex = centerIndex+1;
        }else if (search<arr[centerIndex]){
            maxIndex = centerIndex-1;
        }
    }

    return -1;
}
```

### 稀疏数组

- 一种数据结构

- 当一个数组中大部分元素为0，或者为同一值的数组时，可以使用稀疏数组来保存该数组

- 稀疏数组的处理方式是

  - 记录数组一共有几行几列，有多少个不同值
  - 把具有不同值的元素和行列及值记录在一个小规模的数组中，从而缩小程序的规模

- ```java
  public void arr(){
      int[][] arrays= {
              {0,0,0,1},
              {1,0,1,0},
              {0,0,0,0},
              {0,2,0,1}
      };
      int sum = 0;
      for (int i = 0; i < 4; i++) {
          for (int j = 0; j < 4; j++) {
              if (arrays[i][j] != 0) {
                  sum++;
              }
          }
      }
      //创建稀疏数组
      int[][] arrays2 = new int[sum+1][3];
      arrays2[0][0] = 4;
      arrays2[0][1] = 4;
      arrays2[0][2] = sum;
      int count = 0;
      for (int i = 0; i < arrays.length; i++) {
          for (int j = 0; j < arrays.length; j++) {
              if (arrays[i][j] != 0) {
                  count++;
                  arrays2[count][0] = i;
                  arrays2[count][1] = j;
                  arrays2[count][2] = arrays[i][j];
              }
          }
      }
      //输出
      for (int i = 0; i < arrays2.length; i++) {
          System.out.print(arrays2[i][0]);
          System.out.print(arrays2[i][1]);
          System.out.print(arrays2[i][2]);
          System.out.println();
      }
  
      //读取
      int[][] array3 = new int[arrays2[0][0]][arrays2[0][1]];
      //赋值
      for (int i = 1; i < arrays2.length; i++) {
          array3[arrays2[i][0]][arrays2[i][1]] = arrays2[i][2];
      }
  }
  ```

## 面向对象

### 面向对象&面向过程

- 面向过程
  - 步骤清晰简单，分布进行
  - 适合处理一些较为简单的问题
- 面向对象
  - 物以类聚，先分类，再细节
  - 适合处理复杂问题
- **对于描述复杂的事物，为了从宏观上把握，从整体上合理分析，需要设用面向对象的思路来分析整个系统，但是具体到微观操作，依旧需要面向过程的思路去处理**

### 什么是面向对象

- 面向对象编程 (Object-Oriented Programming)OOP
- 面向独享编程的本质就是以类都方式组织代码，以对象的组织(封装)数据
- 抽象
- 三大特性
  - 封装
  - 继承
  - 多态
- 从认识论角度，现有对象后有类，很多不同的人抽象为人
- 从代码角度，先有类后又对象，类是对象的模板

### 回顾方法

#### 方法定义

- 修饰符
- 返回类型
- **break和return区别**
  - break
    - 跳出循环，跳出switch
  - return
    - 结束方法，返回一个结果
- 方法名
  - 符合规范，见名知意
- 参数列表
- 异常抛出

#### 方法的调用

- 静态方法
  - 可以直接用类名加方法名调用
  - 和类一块加载
- 非静态方法
  - 只能实例化后才能调用
  - 实例化后才会加载
- 形参和实参
- 值传递和引用传递
- this关键字
- Java本质是值传递

### 类和对象的关系

- 类是一种抽线的数据类型，他是对某一类事物整体描述，但是并不能代表某一个具体的事物
- 对象是抽象概念的具体实例

### 创建和初始化对象

- 使用new 关键字创建对象
- 类里面只有属性和方法

### 构造器

- 一个类即使什么都不写，也会存在一个无参构造器
- 可以实例化初始值
- 构造器名必须和类名相同
- 没有返回值
- 一旦定义了有参构造，如果需要无参构造，无参构造必须显式定义无参构造
- new 本质是在调用构造方法

### 内存分析

- Java1.8之后String常量在堆中
- new一个对象后，引用变量名在栈中，也就是存储的内存地址，实际的东西在堆中，栈相当于目录，堆相当于内容
- 堆里面有一个特殊的区域叫方法区，Java7之后方法区移到了内存
- 堆里面存放具体创建的对象
- 栈里面是变量引用和一些方法

### 类和对象小结

1. 类和对象
   - 类是要给模板：抽象，对象是一个具体的实例
2. 方法
   - 定义、调用
3. 对应的引用
   - 引用类型 基本类型8
   - 对象是通过应用来操作的：栈->堆
4. 属性：字段Field 成员变量
   - 默认初始化
     - 数字 0 0.0
     - char u0000
     - boolean false
     - 引用 null
   - 修饰符 属性类型 属性名 = 属性值
5. 对象的创建和使用
   - 必须使用new 关键字创建对象 构造器
   - 对象的属性
   - 对象的方法
6. 类
   - 静态的属性 属性
   - 动态的行为 方法

### 封装

- 高内聚、低耦合
  - 高内聚就是类的内部数据操作细节自己完成，不允许外部干涉
  - 低耦合仅暴露少量的方法给外部使用
- 封装 数据的隐藏
  - 通常，应禁止直接访问一个对象中数据的实际表示，而应通过操作接口来访问，这称为信息隐藏
- 属性私有 get/set
  - 提高程序的安全性、保护数据
  - 隐藏代码的实现细节
  - 统一接口
  - 增加系统可维护性

### 继承

- 继承的本质是对某一批类的抽象
- extends的意思是扩展，子类是父类的扩展
- Java类中只有单继承，没有多继承
- 继承是类和类之间的一种关系，除此之外，类和类之间的关系还有依赖、组合、聚合等
- 继承关系的两个类，一个类为子类(派生类)、一个类为父类(基类),子类继承父类，使用关键字extends来表示
- 子类和父类之间，从意义上讲应该具有is a的关系
- 子类继承了父类，就会拥有父类的全部公共方法
- 在Java中，所有类都直接或间接继承object类
- object类
- super
- 方法重写

#### super

- 用来访问父类的相关属性和方法等
- super()调用父类构造器，必须在子类构造器第一行
- super必须只能出现在子类的方法或构造方法中
- super和this不能同时调用构造方法
- 与this区别
  - 代表的对象不同
    - this 本身调用者这个对象
    - super 代表父类对象的应用
  - 前提
    - this没有继承也可以使用
    - super 只能在继承条件才可以使用
  - 构造方法
    - this() 本类的构造
    - super() 父类的构造

#### 方法重写

- 父类的引用指向子类，输出的还是父类
- 静态方法掉调用只和左边定义的数据类型有关
- 非静态方法重写后，调用的是右边对象的方法
- 静态方法和非静态方法有区别，非静态方法才是重写
- 重写需要有继承关系
  - 方法名必须相同
  - 参数列表必须相同
  - 修饰符范围可以扩大，但是不能缩小public >protected>Default>private
  - 抛出的异常，范围可以被缩小，但是不能扩大
  - 子类方法和父类一致，方法体不同
- 为什么重写
  - 父类的功能，子类不一定需要或者不一定满足

### 多态

- 动态编译
- 即同一方法可以根据发送对象的不同而采用多种不同的行为方式
- 一个对象的实际类型是确定的，但可以指向对象的引用的类型有很多
- 可以指向的引用类型不确定：父类的引用指向子类
- 对象能执行哪些方法看左边
- 注意
  - 多态是方法的多态，属性没有多态
  - 父类和子类有联系，没有联系会有ClassCastException
  - 存在条件 继承关系，方法需要重写
  - 父类引用指向子类对象
- 不能重写的方法
  - static
  - final
  - private
- instanceof 类型转换 引用类型
  - 判断一个对象是什么类型
  - 子类到父类是强制转换
  - 子类转换为父类，可能丢失自己的本来的一些方法

### static

- 静态的变量和非静态的变量

- 静态变量或者静态方法可以直接通过类名直接使用

- 静态在内存中只有一个,static只执行一次

- 非静态方法可以调用静态方法

- 静态方法无法调用非静态方法

- 静态代码块

- ```java
  static{
  
  }
  {
      //匿名代码块
  }
  ```

- 调用顺序 静态代码块 > 匿名代码块 >构造方法

- 静态导入包

- ```java
  import static java.lang.Math.PI
  ```

### 抽象类

- abstract修饰符可以用来修饰方法也可以修饰类，修饰方法就是抽象方法，修饰类就是抽象类
- 抽象类中可以没有抽象方法，有抽象方法的类一定要声明为抽象类
- **抽象类不能使用new关键字来创建对象，是让子类来继承的**
- 抽象方法只有方法的声明，没有方法的实现，他是用来让子类实现的
- 子类继承抽象类那么就必须要实现抽象类没有实现的抽象方法，否则该子类也要声明为抽象类
- 不存在构造器

### 接口

- 普通类 只有具体实现
- 抽象类 具体实现和规范(抽象方法)都有
- 接口 只有规范
- 接口就是规范，定义的是一组规则
- 接口的本质是契约，制定好后大家都遵守
- OO的精髓，是对抽象的抽象，最能体现这一点的就是接口，设计模式所研究的，实际上就是如何合理的去抽象
- 声明的关键字是interface
- 接口中所有定义其实都是抽象的public abstract
- 接口都需要实现类Impl
- 类可以实现接口implements
- 利用接口实现多继承
- 常量 public static final
- 作用
  - 约束
  - 定义一些方法，用不同的人实现
  - public static final
  - public abstract
  - 接口不能实例化，接口中没有构造方法
  - implements可以实现多个接口
  - 必须要重写接口中的方法

### 内部类

- 内部类就是在一个类的内部定义一个类
- 分类
  - 成员内部类
  - 静态内部类 加static
  - 局部内部类 方法中定义类
  - 匿名内部类 没有名字的初始化类，不用将实例保存到变量中
- 内部类可以获得外部类私有属性方法等
- 一个Java类中可以有多个class类，但是只能有一个public
- 实例化外部类后通过new实例化内部类

## 异常

### 什么是异常

- 用户输入不符合要求，打开文件不存在，内存满等
- Exception

### 分类

- 检查性异常
- 运行时异常
- 错误 错误不是异常，编译也检查不到

### 异常体系结构

- Java把异常当作对象来处理，定义一个基类java.lang.Throwable作为索引异常的超类
- 异常分为错误Error和异常Exception
- Throwable
  - Error
  - Exception
- Error由Java虚拟机生成并抛出，大多数错误与代码编写者无关
- Exception一般是程序逻辑引起的
- Error程序无法控制和处理，出现时一般会终止线程，Exception通常可以被程序处理，并且在程序中应该尽可能去处理这些异常

### 异常处理机制

- 抛出异常
- 捕获异常
- 异常处理五个关键字
  - try
  - catch
  - finally
    - 可以不要，但一般IO流中一般需要这个关闭
  - throw
    - 方法里抛出
  - throws
    - 方法上抛出

### 自定义异常

- 创建自定义异常类
- 在方法中抛出
- 继承Exception类即可
- 实现构造方法和toString

## 网络编程

### 概述

- 计算机网络是指讲地理位置不同的具有独立功能的多台计算机及其外部设备，通过通信线路连接起来，在网络操作系统、网络管理软件及网络通信协议的管理和协调下，实现资源共享和信息传递的计算机系统
- 网络编程的目的
  - 数据交换，通信
- 达到通信需要实现什么
  - 如何准确的定位网络上的一台主机 192.168.1.1：8080
  - 找到后如何传递数据
- javaweb 网络编程 B/S
- 网络编程 TCP/IP C/S

### 网络通信的要素

通信双方地址

- ip
- 端口

规则 网络通信的协议

TCP/IP参考模型

![image-20210627182221708](E:\learnNote\image\image-20210627182221708.png)

传输层 TCP UDP

小结

1. 网络编程中有两个主要的问题
   - 如何准确的定位到网络上的一台或多台主机
   - 找到主机之后如何进行通信
2. 网络编程中的要素
   - IP和端口号
   - 网络通信协议 UDP TCP
3. 万物皆对象

### IP

IP地址 InetAddress

- 唯一定位一台网络上计算机
- 127.0.0.1 本机localhost
- ip地址的分类
  - ipv4/ipv6
    - IPV4 127.0.0.1 4个字节组成 0-255 42亿 30亿北美，亚洲4亿 2011年用尽
    - IPV6 128位 8个无符号整数
  - 公网(互联网)-私网(局域网)
    - ABCD类地址
    - 192.168.xx.xx专门给组织内部用的
  - 域名：记忆IP问题
    - IP www.baidu.com

```java
try {
    //查询本机地址
    InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
    InetAddress inetAddress1 = InetAddress.getByName("localhost");
    //查询网址ip地址
    InetAddress inetBaidu = InetAddress.getByName("www.baidu.com");
    System.out.println(inetBaidu.getAddress());
    System.out.println(inetBaidu.getCanonicalHostName());
    System.out.println(inetBaidu.getHostAddress());
    System.out.println(inetBaidu.getHostName());
} catch (UnknownHostException e) {
    e.printStackTrace();
}
```

### 端口

端口表示计算机上的一个程序的进程

- 不同的进程有不同的端口号 用来区分软件

- 被规定0-65535

- TCP、UDP 65535*2 单个写一下，端口号不能冲突

- 端口分类

  - 公有端口0-1023

    - HTTP:80
    - HTTPS:443
    - FTP:21
    - Telnet:23

  - 程序注册端口：1024-49151 分配给用户或程序

    - Tomcat：8080
    - MySQL: 3306
    - Oracle:1521

  - 动态、私有 49152-65532

    ```bash
    netstat -ano #查看所有端口
    netstat -ano | findstr "1080" #查看指定端口
    tasklist|findstr "1080" #查看指定端口进程
    Ctrl+shift+esc
    ```

    ```java
    InetSocketAddress socketAddress = new InetSocketAddress("127.0.0.1", 1360);
    InetAddress address = socketAddress.getAddress();
    String hostName = socketAddress.getHostName();
    int port = socketAddress.getPort();
    ```

  - 端口映射

### 通信协议

协议：约定

**网络通信协议**：速率、传输码率、代码结构、传输控制

非常复杂

分层

**TCP/IP协议簇 **一堆协议的总和 

重要

- TCP 用户传输协议
- UDP 用户数据报协议

出名的协议

- TCP
- IP 网络互联协议

TCP UDP对比

TCP 打电话

- 连接稳定

- 三次握手 四次挥手

  ```
  最少需要三次保证稳定连接
  A 可以连接吗
  B 可以连接
  A 连接
  
  A 要断开连接了
  B 真的要断开连接吗
  B 你真的要断开吗
  A 我真的要断开了
  ```

- 客户端 服务端

- 传输完成 释放连接 效率低

UDP 发短信

- 不连接 不稳定
- 客户端 服务端没有明确的界限
- 不管有没有准备好，都可以发送
- DDOS 洪水攻击 饱和攻击

### TCP

客户端

1. 连接服务器Socket
2. 发送消息

```java
//客户端
class TCPClient{
    public static void main(String[] args) {
        Socket socket = null;
        OutputStream os = null;
        try {
            //要知道服务端的地址
            InetAddress serverIp = InetAddress.getByName("127.0.0.1");
            int port = 9898;
            //创建一个socket连接
             socket = new Socket(serverIp, port);
             os = socket.getOutputStream();
            os.write("欢迎，开始连接".getBytes());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (os!=null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket!=null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
```

服务器

1. 简历服务的断开
2. 等待用户的连接 accept
3. 接收用户的消息

```java
//服务端
class TCPServer{
    public static void main(String[] args) {

        ServerSocket serverSocket = null;
        Socket accept = null;
        InputStream is = null;
        ByteArrayOutputStream baos = null;
        try {
            //得有一个地址
             serverSocket = new ServerSocket(9898);
             while (true){
                 //等待客户端连接过来
                 accept = serverSocket.accept();
                 //读取客户端的消息
                 is = accept.getInputStream();
//            byte[] buffer = new byte[1024];
//            int len;
//            while ((len = is.read(buffer))!=-1){
//                String s = new String(buffer, 0, len);
//                System.out.println(s);
//            }
                 //管道流
                 baos = new ByteArrayOutputStream();
                 byte[] buffer = new byte[1024];
                 int len;
                 while ((len = is.read(buffer))!=-1){
                     baos.write(buffer,0,len);
                 }
                 System.out.println(baos.toString());
             }


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭资源
            if (baos!=null) {

                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (is != null) {

                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (accept!=null) {

                try {
                    accept.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (serverSocket!=null) {

                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
```

### 文件上传

客户端

```java
class TCPFileSend{
    public static void main(String[] args) throws IOException {
        //创建一个socket连接
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 9523);
        //创建一个输出流
        OutputStream os = socket.getOutputStream();
        //读取文件
        FileInputStream fis = new FileInputStream(new File("mm.txt"));
        //写出文件
        byte[] buffer = new byte[1024];
        int len;
        while ((len = fis.read(buffer))!=-1){
            os.write(buffer,0,len);
        }
        //通知服务器五已经结束啦
        socket.shutdownInput();//我已经传输完了
        //确定服务器接收完毕才能够断开连接
        InputStream is = socket.getInputStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] bufferin = new byte[1024];
        int lenn;
        while ((lenn = is.read(bufferin))!=-1){
            baos.write(bufferin,0,lenn);
        }
        System.out.println(baos.toString());
        //关闭资源
        fis.close();
        os.close();
        socket.close();
    }
}
```

服务端

```java
class TCPFileReceive{
    public static void main(String[] args) throws IOException {
        //创建服务
        ServerSocket serverSocket = new ServerSocket(9523);
        //监听客户端的连接
        Socket accept = serverSocket.accept();//阻塞式监听，会一直等待客户端连接
        // 获取输入流
        InputStream is = accept.getInputStream();
        //文件输出
        FileOutputStream fos = new FileOutputStream(new File("receive"));
        byte[] buffer = new byte[1024];
        int len;
        while ((len=is.read(buffer))!=-1){
            fos.write(buffer,0,len);
        }
        //通知客户端我接收完毕了
        OutputStream os = accept.getOutputStream();
        os.write("我接受完毕了，可以断开了".getBytes());
        //关闭资源
        fos.close();
        is.close();
        accept.close();
        serverSocket.close();
    }
}
```

### Tomcat

服务端

- 自定义S
- Tomcat服务器S Java后台开发

客户端

- 自定义C
- 自浏览器 B

### UDP

发送端

```java
//不需要连接服务器
class UDPClient{
    public static void main(String[] args) throws IOException {
        //建立一个Socket
        DatagramSocket socket = new DatagramSocket();
        //建个包
        String msg= "来自客户端的消息";
        //发送给谁
        InetAddress localhost = InetAddress.getByName("localhost");
        int port = 9090;
        //数据，数据的长度起始，要发送给谁
        DatagramPacket packet = new DatagramPacket(msg.getBytes(), 0, msg.getBytes().length,localhost,port);
        //发送包
        socket.send(packet);
        socket.close();
    }
}
```

接收端

```java
class UDPServer{
    public static void main(String[] args) throws IOException {
        //开放端口
        DatagramSocket socket = new DatagramSocket(9090);
        //接收数据包
        byte[] buffer = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer, 0, buffer.length);
        socket.receive(packet);
        System.out.println(packet.getAddress().getHostAddress());
        System.out.println(new String(packet.getData(),0, packet.getLength()));
        socket.close();
    }
}
```

#### 循环发送接收

循环发送

```java
class UDPSend{
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(8756);
        //控制台接收数据
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String data = reader.readLine();
            byte[] bytes = data.getBytes();
            DatagramPacket packet = new DatagramPacket(bytes,0,bytes.length,new InetSocketAddress("localhost",8222));
            socket.send(packet);
            if (data.equals("bye")) {
                break;
            }
        }

        socket.close();
    }
}
```

循环接收

```java
class UDPReceive{
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(8222);
        while (true){
            byte[] container = new byte[1024];
            DatagramPacket packet = new DatagramPacket(container,0,container.length);
            //阻塞式接收包裹
            socket.receive(packet);
            byte[] receive = packet.getData();
            String data = new String(receive, 0, packet.getLength());
            System.out.println(data);
            if (data.equals("bye")) {
                break;
            }
        }
        socket.close();
    }
}
```

#### 咨询功能实现

```java
//咨询功能
class TalkSend implements Runnable {
    DatagramSocket socket;
    BufferedReader reader;

    private String toIp;
    private int fromPort;
    private int toPort;


    public TalkSend(int fromPort, String toIp, int toPort) {
        this.fromPort = fromPort;
        this.toIp = toIp;
        this.toPort = toPort;
        try {
            socket = new DatagramSocket(fromPort);
            reader = new BufferedReader(new InputStreamReader(System.in));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public void run() {
        while (true) {
            try {
                String data = reader.readLine();
                byte[] datas = data.getBytes();
                DatagramPacket packet = new DatagramPacket(datas, 0, datas.length, new InetSocketAddress(this.toIp, this.toPort));

                socket.send(packet);
                if (data.trim().equals("bye")) {
                    break;
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        socket.close();
    }
}

class TalkReceive implements Runnable {
    DatagramSocket socket = null;
    private int port;
    private String msgFrom;

    public TalkReceive(int port,String msgFrom) {
        this.msgFrom = msgFrom;
        this.port = port;
        try {
            socket = new DatagramSocket(port);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                //接收数据包
                byte[] container = new byte[1024];
                DatagramPacket packet = new DatagramPacket(container, 0, container.length);
                socket.receive(packet);//阻塞式接收包裹

                byte[] data = packet.getData();
                String receiveString = new String(data, 0, packet.getLength());
                System.out.println(msgFrom+":"+receiveString);
                if (receiveString.equals("bye")) {
                    break;
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        socket.close();
    }
}

class TalkClient{
    public static void main(String[] args) {
        Thread localhost = new Thread(new TalkSend(6565, "localhost", 6999));
        Thread server = new Thread(new TalkReceive(8585, "服务端"));
        localhost.start();
        server.start();
    }
}
class TalkServer{
    public static void main(String[] args) {
        Thread localhost = new Thread(new TalkSend(3233, "localhost", 8585));
        Thread server = new Thread(new TalkReceive(6999, "学生端"));
        localhost.start();
        server.start();
    }
}
```

### URL

统一资源定位符：定位资源的，定位互联网上的某一个资源

DNS域名解析 把域名解析为IP

协议://ip地址:端口/项目名/资源

```java
class URLTest{
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8080/helloworld/index.html?userName=123");
        System.out.println(url.getProtocol());//协议名
        System.out.println(url.getHost());//主机ip
        System.out.println(url.getPort());//端口
        System.out.println(url.getPath());//文件
        System.out.println(url.getFile());//全路径
        System.out.println(url.getQuery());//参数
    }
}

class URLDown{
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.baidu.com/hello.txt");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        InputStream inputStream = connection.getInputStream();
        FileOutputStream fileOutputStream = new FileOutputStream("mm.txt");
        byte[] buffer= new byte[1024];
        int len;
        while ((len=inputStream.read(buffer))!=-1){
            fileOutputStream.write(buffer,0,len);
        }
        fileOutputStream.close();
        inputStream.close();
        connection.disconnect();
    }
}
```

## 多线程

### 线程简介

- 任务
- 多线程
- 主线程 子线程

程序 进程 线程

- 一个进程可以有多个线程，比如播放器可以放声音也可以放视频
- 进程就是执行程序的一次执行过程，动态的概念，系统资源分配的单位
- 程序是指令和数据的有序集合，其本身没有任何运行的含义，是一个静态的概念
- 线程是CPU调度和执行的单位
- 很多线程是模拟出来的，比如单核CUP，同一个时间点，cpu只能执行一个代码，因为切换的很快，造成多线程错觉

核心概念

- 线程就是独立的执行路径
- 在程序运行时，就是没有创建线程，后台也会有多个线程，比如主线程，gc线程
- main()称之为主线程，是系统的入口，用于执行整个程序
- 在一个进程中，如果开辟了多个线程，线程的运行由调度器安排调度，调度器是与操作系统紧密相关的，先后顺序不能认为干预
- 同一份资源操作时，存在资源抢夺问题，加入并发控制
- 线程会带来额外的开销，比如CPU调度时间，并发控制开销
- 每个线程在自己的工作内存交互，内存控制不当会造成数据不一致

### 线程创建

Thread、Runnable、Callable

- 继承Thread类

- 实现Runnable接口

- 实现Callable接口

#### Thread

- 自定义线程类继承Thread类
- 重写run()方法，编写线程执行体
- 创建线程对象，调用start()方法启动线程
- 线程不一定立即执行，CPU调度

#### 下载图片

```java
class ThreadImageDownload extends Thread{
    //网络名
    private String url;
    //保存的文件名
    private String name;

    public ThreadImageDownload( String url, String name1) {
        this.url = url;
        this.name = name1;
    }

    @Override
    public void run() {
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downLoader(url,name);
        System.out.println("下载的文件名为"+name);
    }

    public static void main(String[] args) {
        new ThreadImageDownload("https://webfs.yun.kugou.com/202106291241/7e4f88a78737c03f6bd9039419419979/KGTX/CLTX001/0f44537d8969323271430fa336d3c5b1.mp3","music.mp3").start();
        new ThreadImageDownload("https://webfs.yun.kugou.com/202106291249/6ce10b6b76ccb7ce74ab2f40686e8c0f/KGTX/CLTX001/fe38c5e198ec277ce6df7e354e1e4052.mp3","musi.mp3").start();
        new ThreadImageDownload("https://webfs.yun.kugou.com/202106291250/7e629d218102d7fe456cd3c5ed31989f/G212/M0A/1E/19/dIcBAF5uxnaAN2MuAC-0yapoN9M618.mp3","mus.mp3").start();

    }

}
class WebDownloader{
    public void downLoader(String url,String name) {
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

```xml
<dependency>
    <groupId>commons-io</groupId>
    <artifactId>commons-io</artifactId>
    <version>2.10.0</version>
</dependency>
```

#### Runnable(推荐)

- 定义MyRunnable类来实现Runnable接口
- 实现run方法，编写线程执行体
- 创建线程对象，调用start()方法启动线程

```java
class TestRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        TestRunnable testRunnable = new TestRunnable();
        new Thread(testRunnable).start();
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

    }
}
```

#### 小结

- 继承Thread类
  - 子类继承Thread类具备多线程能力
  - 启动线程 子类对象.start()
  - 不建议使用 避免OOP单继承局限性
- 实现Runnable接口
  - 实现接口Runnable具有多线程能力
  - 启动线程 传入目标对象＋Thread对象.start()
  - 推荐使用 避免单继承局限性，灵活方便 方便同一个对象被多个线程使用
- 一份资源，多个代理
  - 一个Runnable被多个Thread使用

```java
//多个线程操作同一个资源出现混乱
class MutRunnable implements Runnable{

    private int ticketNum = 10;

    @Override
    public void run() {
        while (true){
            if (ticketNum<=0) {
                break;
            }
            //模拟延时
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"--拿到了第"+ticketNum--+"票");
        }

    }

    public static void main(String[] args) {
        MutRunnable mutRunnable = new MutRunnable();
        new Thread(mutRunnable,"你").start();
        new Thread(mutRunnable,"我").start();
        new Thread(mutRunnable,"他").start();
    }
}
```

#### 龟兔赛跑

```java
class RaceTest implements Runnable{
    private static String winner;
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {

            if (Thread.currentThread().getName().equals("兔子")) {
                try {
                    Thread.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            boolean flag = gameOver(i);
            if (flag) {
                break;
            }

            System.out.println(Thread.currentThread().getName()+"跑了"+i+"步");
        }
    }
    private boolean gameOver(int steps){
        if (winner!=null) {
            return true;
        }{
            if (steps >=100) {
                winner = Thread.currentThread().getName();
                System.out.println("winner is "+ winner);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        RaceTest raceTest = new RaceTest();
        new Thread(raceTest,"兔子").start();
        new Thread(raceTest,"龟").start();
    }
}
```

#### Callable(了解)

1. 实现Callable接口，需要返回值类型
2. 重写call方法，需要抛出异常
3. 创建目标对象
4. 创建执行服务 ExecutorService ser = Executors.newFixedThreadPool(1);
5. 提交执行 Future<Bollean> result1 = ser.submit(t1);
6. 获取结果 boolean r1 = result.get()
7. 关闭服务ser.shutdownNow()

```java
/**
 * callable
 * 可以获取返回值
 * 可以抛出异常
 */
class TestCallable implements Callable<Boolean> {

    private String url;
    private String name;

    public TestCallable(String url, String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public Boolean call() throws Exception {
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downLoader(url,name);
        System.out.println("下载了文件名为: "+name);
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TestCallable t1 = new TestCallable("https://webfs.yun.kugou.com/202106291241/7e4f88a78737c03f6bd9039419419979/KGTX/CLTX001/0f44537d8969323271430fa336d3c5b1.mp3", "music.mp3");
        TestCallable t2 = new TestCallable("https://webfs.yun.kugou.com/202106291249/6ce10b6b76ccb7ce74ab2f40686e8c0f/KGTX/CLTX001/fe38c5e198ec277ce6df7e354e1e4052.mp3", "musi.mp3");
        TestCallable t3 = new TestCallable("https://webfs.yun.kugou.com/202106291250/7e629d218102d7fe456cd3c5ed31989f/G212/M0A/1E/19/dIcBAF5uxnaAN2MuAC-0yapoN9M618.mp3", "mus.mp3");

        //创建执行服务
        ExecutorService ser = Executors.newFixedThreadPool(3);
        //提交执行
        Future<Boolean> r1 = ser.submit(t1);
        Future<Boolean> r2 = ser.submit(t2);
        Future<Boolean> r3 = ser.submit(t3);
        //获取结果
        Boolean rs1 = r1.get();
        Boolean rs2 = r2.get();
        Boolean rs3 = r3.get();
        ser.shutdown();
    }
}
```

### 静态代理

```java
/**
 * 静态代理模式
 * 真实角色和代理角色需要实现同一接口
 * 代理对象要代理真实角色
 * @usage 代理对象可以做很多真实对象做不了的事情，真实对象做自己的事情
 */
class StaticProxy{
    public static void main(String[] args) {
        GamerProxy gamerProxy = new GamerProxy(new Gamer());
        gamerProxy.playGame();
    }
}
interface Game{

    void playGame();
}
//实际游戏玩家
class Gamer implements Game{

    @Override
    public void playGame() {
        System.out.println("玩家玩游戏");
    }
}
//游戏代练玩家
class GamerProxy implements Game{
    private Game target;

    public GamerProxy(Game target) {
        this.target = target;
    }

    @Override
    public void playGame() {
        before();
        this.target.playGame();
        after();
    }

    private void before() {
        System.out.println("开始玩游戏之前");
    }

    private void after() {
        System.out.println("结束玩游戏");
    }
}
```

### Lambda表达式

- 避免匿名内部类定义过多

- 属于函数式编程的概念

- ```java
  (params) -> expression [表达式]
  (params) -> statement [语句]
  (params) -> {statements}
  ```

- 函数式接口的定义

  - 任何接口，如果只包含唯一一个抽象方法，那么他就是一个函数式接口
  - 函数式接口可以通过lambda表达式来实现

```java
//推导lambda表达式
class LambdaTest{

    //静态内部类
    static class Link2 implements ILink{

        @Override
        public void lambdaClick() {
            System.out.println("lambda2");
        }
    }

    public static void main(String[] args) {
        ILink link = new Link();
        link.lambdaClick();

        link = new Link2();
        link.lambdaClick();

        //局部内部类
        class Link3 implements ILink{
            @Override
            public void lambdaClick() {
                System.out.println("lambda3");
            }
        }
        link = new Link3();
        link.lambdaClick();
        //匿名内部类,没有类的名称，必须借助接口或者父类
        link = new ILink() {
            @Override
            public void lambdaClick() {
                System.out.println("lambda3");
            }
        };
        link.lambdaClick();
        //用lambda简化
        link = () ->{
            System.out.println("lambda4");
        };
        link.lambdaClick();
    }
}
//定义一个函数式接口
interface ILink{
    void lambdaClick();
}
//接口实现类
class Link implements ILink{

    @Override
    public void lambdaClick() {
        System.out.println("Lambda");
    }
}
```

```java
class LambdaTest2 {
    public static void main(String[] args) {
        NewLink newLink = (String s) -> {
            System.out.println(s);
        };
        newLink.withParam("这是lambda");
        //简化一，去掉参数类型
        newLink = (s) -> {
            System.out.println(s);
        };
        newLink.withParam("这是lambda2");
        //简化三，去掉括号
        newLink = s -> {
            System.out.println(s);
        };
        newLink.withParam("这是lambda3");
        //简化四，去掉括号
        newLink = s -> System.out.println(s);
        newLink.withParam("这是lambda");
        //lambda只能有一行代码的情况下才能简化为一行，如果有多行需要用函数块包裹
        //必须是函数式接口
        //多个参数也可以去掉参数类型，要去掉就都去掉，但是不能去掉括号

    }
}

interface NewLink {
    void withParam(String s);
}
```

### 线程状态

- 创建状态
- 就绪状态
- 阻塞状态
- 运行状态
- 死亡状态

#### 线程方法

- setPriority 更改线程优先级
- static void sleep 指定的毫秒数内让当前正在执行的线程休眠
- void join 等待该线程终止
- static void yield 暂停当前正在执行的线程对象，并执行其他线程
- void interrupt 中断线程，一般不用这个
- boolean isAlive 测试线程是否处于活动状态

#### 线程停止

- 不推荐使用JDK提供的stop、destroy方法 ，已经废弃

- 推荐线程自己停下来

- 建议使用一个标志位进行终止变量，当flag==false，则终止线程运行

- ```java
  class TestStop implements Runnable{
      //线程中定义线程体使用的标识
      private boolean flag = true;
      @Override
      public void run() {
          //线程体使用该标识
          while (flag){
              System.out.println(Thread.currentThread().getName()+" running");
          }
      }
      //对外提供方法改变标识
      public void stop(){
          this.flag = false;
      }
  }
  ```

#### 线程休眠

- sleep 指定当前线程阻塞的毫秒数
- sleep 存在异常InterruptedException
- sleep 时间达到后线程进入就绪状态
- sleep可以模拟网络延时，倒计时等
- **每一个对象都有一个锁，sleep不会释放锁**

```java
//模拟网络延时主要是放大问题的发生性
class TestSleep implements Runnable{
    //票数
    private int ticketNums = 10;
    @Override
    public void run() {
        while (true) {
            if (ticketNums<=0) {
                break;
            }
            //模拟延时
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"--拿到了第"+ticketNums--+"张票");
        }
    }

    public static void main(String[] args) {
        TestSleep testSleep = new TestSleep();
        new Thread(testSleep,"小明").start();
        new Thread(testSleep,"小力").start();
    }
}
```



```java
//模拟倒计时
class TestSleepTime{
    public static void main(String[] args) {
        int num = 10;
        while (true){
            try {
                Thread.sleep(1000);
                System.out.println(num--);
                if (num<=0) {
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
```

#### 线程礼让

- 礼让线程，让当前正在执行的线程暂停，但不阻塞
- 将线程从运行状态转为就绪状态
- 让CPU重新调度，礼让不一定成功，看CPU心情

```java
//测试礼让线程
//礼让不一定成功
class TestYield{
    public static void main(String[] args) {
        MyYield myYield = new MyYield();
        new Thread(myYield,"a").start();
        new Thread(myYield,"b").start();
    }
}
class MyYield implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "Start");
        Thread.yield();
        System.out.println(Thread.currentThread().getName() + "End");
    }
}
```

#### Join

- Join合并线程，待此线程执行完成后，再执行其他线程，其他线程阻塞
- 类似于插队

```java
//测试Join方法插队
class TestJoin implements Runnable{


    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(random.nextInt(100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程插队"+i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TestJoin testJoin = new TestJoin();
        Thread thread = new Thread(testJoin);
        thread.start();
        for (int i = 0; i < 10; i++) {
            if (i <=5) {
                thread.join();
            }
            System.out.println("main"+i);
        }
    }
}
```

#### 线程状态观测

- Thread.State
  - NEW
    - 尚未启动的线程
  - RUNNABLE
    - 在Java虚拟机中执行的线程
  - BLOCKED
    - 被阻塞等待监视器锁定的线程
  - WAITING
    - 正在等待另一个线程执行特定动作的线程
  - TIMED_WATTING
    - 正在等待另一个线程执行动作达到指定等待时间的线程
  - TERMINATED
    - 已退出的线程

```java
//观察测试线程状态
class TestState{
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("///");
            }
        });
        //观察状态
        Thread.State state = thread.getState();
        System.out.println(state);

        thread.start();
        state = thread.getState();
        System.out.println(state);
        while (state != Thread.State.TERMINATED) {
            Thread.sleep(100);
            state = thread.getState();
            System.out.println(state);
        }

    }
}
```

**线程停止之后不能再次start()**

**线程只能启动一次**

### 线程优先级

- Java提供一个线程调度器来监控程序中启动后进入就绪状态的所有线程，线程调度器按照优先级决定应该调度哪个线程来执行
- 线程的优先级用数字表示，范围为1-10
  - Thread.MIN_PRIORITY = 1;
  - Thread.MAX_PRIORITY = 10;
  - Thread.NORM_PROIORITY = 5;
- 使用以下方式改变或获取优先级
  - getPriority.setPriority(int x)
- 优先级的设定最好在start调度前
- 优先级低只是一位置获得调度的概率低，并不是优先级低就不会被调用了，都是看CPU的调度
- 默认优先级是5

### 守护线程deamon

- 线程分为用户线程和守护吸纳从
- 虚拟机必须确保用户线程执行完毕
- 虚拟机不用等待守护线程执行完毕
- eg 后台操作日志、监控内存、垃圾挥手等待...

```java
//测试守护线程
class TestDaemon{
    public static void main(String[] args) {
        God god = new God();
        People people = new People();
        Thread thread = new Thread(god);
        thread.setDaemon(true); //默认false表示是用户线程，正常的都是用户线程
        thread.start();
        new Thread(people).start();
    }
}
class God implements Runnable{

    @Override
    public void run() {
        while (true){
            System.out.println("一直存在");
        }
    }
}
class People implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 36500; i++) {
            System.out.println("存在的时间");
        }
        System.out.println("Hello World!");
    }
}
```

### 线程同步

- 多个线程操作同一个资源

- **锁机制synchronized**

- 当一个线程获得对象的排它锁，独占资源，其他线程必须等待。使用后释放锁即可

- 存在的问题

  - 一个线程持有锁会导致其他所有需要此锁的线程挂起
  - 多线程竞争下，加锁，释放锁会导致比较多的上下文切换和调度延时，引起性能问题
  - 如果一个优先级高的线程等待一个优先级低的线程释放锁会导致优先级倒置，引起性能问题

  

#### 并发

- 同一个对象被多个线程同时操作

#### 线程同步

- 同一个资源，多个人使用，排队
- 使用队列，进入对象的等待池，前面的线程使用完毕后，后面的再使用

#### 队列和锁

#### 三大不安全示例

```java
//线程不安全，有负数，可能会拿到同一张
class UnsafeBuyTicket{
    public static void main(String[] args) {
        ByTicket byTicket = new ByTicket();
        new Thread(byTicket,"你").start();
        new Thread(byTicket,"我").start();
        new Thread(byTicket,"他").start();
    }
}

//不安全的买票
class ByTicket implements Runnable{
    //ticket
    private int ticketNums = 10;
     boolean flag = true;//外部停止方式
    @SneakyThrows
    @Override
    public void run() {
        //买票
        while (flag){
            buy();
        }

    }
    private void buy() throws InterruptedException {
        if (ticketNums<=0) {
            return;
        }
        Thread.sleep(100);
        System.out.println(Thread.currentThread().getName()+"拿到"+ticketNums--);
    }
}
//不安全取钱
class UnsafeBank{
    public static void main(String[] args) {
        Account account = new Account(100,"基金");
        Drawing you = new Drawing(account, 50, "你");
        Drawing girl = new Drawing(account, 100, "她");
        you.start();
        girl.start();
    }
}
class Account{
    private int money;
    private String name;

    public Account(int money, String name) {
        this.money = money;
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Drawing extends Thread{
    Account account;
    //取了多少钱
    int drawingMoney;
    //现在有多少钱
    int nowMoney;

    public Drawing(Account account, int drawingMoney, String name) {
        super(name);
        this.account = account;
        this.drawingMoney = drawingMoney;
    }

    @Override
    public void run() {
        if (account.getMoney() - drawingMoney < 0) {
            System.out.println(Thread.currentThread().getName() + "钱不够了");
            return;
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        account.setMoney(account.getMoney()-drawingMoney);
        nowMoney = nowMoney + drawingMoney;

        System.out.println(account.getName() + "余额为"+account.getMoney());
        System.out.println(this.getName()+"手里的钱" + nowMoney);
    }
}
//线程不安全的集合
class UnsafeList{
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                arrayList.add(Thread.currentThread().getName());
            }).start();
        }
        System.out.println(arrayList.size());
    }
}
```

#### 同步方法

- 由于我们可以通过private关键字来保证数据对象只能被方法访问，所以我们只需要针对方法提出一套机制，这套机制就是synchronized关键字，它包括两种用法：
  - synchronized方法和synchronized块
- synchronized方法控制对"对象"的访问，每个对象对应一把锁，每个synchronized方法都必须获得调用该方法的对象的锁才能执行，否则线程会阻塞，方法一旦执行，就独占该锁，直到该方法返回才释放锁，后面被阻塞的线程才能获得这个锁，继续执行
  - 缺陷，若将一个大的方法声明为synchronized将会影响效率

##### 同步方法弊端

- 方法里面需要的内容才需要所，锁太多浪费资源

#### 同步块

- 同步块 synchronized(Obj){}
- Obj称之为同步监视器
  - Obj可以是任何对象，但是推荐使用共享资源作为同步监视器
  - 同步方法中无需指定同步监视器，因为同步方法的同步监视器就是this，就是这个对象本身，或者是class
- 同步监视器的执行过程
  1. 第一个线程访问，锁定同步监视器，执行其中代码
  2. 第二个线程访问，发现同步监视器被锁定，无法访问
  3. 第一个线程访问完毕，解锁同步显示器
  4. 第二个线程访问，发现同步显示器没有锁，然后锁定并访问

```java
//线程安全，有负数，可能会拿到同一张
class UnsafeBuyTicket{
    public static void main(String[] args) {
        ByTicket byTicket = new ByTicket();
        new Thread(byTicket,"你").start();
        new Thread(byTicket,"我").start();
        new Thread(byTicket,"他").start();
    }
}

//安全的买票
class ByTicket implements Runnable{
    //ticket
    private int ticketNums = 10;
     boolean flag = true;//外部停止方式
    @SneakyThrows
    @Override
    public void run() {
        //买票
        while (flag){
            buy();
        }

    }
    //加了synchronized变为同步方法，锁的是this
    private synchronized void buy() throws InterruptedException {
        if (ticketNums<=0) {
            return;
        }
        Thread.sleep(100);
        System.out.println(Thread.currentThread().getName()+"拿到"+ticketNums--);
    }
}
```

  

```java
//安全取钱
class UnsafeBank{
    public static void main(String[] args) {
        Account account = new Account(100,"基金");
        Drawing you = new Drawing(account, 50, "你");
        Drawing girl = new Drawing(account, 100, "她");
        you.start();
        girl.start();
    }
}
class Account{
    private int money;
    private String name;

    public Account(int money, String name) {
        this.money = money;
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Drawing extends Thread{
    Account account;
    //取了多少钱
    int drawingMoney;
    //现在有多少钱
    int nowMoney;

    public Drawing(Account account, int drawingMoney, String name) {
        super(name);
        this.account = account;
        this.drawingMoney = drawingMoney;
    }

    @Override
    public void run() {
        //锁的对象就是变化的量，增删改
        synchronized (account){
            if (account.getMoney() - drawingMoney < 0) {
                System.out.println(Thread.currentThread().getName() + "钱不够了");
                return;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            account.setMoney(account.getMoney()-drawingMoney);
            nowMoney = nowMoney + drawingMoney;

            System.out.println(account.getName() + "余额为"+account.getMoney());
            System.out.println(this.getName()+"手里的钱" + nowMoney);
        }

    }
}
```

```java
//加锁线程安全的集合
class UnsafeList{
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                new Thread(()->{
                    synchronized (arrayList){
                        arrayList.add(Thread.currentThread().getName());
                    }
                }).start();
            }
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(arrayList.size());
    }
}
```

### 多线程JUC

```java
//测试JUC安全类型的集合
class TestJUC{
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        for (int i = 0; i < 1000; i++) {
            new Thread(()->{
                list.add(Thread.currentThread().getName());
            }).start();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(list.size());
    }
}
```

### 死锁

多个线程各占有一些共享资源，并且互相等待其他线程占有的资源才能运行，而导致两个或者多个线程都在等待对方释放资源，都停止执行的清晰，某一个同步块同时拥有两个以上对象的锁时，就有可能会发生死锁的问题

```java
//多个线程互相抱着对方需要的资源，然后形成僵持
class TestDeadLock{

    //static保证需要的资源只有一份
    private static String keyboard = "keyboard";
    private static String mouse = "mouse";
    public static void main(String[] args) {
        new Thread(()->{
            synchronized (keyboard){
                try {
                    Thread.sleep(1000);
                    System.out.println(keyboard+"1");
                    synchronized (mouse){
                        System.out.println(mouse+"1");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(()->{
            synchronized (mouse){
                System.out.println(mouse+"2");
                synchronized (keyboard){
                    System.out.println(keyboard+"2");
                }
            }
        }).start();
    }
}
```

- 产生死锁的四个必要条件
  - 互斥条件：一个资源每次只能被一个进程使用
  - 请求与保持条件，一个进程因请求资源而阻塞时，对已获得的资源保持不放
  - 不剥夺条件：进程已获得的资源，在未使用完之前，不能强行剥夺
  - 循环等待条件，若干进程之间形成一种头尾相接的循环等待资源关系

### Lock锁

- JDK5.0开始，Java提供了更强大的线程同步机制——通过显式定义同步锁对象来实现同步，同步锁使用Lock对象充当
- java.util.concurrent.locks.Lock接口是控制多个线程对共享资源进行访问的工具，锁提供了对共享资源的独占访问，每次只能有一个线程对Lock对象加锁，线程开始访问共享资源之前应该先获得Lock对象
- 可重入锁
- ReentrantLock类实现了Lock，它拥有与synchronized相同的并发性和内存语义，在实现线程安全的控制中，比较常用的是ReentrantLock，可以显式加锁、释放锁

```java
class A{
    private final ReentrantLock lock = new ReentrantLock();
    public void m(){
        lock.lock();
        try {
            //保证线程安全的代码
        }finally {
            lock.unlock();
            //如果同步代码有异常，要将unlock()写入finally语句块
        }
    }
}
```

```java
//测试Lock锁
class TestLock{
    public static void main(String[] args) {
        TestLockE testLockE = new TestLockE();
        new Thread(testLockE).start();
        new Thread(testLockE).start();
        new Thread(testLockE).start();
    }
}
class TestLockE implements Runnable{

    int tickNums = 10;
    //定义lock锁
    private final ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true){
            try {
                lock.lock(); //加锁
                if (tickNums>0) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(tickNums--);
                }else {
                    break;
                }
            }finally {
                //解锁
                lock.unlock();
            }

        }
    }
}
```

synchronized和Lock对比

- Lock是显式锁(手动开启和关闭锁，别忘记关闭锁)，synchronized是隐式锁，除了作用域自动释放
- Lock只有代码块锁，synchronized有代码块锁和方法锁
- 使用Lock锁，JVM将话费较少的时间来调度线程，性能更好，并且具有更好的扩展性(提供更多子类)
- 优先使用顺序
  - Lock > 同步代码块(已经进入了方法体，分配了相应资源)>同步方法(在方法体之外)

### 线程协作

生产者消费者模型

#### 线程通信

- 应用场景
- 假设仓库中只能存放一件产品，生产者将生产出来的产品放入仓库，消费者将仓库中产品取走消费
- 如果仓库中没有产品，则生产者将产品放入仓库，否则停止生产并等待，直到仓库中的产品被消费者取走为止
- 如果仓库中放有产品，则消费者可以将产品取走消费，否则停止消费并等待，直到仓库中再次放入产品为止

```mermaid
flowchart TB
	id1(Producer生产者) --> id2(数据缓存区) --> id3(Consumer消费者) 
```

#### 线程通信-分析

这是一个线程同步问题，生产者和消费者共享一个资源，并且生产者和消费者之间相互依赖，互为条件

- 对于生产者，没有生产产品之前，要通知消费者等待，而生产了产品之后，有需要马上通知消费者消费
- 对于消费者，在消费之后，要通知生产者已经结束消费，需要生产新的产品以供消费
- 在生产者消费者问题中，仅有synchronized是不够的
  - synchronized可组织并发更新同一个共享资源，实现了同步
  - synchronized不能用来实现不同线程之间消息的传递(通信)

Java提供了几个方法解决线程之间的通信问题

- wait() 表示线程一直等待，直到其他线程通知，与sleep不同，会释放锁
- wait(long timeout) 指定等待的毫秒数
- notify() 唤醒一个处于等待状态的线程
- notifyAll() 唤醒同一个对象上所有调用wait() 方法的线程，优先级别高的线程优先调度

均是Object类的方法，都只能在同步方法或者同步代码块张使用，否则会抛出异常IIIegalMonitorStateException

#### 管程法

并发协作模型 生产者/消费者模式 管理法

- 生产者：负责生产数据的模块 可能是对象、方法、线程、进程
- 消费者：负责处理数据的模块 可能是对象、方法、线程、进程
- 缓冲区：消费者不能直接使用生产者的数据，它们之间有个缓冲区

生产者将生产好的数据放入缓冲区，消费者从缓冲区拿出数据

```java
//测试生产者消费者模式-->利用缓冲区解决：管程法
class TestPC{
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        new Producer(buffer).start();
        new Consumer(buffer).start();
    }
}
//生产者
class Producer extends Thread{
    Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            buffer.push(new Product(i));
            System.out.println("生产了"+i+"个");
        }
    }
}
//消费者
class Consumer extends Thread{
    Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("消费类->"+buffer.pop().id+"个");
        }
    }
}
//产品
class Product{
    int id;

    public Product(int id) {
        this.id = id;
    }
}
//缓冲区
class Buffer{
    //需要一个容腔大小
    Product[] products = new Product[10];
    //容腔计数器
    int count = 0;
    //生产者放入产品
    public synchronized void push(Product product){
        //如果容器满了，就需要等待消费者消费
        if (count == products.length) {
            //通知消费者消费，生产等待
            try {
                this.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        //如果没有满，我们就需要丢入产品
        products[count] = product;
        count++;
        //可以通知消费者消费了
        this.notifyAll();
    }
    //消费者消费产品
    public synchronized Product pop(){
        //判断能否消费
        if (count==0) {
            //等待生产者生产,消费者等待
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //如果可以消费
        count--;
        Product product = products[count];
        //用完了，通知生产者生产
        this.notifyAll();
        return product;
    }
}
```





#### 信号灯法

并发协作模型 生产者/消费者模式 信号灯法

```java
//测试生产者消费者问题2：信号灯法，标志位解决
class TestPC2{
    public static void main(String[] args) {
        TV tv = new TV();
        new Player(tv).start();
        new Watcher(tv).start();
    }
}
//生产者 --> 演员
class Player extends Thread{
    TV tv;

    public Player(TV tv) {
        this.tv = tv;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if (i%2 ==0) {
                this.tv.play("快乐大本营播放中");
            }else {
                this.tv.play("抖音");
            }
        }
    }
}
//消费者 观众
class Watcher extends Thread{
    TV tv;

    public Watcher(TV tv) {
        this.tv = tv;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            tv.watch();
        }
    }
}
//产品 节目
class TV{
    //演员表演 观众等待
    //观众观看 演员等等
    String voice;//表演的节目
    boolean flag = true;

    //表演
    public synchronized void play(String voice){
        if (!flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("演员表演了"+voice);
        //通知观众观看
        this.notifyAll();//通知唤醒
        this.voice = voice;
        this.flag = !this.flag;
    }
    //观看
    public synchronized void watch(){
        if (flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("观看了"+voice);
        //通知演员表演
        this.notifyAll();
        this.flag = !this.flag;
    }

}
```

### 线程池

- 背景：经常创建和销毁、使用量特别大的资源，比如并发情况下的线程，对性能影响很大

- 思路：提前创建好多个线程，放入线程池中，使用时之间获取，使用完放回池中，可以比米娜频繁创建销毁、实现重复利用。类是生活中的交通工具

- 优点

  - 提高响应速度(减少了创建新线程的时间)

  - 降低资源消耗(重复利用线程池中线程，不需要每次都创建)

  - 便于线程管理

    - corePoolSize 核心池的大小
    - maximumPoolSize 最大线程数
    - keepAliveTime 线程没有任务时最多保持多长时间后会终止

#### 使用线程池

   - JDK 5.0起提供了线程池相关API：ExecutorService和Executors
   - ExecutorService 真正的线程池接口，常见子类ThreadPoolExecutor
     - void execute(Runnable command) 执行任务/命令，没有返回值，一般用来执行Runnable
     - <T> Future<T> submit(Callable<T> task) 执行任务，有返回值，一般用来执行Callable
     - void shutdown() 关闭连接池
- Executors 工具类、线程池的工厂类，用于创建并返回不同类型的线程池

```java
class TestPool {
    public static void main(String[] args) {
        //创建服务，创建线程池
        //newFixedThreadPool参数为线程池大小
        ExecutorService service = Executors.newFixedThreadPool(10);
        //执行
        service.execute(new TheThread());
        service.execute(new TheThread());
        service.execute(new TheThread());
        service.execute(new TheThread());
        //关闭连接
        service.shutdown();
    }
}

class TheThread implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

    }
}
```

### 总结

线程创建

1. 继承Thread类
2. 实现Runnable接口
3. 实现Callable接口(FutureTask)

## 注解 Annotation

### 什么是注解

- Annotation是从JDK5.0开始引入的新技术
- Annotation作用
  - 不是程序本身，可以对程序做出解释
  - 可以被其他程序，比如编译器读取
- Annotation格式
  - 注解是以"@注释名"在代码中存在的，还可以添加一些参数值，例如@Support(value="1")
- Annotation使用位置
  - 可以添加在package,class，method，field等上面，相当于给他们添加了额外的附加信息，我们可以通过反射机制编程实现对这些元数据的访问

### 内置注解

- @Override 定义在java.lang.Override中，此注释只适用于修饰方法，表示一个方法声明打算重写超类中的另一个方法声明
- @Deprecated 定义在java.lang.Deprecated中，可以用于修饰方法，属性，类，表示不鼓励程序员使用这样的元素，通常指这样的元素很危险或有更好的选择
- @SuppressWarnings 定义在java.lang.SuppressWarnings中，用来抑制编译时的警告信息
  - 与前两个注解有所不同，需要添加一个参数才能正确运行，这些参数都是已经被定义好了的，选择使用即可
  - @SuppressWarnings("all")
  - @SuppressWarnings("unchecked")
  - @SuppressWarnings(value-{"unchecked","deprecation})
  - ...

### 元注解

- 元注解的作用就是负责注解其他注解，Java定义了4个标准的meta-annotation类型，它们被用来提供对其他annotation类型做说明
- 这些类型和它们所支持的类在java.lang.annatation包中可以找到(@Target,@Retention,@Documented,@Inherited)
  - @Target 用于描述注解的适用范围(即被描述的注解可以用在什么地方)
  - @Retention 表示需要在什么级别保存该注释信息，用于描述注解的声明周期
    - SOURCE<CLASS<**RUNTIME**
  - @Document 说明该注解将被包含在javadoc中
  - @Inherited 说明子类可以继承父类中的该注解

```java
//定义一个注解
//Target表示我们的注解可以放在哪些地方
@Target(value = {ElementType.METHOD,ElementType.TYPE})
//Retention表示我们的注解在什么地方还有效
//runtime>class>sources
@Retention(value = RetentionPolicy.RUNTIME)
//表示是否将注解声称在javadoc中
@Documented
//表示是否可以继承父类的注解
@Inherited
@interface MyAnnotation{}
```

### 自定义注解

- 使用@interface自定义注解时，自动继承了java.lang.Annotation接口
- 分析
  - @interface用来声明一个注解，格式public @interface 注解名{自定义内容}
  - 其中的每一个方法实际上是声明了一个配置参数
  - 方法的名称就是参数的名称
  - 返回值类型就是参数类型，返回值只能是基本类型,Class，String，enum
  - 可以通过default来声明参数的默认值
  - 如果只有一个参数成员，一般参数名为value
  - 注解元素必须要有值，我们定义注解元素时，经常使用空字符串,0作为默认值

```java
class TestAnno{
    //注解可以显式赋值，如果没有默认值，我们就必须给注解赋值
    @MyAnnotationT(name = "me",people = "11")
    public void test(){
    }
    @MyAnn("22")
    public void nn(){
        
    }
}
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotationT{
    //注解的参数 参数类型 + 参数名();
    String name() default "";
    int age() default 0;
    int id() default -1;//如果默认值为-1，代表不存在
    String[] people();
    String[] world() default {"bili"};
}
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnn{
    String value();
}
```

## 反射

### 静态和动态语言

#### 动态语言

- 是一类在运行时可以改变其结构的语言，例如新的函数、对象、甚至代码都可以被引进，已有的函数可以被删除或是其他结构上的变化，就是在运行时代码可以根据某些条件改变自身结构
- 主要动态语言
  - Object-C、C#、JavaScript、PHP、Python等

#### 静态语言

- 与动态语言相对应的，运行时结构不可变的语言就是静态语言，如Java、C、C++
- Java不是动态语言，但是Java可以称作准动态语言，即Java具有一定的动态性，我们可以利用反射机制获得类似动态语言的特性

### Java反射机制概述

- Reflection(反射)是Java被视为动态语言的关键，反射机制允许程序在执行期间借助于Reflection API获取任何类的内部信息，并能直接操作任意对象的内部属性及方法

  - ```java
    Class c = Class.fromName("java.lang.String")
    ```

- 加载完类之后，在堆内存的方法区就产生了一个Class类型的对象(一个类只有一个Class对象)，这个对象就包含了完整的类的结构信息，我们可以通过这个对象看到类的结构，这个对象就像一面镜子，透过这个镜子看到类的结构，所以，我们称之为反射

  - 正常方式:引入需要的"包类"名称->通过new实例化->取得实例化对象
  
  - ```mermaid
    flowchart LR
    	id1(引入需要的包类名称) --> id2(通过new实例化) --> id3(取得实例化对象)
    ```
  
  - 反射方式:实例化对象->getClass方法->得到完整的"包类"名称
  
  - ```mermaid
    flowchart LR
    	id1(实例化对象) --> id2(getClass方法) -->id3(得到完整的包类名称)
    ```
  
- Java反射机制提供的功能

  - 在运行时判断任意一个对象所属的类
  - 在运行时构造任意一个类的对象
  - 在运行时判断任意一个类所具有的成员变量和方法
  - 在运行时获取泛型信息
  - 在运行时调用任意一个对象的成员变量和方法
  - 在运行时处理注解
  - 生成动态代理
  - ...

- Java反射优点和缺点

  - 优点
    - 可以实现动态创建对象和编译，体现出很大的灵活性
  - 缺点
    - 对性能有影响，使用反射基本上是一种解释操作，我们可以告诉JVM，我们希望做什么并且它满足我们的要求，这类操作总是慢于直接执行相同的操作

- 反射相关的主要API

  - java.lang.Class 代表一个类
  - java.lang.reflect.Method 代表类的方法
  - java.lang.reflect.Field 代表类的成员变量
  - java.lang.reflect.Constructor 代表类的构造器
  - ...

```java
//什么是反射
class TestReflection{
    public static void main(String[] args) throws ClassNotFoundException {
        //通过反射获取类的对象
        Class<?> c1 = Class.forName("com.flywinter.demo2.User");
        System.out.println(c1);
        Class<?> c2 = Class.forName("com.flywinter.demo2.User");

        //一个类在内存中只存有一个Class对象
        //一个类被加载后，类的整个结构都会被封装在Class对象中
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
    }
}
//实体类
class User{
    private String name;
    private int id;
    public User(){

    }

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

```

### 理解Class类并获取Class示例

在Object类种定义了以下的方法，此方法被所以子类继承

```java
public final Class getClass()
```

- 以上方法返回值的类型是一个Class类，此类是所有Java反射的源头，实际上所谓反射从程序的运行结果来看也很好理解，即可以通过对象反射求出类的名称

对象通过getClass可以得到的信息:某个类的属性、方法和构造器、某个类到底实现了哪些接口，对于每个类而言，JRE都为其保留一个不变的Class类型的对象，一个Class对象包含了特定某个结构(class/interface/enum/annotation/primitive type/void[])的有关信息

- Class本身也是一个类
- Class对象只能由系统建立对象
- 一个加载的类在jvm种只会有一个Class实例
- 一个Class对象对应的是一个加载到JVM中的一个.class文件
- 每个类的实例都会记得自己是由哪个Class实例所生成
- 通过Class可以完整地得到一个类中所有被加载的结构
- Class类是Reflection的根源，针对任何你想动态加载、运行的类，唯有先获得相应的Class对象

Class类的常用方法

```java
//返回指定类名的Class对象
public static Class<?> forName(String className);
//调用缺省构造函数，返回Class对象的一个实例，JDK9之后已废弃
public T newInstance();
//返回Class对象所表示的实体(类/接口/数组类型/或void)的名称
public String getName();
//返回一个Method对象，此对象的形参类型为paramType
public Method getMethod(String name, Class<?>... parameterTypes);
//返回当前Class对象的父类的Class对象
public native Class<? super T> getSuperclass();
//获取当前Class对象的接口
public Class<?>[] getInterfaces();
//返回该类的类加载器
public ClassLoader getClassLoader();
//返回一个包含某些Constructor对象的数组
public Constructor<T> getConstructor(Class<?>... parameterTypes);
//返回Field对象的一个数组
public Field[] getDeclaredFields() throws SecurityException;
```

获取Class类的实例

1. 已知具体的类，通过类的class属性获取，该方法最为可靠，程序性能最高

   - ```java
     Class clazz = Person.class;
     ```

2. 已知某个类的实例，调用该实例的getClass()方法获取Class对象

   - ```java
     Class clazz = person.getClass();
     ```

3. 已知一个类的全类名，且该类在类路径下，可通过Class类的静态方法和forName()获取，可能抛出ClassNotFoundException

   - ```java
     Class clazz = Class.forName("com.flywinter.demo");
     ```

4. 内置基本数据类型可以直接用 类名.Type

5. 还可以利用ClassLoader

```java
class User{
    private String name;
    private int id;
    public User(){

    }

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
class TestReflection2{
    public static void main(String[] args) throws ClassNotFoundException {
        //通过new获得对象
        User c1 = new User();
        System.out.println(c1.hashCode());
        //方式1 通过对象获得
        Class<? extends User> aClass = c1.getClass();
        System.out.println(aClass.hashCode());
        //方法2 通过forName获得
        Class<?> c2 = Class.forName("com.flywinter.demo2.User");
        System.out.println(c2.hashCode());
        //方法3 通过类名.class获得
        Class<User> c3 = User.class;
        System.out.println(c3.hashCode());
        //方法4 基本内置类型的包装类都有一个Type属性
        Class<Integer> type = Integer.TYPE;
        System.out.println(type);
        //获得父类类型
        Class<?> superclass = aClass.getSuperclass();
        System.out.println(superclass);
    }
}
```

哪些类型可以有Class对象

- class 外部类、成员(成员内部类、静态内部类)、局部内部类、匿名内部类
- interface 接口
- [] 数组
- enum 枚举
- annotation 注解@interface
- primitive Type 基本数据类型
- void

```java
class TestReflection3{
    public static void main(String[] args) {
        Class<Object> c1 = Object.class;//类
        Class<Comparable> c2 = Comparable.class;//接口
        Class<String[]> c3 = String[].class;//一维数组
        Class<int[][]> c4 = int[][].class;//二维数组
        Class<Override> c5 = Override.class;//注解
        Class<ElementType> c6 = ElementType.class;//枚举
        Class<Integer> c7 = Integer.class;//基本数据类型
        Class<Void> c8 = void.class;//void
        Class<Class> c9 = Class.class;//Class
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c8);
        System.out.println(c9);
        
        //只要元素类型和维度一样，都是一个Class类型
        int[] a = new int[10];
        int[] b = new int[100];
        System.out.println(a.getClass().hashCode());
        System.out.println(b.getClass().hashCode());
    }
}
```

### Java内存分析

```mermaid
flowchart LR
	id1(Java内存) --> id2(堆) --> id5(存放new的对象和数组)
	id2(堆) --> id6(可以被所有的线程共享 不会存放别的对象引用)
	id1(Java内存) --> id3(栈)
	id3(栈) --> id7(存放基本变量类型 会包含这个基本了类型的具体数值)
	id3(栈) --> id8(存放对象的变量 会存放这个引用在堆里面的具体地址)
	id1(Java内存) --> id4(方法区)
	id4(方法区) --> id9(可以被所有的线程共享)
	id4(方法区) --> id10(包含了所有的class和static变量)
```

#### 了解类的加载过程

当程序主动使用某个类时，如果该类还未被加载到内存中，则系统会通过如下三个步骤进行加载

```mermaid
flowchart TB
	id1(类的加载Loader) ---> id2(类的链接Link) --> id3(类的初始化Initialize)
	id4(将类的class文件读入内存 并为之创建一个java.lang.Class对象 此过程由类加载器完成) -.->id1(类的加载Loader)
	id5(将类的二进制数据合并到JRE) -.-> id2(类的链接Link)
	id6(JVM负责对类进行初始化) -.-> id3(类的初始化Initialize)
```

#### 类的加载与ClassLoader

- 加载 将class文件字节码加载到内存中，并将这些静态数据转换成方法区运行时数据结构，然后生成一个代表这个类的java.lang.Class对象
- 链接 将Java类的二进制代码合并到JVM的运行状态之中的过程
  - 验证 确保加载的类信息符合JVM规范 没有安全方面的问题
  - 准备 正式为类变量(static)分配内存并设置类变量默认初始值的阶段，这些内存都将在方法区中进行分配
  - 解释 虚拟机常量池内符号引用(常量名)替换为直接引用(地址)的过程
- 初始化
  - 执行类构造器<clinit>()方法的过程，类构造器<clinit>()方法是由编译期自动收集类中所有类变量的赋值动作和静态代码块中的语句合并产生的，类构造器是构造类信息的，不是构造该类对象的构造器
  - 当初始化一个类的时候，如果发现其父类还没有进行初始化，则需要先触发其父类的初始化
  - 虚拟机会保证一个类的<clinit>()方法在多线程环境中被正式加锁和同步

```java
class TestAA{
    public static void main(String[] args) {
        AA aa = new AA();
        System.out.println(aa.m);
        /*
        1.加载到内存，会产生一个类对应的class对象
        2.链接，链接结束后m=0;
        3.初始化
            <clinit>(){
                System.out.println("A的静态代码块");
                m = 300;
                m=100;
            }
         */
    }
}
class AA{
    static {
        System.out.println("A的静态代码块");
        m = 300;
    }
    /*
     初始化的时候会把静态代码块和静态变量等合并起来
     m=300
     m=100
     */
    static int m = 100;
    public AA() {
        System.out.println("A的构造方法");
    }
}
```

#### 什么时候会发生类初始化

- 类的主动引用(一定会发生类的初始化)
  - 当虚拟机启动，先初始化main方法所在的类
  - new一个类的对象
  - 调用类的静态成员(除了final常量)和静态方法
  - 使用java.lang.reflect包的方法对类进行反射调用
  - 当初始化一个类，如果父类没有被初始化，则会初始化它的父类
- 类的被动引用(不会发生类的初始化)
  - 当访问一个静态域时，只有真正声明这个域的类才会被初始化，如:当通过子类引用父类的静态变量，不会导致子类初始化
  - 通过数组定义类引用， 不会触发此类的初始化
  - 引用常量不会触发此类的初始化(常量在链接阶段就存入调用类的常量池中了)

```java
//测试类什么时候会初始化
class TestClassInit{
    static {
        System.out.println("main类被加载");
    }
    public static void main(String[] args) throws ClassNotFoundException {
        //1.主动引用
//        Son son = new Son();
        //反射也会产生主动引用
//        Class.forName("com.flywinter.demo2.Son");
        //不会产生类的初始化的方法
//        System.out.println(Son.b);
//        Son[] arr = new Son[5];
        System.out.println(N);
    }
}
class Father{
    static int b = 2;
    static {
        System.out.println("父类被加载");
    }
}
class Son extends Father{
    static {
        System.out.println("子类被加载");
        m = 300;
    }
    static int m = 100;
    static final int N = 1;
}
```

#### 类加载器的作用

- 类加载的作用：将class文件字节码内容加载到内存中，并将这些静态数据转换成方法区的运行时数据结构，然后在堆中生成一个代表这个类的java.lang.Class对象，作为方法区中类数据的访问入口
- 类缓存：标准的JavaSE类加载器可以按要求查找类，但一旦某个类被加载到类加载器中，它将维持加载(缓存)一段时间，不过JVM垃圾回收机制可以回收这些Class对象

```mermaid
flowchart TB
	id1(源程序.java文件) --> id2(Java编译器) --> id3(字节码.class文件) --> id4(类装载器) --> id5(字节码校验器) -->id6(解释器) --> id7(操作系统平台)
```

类加载器的作用时用来把类(class)装载进内存的，JVM规定了以下类型的类加载器

- 引导类加载器(Bootstap Classloader) 用C++编写，是JVM自带的类加载器，负责Java平台的核心库，用来装载核心类库，该加载器无法直接获取
- 扩展类加载器(ExtensionClassloader) 负责jre/lib/ext目录下的jar包或-D java.ext.dirs指定目录下的jar包导入工程
- 系统类加载器(System Classloader) 负责java -classpath或-D java.class.path所指的目录下的类与jar包装入工作，是最常用的加载器

```mermaid
flowchart TB
	id1(Bootstap Classloader) --自顶向下尝试加载类--> id4(自定义类加载器)
	id1(Bootstap Classloader) --> id2(ExtensionClassloader) -->id3(System Classloader) -->id4(自定义类加载器)
	id4(自定义类加载器) --自底向上检查类是否已加载--> id1(Bootstap Classloader)
```

```java
class TestGetLoader{
    public static void main(String[] args) throws ClassNotFoundException {
        //获取系统类的加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);
        //获取系统类加载器的父类加载器 -->扩展类加载器
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);
        //获取扩展类加载器父类加载器-->根加载器（C/C++）
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);
        //测试当前类是哪个加载器加载的
        ClassLoader classLoader = Class.forName("com.flywinter.demo2.TestGetLoader").getClassLoader();
        System.out.println(classLoader);
        //测试JDK内置类是谁加载的
        ClassLoader classLoader1 = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader1);

        //如何获得系统类加载器可以加载的路径
        String property = System.getProperty("java.class.path");
        System.out.println(property);
        /*
        双亲委派机制
        E:\past file\spring\demo2\target\test-classes;
        E:\past file\spring\demo2\target\classes;
        C:\Users\14757\.m2\repository\org\springframework\boot\spring-boot-starter-thymeleaf\2.5.1\spring-boot-starter-thymeleaf-2.5.1.jar;
        C:\Users\14757\.m2\repository\org\springframework\boot\spring-boot-starter\2.5.1\spring-boot-starter-2.5.1.jar;
        C:\Users\14757\.m2\repository\org\springframework\boot\spring-boot-starter-logging\2.5.1\spring-boot-starter-logging-2.5.1.jar;
        C:\Users\14757\.m2\repository\ch\qos\logback\logback-classic\1.2.3\logback-classic-1.2.3.jar;
        C:\Users\14757\.m2\repository\ch\qos\logback\logback-core\1.2.3\logback-core-1.2.3.jar;
        C:\Users\14757\.m2\repository\org\apache\logging\log4j\log4j-to-slf4j\2.14.1\log4j-to-slf4j-2.14.1.jar;
        C:\Users\14757\.m2\repository\org\apache\logging\log4j\log4j-api\2.14.1\log4j-api-2.14.1.jar;
        C:\Users\14757\.m2\repository\org\slf4j\jul-to-slf4j\1.7.30\jul-to-slf4j-1.7.30.jar;
        C:\Users\14757\.m2\repository\jakarta\annotation\jakarta.annotation-api\1.3.5\jakarta.annotation-api-1.3.5.jar;
        C:\Users\14757\.m2\repository\org\yaml\snakeyaml\1.28\snakeyaml-1.28.jar;
        C:\Users\14757\.m2\repository\org\thymeleaf\thymeleaf-spring5\3.0.12.RELEASE\thymeleaf-spring5-3.0.12.RELEASE.jar;
        C:\Users\14757\.m2\repository\org\thymeleaf\thymeleaf\3.0.12.RELEASE\thymeleaf-3.0.12.RELEASE.jar;
        C:\Users\14757\.m2\repository\org\attoparser\attoparser\2.0.5.RELEASE\attoparser-2.0.5.RELEASE.jar;
        C:\Users\14757\.m2\repository\org\unbescape\unbescape\1.1.6.RELEASE\unbescape-1.1.6.RELEASE.jar;
        C:\Users\14757\.m2\repository\org\thymeleaf\extras\thymeleaf-extras-java8time\3.0.4.RELEASE\thymeleaf-extras-java8time-3.0.4.RELEASE.jar;
        C:\Users\14757\.m2\repository\org\springframework\boot\spring-boot-starter-web\2.5.1\spring-boot-starter-web-2.5.1.jar;
        C:\Users\14757\.m2\repository\org\springframework\boot\spring-boot-starter-json\2.5.1\spring-boot-starter-json-2.5.1.jar;
        C:\Users\14757\.m2\repository\com\fasterxml\jackson\core\jackson-databind\2.12.3\jackson-databind-2.12.3.jar;
        C:\Users\14757\.m2\repository\com\fasterxml\jackson\core\jackson-annotations\2.12.3\jackson-annotations-2.12.3.jar;
        C:\Users\14757\.m2\repository\com\fasterxml\jackson\core\jackson-core\2.12.3\jackson-core-2.12.3.jar;
        C:\Users\14757\.m2\repository\com\fasterxml\jackson\datatype\jackson-datatype-jdk8\2.12.3\jackson-datatype-jdk8-2.12.3.jar;
        C:\Users\14757\.m2\repository\com\fasterxml\jackson\datatype\jackson-datatype-jsr310\2.12.3\jackson-datatype-jsr310-2.12.3.jar;
        C:\Users\14757\.m2\repository\com\fasterxml\jackson\module\jackson-module-parameter-names\2.12.3\jackson-module-parameter-names-2.12.3.jar;
        C:\Users\14757\.m2\repository\org\springframework\boot\spring-boot-starter-tomcat\2.5.1\spring-boot-starter-tomcat-2.5.1.jar;
        C:\Users\14757\.m2\repository\org\apache\tomcat\embed\tomcat-embed-core\9.0.46\tomcat-embed-core-9.0.46.jar;
        C:\Users\14757\.m2\repository\org\apache\tomcat\embed\tomcat-embed-websocket\9.0.46\tomcat-embed-websocket-9.0.46.jar;
        C:\Users\14757\.m2\repository\org\springframework\spring-web\5.3.8\spring-web-5.3.8.jar;
        C:\Users\14757\.m2\repository\org\springframework\spring-beans\5.3.8\spring-beans-5.3.8.jar;
        C:\Users\14757\.m2\repository\org\springframework\spring-webmvc\5.3.8\spring-webmvc-5.3.8.jar;
        C:\Users\14757\.m2\repository\org\springframework\spring-context\5.3.8\spring-context-5.3.8.jar;
        C:\Users\14757\.m2\repository\org\springframework\spring-expression\5.3.8\spring-expression-5.3.8.jar;
        C:\Users\14757\.m2\repository\org\springframework\boot\spring-boot-devtools\2.5.1\spring-boot-devtools-2.5.1.jar;
        C:\Users\14757\.m2\repository\org\springframework\boot\spring-boot\2.5.1\spring-boot-2.5.1.jar;
        C:\Users\14757\.m2\repository\org\springframework\boot\spring-boot-autoconfigure\2.5.1\spring-boot-autoconfigure-2.5.1.jar;
        C:\Users\14757\.m2\repository\org\projectlombok\lombok\1.18.20\lombok-1.18.20.jar;
        C:\Users\14757\.m2\repository\org\springframework\boot\spring-boot-starter-test\2.5.1\spring-boot-starter-test-2.5.1.jar;
        C:\Users\14757\.m2\repository\org\springframework\boot\spring-boot-test\2.5.1\spring-boot-test-2.5.1.jar;
        C:\Users\14757\.m2\repository\org\springframework\boot\spring-boot-test-autoconfigure\2.5.1\spring-boot-test-autoconfigure-2.5.1.jar;
        C:\Users\14757\.m2\repository\com\jayway\jsonpath\json-path\2.5.0\json-path-2.5.0.jar;
        C:\Users\14757\.m2\repository\net\minidev\json-smart\2.4.7\json-smart-2.4.7.jar;
        C:\Users\14757\.m2\repository\net\minidev\accessors-smart\2.4.7\accessors-smart-2.4.7.jar;
        C:\Users\14757\.m2\repository\org\ow2\asm\asm\9.1\asm-9.1.jar;
        C:\Users\14757\.m2\repository\jakarta\xml\bind\jakarta.xml.bind-api\2.3.3\jakarta.xml.bind-api-2.3.3.jar;
        C:\Users\14757\.m2\repository\jakarta\activation\jakarta.activation-api\1.2.2\jakarta.activation-api-1.2.2.jar;
        C:\Users\14757\.m2\repository\org\assertj\assertj-core\3.19.0\assertj-core-3.19.0.jar;
        C:\Users\14757\.m2\repository\org\hamcrest\hamcrest\2.2\hamcrest-2.2.jar;
        C:\Users\14757\.m2\repository\org\junit\jupiter\junit-jupiter\5.7.2\junit-jupiter-5.7.2.jar;
        C:\Users\14757\.m2\repository\org\junit\jupiter\junit-jupiter-api\5.7.2\junit-jupiter-api-5.7.2.jar;
        C:\Users\14757\.m2\repository\org\apiguardian\apiguardian-api\1.1.0\apiguardian-api-1.1.0.jar;
        C:\Users\14757\.m2\repository\org\opentest4j\opentest4j\1.2.0\opentest4j-1.2.0.jar;
        C:\Users\14757\.m2\repository\org\junit\platform\junit-platform-commons\1.7.2\junit-platform-commons-1.7.2.jar;
        C:\Users\14757\.m2\repository\org\junit\jupiter\junit-jupiter-params\5.7.2\junit-jupiter-params-5.7.2.jar;
        C:\Users\14757\.m2\repository\org\junit\jupiter\junit-jupiter-engine\5.7.2\junit-jupiter-engine-5.7.2.jar;
        C:\Users\14757\.m2\repository\org\junit\platform\junit-platform-engine\1.7.2\junit-platform-engine-1.7.2.jar;
        C:\Users\14757\.m2\repository\org\mockito\mockito-core\3.9.0\mockito-core-3.9.0.jar;
        C:\Users\14757\.m2\repository\net\bytebuddy\byte-buddy\1.10.22\byte-buddy-1.10.22.jar;
        C:\Users\14757\.m2\repository\net\bytebuddy\byte-buddy-agent\1.10.22\byte-buddy-agent-1.10.22.jar;
        C:\Users\14757\.m2\repository\org\objenesis\objenesis\3.2\objenesis-3.2.jar;
        C:\Users\14757\.m2\repository\org\mockito\mockito-junit-jupiter\3.9.0\mockito-junit-jupiter-3.9.0.jar;
        C:\Users\14757\.m2\repository\org\skyscreamer\jsonassert\1.5.0\jsonassert-1.5.0.jar;
        C:\Users\14757\.m2\repository\com\vaadin\external\google\android-json\0.0.20131108.vaadin1\android-json-0.0.20131108.vaadin1.jar;
        C:\Users\14757\.m2\repository\org\springframework\spring-core\5.3.8\spring-core-5.3.8.jar;
        C:\Users\14757\.m2\repository\org\springframework\spring-jcl\5.3.8\spring-jcl-5.3.8.jar;
        C:\Users\14757\.m2\repository\org\springframework\spring-test\5.3.8\spring-test-5.3.8.jar;
        C:\Users\14757\.m2\repository\org\xmlunit\xmlunit-core\2.8.2\xmlunit-core-2.8.2.jar;
        C:\Users\14757\.m2\repository\junit\junit\4.12\junit-4.12.jar;C:\Users\14757\.m2\repository\org\hamcrest\hamcrest-core\2.2\hamcrest-core-2.2.jar;
        C:\Users\14757\.m2\repository\org\springframework\boot\spring-boot-starter-validation\2.5.1\spring-boot-starter-validation-2.5.1.jar;
        C:\Users\14757\.m2\repository\org\apache\tomcat\embed\tomcat-embed-el\9.0.46\tomcat-embed-el-9.0.46.jar;
        C:\Users\14757\.m2\repository\org\hibernate\validator\hibernate-validator\6.2.0.Final\hibernate-validator-6.2.0.Final.jar;
        C:\Users\14757\.m2\repository\jakarta\validation\jakarta.validation-api\2.0.2\jakarta.validation-api-2.0.2.jar;
        C:\Users\14757\.m2\repository\org\jboss\logging\jboss-logging\3.4.2.Final\jboss-logging-3.4.2.Final.jar;
        C:\Users\14757\.m2\repository\com\fasterxml\classmate\1.5.1\classmate-1.5.1.jar;
        C:\Users\14757\.m2\repository\org\springframework\boot\spring-boot-starter-jdbc\2.5.1\spring-boot-starter-jdbc-2.5.1.jar;
        C:\Users\14757\.m2\repository\com\zaxxer\HikariCP\4.0.3\HikariCP-4.0.3.jar;C:\Users\14757\.m2\repository\org\springframework\spring-jdbc\5.3.8\spring-jdbc-5.3.8.jar;
        C:\Users\14757\.m2\repository\org\springframework\spring-tx\5.3.8\spring-tx-5.3.8.jar;
        C:\Users\14757\.m2\repository\mysql\mysql-connector-java\8.0.21\mysql-connector-java-8.0.21.jar;
        C:\Users\14757\.m2\repository\org\springframework\boot\spring-boot-starter-data-jpa\2.5.1\spring-boot-starter-data-jpa-2.5.1.jar;
        C:\Users\14757\.m2\repository\org\springframework\boot\spring-boot-starter-aop\2.5.1\spring-boot-starter-aop-2.5.1.jar;
        C:\Users\14757\.m2\repository\org\aspectj\aspectjweaver\1.9.6\aspectjweaver-1.9.6.jar;
        C:\Users\14757\.m2\repository\jakarta\transaction\jakarta.transaction-api\1.3.3\jakarta.transaction-api-1.3.3.jar;
        C:\Users\14757\.m2\repository\jakarta\persistence\jakarta.persistence-api\2.2.3\jakarta.persistence-api-2.2.3.jar;
        C:\Users\14757\.m2\repository\org\hibernate\hibernate-core\5.4.32.Final\hibernate-core-5.4.32.Final.jar;
        C:\Users\14757\.m2\repository\org\javassist\javassist\3.27.0-GA\javassist-3.27.0-GA.jar;
        C:\Users\14757\.m2\repository\antlr\antlr\2.7.7\antlr-2.7.7.jar;C:\Users\14757\.m2\repository\org\jboss\jandex\2.2.3.Final\jandex-2.2.3.Final.jar;
        C:\Users\14757\.m2\repository\org\dom4j\dom4j\2.1.3\dom4j-2.1.3.jar;
        C:\Users\14757\.m2\repository\org\hibernate\common\hibernate-commons-annotations\5.1.2.Final\hibernate-commons-annotations-5.1.2.Final.jar;
        C:\Users\14757\.m2\repository\org\glassfish\jaxb\jaxb-runtime\2.3.4\jaxb-runtime-2.3.4.jar;C:\Users\14757\.m2\repository\org\glassfish\jaxb\txw2\2.3.4\txw2-2.3.4.jar;
        C:\Users\14757\.m2\repository\com\sun\istack\istack-commons-runtime\3.0.12\istack-commons-runtime-3.0.12.jar;
        C:\Users\14757\.m2\repository\com\sun\activation\jakarta.activation\1.2.2\jakarta.activation-1.2.2.jar;
        C:\Users\14757\.m2\repository\org\springframework\data\spring-data-jpa\2.5.1\spring-data-jpa-2.5.1.jar;
        C:\Users\14757\.m2\repository\org\springframework\data\spring-data-commons\2.5.1\spring-data-commons-2.5.1.jar;
        C:\Users\14757\.m2\repository\org\springframework\spring-orm\5.3.8\spring-orm-5.3.8.jar;
        C:\Users\14757\.m2\repository\org\springframework\spring-aspects\5.3.8\spring-aspects-5.3.8.jar;
        C:\Users\14757\.m2\repository\org\springframework\boot\spring-boot-starter-security\2.5.1\spring-boot-starter-security-2.5.1.jar;
        C:\Users\14757\.m2\repository\org\springframework\spring-aop\5.3.8\spring-aop-5.3.8.jar;
        C:\Users\14757\.m2\repository\org\springframework\security\spring-security-config\5.5.0\spring-security-config-5.5.0.jar;
        C:\Users\14757\.m2\repository\org\springframework\security\spring-security-core\5.5.0\spring-security-core-5.5.0.jar;
        C:\Users\14757\.m2\repository\org\springframework\security\spring-security-web\5.5.0\spring-security-web-5.5.0.jar;
        C:\Users\14757\.m2\repository\ai\djl\api\0.12.0-SNAPSHOT\api-0.12.0-20210705.103127-52.jar;
        C:\Users\14757\.m2\repository\com\google\code\gson\gson\2.8.7\gson-2.8.7.jar;C:\Users\14757\.m2\repository\net\java\dev\jna\jna\5.8.0\jna-5.8.0.jar;
        C:\Users\14757\.m2\repository\org\apache\commons\commons-compress\1.20\commons-compress-1.20.jar;
        C:\Users\14757\.m2\repository\org\slf4j\slf4j-api\1.7.30\slf4j-api-1.7.30.jar;
        C:\Users\14757\.m2\repository\ai\djl\basicdataset\0.12.0-SNAPSHOT\basicdataset-0.12.0-20210705.103127-52.jar;
        C:\Users\14757\.m2\repository\org\apache\commons\commons-csv\1.8\commons-csv-1.8.jar;
        C:\Users\14757\.m2\repository\ai\djl\model-zoo\0.12.0-SNAPSHOT\model-zoo-0.12.0-20210705.103127-52.jar;
        C:\Users\14757\.m2\repository\ai\djl\mxnet\mxnet-model-zoo\0.12.0-SNAPSHOT\mxnet-model-zoo-0.12.0-20210705.103127-50.jar;
        C:\Users\14757\.m2\repository\ai\djl\mxnet\mxnet-engine\0.12.0-SNAPSHOT\mxnet-engine-0.12.0-20210705.103127-50.jar;
        C:\Users\14757\.m2\repository\ai\djl\mxnet\mxnet-native-auto\1.8.0\mxnet-native-auto-1.8.0.jar;
        C:\Users\14757\.m2\repository\ai\djl\pytorch\pytorch-engine\0.12.0-SNAPSHOT\pytorch-engine-0.12.0-20210705.103127-50.jar;
        C:\Users\14757\.m2\repository\ai\djl\pytorch\pytorch-native-auto\1.7.0\pytorch-native-auto-1.7.0.jar;
        C:\Users\14757\.m2\repository\commons-io\commons-io\2.10.0\commons-io-2.10.0.jar;
        C:\Users\14757\.m2\repository\org\apache\activemq\activemq-all\5.16.2\activemq-all-5.16.2.jar

         */


    }
}
```

#### 双亲委派机制

> 什么是双亲委派机制. 当某个类加载器需要加载某个 .class 文件时，它首先把这个任务委托给他的上级类加载器，递归这个操作，如果上级的类加载器没有加载，自己才会去加载这个类

作用

> 1、防止重复加载同一个.class。通过委托去向上面问一问，加载过了，就不用再加载一遍。保证数据安全。
>
>  2、保证核心.class不能被篡改。通过委托方式，不会去篡改核心.clas，即使篡改也不会去加载，即使加载也不会是同一个.class

### 创建类运行时的对象

#### 获取运行时类的完整结构

> Field、Method、Constructor、Superclass、Interface、Annotation

- 实现的全部接口
- 所继承的父类
- 全部的构造器
- 全部的方法
- 全部的Fiedl
- 注解
- ...

```java
//获得类的信息
class TestGetClassInfo{
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class<?> c1 = Class.forName("com.flywinter.demo2.User");
//        User user = new User();
//        c1 = user.getClass();
        //获得类的名字
        System.out.println(c1.getName()); //获得包名+类名
        System.out.println(c1.getSimpleName());//获得类名
        //获得类的属性
        System.out.println("========================");
        Field[] fields = c1.getFields();//只能找到public属性
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("=====================");
        fields = c1.getDeclaredFields();//找到全部的属性
        for (Field field : fields) {
            System.out.println(field);
        }

        //获得指定属性的值
        Field name = c1.getDeclaredField("name");
        System.out.println(name);
        //获得类的方法
        Method[] methods = c1.getMethods(); //获得本类及其父类的全部public方法
        for (Method method : methods) {
            System.out.println("正常的:"+method);
        }
        Method[] declaredMethods = c1.getDeclaredMethods();//获得本类的所有方法
        for (Method declaredMethod : declaredMethods) {
            System.out.println("declaredMethod:"+declaredMethod);
        }
        //获得指定方法
        //由参数决定重载
        Method getName = c1.getMethod("getName", null);
        Method setName = c1.getMethod("setName", String.class);
        System.out.println(getName);
        System.out.println(setName);
        //获得指定的构造器
        Constructor<?>[] constructors = c1.getConstructors(); //获得public
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
        Constructor<?>[] declaredConstructors = c1.getDeclaredConstructors();//获得所有的
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
        //获取指定构造器
        Constructor<?> declaredConstructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        System.out.println(declaredConstructor);
    }
}
```

#### 小结

- 在实际的操作中，取得类的信息的操作代码
- 如何取得属性、方法、构造器名称、修饰符等
- java.lang.reflect

#### 获取Class对象作用

- 创建类的对象 调用Class对象的newInstance()方法
  - 类必须有一个无参数的构造器
  - 类的构造器访问权限需要足够
- 如果没有无参构造器，需要在操作的时候明确调用类中的构造器，并将参数传递进去，才可以进行实例化操作
  - 通过Class类的getDeclaredConstructor(Class<?>... parameterTypes)取得本类的指定形参类型的构造器
  - 向构造器的形参中传递一个对象数组进去，里面包含了构造器中所需的各个参数
  - 通过Constructor实例化对象

```java
//动态创建对象，通过反射
class TestCreate{
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        //获得class对象
        Class<?> c1 = Class.forName("com.flywinter.demo2.User");
        //构造一个对象
        User user = (User) c1.newInstance(); //本质上调用了类的无参构造器
        System.out.println(user);
        
        //通过构造器创建对象
        Constructor declaredConstructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        User user2 =(User) declaredConstructor.newInstance("fall", 1, 1);
        //通过反射调用普通方法
        User user3 = (User) c1.newInstance();
        //通过反射获取一个方法
        
        Method setName = c1.getDeclaredMethod("setName", String.class);
        //invoke：激活的以上
        //(对象，方法的值)
        setName.invoke(user3,"name");
        System.out.println(user3.getName());
        
        //通过反射操作属性
        User user4 = (User) c1.newInstance();
        Field name = c1.getDeclaredField("name");
        //不能直接操作私有属性，需要关闭程序的安全监测
        name.setAccessible(true);
        name.set(user4,"name");
        System.out.println(user4.getName());
    }
}
```

#### 调用指定的方法

通过反射，调用类中的方法，通过Method类完成

- 通过Class类的getMethod(String name,Class...parameterTypes)方法取得一个Method对象，并设置此方法操作时所需要的参数类型
- 之后使用Object invoke(Object obj,Object[] args)进行调用，并向方法中传递要设置的obj对象的参数信息

Object invoke(Object obj,Object[] args)

- Object对应原方法的返回值，若原方法无返回值， 此时返回null
- 若原方法为静态方法，此时形参Object obj可为null
- 若原方法形参列表为空，则Object[] args为null
- 若原方法声明为private，则需要在调用此invoke()方法前，显式调用方法对象的setAccessible(true)方法，将可访问private方法

setAccessible

- Method和Field、Constructor对象都有setAccessible()方法
- setAccessible作用是启动和金庸访问安全检查的开关，参数值为true则指示反射的对象在使用时应该取消Java语言访问检查
  - 提高反射的效率，如果代码中必须用反射，而该句代码需要频繁的被调用，那么设置为true
  - 使得原本无法访问的私有成员也可以访问
- 参数值为false则指示反射的对象应该实施Java语言访问检查

性能对比分析

```java
//分析性能问题
class TestPerformance{
    //普通方式调用
    public static void test01() {
        User user = new User();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            user.getName();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("普通方式:"+(endTime - startTime));
    }
    //反射方式调用
    public static void test02() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user = new User();
        Class<? extends User> c1 = user.getClass();
        Method getName = c1.getDeclaredMethod("getName", null);

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            getName.invoke(user,null);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("普通方式:"+(endTime - startTime));
    }
    //反射方式调用 关闭检测
    public static void test03() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user = new User();
        Class<? extends User> c1 = user.getClass();
        Method getName = c1.getDeclaredMethod("getName", null);
        getName.setAccessible(true);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            getName.invoke(user,null);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("反射方式，关闭检测:"+(endTime - startTime));
    }

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        test01();
        test02();
        test03();
    }

}
```

### 反射操作泛型

- Java采用泛型擦除的机制来引入泛型，Java中泛型仅仅是给编译器javac使用的，确保数据的安全性和免去强制类型转换问题，但是，一旦编译完成，所有和泛型有关的类型全部擦除
- 为了通过反射操作这些类型，Java新增了ParameterizedType，GenericArrayType，TypeVariable和WildcardType几种类型来代表不能被归一到Class类中的类型但是又和原始类型齐名的类型
  - ParameterType 表示一种参数化类型，比如Collcetion<String>
  - GenericArrayType 表示一种元素类型是参数化类型或者类型变量的数组类型
  - TypeVariable 是各种类型变量的公共父接口
  - WildcardType 代表一种通配符类型表达器

```java
//通过反射获取泛型
class TestGetGeneric{
    public void test1(Map<String,User> userMap,List<User> list){
        System.out.println("test1");
    }
    public Map<String,User> test2(){
        System.out.println("test2");
        return null;
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Method method = TestGetGeneric.class.getMethod("test1",Map.class, List.class);
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        for (Type genericParameterType : genericParameterTypes) {
            System.out.println(genericParameterType);
            if (genericParameterType instanceof ParameterizedType) {
                Type[] actualTypeArguments = ((ParameterizedType) genericParameterType).getActualTypeArguments();
                for (Type actualTypeArgument : actualTypeArguments) {
                    System.out.println(actualTypeArgument);
                }
            }
        }

        Method method2 = TestGetGeneric.class.getMethod("test2",null);
        Type genericReturnType = method2.getGenericReturnType();
        if (genericReturnType instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) genericReturnType).getActualTypeArguments();
            for (Type actualTypeArgument : actualTypeArguments) {
                System.out.println(actualTypeArgument);
            }
        }
    }
}
```

### 反射操作注解

- getAnnotations
- getAnnotation

#### ORM

- 什么是ORM
  - Object relationship Mapping --> 对象关系映射
  - 比如Java的类映射为数据库相关表的结构
  - 类和表结构对应
  - 属性和字段对应
  - 对象和记录对应
- 要求 利用注解和反射完成类和表结构的映射关系

```java
//反射操作注解
class TestORM{
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class<?> c1 = Class.forName("com.flywinter.demo2.Student");
        //通过反射获取注解
        Annotation[] annotations = c1.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
        //获得注解的value值
        TableStudent tableStudent = c1.getAnnotation(TableStudent.class);
        String value = tableStudent.value();
        System.out.println(value);
        //获得类指定的注解
        Field f = c1.getDeclaredField("name");
        FieldStudent annotation = f.getAnnotation(FieldStudent.class);
        System.out.println(annotation.columnName());
        System.out.println(annotation.type());
        System.out.println(annotation.length());
    }
}
@TableStudent("db_student")
class Student{
    @FieldStudent(columnName = "db_id",type = "int",length = 10)
    private int id;
    @FieldStudent(columnName = "db_age",type = "int",length = 10)
    private int age;
    @FieldStudent(columnName = "db_name",type = "varchar",length = 3)
    private String name;

    public Student() {
    }

    public Student(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", Age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
//类名的注解
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface TableStudent{
    String value();
}
//属性的注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface FieldStudent{
    String columnName();
    String type();
    int length();
}
```



# JavaWeb学习

## 学习路线

```mermaid
flowchart LR
	id1(JavaWeb7day) --> id2(Tomcat)
	id1 --> id3(Http)
	id1 --> id4(Maven)
	id1 --> id5(Servlet)
	id1 --> id6(Session\Cookie)
	id1 --> id7(JSP)
	id1 --> id8(三层架构)
	id1 --> id9(JSTL/EL表达式)
	id1 --> id10(过滤器)
	id1 --> id11(监听器)
	id1 --> id12(文件上传)
	id1 --> id13(邮件收发)
	id1 --> id14(扩展 富文本编辑器)
```



## Web的基本概念

### 前言

+ web，网页的意思，www.baidu.com
+ 静态web
  - html，css
  - 提供给所有人看的数据始终不会发生变化
+ 动态web
  - 提供给所有人看到数据始终会发生变化，每个人在不同的时间地点看到的信息不一样
  - 几乎所有的网站都是动态web
  - 技术栈 Servlet/JSP，ASP，PHP

在Java中，动态web资源开发的技术统称为JavaWeb

### Web应用程序

> Web 应用程序，可以供浏览器访问的程序

- a.html,b.html...多个web资源，这些web资源可以被外界访问
- 我们能访问的任何一个页面或资源，都存在于这个世界某一个角落的计算机上
- URL
- 这个统一的web资源会被放在同一个文件夹下，web应用程序-->Tomcat服务器
- 一个web应用由多部分组成(静态web，动态web)
  - html，css，js
  - jsp，servlet
  - Java应用程序
  - jar包
  - 配置文件(Properties)

web应用程序编写完毕后，若想提供给外界访问，需要一个服务器来统一管理

### 静态web

- *.html这些都是

- ```mermaid
  flowchart LR
  	id1(客户端) -- 一次请求Request--> id2(webService)
  	id2(webService) --一次响应Response--> id1(客户端)
  	subgraph 服务器
  		id2(webService) --> id3(index.html)
  		id3 --> id2
  	end
  ```

- 静态web存在的缺点

  - web页面无法动态更新，所有用户看到的都是同一个页面
    - 轮播图，点击特效，伪动态
    - javaScript 实际开发中用的最多
    - VBScript
  - 无法和数据库交互，数据无法持久化，用户无法交互

### 动态web

页面会动态展示 "web的页面展示效果因人而异"

```mermaid
flowchart TB
	id1(客户端) -- 一次请求Request--> id2(webService)
	id4 --一次响应Response--> id1
	subgraph 服务器
		id2(webServerPlugin) --静态资源--> id4(WebServer) --> id3(FileSystem)
		id2 --动态资源--> id5(动态web资源JSP/Servlet)
		id5 --> id4
	end
	id5 --JDBC--> id6(数据库)
```

缺点

- 假如服务器的动态web资源出现了错误，我们就需要重新编写我们的后台程序，重新发布
  - 停机weihu

优点

- Web页面可以动态更新，所有用户看到的都不是同一个页面
- 可以与数据库交互(数据持久化：注册、商品信息)

## Web服务器

### 技术简介

ASP

- 微软 国内最早流行的
- 在HTML中嵌入了VB脚本，ASP+COM
- 在ASP开发中，基本上一个页面都有几千行的业务代码，页面非常混乱，维护成本高
- C#

```html
<h1>
    <%
       System.out.printlin("hello")
     %>
</h1>
```

PHP

- PHP开发速度很快，功能很强大，跨平台，代码很简单
- 无法承载访问量很大的情况(局限性)

JSP/Servlet

B/S 浏览器和服务器

C/S 客户端和服务器

- sun公司主推的B/S架构
- 基于Java语言的(所有的大公司，或者一些开源的组件，都是Java写的)
- 可以承载三高问题带来的影响
- 语法类似ASP ASP->JSP 便于转换

...

### Web服务器

服务器是一种被动的操作，用来处理用户的一些请求和给用户一些响应信息

#### IIS

微软的 ASP... Windows自带的

#### Tomcat

面向Google编程

Tomcat是Apache 软件基金会（Apache Software Foundation）的Jakarta 项目中的一个核心项目，最新的Servlet 和JSP 规范总是能在Tomcat 中得到体现，Tomcat 5支持最新的Servlet 2.4 和JSP 2.0 规范。因为Tomcat 技术先进、性能稳定，而且免费，因而深受Java 爱好者的喜爱并得到了部分软件开发商的认可，成为目前比较流行的Web 应用服务器。

Tomcat 服务器是一个免费的开放源代码的Web 应用服务器，属于轻量级应用[服务器](https://baike.baidu.com/item/服务器)，在中小型系统和并发访问用户不是很多的场合下被普遍使用，是开发和调试JSP 程序的首选。对于一个Java初学Wen的人来说，它是最佳的选择

Tomcat 实际上运行JSP 页面和Servlet。目前Tomcat最新版本为10.0.5

**工作3~5年之后，可以尝试手写Tomcat服务器**

下载Tomcat

1. 安装或解压
2. 了解配置文件及目录结构
3. 这个东西的作用

## Tomcat

### 安装Tomcat

- [Tomcat8下载](https://tomcat.apache.org/download-80.cgi)

### Tomcat配置

- bin 启动，关闭的脚本文件
- cong 配置
- lib 以来的jar包
- logt日志
- webapps存放网站
- work工作目录

启动、关闭Tomcat

- 启动 startup.bat
- 关闭 shutdown.bat

访问测试 http://http://localhost:8080/

可能遇到的问题

1. Java环境变量没有配置

2. 闪退问题

   - 如果提示 tomcat Using CATALINA_OPTS:   ""，如果JDK版本>=11，cmd进入jdk的bin目录执行命令

     ```bash
     jlink.exe --module-path jmods --add-modules java.desktop --output jre 
     ```

     生成JRE

   - 在系统环境变量里配置JAVA_HOME指向JDK目录，然后在Path里面添加%JAVA_HOME%/bin，不要配置JRE_HOME

   - 如果版本小于JDK11，那么注意配置JRE_HOME变量

3. 乱码问题

   - 配置文件中设置

核心配置文件

**conf>server.xml**

- 可以配置启动的端口号

- tomcat的默认端口号为8080

  MYSQL默认端口号 3306

  http 80

  https 443

  ```xml
  <Connector port="8080" protocol="HTTP/1.1"
             connectionTimeout="20000"
             redirectPort="8443" />
  ```

- 可以配置主机的名称

- 默认的主机名为 localhost->127.0.0.1

- 默认网站应用存放的位置为webapps

  ```xml
  <Host name="localhost"  appBase="webapps"
              unpackWARs="true" autoDeploy="true">
  ```

高难度面试题

网站时如何进行访问的

1. 输入一个域名，回车访问

2. 检查本机的C:\Windows\System32\drivers\etc\hosts配置文件下有没有这个域名映射

   - 有，直接返回对应的ip地址

     ```java
     127.0.0.1 localhost
     ```

   - 没有 去DNS服务器找，找到就返回，找不到就返回找不到

![image-20210711153433012](allNote.assets/image-20210711153433012.png)

### 发布一个web网站

- 将自己写的网站放到服务器(Tomcat)中指定的web应用的文件夹(webapps)下，就可以访问了

网站应该有的结构

```java
--webapps:Tomcat服务器的web目录
    - ROOT
    - examples 网站的目录名
    	- WEB-INFO
    		- classes Java程序
    		- lib web应用所依赖的jar包
    		- web.xml
    	- index.html
    	- static
    		- css
    			- my.css
    		- js
    		- img
```

### Http

#### 什么是http

超文本传输协议（Hyper Text Transfer Protocol，HTTP）是一个简单的请求-响应协议，它通常运行在[TCP](https://baike.baidu.com/item/TCP/33012)之上。

- 文本 html ,字符串，...
- 超文本 图片、音乐、视频、定位、地图...
- 80

Https 安全的

- 443

#### 两个时代

- http1.0
  - HTTP/1.0 客户端可以与web服务器连接后，只能获得一个web资源，断开连接
- http2.0
  - HTTP/1.1 客户端可以与web服务器连接后，可以获得多个web资源

#### Http请求

- 客户端---发请求---服务器

百度

```java
Request URL: https://www.baidu.com/    请求地址
Request Method: GET     get方法/Post方法
Status Code: 200 OK     状态码 200
Remote(远程) Address: 182.61.200.7:443     
```

```java
Accept: text/html
Accept-Encoding: gzip, deflate, br
Accept-Language: zh-CN,zh;q=0.9   语言
Cache-Control: max-age=0
Connection: keep-alive
```

1. 请求行

   - 请求行中的请求方式 GET
   - 请求方式 Get，Post，HEAD，DELETE,PUT,TRACT
     - get 请求能够携带的参数比较少，大小有限制，会在浏览器的URL地址栏显式数据内容，不安全，但高效
     - post 请求能够携带的参数没有限制，大小没有限制，不会在浏览器的URL地址栏显式数据内容，安全，但不高效

2. 消息头

   ```java
   Accept: 告诉浏览器，它所支持的数据类型 
   Accept-Encoding: 支持哪种编码格式 GBK UTF-8 GB2312 ISO8859-1
   Accept-Language: 告诉浏览器，它的语言环境
   Cache-Control: 缓存控制
   Connection: 告诉浏览器，请求完成是断开还是保持连接
   HOST 主机
   ```

   

#### Http响应

- 服务器---响应---客户端

百度

```java
Cache-Control: private    缓存控制
Connection: keep-alive	  连接
Content-Encoding: gzip	  编码
Content-Type: text/html;charset=utf-8  类型
```

1. 响应体

   ```java
   Accept: 告诉浏览器，它所支持的数据类型 
   Accept-Encoding: 支持哪种编码格式 GBK UTF-8 GB2312 ISO8859-1
   Accept-Language: 告诉浏览器，它的语言环境
   Cache-Control: 缓存控制
   Connection: 告诉浏览器，请求完成是断开还是保持连接
   HOST 主机
   Refresh 告诉客户端，多久刷新一次
   Location 让网页重新定位
   ```

2. 响应状态码

   - 200 请求响应成功
   - 3** 请求重定向
     - 重定向 重新定义到给定的网站
   - 4** 找不到资源 404
     - 资源不存在
   - 5** 服务器出错 500 502网关错误

## Maven

### 为什么要学习Maven

1. 在Javaweb开发中，需要使用大量的jar包，手动导入

2. 如何让一个东西自动帮我们导入jar包

   因此Maven诞生

### Maven项目架构管理工具

目前就是用来方便导入jar包的

Maven的核心思想 **约定大于配置**

- 有约束，不要去违反

Maven会规定好你如何去编写Java代码，必须按照这个规范来

### 下载安装Maven

[Maven下载](https://maven.apache.org/download.cgi)

conf>setting.xml里面的mirrors，设置镜像地址

### 配置环境变量

在系统的环境变量中，配置如下配置

- M2_HOME maven目录下的bin目录
- MAVEN_HOME maven的目录
- 在系统的Path中配置 %MAVEN_HOME%\bin

### 阿里云镜像

- 镜像 mirrors
  - 作用 加速下载
- 国内建议使用阿里云镜像

```xml
   <!-- 	阿里云镜像 -->
	<mirror>
    <id>nexus-aliyun</id>
     <mirrorOf>*,!jeecg,!jeecg-snapshots</mirrorOf>
    <name>Nexus aliyun</name>
    <url>http://maven.aliyun.com/nexus/content/groups/public</url>
	</mirror>

```

```xml
<mirror>
    <id>nexus-aliyun</id>
    <mirrorOf>central</mirrorOf>
    <name>Nexus aliyun</name>
    <url>http://maven.aliyun.com/nexus/content/groups/public</url>
</mirror>
```

### 在IDEA中使用Maven

创建maven项目

勾选Create from archetype可以选择对应的Maven模板

Maven JAV

- GroupId 域名倒写
- ArtifactId 项目名
- Version 版本

等待项目初始化

IDEA中Maven通常会使用默认的仓库，可以手动改为指定的仓库

可以在File>New Project Settings>Setting for New Project中更改

### 本地仓库

在本地的仓库，远程仓库

建立一个本地仓库

```xml
 <localRepository>/path/to/local/repo</localRepository>
```



![image-20210711203312241](allNote.assets/image-20210711203312241.png)

### 创建一个普通的Maven对象

不勾选勾选Create from archetype，那么不会有选择仓库的选项

这个只有在web应用，也就是选择了模板后才会自动创建

![image-20210711210140590](allNote.assets/image-20210711210140590.png)

### 标记源代码目录

![image-20210711210228410](allNote.assets/image-20210711210228410.png)

### 在IDEA中配置Tomcat

![image-20210711210532914](allNote.assets/image-20210711210532914.png)

![image-20210711210705878](allNote.assets/image-20210711210705878.png)

解决警告问题

必须要配置 我们访问一个网站，需要指定一个文件夹的名字

![image-20210711210756775](allNote.assets/image-20210711210756775.png)

![image-20210711211005291](allNote.assets/image-20210711211005291.png)

启动Tomcat

![image-20210711211254004](allNote.assets/image-20210711211254004.png)

### pom文件

pom.xml是maven的核心文件

```java
<?xml version="1.0" encoding="UTF-8"?>
<!--Maven的版本头文件-->
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

<!--  这里就是配置的GAV-->
  <groupId>com.flywinter</groupId>
  <artifactId>springweb</artifactId>
  <version>1.0-SNAPSHOT</version>
<!--  Package 项目打包方式-->
<!--  jar java应用-->
<!--  war JavaWeb应用-->
  <packaging>war</packaging>

<!--  <name>springweb Maven Webapp</name>-->
  <!-- FIXME change it to the project's website -->
<!--  <url>http://www.example.com</url>-->

<!--  配置-->
  <properties>
<!--    项目的默认构建编码-->
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
<!--    编译版本-->
    <maven.compiler.source>1.7</maven.compiler.source>
    <maven.compiler.target>1.7</maven.compiler.target>
  </properties>
<!--项目依赖-->
  <dependencies>
<!--    具体依赖的jar包-->
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.11</version>
      <scope>test</scope>
    </dependency>
  </dependencies>
<!--项目构建用到东西-->
  <build>
    <finalName>springweb</finalName>
    <pluginManagement><!-- lock down plugins versions to avoid using Maven defaults (may be moved to parent pom) -->
      <plugins>
        <plugin>
          <artifactId>maven-clean-plugin</artifactId>
          <version>3.1.0</version>
        </plugin>
        <!-- see http://maven.apache.org/ref/current/maven-core/default-bindings.html#Plugin_bindings_for_war_packaging -->
        <plugin>
          <artifactId>maven-resources-plugin</artifactId>
          <version>3.0.2</version>
        </plugin>
        <plugin>
          <artifactId>maven-compiler-plugin</artifactId>
          <version>3.8.0</version>
        </plugin>
        <plugin>
          <artifactId>maven-surefire-plugin</artifactId>
          <version>2.22.1</version>
        </plugin>
        <plugin>
          <artifactId>maven-war-plugin</artifactId>
          <version>3.2.2</version>
        </plugin>
        <plugin>
          <artifactId>maven-install-plugin</artifactId>
          <version>2.5.2</version>
        </plugin>
        <plugin>
          <artifactId>maven-deploy-plugin</artifactId>
          <version>2.8.2</version>
        </plugin>
      </plugins>
    </pluginManagement>
  </build>
</project>
```

![image-20210712232850815](allNote.assets/image-20210712232850815.png)

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.flywinter</groupId>
    <artifactId>mavenTest</artifactId>
    <version>1.0-SNAPSHOT</version>

    <properties>
        <maven.compiler.source>11</maven.compiler.source>
        <maven.compiler.target>11</maven.compiler.target>
    </properties>
    <dependencies>
        <!--    具体依赖的jar包-->
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.11</version>
            <scope>test</scope>
        </dependency>
        <!--        Maven的高级之处在于他会帮你导入这个Jar包所依赖的其他jar包-->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>5.2.15.RELEASE</version>
        </dependency>
    </dependencies>
</project>
```

Maven由于它的约定大于配置，我们之后可能遇到我们写的配置文件，无法被导出或者生效的问题，解决方案

```xml
<!--    在build中配置resource，来防止我们资源导出失败的问题-->
    <build>
        <resources>
            <resource>
                <directory>src/main/resources</directory>
                <excludes>
                    <exclude>**/*.properties</exclude>
                    <exclude>**/*.xml</exclude>
                </excludes>
                <filtering>false</filtering>
            </resource>
            <resource>
                <directory>src/main/java</directory>
                <includes>
                    <include>**/*.properties</include>
                    <include>**/*.xml</include>
                </includes>
                <filtering>false</filtering>
            </resource>
        </resources>
    </build>
```

maven中jar包的关系

![image-20210712234212458](allNote.assets/image-20210712234212458.png)

![image-20210712234228376](allNote.assets/image-20210712234228376.png)



### Maven中的一些问题

1. Maven3.6.2版本有问题 

   - 换一个版本

2.  Tomcat闪退

   - JDK11以下，配置JAVA_HOME和JRE_HOME
   - JDK11及以上，生成JRE，只需要配置JAVA_HOME

3. IDEA每次都要重复配置Maven

   - File > New Project Settings > Settings for New Projects

4. Maven项目中Tomcat无法配置

5. maven默认web.xml中web.xml版本问题

   ![image-20210712235655389](allNote.assets/image-20210712235655389.png)

6. 替换为Tomcat最新ROOT下的web.xml版本

   ```xml
   <?xml version="1.0" encoding="UTF-8"?>
   <web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee"
            xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
            xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee
                         http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd"
            version="4.0"
            metadata-complete="true">
   </web-app>
   ```

## Servlet

### Servlet简介

- Servlet就是sun公司开发动态Web的一门技术
- Sun在这些API中提供一个接口，叫做Servlet，如果你想开发一个Servlet程序，只需要完成两个步骤
  - 编写一个类实现Servlet接口
  - 把开发好的Java类部署到Web服务器中
  - **把实现了Servlet接口的Java程序叫做Servlet**

### Hello Servlet

Servlet接口Sun公司有两个默认的实现类HttpServlet,GenericServlet

```mermaid
flowchart TB
	id1(Servlet接口) --> id2(GenericServlet) -->id3(HttpServlet)-->id4(我们自己的类只需要继承HttpServlet即可)
	id5("void service(ServletRequest var1, ServletResponse var2) throws ServletException, IOException")-->id1
	id6("void service(ServletRequest var1, ServletResponse var2) throws ServletException, IOException")-->id2
```



1. 构建一个普通的Maven项目，删掉里面的src目录，以后就在这个项目里面建立Modul，这个空的工程就是Maven的主工程

2. 关于Maven父子工程的理解

   父项目中会有

   ```xml
   <modules>
       <module>servlet-01</module>
   </modules>
   ```

   子项目会有(新版可能没有这个，可以自己添加，但是显示GroupId重复)

   ```java
   <parent>
     <groupId>com.flywinter</groupId>
     <artifactId>javaweb-02-servlet</artifactId>
     <version>1.0-SNAPSHOT</version>
   </parent>
   ```

   父项目中的Java子项目可以直接使用

   son extends parent

3. Maven环境优化

   1. 修改web.xml为最新的
   2. 将Maven的结构搭建完整

4. 编写一个Servlet

   1. 编写一个普通类
   2. 实现Servlet接口，这里直接继承HttpServlet
   
   ```java
   public class HelloServlet extends HttpServlet {
   
       //由于get或者post只是请求实现的不同方式，可以相互调用
       @Override
       protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           response.setContentType("text/html");
           PrintWriter out = response.getWriter();//获取响应流
           out.println("<html>");
           out.println("<head>");
           out.println("<title>Hello World!</title>");
           out.println("</head>");
           out.println("<body>");
           out.println("<h1>Hello World!</h1>");
           out.println("</body>");
           out.println("</html>");
   
       }
   
       @Override
       protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
           doGet(req,resp);
       }
   }
   ```
   
5. 编写Servlet映射

   为什么需要映射 我们写的是Java程序，但是需要通过浏览器访问，而浏览器需要连接web服务器，所以我们需要在web服务器中注册我们写的Servlet，还需要给他一个浏览器能够访问的路径,在web.xml中

   ```xml
   <!--    注册Servlet-->
       <servlet>
           <servlet-name>hello</servlet-name>
           <servlet-class>com.flywinter.servlet.HelloServlet</servlet-class>
       </servlet>
   <!--Servlet的请求路径-->
       <servlet-mapping>
           <servlet-name>hello</servlet-name>
           <url-pattern>/hello</url-pattern>
       </servlet-mapping>
   ```

6. 配置Tomcat

   注意 配置项目发布的路径就可以了

7. 启动测试

### Servlet原理

Servlet是由Web服务器调用，web服务器在收到浏览器请求之后，会

```mermaid
flowchart TB
	id1(浏览器) --发送Http请求--> id2(web容器)
	id2 --首次访问--> id3(Servlet)
	id2 --> id4(请求 请求头 请求体 Request)
	id2 --> id5(响应 响应头 响应体 Response)
	id5 --读取响应的信息--> id2
	id2 --响应给客户端--> id1
	id4 --调用Servlet的Service方法--> id6(Servlet)
	id5 --调用Servlet的Service方法--> id6
	id6 --> id7("service(ServletRequest var1, ServletResponse var2)")
	id8(Request会从service拿到请求 并且把请求之后的响应交给Response)
	id6 --> id9(我们自己编写的实现类 重写这些方法接收并处理请求 给出响应的信息)
```

### Mapping问题

1. 一个Servlet可以指定一个映射路径

   ```xml
   <servlet-mapping>
       <servlet-name>hello</servlet-name>
       <url-pattern>/hello</url-pattern>
   </servlet-mapping>
   ```

2. 一个Servlet可以指定多个映射路径

   ```xml
   <servlet-mapping>
       <servlet-name>hello</servlet-name>
       <url-pattern>/hello</url-pattern>
   </servlet-mapping>
   <servlet-mapping>
       <servlet-name>hello</servlet-name>
       <url-pattern>/hello1</url-pattern>
   </servlet-mapping>
   <servlet-mapping>
       <servlet-name>hello</servlet-name>
       <url-pattern>/hello2</url-pattern>
   </servlet-mapping>
   ```

3. 一个Servlet可以指定通用路径

   ```xml
   
   <servlet-mapping>
       <servlet-name>hello</servlet-name>
       <url-pattern>/hello/*</url-pattern>
   </servlet-mapping>
   ```

4. 默认请求路径

   ```xml
   <!--    默认请求路径-->
       <servlet-mapping>
           <servlet-name>hello</servlet-name>
           <url-pattern>/*</url-pattern>
       </servlet-mapping>
   ```

5. 指定一些后缀或前缀等

   ```xml
   <!--    可以自定义后缀实现请求映射
   注意 *勤勉不能加项目映射的路径
   只要以.do结尾就可以i请求到-->
   <servlet-mapping>
       <servlet-name>hello</servlet-name>
       <url-pattern>*.do</url-pattern>
   </servlet-mapping>
   ```

6. 优先级问题

   指定了固有的映射路径优先级最高，如果找不到就会找默认的请求

   ```xml
   <!--    404-->
       <servlet>
           <servlet-name>error</servlet-name>
           <servlet-class>com.flywinter.servlet.ErrorServlet</servlet-class>
       </servlet>
       <servlet-mapping>
           <servlet-name>error</servlet-name>
           <url-pattern>/*</url-pattern>
       </servlet-mapping>
   ```

### ServletContext

web容器在启动的时候，它会为每个web程序都创建一个对应的ServletContext对象，它代表了当前的web应用

#### 1. 共享数据

一个Servlet中保存的数据可以在另一个Servlet中使用

```mermaid
flowchart TB
	id4(ServletContext可以保存一些数据)
	id1(Servlet1) --> id4
    id2(Servlet2) --> id4
    id3(Servlet3)--> id4
```

```java
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        this.getInitParameter(); 初始化参数
//        this.getServletConfig(); Servlet配置
//        this.getServletContext(); Servlet上下文
        ServletContext servletContext = this.getServletContext();
        String name = "flywinter";//数据
        servletContext.setAttribute("userName",name);//将一个数据保存在ServletContext中

        System.out.println("Hello");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
```

```java
public class GetServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext servletContext = this.getServletContext();

        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        String userName = (String) servletContext.getAttribute("userName");
        resp.getWriter().print("name:"+userName);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
```

```xml
 <servlet>
    <servlet-name>hello</servlet-name>
    <servlet-class>com.flywinter.HelloServlet</servlet-class>
<!--    <init-param>-->
<!--      <param-name></param-name>-->
<!--      <param-value></param-value>-->
<!--    </init-param>-->
  </servlet>
  <servlet-mapping>
    <servlet-name>hello</servlet-name>
    <url-pattern>/hello</url-pattern>
  </servlet-mapping>

  <servlet>
    <servlet-name>getname</servlet-name>
    <servlet-class>com.flywinter.GetServlet</servlet-class>
  </servlet>
  <servlet-mapping>
    <servlet-name>getname</servlet-name>
    <url-pattern>/getname</url-pattern>
  </servlet-mapping>
```

测试访问结果

#### 2获取初始化参数

```xml
<!--  配置一些web应用的初始化参数-->
  <context-param>
    <param-name>url</param-name>
    <param-value>jdbc:mysql://localhost:3306/m</param-value>
  </context-param>
```

```java
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    ServletContext context = this.getServletContext();
    String parameter = context.getInitParameter("url");
    resp.getWriter().print(parameter);
}
```

#### 3.请求转发

```java
  @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("进入了Servlet");
        ServletContext servletContext = this.getServletContext();
        servletContext.
                getRequestDispatcher("/param") //转发的请求路径
                .forward(req,resp);//实现请求转发
    }

```

#### 4.读取资源文件

Properties

- 在java目录下新建properties
- 在resources目录下新建properties

发现：都被打包到了同一个路径下：classes，我们俗称这个路径为classpath

思路：需要一个文件流

```properties
username = root
password = 123456
# classpath
```



```java
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    ServletContext context = this.getServletContext();
    InputStream inputStream = context.getResourceAsStream("/WEB-INF/db.properties");
    Properties properties = new Properties();
    properties.load(inputStream);
    String username = properties.getProperty("username");
    String password = properties.getProperty("password");
    resp.getWriter().print(username+password);

}
```

访问测试

### HttpServletResponse

web服务器收到客户端的http请求，针对这个请求，分别创建一个代表请求的HttpServletRequest对象，代表响应的一个HttpServletResponse

- 如果要获取客户端请求过来的参数：找HttpServletRequest
- 如果要给客户端响应一些信息：找HttpServletResponse

#### 1.简单分类

负责向浏览器发送数据的方法

```java
ServletOutputStream getOutputStream() throws IOException;
PrintWriter getWriter() throws IOException;
```

负责向浏览器发送响应头的方法

```java
void setCharacterEncoding(String var1);

void setContentLength(int var1);

void setContentLengthLong(long var1);

void setContentType(String var1);

void setDateHeader(String var1, long var2);

void addDateHeader(String var1, long var2);

void setHeader(String var1, String var2);

void addHeader(String var1, String var2);

void setIntHeader(String var1, int var2);

void addIntHeader(String var1, int var2);
```

响应的状态码

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

#### 2.常见应用

1. 向浏览器输出消息

2. 下载文件

   - 要获取下载文件的路径

   - 下载的文件名

   - 设置让浏览器支持下载我们需要的东西

   - 获取下载文件的输入流

   - 创建缓冲区

   - 获取OutputStream对象

   - 将FileOutStream流写入到buffer缓冲区

   - 使用OutputStream输出到客户端

     ```java
         @Override
         protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     //        1. - 要获取下载文件的路径
     //        String realPath = this.getServletContext().getRealPath("/1.jpeg");
             String realPath = "E:\\learnNote\\maven\\javaweb-02-servlet\\response\\target\\classes\\1.jpeg";
             System.out.println("下载文件的路径："+realPath);
     //                - 下载的文件名
             String fileName = realPath.substring(realPath.lastIndexOf("\\") + 1);
     //                - 设置让浏览器支持下载我们需要的东西  文件如果为中文名需要指定编码
             resp.setHeader("Content-Disposition","attachment;fileName="+ URLEncoder.encode(fileName,"UTF-8"));
     //                - 获取下载文件的输入流
             FileInputStream inputStream = new FileInputStream(realPath);
     //                - 创建缓冲区
             int len = 0;
             byte[] buffer = new byte[1024];
     //                - 获取OutputStream对象
             ServletOutputStream outputStream = resp.getOutputStream();
     //                - 将FileOutStream流写入到buffer缓冲区  - 使用OutputStream输出到客户端
             while ((len = inputStream.read(buffer))>0){
                 outputStream.write(buffer,0,len);
             }
             inputStream.close();
             outputStream.close();
         }
     ```

#### 1.验证码功能

- 前端实现

- 后端实现，需要用到Java图片类产生图片

  ```java
      @Override
      protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
  //        如何让浏览器3s自动刷新一次
          resp.setHeader("refresh","3");
          //在内存中创建一个图片
          BufferedImage bufferedImage = new BufferedImage(80,20,BufferedImage.TYPE_INT_RGB);
          //得到图片
          Graphics2D graphics = (Graphics2D) bufferedImage.getGraphics();//笔
          //设置图片的颜色
          graphics.setColor(Color.white);
          graphics.fillRect(0,0,80,20);
          //给图片写数据
          graphics.setColor(Color.BLUE);
          graphics.setFont(new Font(null,Font.BOLD,20));
          graphics.drawString(getRandom(),0,20);
          //告诉浏览器这个请求用图片的方式打开
          resp.setContentType("image/jpeg");
          //网站存在缓存，不让浏览器缓存
          resp.setDateHeader("expires",-1);
          resp.setHeader("Cache-Control","no-cache");
          resp.setHeader("Pragma","no-cache");
          //把图片写给浏览器
          ImageIO.write(bufferedImage,"jpg",resp.getOutputStream());
      }
      //生成随机数
      private String getRandom(){
          Random random = new Random();
          String num = random.nextInt(9999999) + "";
          StringBuffer stringBuffer = new StringBuffer();
          for (int i = 0; i < 7 - num.length(); i++) {
              stringBuffer.append("0");
          }
          num = stringBuffer.toString() + num;
          return num;
      }
  ```

#### 4. 实现重定向

B一个web资源收到客户端A请求后，B会通知客户端去访问另一个web资源C，这个过程叫做重定向

常见场景

- 用户登录

  ```java 
  void sendRedirect(String var1) throws IOException;
  ```

  测试

  ```java
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      /*
      resp.setHeader("Location",this.getServletContext().getContextPath()+"/verify");
      resp.setStatus(302);
      */
      resp.sendRedirect(this.getServletContext().getContextPath()+"/verify");//重定向
  }
  ```

重定向和转发的区别

相同点

- 页面都会跳转

不同点

- 请求转发的时候，url不会发生变化
- 重定向的时候，url地址栏会发生变化

登录跳转示例

```jsp
<html>
<body>
<h2>Hello World!</h2>
<%--这里提交的路径需要寻找到项目的类路径--%>
<%--${pageContext.request.contextPath}代表当前的项目--%>
<%@page pageEncoding="UTF-8" %>
<form action="${pageContext.request.contextPath}/login" method="get">
    用户名:<input type="text" name="username"><br>
    密码:<input type="text" name="password"><br>
    <input type="submit">
</form>
</body>
</html>
```

```jsp
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Success</h1>
</body>
</html>
```

```xml
<servlet>
    <servlet-name>request</servlet-name>
    <servlet-class>com.flywinter.RequestTest</servlet-class>
</servlet>
<servlet-mapping>
    <servlet-name>request</servlet-name>
    <url-pattern>/login</url-pattern>
</servlet-mapping>
```

```java
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println("进入这个请求了");
    //处理请求
    String username = req.getParameter("username");
    String password = req.getParameter("password");
    System.out.println(username+":"+password);
    //重定向的时候一定要注意 路径问题 否则就会报404
    resp.sendRedirect(this.getServletContext().getContextPath()+"/success.jsp");
}
```

### HttpServletRequest

> HttpServletRequest代表客户端的请求，用户通过Http协议访问服务器，Http请求中的所有信息会被封装到HttpServeltRequest，通过HttpRequestServlet的方法获取

#### 1.获取前端传递的参数,请求转发

![image-20210717172510069](allNote.assets/image-20210717172510069.png)

```java
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    req.setCharacterEncoding("UTF-8");
    resp.setCharacterEncoding("UTF-8");
    String username = req.getParameter("username");
    String password = req.getParameter("password");
    String[] hobbies = req.getParameterValues("hobbies");
    System.out.println("===============");
    //后台接收中文乱码问题
    System.out.println(username);
    System.out.println(password);
    System.out.println(Arrays.toString(hobbies));
    //通过请求转发
    //这里的/代表当前的web应用
    req.getRequestDispatcher("/success.jsp").forward(req,resp);
    resp.setCharacterEncoding("UTF-8");
}

@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    doGet(req, resp);
}
```

#### 2.请求转发和重定向的区别

相同

- 页面都会实现跳转

不同的

- 请求转发的时候，url不会发生变化  307
- 重定向的时候，url地址栏会发生变化 302

## Session、Cookie

### 会话

会话：用户打开一个浏览器，点击了很多超链接，访问多个web资源，关闭浏览器，这个过程称之为会话

有状态会话：服务端请求服务端后，下次再请求，服务端会知道客户端已经请求过

服务端发送一个凭证

服务端登记这个凭证

一个网站，怎么证明来过

1. 服务端发送给客户端一个凭证，客户端下次访问服务端带上凭证就可以了 cookie
2. 服务器登记客户端来过了，下次客户端再来的时候服务端匹配 session

### 保存会话的两种技术

cookie

- 客户端技术(响应、请求)

session

- 服务器技术，利用这个技术，可以保存用户的会话信息，然后把信息或数据放在session中

常见应用

- 记住用户登录状态

### Cookie

![image-20210717223618310](allNote.assets/image-20210717223618310.png)

1. 从请求中拿到cookie信息
2. 服务器响应给客户端

```java
Cookie[] cookies = req.getCookies();//获得cookie
cookie.getName()//获得cookie中的key
cookie.getValue()//获得key对应的值
        Cookie cookie = new Cookie("lastLoginTime", System.currentTimeMillis()+"");//新建一个cookie
cookie.setMaxAge(24*60*60);//设置cookie有效期
resp.addCookie(cookie);//添加cookie
```

cookie:一般会保存在本地的用户目录下AppData中.cookie后缀

一个网站的cookie是否存在上限

- 一个Cookie只能保存一个信息
- 一个web站点可以给浏览器发送多个cookie，最多存放20个cookie
- Cookie大小限制4kb
- 300个cookie浏览器上限

删除cookie

- 不设置有效期，关闭浏览器，自动失效
- 设置有效期时间为0

cookie存中文数据编码解码

```java
URLEncoder.encode("中文数据","UTF-8");//编码
URLDecoder.decode(cookie.getValue(),"UTF-8");//解码
```

### Session(重点)

![image-20210717223745383](allNote.assets/image-20210717223745383.png)

什么是Session

- 服务器会给每一个用户(浏览器)，创建一个Session对象
- 一个Session独占一个浏览器，只要浏览器没有关闭，这个Session就存在
- 用户登录之后，整个网站他都可以访问-->保存用户的信息，保存购物车等

![image-20210717221245841](allNote.assets/image-20210717221245841.png)

Session和cookie的区别

- Cookie是把用户的数据写给用户的浏览器，浏览器保存(可以保存多个)
- Session把用户的数据写到用户独占Session中，服务器端缓存(保存重要的信息)
- Session对象由服务器创建

使用场景

- 保存一个登录用户的信息
- 购物车信息
- 在整个网站中经常会使用的数据，我们将它保存在Session中

```java
        //解决乱码问题
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        //得到Session
        HttpSession session = req.getSession();
        session.setAttribute("name",new Person("name",10));
        //给Session中存东西
        String id = session.getId();
        //判断Session是不是新创建的
        if (session.isNew()) {
            resp.getWriter().write("session创建成功，Id为:"+id);
        }else {
            resp.getWriter().write("Session已经在服务器中存在了:"+id);
        }
        //Session创建的时候做了什么事情
//        Cookie cookie = new Cookie("JSSIONID", "sessionId");
//        resp.addCookie(cookie);
```

```java
//解决乱码问题
req.setCharacterEncoding("UTF-8");
resp.setCharacterEncoding("UTF-8");
resp.setContentType("text/html;charset=UTF-8");
//得到Session
HttpSession session = req.getSession();
Person name =(Person) session.getAttribute("name");
System.out.println(name);
```

```java
HttpSession session = req.getSession();
session.removeAttribute("name");
//手动注销Session
session.invalidate();
```

会话自动过期web.xml配置

```xml
<!--    设置Session默认的失效时间-->
    <session-config>
<!--        15分钟后session自动失效，以分钟为单位-->
        <session-timeout>15</session-timeout>
    </session-config>
```

## JSP

### 什么是JSP

Java Server Pages Java服务器端页面，和Servlet一样，用于动态Web技术

最大的特点

- 写JSP就像在写HTML
- 区别
  - HTML只给用户提供静态的数据
  - JSP页面中可以嵌入Java代码，为用户提供动态数据

### JSP原理

JSP到底是怎么执行的

- 代码层面没有任何问题

- 服务器内部工作原理

  Tomcat中有一个work目录

  IDEA中使用Tomcat会在IDEA的Tomcat中生成一个work目录

  ```
  C:\Users\14757\AppData\Local\JetBrains\IntelliJIdea2021.1\tomcat\4b6d8140-047f-4f5c-b67f-ef008d23dfbb\work\Catalina\localhost\servlet\org\apache\jsp
  ```

  里面的页面转变成了Java

  ![image-20210717224721401](allNote.assets/image-20210717224721401.png)

浏览器向服务器发送请求，不管访问什么资源，其实都是在访问Servlet

JSP最终也会被转化为一个Java类

**JSP本质上就是一个Servlet**

```java
//初始化
public void _jspInit() {
  }
//销毁
  public void _jspDestroy() {
  }
//JSPService
  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException 
```

1. 判断请求

2. 内置一些对象

   ```java
    final javax.servlet.jsp.PageContext pageContext; //页面上下文
       javax.servlet.http.HttpSession session = null;//session
       final javax.servlet.ServletContext application;//application
       final javax.servlet.ServletConfig config;//config
       javax.servlet.jsp.JspWriter out = null;//out
       final java.lang.Object page = this;//page 当前
       HttpServletRequest request   //请求
       HttpServletResponse response  //响应
   ```

3. 输出页面前增加的代码

   ```java
     response.setContentType("text/html");//设置相应页面类型
         pageContext = _jspxFactory.getPageContext(this, request, response,
         			null, true, 8192, true);
         _jspx_page_context = pageContext;
         application = pageContext.getServletContext();
         config = pageContext.getServletConfig();
         session = pageContext.getSession();
         out = pageContext.getOut();
         _jspx_out = out;
   ```

4. 以上的对象可以在JSP页面中直接使用

5. ![image-20210717230352237](allNote.assets/image-20210717230352237.png)

在JSP页面中

只要是Java代码就会原封不动的输出

如果是HTML代码，就会被转换为

```java
out.write("<html>\r\n");
```

这样的格式，输出到前端

### JSP基础语法

任何语言都有自己的语法，JSP作为Java技术的一种应用，它拥有一些自己扩充的语法，Java的所有语法都支持

**JSP表达式**

```jsp
<%--  JSP表达式
作用：用来将程序的输出，输出到客户端
  <%= 变量或者表达式%>
--%>
  <%=new Date()%>
```

**JSP脚本片段**

```jsp
<%--  JSP脚本片段--%>
  <%
    int sum = 0;
    for (int i = 0; i < 100; i++) {
      sum+=i;
    }
    out.println("<h1>Sum="+sum+"</h1>");
  %>
```

**脚本片段的再实现**

```jsp
  <%
    int x = 10;
    out.println(x);
  %>
  <p>这是一个JSP文档</p>
  <%
    int y = 2;
    out.println(y);
  %>
  <hr>
<%--  在代码中嵌入HTML元素--%>
  <%
    for (int i = 0; i < 5; i++) {
  %>
  <h1>
    Hello World <%=i%>
  </h1>
  <%
    }
  %>
```

**JSP声明**

```jsp
<%!
  static {
    System.out.println("Loading Servlet");
  }
  private int globalVar = 0;
  public void print(){
    System.out.println("进入了print方法");
  }
%>
```

JSP声明：会被编译到JSP生成的Java类中，其他的，就会被生成到_jspService方法中

在JSP中嵌入Java

```jsp
<%%>
<%=%>
<%!%>
<%--注释--%>
```

JSP的注释不会在客户端展示，HTML的注释会显示

### JSP指令

```jsp
<%@page args...%>
<%@include file="index.jsp"%>

<%--<%@include file="" %>会将两个页面合二为一--%>
<%@include file="common/header.jsp" %>
<h1>网站主题</h1>
<%@include file="common/footer.jsp" %>
<hr>
<%--JSP标签
<%--<jsp:include page=""/>拼接页面，本质还是两个--%>
--%>
<jsp:include page="common/header.jsp"/>
<jsp:include page="common/footer.jsp"/>
```

### 9大内置对象

- PageContext 存数据
- Request 存数据
- Response
- Session 存数据
- Application [ServletContext] 存数据
- config [ServletConfig]
- out 
- page 几乎不用
- exception

```java
    pageContext.setAttribute("name1","pageContext"); //保存的数据只在一个页面中有效
    request.setAttribute("name2","request"); //保存的数据只在一次请求中有效，请求转发会携带这个数据
    session.setAttribute("name3","session"); //保存的数据只在一次会话中有效，从打开浏览器到关闭浏览器
    application.setAttribute("name4","application"); //保存的数据只在服务器中有效，从打开服务器到关闭服务器
```

request:客户端向服务器发送请求，产生的数据，用户看完就没用了

session:客户端向服务器发送请求，产生的数据，用户用完一会还有，比如购物车

application:客户端向服务器发送请求，产生的数据，一个用户用完了，其他用户可能用

### JSP标签,JSTL标签，EL表达式

```xml
<!--        JSTL表达式的依赖-->
        <dependency>
            <groupId>javax.servlet.jsp.jstl</groupId>
            <artifactId>jstl-api</artifactId>
            <version>1.2</version>
        </dependency>
<!--        standard标准库-->
        <dependency>
            <groupId>taglibs</groupId>
            <artifactId>standard</artifactId>
            <version>1.1.2</version>
        </dependency>
```

EL表达式：${}

- 获取数据
- 执行运算
- 获取web开发的常用对象
- ~~运行Java代码~~

JSP标签

```jsp
<%--<jsp:include page=""--%>
<%--localhost:8080/jsptag.jsp?name=name&age=12--%>
<jsp:forward page="jsptag2.jsp">
  <jsp:param name="name" value="name"/>
  <jsp:param name="age" value="11"/>
</jsp:forward>
```

SJTL表达式

JSTL标签库的使用就是为了弥补HTML标签的不足，它自定义了很多标签，标签的功能和Java代码相同

**核心标签**

```jsp
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
```

![image-20210718121317917](allNote.assets/image-20210718121317917.png)

JSTL标签库使用步骤

- 引入对应的taglib
- 使用其中的方法

在Tomcat中也需要导入相关包，否则会提示uri解析错误

![image-20210718122443748](allNote.assets/image-20210718122443748.png)

c:if

```jsp
<%--
  Created by IntelliJ IDEA.
  User: 14757
  Date: 2021/7/18
  Time: 12:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--引入JSTL标签库，才能使用JSTL核心库--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>测试if</h1>

<hr>

<form action="coreif.jsp" method="get">
<%--  EL表达式获取表单中的数据
${param.参数名}
--%>
  <input type="text" name="username" value="${param.username}">
  <input type="submit" value="登录">
</form>
判断如果提交的用户名是管理员，则登陆成功
<c:if test="${param.username=='admin'}" var="isAdmin">
  <c:out value="管理员"/>
</c:if>
<c:out value="${isAdmin}"/>

</body>
</html>
```

c:choose

```jsp
<%--定义一个变量score 值为85--%>
<c:set var="score" value="85"/>
<c:choose>
  <c:when test="${score >=90}">
    你的成绩为优秀
  </c:when>
  <c:when test="${score >=80}">
    你的成绩为良好
  </c:when>
  <c:when test="${score >=70}">
    你的成绩为一般
  </c:when>
  <c:when test="${score <70}">
    你的成绩不及格
  </c:when>
</c:choose>
```

c:forEach

```jsp
<%
  ArrayList<String> people = new ArrayList<>();
  people.add(0,"1");
  people.add(1,"2");
  people.add(2,"3");
  people.add(3,"4");
  request.setAttribute("list",people);
%>
<%--var 每一次遍历出来的遍历 
items要遍历的对象
begin 开始
step 步长
end 结束
--%>
<c:forEach var="people" items="${list}">
  <c:out value="${people}"/>
</c:forEach>

<hr>
<c:forEach var="people" items="${list}" begin="1" end="3" step="2">
  <c:out value="${people}"/>
</c:forEach> 
```

格式化标签

SQL标签

XML标签

## JavaBean

实体类

JavaBean特有的写法

- 必须要有一个无参构造
- 属性必须私有化
- 必须有对应的get/set方法

一般用来和数据库的字段做映射 ORM

ORM 对象关系映射

- 表-->类
- 字段-->属性
- 行记录 -->对象

people表

| id   | name | age  | address |
| ---- | ---- | ---- | ------- |
| 1    | 张三 | 20   | 南京    |
| 2    | 王五 | 40   | 上海    |
| 3    | 李四 | 60   | 北京    |

```java
class People{
    private int id;
    private String name;
    private int age;
    private String address;
}
```

## MVC三层架构

什么是MVC: Model view Controller 模型 视图 控制器

早些年

![image-20210718165540509](allNote.assets/image-20210718165540509.png)

用户直接访问控制层，控制层就可以直接操作数据库

serclet-->CRUD-->数据库

- 弊端 程序十分臃肿，不利于维护，servlet的代码中，处理请求、响应、试图跳转、JDBC、业务代码、处理逻辑代码

三层架构

![image-20210718170337769](allNote.assets/image-20210718170337769.png)

Model

- 业务处理：业务逻辑（Service）
- 数据持久层：CRUD(Dao)

View

- 展示数据
- 提供链接发起Servlet请求(a,form,img...)

Controller(Servlet)

- 接收用户请求(req:请求参数，Session信息)

- 交给业务层处理对应的代码

- 控制视图的跳转

  ```java
  登录-->接收用户的登录请求-->处理用户的请求(获取用户登录的参数,username,password)-->交给业务层处理登陆业务(判断用户名密码名是否正确：事务)-->Dao层查询用户名和密码是否正确-->数据库
  ```

## 过滤器Filter

Filter：过滤器，用来过滤网站的数据

- 处理中文乱码
- 登陆验证...

![image-20210718171125486](allNote.assets/image-20210718171125486.png)

Filter开发流程

1. 导包

2. 编写过滤器

   - 注意Filter是javax.servlet包下

   - ```java
     public class CharsetEncodingFilter implements Filter {
         //初始化 web服务器启动就初始化了 随时等待过滤对象
         @Override
         public void init(FilterConfig filterConfig) throws ServletException {
             System.out.println("CharsetEncodingFilter初始化");
         }
     
     //    chain 链
     //    过滤器中的所有代码，在过滤特定请求的时候都会执行
     //    必须要让过滤器继续执行
     //    filterChain.doFilter(servletRequest, servletResponse);
         @Override
         public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
             servletRequest.setCharacterEncoding("UTF-8");
             servletResponse.setCharacterEncoding("UTF-8");
             servletResponse.setContentType("text/html;charset=UTF-8");
             System.out.println("CharsetEncodingFilter执行前");
             filterChain.doFilter(servletRequest, servletResponse);//让我们的请求继续走，如果不写，程序在这里就被拦截停止了
             System.out.println("CharsetEncodingFilter执行后");
         }
     
         //销毁 web服务器关闭的时候，过滤器会销毁
         @Override
         public void destroy() {
             System.gc();
             System.out.println("CharsetEncodingFilter Destroyed");
         }
     }
     ```

3. 在web.xml中配置

   ```xml
       <filter>
           <filter-name>CharsetEncodingFilter</filter-name>
           <filter-class>com.flywinter.filter.CharsetEncodingFilter</filter-class>
       </filter>
       <filter-mapping>
           <filter-name>CharsetEncodingFilter</filter-name>
   <!--        Servlet的所有请求都会经过这个过滤器-->
           <url-pattern>/servlet/*</url-pattern>
       </filter-mapping>
   ```

## 监听器

实现一个监听器的接口

1. 编写监听器

   ```java
   public class OnlineCountListener implements HttpSessionListener {
       //创建session监听
       //一旦创建session就会触发一次这个事件
       @Override
       public void sessionCreated(HttpSessionEvent httpSessionEvent) {
           ServletContext servletContext = httpSessionEvent.getSession().getServletContext();
           System.out.println(httpSessionEvent.getSession().getId());
           Integer onlineCount = (Integer) servletContext.getAttribute("OnlineCount");
           if (onlineCount == null) {
               onlineCount = new Integer(1);
           }else {
               int count = onlineCount.intValue();
               onlineCount = new Integer(count+1);
           }
           servletContext.setAttribute("OnlineCount",onlineCount);
       }
       //销毁session监听
       //一旦销毁session就会触发一次这个事件
       @Override
       public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
           ServletContext servletContext = httpSessionEvent.getSession().getServletContext();
           Integer onlineCount = (Integer) servletContext.getAttribute("OnlineCount");
           if (onlineCount == null) {
               onlineCount = new Integer(0);
           }else {
               int count = onlineCount.intValue();
               onlineCount = new Integer(count-1);
           }
           servletContext.setAttribute("OnlineCount",onlineCount);
       }
       /*
       Session销毁
       手动销毁
       自动销毁
       */
   }
   ```

2. web.xml中注册监听器

   ```xml
   <!--    注册监听器-->
       <listener>
           <listener-class>com.flywinter.listener.OnlineCountListener</listener-class>
       </listener>
   ```

3. 看情况是否使用

## 过滤器监听器常见使用

```java
public class TestPanel {
    public static void main(String[] args) {
        Frame frame = new Frame("实习快乐");//新建一个窗体
        Panel panel = new Panel(null);//面板
        frame.setLayout(null);//设置窗体布局

        frame.setBounds(300,300,500,500);
        frame.setBackground(new Color(0,0,255));//设置背景颜色


        frame.setBounds(50,50,300,300);
        frame.setBackground(new Color(0,255,0));//设置背景颜色

        frame.add(panel);
        frame.setVisible(true);

        //监听事件，监听关闭事件
        frame.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("打开");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("关闭中");
                System.exit(0);
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("关闭了");
            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("激活");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("未激活");
            }
        });

    }
}
```

用户登录之后才能进入主页，用户注销后就不能进入主页了

1. 用户登录之后，向Session中放入用户的数据
2. 进入主页的时候要判断用户是否已经登录，在过滤器中实现

## JDBC

### 什么是JDBC ：Java连接数据库

```mermaid
flowchart TB
	id1(Application) --> id2(JDBC)
	id2 --> id3(MySQL驱动)-->id6(MySQL)
	id2 -->id4(Oracle驱动)-->id5(Oracle)
```

需要jar包的支持

- java.sql
- javax.sql
- 驱动包

环境搭建

1. 导入数据库依赖

   ```java
   <!--        mysql的驱动-->
           <dependency>
               <groupId>mysql</groupId>
               <artifactId>mysql-connector-java</artifactId>
               <version>8.0.24</version>
           </dependency>
   ```

2. JDBC固定步骤

   1. 加载驱动
   2. 连接数据库
   3. 向数据库发送SQL对象Statement:CRUD
   4. 编写SQL 根据业务，不同的SQL
   5. 执行SQL
   6. 关闭连接

   ```java
   //1.配置信息
   String url = "jdbc:mysql://localhost:3306/jdbc?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
   String username = "root";
   String password = "123456";
   //2.加载驱动
   Class.forName("com.mysql.jdbc.Driver");
   //3.连接数据库，代表数据库
   Connection connection = DriverManager.getConnection(url, username, password);
   //4.向数据库发送SQL的对象statement PreparedStatement CRUD
   Statement statement = connection.createStatement();
   //5.编写SQL
   String sql = "select * from users";
   //6.执行sql语句 返回结果集
   ResultSet resultSet = statement.executeQuery(sql);
   while (resultSet.next()) {
       System.out.println("id="+resultSet.getObject("id"));
       System.out.println("name="+resultSet.getObject("name"));
       System.out.println("password="+resultSet.getObject("password"));
       System.out.println("email="+resultSet.getObject("email"));
       System.out.println("birthday="+resultSet.getObject("birthday"));
   }
   //7.关闭连接，释放资源，先开后关
   resultSet.close();
   statement.close();
   connection.close();
   ```

### 预编译SQL

```java
//1.配置信息
String url = "jdbc:mysql://localhost:3306/jdbc?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
String username = "root";
String password = "123456";
//2.加载驱动
Class.forName("com.mysql.jdbc.Driver");
//3.连接数据库，代表数据库
Connection connection = DriverManager.getConnection(url, username, password);
//4.编写SQL
String sql = "insert into users (id, name, password, email, birthday) VALUES (?,?,?,?,?)";
//5.预编译
PreparedStatement preparedStatement = connection.prepareStatement(sql);
preparedStatement.setInt(1,4); //给第一个占位符的赋值为1
preparedStatement.setString(2,"name"); //给第二个占位符的赋值为name
preparedStatement.setString(3,"pass"); //给第三个占位符的赋值为pass
preparedStatement.setString(4,"z@foxmail.com"); //给第四个占位符的赋值为z@foxmail.com
preparedStatement.setDate(5,new Date(System.currentTimeMillis())); //给第五个占位符的赋值为Date()
//6.执行sql语句 返回结果集
int i = preparedStatement.executeUpdate();
if (i>0) {
    System.out.println("插入成功");
}
//7.关闭连接，释放资源，先开后关
preparedStatement.close();
connection.close();
```

### 事务

要么都成功，要么都失败

ACID原则，保证数据的安全

> 开启事务
>
> 事务提交 commit()
>
> 事务回滚 rollback()
>
> 关闭事务
>
> 比如转账 数据一致性

Junit单元测试

依赖

```xml
<!--        单元测试-->
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13</version>
        </dependency>
```

简单使用

@Test注解只有在方法上有效，只要加了这个注解，就可以直接运行这个方法

```java
    @Test
    public void test() throws ClassNotFoundException, SQLException {
        //1.配置信息
        String url = "jdbc:mysql://localhost:3306/jdbc?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
        String username = "root";
        String password = "123456";
        Connection connection = null;
        try {
            //2.加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //3.连接数据库，代表数据库
            connection = DriverManager.getConnection(url, username, password);
            //4.通知数据库开启事务，fasle，开启
            connection.setAutoCommit(false);
            String sql = "update account set money = money-100 where name = 'A'";
            connection.prepareStatement(sql).executeUpdate();
//        人为制造异常
            int i = 1/0;
            String sql2 = "update account set money = money+100 where name = 'B'";
            connection.prepareStatement(sql2).executeUpdate();
            connection.commit();//以上两条SQL都执行成功，就提交事务
        }catch (Exception e){
            //如果出现异常，就通知数据库回滚
            connection.rollback();
            System.out.println("出现了异常");
        }finally {
            connection.close();
        }
    }
```

## SMBMS

### 1.项目结构

```mermaid
flowchart LR
	id1(SMBMS) --> id2([登录/注销])
	id1 --> id3(用户管理)
	id1 --> id4(订单管理)
	id1 --> id5(供应商管理)
	id3 --> id6(增)
	id3 --> id7(删)
	id3 --> id8(改)
	id3 --> id9(查)
	id4 --> id6(增)
	id4 --> id7(删)
	id4 --> id8(改)
	id4 --> id9(查)
	id5 --> id6(增)
	id5 --> id7(删)
	id5 --> id8(改)
	id5 --> id9(查)
	
	id6 --> id10(数据库)
	id7 --> id10
	id8 --> id10
	id9 --> id10
```

ER图(实体关系图)

![image-20210719122046200](allNote.assets/image-20210719122046200.png)



### 2.项目搭建

1. 搭建一个maven web项目

2. 配置tomcat

3. 测试项目能否跑起来

4. 导入项目中需要引入的jar包

   ```xml
   <dependencies>
       <dependency>
           <groupId>javax.servlet</groupId>
           <artifactId>servlet-api</artifactId>
           <version>2.5</version>
       </dependency>
       <dependency>
           <groupId>javax.servlet.jsp</groupId>
           <artifactId>jsp-api</artifactId>
           <version>2.2</version>
       </dependency>
       <dependency>
           <groupId>mysql</groupId>
           <artifactId>mysql-connector-java</artifactId>
           <version>8.0.24</version>
       </dependency>
       <dependency>
           <groupId>javax.servlet.jsp.jstl</groupId>
           <artifactId>jstl-api</artifactId>
           <version>1.2</version>
       </dependency>
       <dependency>
           <groupId>taglibs</groupId>
           <artifactId>standard</artifactId>
           <version>1.1.2</version>
       </dependency>
   </dependencies>
   ```

5. 创建项目包结构

   ![image-20210719195412820](allNote.assets/image-20210719195412820.png)

   

6. 编写实体类

   ORM映射 表-类映射

   User类

   ```java
   package com.flywinter.entity;
   
   import java.awt.font.ImageGraphicAttribute;
   import java.util.Date;
   
   /**
    * Created by IntelliJ IDEA
    * User:Zhang Xingkun
    * Date:2021/7/19 12:24
    * Description:
    */
   public class User {
       private Integer id; //id
       private String userCode; //用户编码
       private String userName; //用户名称
       private String userPassword; //用户密码
       private Integer gender;  //性别
       private Date birthday;  //出生日期
       private String phone;   //电话
       private String address; //地址
       private Integer userRole;    //用户角色
       private Integer createdBy;   //创建者
       private Date creationDate; //创建时间
       private Integer modifyBy;     //更新者
       private Date modifyDate;   //更新时间
   
       private Integer age;//年龄
       private String userRoleName;    //用户角色名称
   
   
       public String getUserRoleName() {
           return userRoleName;
       }
   
       public void setUserRoleName(String userRoleName) {
           this.userRoleName = userRoleName;
       }
   
       public Integer getAge() {
           Date date = new Date();
           Integer age = date.getYear() - birthday.getYear();
           return age;
       }
   
       public Integer getId() {
           return id;
       }
   
       public void setId(Integer id) {
           this.id = id;
       }
   
       public String getUserCode() {
           return userCode;
       }
   
       public void setUserCode(String userCode) {
           this.userCode = userCode;
       }
   
       public String getUserName() {
           return userName;
       }
   
       public void setUserName(String userName) {
           this.userName = userName;
       }
   
       public String getUserPassword() {
           return userPassword;
       }
   
       public void setUserPassword(String userPassword) {
           this.userPassword = userPassword;
       }
   
       public Integer getGender() {
           return gender;
       }
   
       public void setGender(Integer gender) {
           this.gender = gender;
       }
   
       public Date getBirthday() {
           return birthday;
       }
   
       public void setBirthday(Date birthday) {
           this.birthday = birthday;
       }
   
       public String getPhone() {
           return phone;
       }
   
       public void setPhone(String phone) {
           this.phone = phone;
       }
   
       public String getAddress() {
           return address;
       }
   
       public void setAddress(String address) {
           this.address = address;
       }
   
       public Integer getUserRole() {
           return userRole;
       }
   
       public void setUserRole(Integer userRole) {
           this.userRole = userRole;
       }
   
       public Integer getCreatedBy() {
           return createdBy;
       }
   
       public void setCreatedBy(Integer createdBy) {
           this.createdBy = createdBy;
       }
   
       public Date getCreationDate() {
           return creationDate;
       }
   
       public void setCreationDate(Date creationDate) {
           this.creationDate = creationDate;
       }
   
       public Integer getModifyBy() {
           return modifyBy;
       }
   
       public void setModifyBy(Integer modifyBy) {
           this.modifyBy = modifyBy;
       }
   
       public Date getModifyDate() {
           return modifyDate;
       }
   
       public void setModifyDate(Date modifyDate) {
           this.modifyDate = modifyDate;
       }
   }
   ```

   Bill类

   ```java
   package com.flywinter.entity;
   
   import java.math.BigDecimal;
   import java.util.Date;
   
   /**
    * Created by IntelliJ IDEA
    * User:Zhang Xingkun
    * Date:2021/7/19 12:34
    * Description:
    */
   public class Bill {
       private Integer id;   //id
       private String billCode; //账单编码
       private String productName; //商品名称
       private String productDesc; //商品描述
       private String productUnit; //商品单位
       private BigDecimal productCount; //商品数量
       private BigDecimal totalPrice; //总金额
       private Integer isPayment; //是否支付
       private Integer providerId; //供应商ID
       private Integer createdBy; //创建者
       private Date creationDate; //创建时间
       private Integer modifyBy; //更新者
       private Date modifyDate;//更新时间
   
       private String providerName;//供应商名称
   
   
       public String getProviderName() {
           return providerName;
       }
       public void setProviderName(String providerName) {
           this.providerName = providerName;
       }
       public Integer getId() {
           return id;
       }
       public void setId(Integer id) {
           this.id = id;
       }
       public String getBillCode() {
           return billCode;
       }
       public void setBillCode(String billCode) {
           this.billCode = billCode;
       }
       public String getProductName() {
           return productName;
       }
       public void setProductName(String productName) {
           this.productName = productName;
       }
       public String getProductDesc() {
           return productDesc;
       }
       public void setProductDesc(String productDesc) {
           this.productDesc = productDesc;
       }
       public String getProductUnit() {
           return productUnit;
       }
       public void setProductUnit(String productUnit) {
           this.productUnit = productUnit;
       }
       public BigDecimal getProductCount() {
           return productCount;
       }
       public void setProductCount(BigDecimal productCount) {
           this.productCount = productCount;
       }
       public BigDecimal getTotalPrice() {
           return totalPrice;
       }
       public void setTotalPrice(BigDecimal totalPrice) {
           this.totalPrice = totalPrice;
       }
       public Integer getIsPayment() {
           return isPayment;
       }
       public void setIsPayment(Integer isPayment) {
           this.isPayment = isPayment;
       }
   
       public Integer getProviderId() {
           return providerId;
       }
       public void setProviderId(Integer providerId) {
           this.providerId = providerId;
       }
       public Integer getCreatedBy() {
           return createdBy;
       }
       public void setCreatedBy(Integer createdBy) {
           this.createdBy = createdBy;
       }
       public Date getCreationDate() {
           return creationDate;
       }
       public void setCreationDate(Date creationDate) {
           this.creationDate = creationDate;
       }
       public Integer getModifyBy() {
           return modifyBy;
       }
       public void setModifyBy(Integer modifyBy) {
           this.modifyBy = modifyBy;
       }
       public Date getModifyDate() {
           return modifyDate;
       }
       public void setModifyDate(Date modifyDate) {
           this.modifyDate = modifyDate;
       }
   }
   ```

   Provider类

   ```java
   package com.flywinter.entity;
   
   import java.util.Date;
   
   /**
    * Created by IntelliJ IDEA
    * User:Zhang Xingkun
    * Date:2021/7/19 12:32
    * Description:
    */
   public class Provider {
       private Integer id;   //id
       private String proCode; //供应商编码
       private String proName; //供应商名称
       private String proDesc; //供应商描述
       private String proContact; //供应商联系人
       private String proPhone; //供应商电话
       private String proAddress; //供应商地址
       private String proFax; //供应商传真
       private Integer createdBy; //创建者
       private Date creationDate; //创建时间
       private Integer modifyBy; //更新者
       private Date modifyDate;//更新时间
   
       public Integer getId() {
           return id;
       }
       public void setId(Integer id) {
           this.id = id;
       }
       public String getProCode() {
           return proCode;
       }
       public void setProCode(String proCode) {
           this.proCode = proCode;
       }
       public String getProName() {
           return proName;
       }
       public void setProName(String proName) {
           this.proName = proName;
       }
       public String getProDesc() {
           return proDesc;
       }
       public void setProDesc(String proDesc) {
           this.proDesc = proDesc;
       }
       public String getProContact() {
           return proContact;
       }
       public void setProContact(String proContact) {
           this.proContact = proContact;
       }
       public String getProPhone() {
           return proPhone;
       }
       public void setProPhone(String proPhone) {
           this.proPhone = proPhone;
       }
       public String getProAddress() {
           return proAddress;
       }
       public void setProAddress(String proAddress) {
           this.proAddress = proAddress;
       }
       public String getProFax() {
           return proFax;
       }
       public void setProFax(String proFax) {
           this.proFax = proFax;
       }
       public Integer getCreatedBy() {
           return createdBy;
       }
       public void setCreatedBy(Integer createdBy) {
           this.createdBy = createdBy;
       }
       public Date getCreationDate() {
           return creationDate;
       }
       public void setCreationDate(Date creationDate) {
           this.creationDate = creationDate;
       }
       public Integer getModifyBy() {
           return modifyBy;
       }
       public void setModifyBy(Integer modifyBy) {
           this.modifyBy = modifyBy;
       }
       public Date getModifyDate() {
           return modifyDate;
       }
       public void setModifyDate(Date modifyDate) {
           this.modifyDate = modifyDate;
       }
   }
   ```

   Role类

   ```java
   package com.flywinter.entity;
   
   import java.util.Date;
   
   /**
    * Created by IntelliJ IDEA
    * User:Zhang Xingkun
    * Date:2021/7/19 12:30
    * Description:
    */
   public class Role {
       private Integer id;   //id
       private String roleCode; //角色编码
       private String roleName; //角色名称
       private Integer createdBy; //创建者
       private Date creationDate; //创建时间
       private Integer modifyBy; //更新者
       private Date modifyDate;//更新时间
   
       public Integer getId() {
           return id;
       }
       public void setId(Integer id) {
           this.id = id;
       }
       public String getRoleCode() {
           return roleCode;
       }
       public void setRoleCode(String roleCode) {
           this.roleCode = roleCode;
       }
       public String getRoleName() {
           return roleName;
       }
       public void setRoleName(String roleName) {
           this.roleName = roleName;
       }
       public Integer getCreatedBy() {
           return createdBy;
       }
       public void setCreatedBy(Integer createdBy) {
           this.createdBy = createdBy;
       }
       public Date getCreationDate() {
           return creationDate;
       }
       public void setCreationDate(Date creationDate) {
           this.creationDate = creationDate;
       }
       public Integer getModifyBy() {
           return modifyBy;
       }
       public void setModifyBy(Integer modifyBy) {
           this.modifyBy = modifyBy;
       }
       public Date getModifyDate() {
           return modifyDate;
       }
       public void setModifyDate(Date modifyDate) {
           this.modifyDate = modifyDate;
       }
   }
   ```

7. 编写公共基础类

   - 数据库配置文件

     ```properties
     driver = com.mysql.jdbc.Driver
     url = jdbc:mysql://localhost:3306/smbms?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true
     username = root
     password = 123456
     ```

   - 编写数据库公共类

     ```java
     package com.flywinter.dao;
     
     import java.io.IOException;
     import java.io.InputStream;
     import java.sql.*;
     import java.util.Properties;
     
     /**
      * Created by IntelliJ IDEA
      * User:Zhang Xingkun
      * Date:2021/7/19 20:09
      * Description:操作数据库的公共类
      */
     public class BaseDao {
         private static String driver;
         private static String url;
         private static String username;
         private static String password;
         //静态代码块，类加载的时候就初始化了
         static {
             Properties properties = new Properties();
            //通过类加载器读取对应的资源
             InputStream inputStream = BaseDao.class.getClassLoader().getResourceAsStream("db.properties");
             try {
                 properties.load(inputStream);
             }catch (IOException e){
                 e.printStackTrace();
             }
             driver = properties.getProperty("driver");
             url = properties.getProperty("url");
             username = properties.getProperty("username");
             password = properties.getProperty("password");
         }
         //获取数据库的连接
         public static Connection getConnection(){
             Connection connection = null;
             try {
                 Class.forName(driver);
                 connection = DriverManager.getConnection(url,username,password);
             } catch (Exception e) {
                 e.printStackTrace();
             }
             return connection;
         }
         //编写查询公共类
         public static ResultSet execute(Connection connection,String sql,Object[] params,ResultSet resultSet,PreparedStatement preparedStatement) throws SQLException {
             //预编译的sql，在后面直接执行就可以
              preparedStatement = connection.prepareStatement(sql);
             for (int i = 0; i < params.length; i++) {
                 //setObject占位符从1开始，但是我们的数组从0开始
                 preparedStatement.setObject(i+1,params[i]);
             }
              resultSet = preparedStatement.executeQuery();
             return resultSet;
         }
     
         //编写增删改公共方法
         public static int execute(Connection connection,String sql,Object[] params,PreparedStatement preparedStatement) throws SQLException {
             preparedStatement = connection.prepareStatement(sql);
             for (int i = 0; i < params.length; i++) {
                 //setObject占位符从1开始，但是我们的数组从0开始
                 preparedStatement.setObject(i+1,params[i]);
             }
             int updateRows = preparedStatement.executeUpdate();
             return updateRows;
         }
         public static boolean closeResource(Connection connection,ResultSet resultSet,PreparedStatement preparedStatement){
             boolean flag = true;
             if (resultSet != null) {
                 try {
                     resultSet.close();
                     //GC回收
                     resultSet = null;
                 } catch (SQLException throwables) {
                     throwables.printStackTrace();
                     flag = false;
                 }
             }
             if (preparedStatement != null) {
                 try {
                     preparedStatement.close();
                     //GC回收
                     preparedStatement = null;
                 } catch (SQLException throwables) {
                     throwables.printStackTrace();
                     flag = false;
                 }
             }
             if (connection != null) {
                 try {
                     connection.close();
                     //GC回收
                     connection = null;
                 } catch (SQLException throwables) {
                     throwables.printStackTrace();
                     flag = false;
                 }
             }
             return flag;
         }
     }
     ```

8. 编写字符编码过滤器

   ```java
   package com.flywinter.filter;
   
   import javax.servlet.*;
   import java.io.IOException;
   
   /**
    * Created by IntelliJ IDEA
    * User:Zhang Xingkun
    * Date:2021/7/19 20:28
    * Description:
    */
   public class CharacterEncodingFilter implements Filter {
       @Override
       public void init(FilterConfig filterConfig) throws ServletException {
   
       }
   
       @Override
       public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
           servletRequest.setCharacterEncoding("UTF-8");
           servletResponse.setCharacterEncoding("UTF-8");
   //        servletResponse.setContentType("text/html;charset=UTF-8");
           filterChain.doFilter(servletRequest, servletResponse);
       }
   
       @Override
       public void destroy() {
   
       }
   }
   ```

   ```xml
   <!--字符编码过滤器-->
       <filter>
           <filter-name>CharacterEncodingFilter</filter-name>
           <filter-class>com.flywinter.filter.CharacterEncodingFilter</filter-class>
       </filter>
       <filter-mapping>
           <filter-name>CharacterEncodingFilter</filter-name>
           <url-pattern>/*</url-pattern>
       </filter-mapping>
   ```

9. 导入静态资源

### 3.登录功能实现

```mermaid
flowchart LR
id1(用户) -->id2(登陆界面 用户名 密码) --login.do--> id3(判断是否登录成功)
id3 --> id4(成功) --> id6(后台主页) --> id1
id3 --> id5(失败) --提示登录失败--> id2
id3 --> id7(dao)
id7 --> id3
id7 --> id8(数据库)
id8 --> id7
```

1. 编写前端页面

2. 设置首页

   ```xml
   <!--    设置欢迎页面-->
       <welcome-file-list>
           <welcome-file>login.jsp</welcome-file>
       </welcome-file-list>
   ```

3. 编写dao层登录用户登录的接口

   ```java
   public User getLoginUser(Connection connection,String userCode) throws SQLException;
   ```

4. 编写dao层的实现类

   ```java
   public User getLoginUser(Connection connection, String userCode) throws SQLException {
       PreparedStatement pstm = null;
       ResultSet rs = null;
       User user = null;
       if (connection != null) {
           String sql = "select * from smbms_user where userCode=?";
           Object[] params = {userCode};
           rs = BaseDao.execute(connection, pstm, rs, sql, params);
           if (rs.next()) {
               user = new User();
               user.setId(rs.getInt("id"));
               user.setUserCode(rs.getString("userCode"));
               user.setUserName(rs.getString("userName"));
               user.setUserPassword(rs.getString("userPassword"));
               user.setGender(rs.getInt("gender"));
               user.setBirthday(rs.getDate("birthday"));
               user.setPhone(rs.getString("phone"));
               user.setAddress(rs.getString("address"));
               user.setUserRole(rs.getInt("userRole"));
               user.setCreatedBy(rs.getInt("createdBy"));
               user.setCreationDate(rs.getTimestamp("creationDate"));
               user.setModifyBy(rs.getInt("modifyBy"));
               user.setModifyDate(rs.getTimestamp("modifyDate"));
           }
           BaseDao.closeResource(null, pstm, rs);
       }
       return user;
   }
   ```

5. 业务层接口

   ```java
   public interface UserService {
       //用户登录
       public User login(String userCode,String password);
   }
   ```

6. 业务层实现类

   ```java
   public class UserServiceImpl implements UserService{
       //业务层都会调用dao层，所以我们要引入Dao层
       private UserDao userDao;
       public UserServiceImpl(){
           userDao = new UserDaoImpl();
       }
   
       @Override
       public User login(String userCode, String password) {
           Connection connection = null;
           User user = null;
           connection = BaseDao.getConnection();
           //通过业务层调用对应的具体数据库操作
           try {
               user = userDao.getLoginUser(connection,userCode);
           } catch (SQLException throwables) {
               throwables.printStackTrace();
           }finally {
               BaseDao.closeResource(connection,null,null);
           }
           return user;
       }
   
       @Test
       public void test(){
           UserServiceImpl userService = new UserServiceImpl();
           User admin = userService.login("test", "123456");
           System.out.println(admin.getUserPassword());
       }
   }
   ```

7. 编写Servlet

   ```java
   public class LoginServlet extends HttpServlet {
       //Servlet 控制层调用业务层代码
       @Override
       protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
           System.out.println("LoginServlet Start....");
           String userCode = req.getParameter("userCode");
           String userPassword = req.getParameter("userPassword");
           //和数据库密码进行对比，调用业务层
           UserServiceImpl userService = new UserServiceImpl();
           User user = userService.login(userCode, userPassword);
           if (user!=null) {
               //可以登录
               //将用户的信息放到Session中
               req.getSession().setAttribute(Constants.USER_SESSION,user);
               //跳转到主页
               resp.sendRedirect("jsp/frame.jsp");
           }else {
               //查无此人 无法登录
               //转发会登陆页面 顺便提示用户名或密码错误
               req.setAttribute("error","用户名或密码不正确");
               req.getRequestDispatcher("login.jsp").forward(req,resp);
           }
       }
   
       @Override
       protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
           doGet(req, resp);
       }
   }
   ```

8. 注册Servlet

   ```xml
   <servlet>
       <servlet-name>LoginServlet</servlet-name>
       <servlet-class>com.flywinter.sevlet.user.LoginServlet</servlet-class>
   </servlet>
   <servlet-mapping>
       <servlet-name>LoginServlet</servlet-name>
       <url-pattern>/login.do</url-pattern>
   </servlet-mapping>
   ```

9. 测试访问

### 4.登录功能优化

注销功能

思路：移除session，返回登录界面

```java
public class LogoutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //移除用户的session
        req.getSession().removeAttribute(Constants.USER_SESSION);
        resp.sendRedirect(req.getContextPath()+"/login.jsp");//返回登录界面
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
```

```xml
<servlet>
    <servlet-name>LogoutServlet</servlet-name>
    <servlet-class>com.flywinter.sevlet.user.LogoutServlet</servlet-class>
</servlet>
<servlet-mapping>
    <servlet-name>LogoutServlet</servlet-name>
    <url-pattern>/jsp/logout.do</url-pattern>
</servlet-mapping>
```

#### 登录拦截优化

编写一个过滤器，并注册

```jade
public class SysFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        //过滤器，从Session中获取用户
        User user = (User) request.getSession().getAttribute(Constants.USER_SESSION);
        if (user == null) {//已经被移除或者注销了，或者未登录
            response.sendRedirect("/smbms/error.jsp");
        }else {
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }

    @Override
    public void destroy() {

    }
}
```

```xml
<!--    用户登录过滤器-->
    <filter>
        <filter-name>SysFilter</filter-name>
        <filter-class>com.flywinter.filter.SysFilter</filter-class>
    </filter>
    <filter-mapping>
        <filter-name>SysFilter</filter-name>
        <url-pattern>/jsp/*</url-pattern>
    </filter-mapping>
```

测试登录、注销、权限

### 5.密码修改

1. 导入前端素材

   ```xml
   <form id="userForm" name="userForm" method="post" action="${pageContext.request.contextPath }/jsp/user.do">
   ```

2. 实现功能，从底层开始

   ```mermaid
   flowchart LR
   id1(前端JSP) --请求--> id2(Servlet) --调用--> id3(Service)
   id3 --调用--> id4(Dao) --> id5(数据库)
   ```

3. UserDao接口

   ```java
   int updatePwd(Connection connection,int id,String password) throws SQLException;
   ```

4. UserDaoImpl实现类

   ```java
   @Override
   public int updatePwd(Connection connection, int id, String password) throws SQLException {
       PreparedStatement preparedStatement = null;
       int execute = 0;
       if (connection !=null) {
           String sql = "update smbms_user set userPassword = ? where id =?";
           Object[] params = {password,id};
           execute = BaseDao.execute(connection, preparedStatement, sql, params);
           BaseDao.closeResource(null,preparedStatement,null);
       }
       return execute;
   }
   ```

5. UserService

   ```java
   boolean updatePwd(int id,String password);
   ```

6. UserServiceImpl

   ```java
   @Override
   public boolean updatePwd(int id, String password) {
       Connection connection = null;
       boolean flag = false;
       connection = BaseDao.getConnection();
       try {
           if (userDao.updatePwd(connection,id,password) > 0) {
               flag = true;
           }
       } catch (SQLException throwables) {
           throwables.printStackTrace();
       }finally {
           BaseDao.closeResource(connection,null,null);
       }
       return flag;
   }
   ```


### 6. 密码修改优化Ajax

1. 阿里巴巴的fastjson

   ```xml
   <dependency>
       <groupId>com.alibaba</groupId>
       <artifactId>fastjson</artifactId>
       <version>1.2.61</version>
   </dependency>
   ```

2. 后台代码修改

   ```java
   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String method = req.getParameter("method");
       if (method.equals("savepwd")&&method != null) {
           this.updatePwd(req, resp);
       }else if (method.equals("pwdmodify")&&method!=null){
           this.pwdModify(req, resp);
       }
   }
   
   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       doGet(req, resp);
   }
   
   //修改密码
   public void updatePwd(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
       //从Session中拿Id
       boolean flag = false;
       Object attribute =  req.getSession().getAttribute(Constants.USER_SESSION);
       String newpassword = req.getParameter("newpassword");
       if (attribute!=null&& StringUtils.isNullOrEmpty(newpassword)) {
           UserServiceImpl userService = new UserServiceImpl();
           flag = userService.updatePwd(((User) attribute).getId(), newpassword);
           if (flag) {
               req.setAttribute("message","密码修改成功，请退出，使用新密码登录");
               //密码修改成功，移除Session
               req.getSession().removeAttribute(Constants.USER_SESSION);
           }else {
               req.setAttribute("message","密码修改失败");
   
           }
       }else {
           req.setAttribute("message","密码格式出错");
       }
       req.getRequestDispatcher("pwdmodify.jsp").forward(req,resp);
   }
   //验证旧密码，session种有用户的密码
   public void pwdModify(HttpServletRequest req,HttpServletResponse resp){
       //从Session中拿Id
       boolean flag = false;
       Object attribute =  req.getSession().getAttribute(Constants.USER_SESSION);
       String oldpassword = req.getParameter("oldpassword");
   
       Map<String,String> resultMap =new  HashMap<String,String>();
       if (attribute == null) {
           //Session失效了
           resultMap.put("result","sessionerror");
       }else if (StringUtils.isNullOrEmpty(oldpassword)){
           //输入密码为空
           resultMap.put("result","error");
       }else {
           String userPassword = ((User) attribute).getUserPassword();
           if (oldpassword.equals(userPassword)) {
               resultMap.put("result","true");
           }else {
               resultMap.put("result","false");
           }
       }
       try {
           resp.setContentType("application/json");
           PrintWriter writer = resp.getWriter();
           writer.write(JSONArray.toJSONString(resultMap));
           writer.flush();
           writer.close();
       } catch (IOException e) {
           e.printStackTrace();
       }
   }
   ```

### 7.用户管理底层实现

```mermaid
flowchart LR
id(用户) --发起请求--> id1(Servlet\n处理请求\n调用业务\n返回页面)
id1 --返回前端页面-->id
id1 --> id2(用户列表) --> id5(Service) --> id6(Dao)
id1 --> id3(角色列表) --> id7(Service) --> id8(Dao)
id1 --> id4(分页\npageSize固定\n总数数据库查询)--> id9(Service) --> id10(Dao)
id6 --> id11(数据库)
id8 --> id11(数据库)
id10 --> id11(数据库)
```

1. 导入分页的工具类

   ```java
   public class PageSupport {
       //当前页码-来自于用户输入
       private int currentPageNo = 1;
   
       //总数量（表）
       private int totalCount = 0;
   
       //页面容量
       private int pageSize = 0;
   
       //总页数-totalCount/pageSize（+1）
       private int totalPageCount = 1;
   
       public int getCurrentPageNo() {
           return currentPageNo;
       }
   
       public void setCurrentPageNo(int currentPageNo) {
           if (currentPageNo > 0) {
               this.currentPageNo = currentPageNo;
           }
       }
   
       public int getTotalCount() {
           return totalCount;
       }
   
       public void setTotalCount(int totalCount) {
           if (totalCount > 0) {
               this.totalCount = totalCount;
               //设置总页数
               this.setTotalPageCountByRs();
           }
       }
   
       public int getPageSize() {
           return pageSize;
       }
   
       public void setPageSize(int pageSize) {
           if (pageSize > 0) {
               this.pageSize = pageSize;
           }
       }
   
       public int getTotalPageCount() {
           return totalPageCount;
       }
   
       public void setTotalPageCount(int totalPageCount) {
           this.totalPageCount = totalPageCount;
       }
   
       public void setTotalPageCountByRs() {
           if (this.totalCount % this.pageSize == 0) {
               this.totalPageCount = this.totalCount / this.pageSize;
           } else if (this.totalCount % this.pageSize > 0) {
               this.totalPageCount = this.totalCount / this.pageSize + 1;
           } else {
               this.totalPageCount = 0;
           }
       }
   
   }
   ```

2. 用户列表页面导入

#### 1.获取用户数量

1. UserDao

   ```java
   //查询用户总数
   int getUserCount(Connection connection,String username,int userRole) throws SQLException;
   ```

2. UserDaoImpl

   ```java
   //根据用户名或角色查询用户总数
   @Override
   public int getUserCount(Connection connection, String username, int userRole) throws SQLException {
       PreparedStatement preparedStatement = null;
       ResultSet resultSet = null;
       int count = 0;
       if (connection !=null) {
           StringBuffer sql = new StringBuffer();
           sql.append("select count(1) as count from smbms_user u,smbms_role r where u.userRole = r.id");
           ArrayList<Object> list = new ArrayList<>();
   
           if (!StringUtils.isNullOrEmpty(username)) {
               sql.append(" and u.userName like ?");
               list.add("%"+username+"%");
           }
           if (userRole > 0) {
               sql.append(" and u.userName like ?");
               list.add(userRole);
           }
           //怎么把list转化为数组
           Object[] params = list.toArray();
           System.out.println("userDao->getUserCount"+sql.toString());
           resultSet = BaseDao.execute(connection, preparedStatement, resultSet, sql.toString(), params);
           if (resultSet.next()) {
               count = resultSet.getInt("count");
           }
           BaseDao.closeResource(null,preparedStatement,resultSet);
       }
       return count;
   }
   ```

3. UserService

   ```java
   //查询记录数
   int getUserCount(String username,int userRole);
   ```

4. UserServiceImpl

   ```java
   //查询数据记录
   @Override
   public int getUserCount(String username, int userRole) {
       Connection connection = null;
       int count = 0;
       try {
           connection = BaseDao.getConnection();
           userDao.getUserCount(connection,username,userRole);
       } catch (SQLException throwables) {
           throwables.printStackTrace();
       }finally {
           BaseDao.closeResource(connection,null,null);
       }
       return count;
   }
   ```

#### 2.获取用户列表

1. UserDao

   ```java
   List<User> getUserList(Connection connection, String userName, int userRole, int currentPageNo, int pageSize) throws Exception;
   ```

2. UserDaoImpl

   ```java
   @Override
   public List<User> getUserList(Connection connection, String userName, int userRole, int currentPageNo, int pageSize) throws Exception {
       PreparedStatement pstm = null;
       ResultSet rs = null;
       List<User> userList = new ArrayList<User>();
       if (connection != null) {
           StringBuffer sql = new StringBuffer();
           sql.append("select u.*,r.roleName as userRoleName from smbms_user u,smbms_role r where u.userRole = r.id ");
           List<Object> list = new ArrayList<Object>();
           if (!StringUtils.isNullOrEmpty(userName)) {
               sql.append(" and u.userName like ?");
               list.add("%" + userName + "%");
           }
           if (userRole > 0) {
               sql.append(" and u.userRole =?");
               list.add(userRole);
           }
           //在数据库中，分页使用 limit startIndex，pagesize；总数
           //当前页（当前页-1）*页面大小
           //0，  5      1    0       01234
           //5，  5      2    5       26789
           //10， 5      3    10
           sql.append(" order by creationDate DESC limit ?,?");
           currentPageNo = (currentPageNo - 1) * pageSize;
           list.add(currentPageNo);
           list.add(pageSize);
   
           Object[] params = list.toArray();
           //System.out.println("sql---->" + sql.toString());
           rs = BaseDao.execute(connection, pstm, rs, sql.toString(), params);
           while (rs.next()) {
               User _user = new User();
               _user.setId(rs.getInt("id"));
               _user.setUserCode(rs.getString("userCode"));
               _user.setUserName(rs.getString("userName"));
               _user.setGender(rs.getInt("gender"));
               _user.setBirthday(rs.getDate("birthday"));
               _user.setPhone(rs.getString("phone"));
               _user.setUserRole(rs.getInt("userRole"));
               _user.setUserRoleName(rs.getString("userRoleName"));
               userList.add(_user);
           }
           BaseDao.closeResource(null,pstm,rs);
       }
       return userList;
   }
   ```

3. UserService

   ```java
   List<User> getUserList(String queryUserName, int queryUserRole, int currentPageNo, int pageSize);
   ```

4. UserServiceImpl

   ```java
   @Override
   public List<User> getUserList(String queryUserName, int queryUserRole, int currentPageNo, int pageSize){
       Connection connection = null;
       List<User> userList = null;
       System.out.println("queryUserName ---> " + queryUserName);
       System.out.println("queryUserRole ---> " + queryUserRole);
       System.out.println("currentPageNo ---> " + currentPageNo);
       System.out.println("pageSize ---> " + pageSize);
       try {
           connection = BaseDao.getConnection();
           userList = userDao.getUserList(connection,queryUserName,queryUserRole,currentPageNo,pageSize);
       }catch (Exception e){
           e.printStackTrace();
       }finally {
           BaseDao.closeResource(connection,null,null);
       }
       return userList;
   }
   ```

#### 3.获取用户角色列表

为了让职责通用，可以把角色的操作单独放在一个包中，和实体类对应

1. RoleDao

   ```java
   //获取角色列表
   List<Role> getRoleList(Connection connection) throws SQLException;
   ```

2. RoleDaoImpl

   ```java
   //获取角色列表
   @Override
   public List<Role> getRoleList(Connection connection) throws SQLException {
       PreparedStatement preparedStatement = null;
       ResultSet resultSet = null;
       ArrayList<Role> roleList = new ArrayList<>();
       if (connection!=null) {
           String sql = "select * from smbms_role";
           Object[] params = {};
           resultSet = BaseDao.execute(connection, preparedStatement, resultSet, sql, params);
           while (resultSet.next()){
               Role _role = new Role();
               _role.setId(resultSet.getInt("id"));
               _role.setRoleCode(resultSet.getString("roleCode"));
               _role.setRoleName(resultSet.getString("roleName"));
               roleList.add(_role);
           }
           BaseDao.closeResource(null,preparedStatement,resultSet);
       }
       return roleList;
   }
   ```

3. RoleService

   ```java
   List<Role> getRoleList();
   ```

4. RoleServiceImpl

   ```java
   public class RoleServiceImpl implements RoleService{
       //引入Dao
       private RoleDao roleDao;
       public RoleServiceImpl(){
           roleDao = new RoleDaoImpl();
       }
       @Override
       public List<Role> getRoleList(){
           Connection connection = null;
           List<Role> roleList = null;
           try {
               connection = BaseDao.getConnection();
               roleList = roleDao.getRoleList(connection);
           }catch (SQLException e){
               e.printStackTrace();
           }finally {
               BaseDao.closeResource(connection,null,null);
           }
           return roleList;
       }
   }
   ```

#### 4. 用户显示的Servlet

1. 获取用户前端的数据(查询)
2. 判断请求是否需要执行，看参数的值判断
3. 为了实现分页，需要计算出当前页面和总页面，页面大小
4. 用户列表展示
5. 返回前端

```java
public void query(HttpServletRequest request, HttpServletResponse response) {
    //查询用户数据
    //从前端获取数据
    String queryname = request.getParameter("queryname");
    String temp = request.getParameter("queryUserRole");
    String pageIndex = request.getParameter("pageIndex");
    int queryUserRole = 0;
    //获取用户列表
    UserServiceImpl userService = new UserServiceImpl();
    List<User> userList = null;
    //第一次走这个请求，一定是第一页，页面大小固定
    int pageSize = 5;
    int currentPage = 1;
    if (queryname == null) {
        queryname = "";
    }
    if (temp != null && !temp.equals("")) {
        queryUserRole = Integer.parseInt(pageIndex);
    }
    if (pageIndex != null) {
        currentPage = Integer.parseInt(pageIndex);
    }

    int totalCount = userService.getUserCount(queryname, queryUserRole);
    PageSupport pageSupport = new PageSupport();
    pageSupport.setCurrentPageNo(currentPage);
    pageSupport.setPageSize(pageSize);
    pageSupport.setTotalCount(totalCount);

    int totalPageCount = ((int) totalCount / pageSize) + 1;//总共有几页

    if (currentPage < 1) {
        currentPage = 1;
    } else if (currentPage > totalCount) {
        currentPage = totalPageCount;
    }

    //获取用户的总数
    userList = userService.getUserList(queryname, queryUserRole, currentPage, pageSize);
    request.setAttribute("userList", userList);
    RoleServiceImpl roleService = new RoleServiceImpl();
    List<Role> roleList = roleService.getRoleList();
    request.setAttribute("roleList", roleList);
    request.setAttribute("totalCount", totalCount);
    request.setAttribute("currentPageNo", currentPage);
    request.setAttribute("totalPageCount", totalPageCount);
    request.setAttribute("queryUserName", queryname);
    request.setAttribute("queryUserRole", queryUserRole);
    //返回前端
    try {
        request.getRequestDispatcher("userlist.jsp").forward(request, response);
    } catch (ServletException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
```

```java
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String method = req.getParameter("method");
    if (method.equals("savepwd") && method != null) {
        this.updatePwd(req, resp);
    } else if (method.equals("pwdmodify") && method != null) {
        this.pwdModify(req, resp);
    } else if (method.equals("query") && method != null) {
        this.query(req, resp);
    }
}
```

### 8.SMBMS架构分析

```mermaid
flowchart LR
idd(一切增删改都需要处理事务 ACID)
id(用户) --> id2("用户管理页面(查询)")
	id2 --> id2_1(增加用户) --> id2_1_1(前端表单提交) --/jsp/user.do?method=add--> id2_1_1_1(Servlet) --> id2_1_1_1_1("Service(处理事务)") --"userDao.add(connection,user)"--> id2_1_1_1_1_1(Dao) --"BaseDao.execute(connection,pstm,sql,params)"--> id2_1_1_1_1_1_1(JDBC) --> id2_1_1_1_1_1_1_1(数据库)
	id2 --> id2_2(删除用户)
	id2 --> id2_3(修改用户)
id(用户) --> id3("供应商管理页面(查询)")
	id3 --> id3_1(增加供应商)
	id3 --> id3_2(删除供应商)
	id3 --> id3_3(修改供应商)
id(用户) --> id4("订单管理页面(查询)")
	id4 --> id4_1(增加订单)
	id4 --> id4_2(删除订单)
	id4 --> id4_3(修改订单)
```

## 文件传输原理实现

文件上传注意

1. 为保证文件上传安全，上传文件应该放在外界无法直接访问的目录下，比如WEB-INF下
2. 为防止文件覆盖现象发生，为上传文件生成一个唯一的文件名  时间戳 uuid  md5 位运算算法
3. 限制上传文件的最大值
4. 限制上传文件的类型，收到文件时判断后缀名是否合法

```java
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //判断是普通表单还是上传文件
        if (!ServletFileUpload.isMultipartContent(req)) {
            return;//终止方法运行，如果是普通表单
        }
        //创建上传文件的保存路径，最好保存在WEB-INF目录下，用户无法直接访问
        String uploadPath = this.getServletContext().getRealPath("/WEB-INF/upload");
        File uploadFile = new File(uploadPath);
        if (!uploadFile.exists()) {
            uploadFile.mkdir();//创建这个目录
        }
        //缓存 临时文件
//        临时路径，一旦文件超过了预期的大小，就把它放到一个临时文件中，过几天自动删除，或者提醒用户转存为永久
        String tempPath = this.getServletContext().getRealPath("/WEB-INF/temp");
        File tempFile = new File(tempPath);
        if (!tempFile.exists()) {
            tempFile.mkdir();
        }
        //处理上传文件，一般需要处理流使用request.getInputStream()，获取，原生文件获取流十分麻烦
//        使用apache的文件上传组件来实现 common-fileupload 依赖于 commons-io

        //1.创建DiskFileItemFactory对象，处理文件上传路径或大小限制
        DiskFileItemFactory factory = new DiskFileItemFactory();
        //通过工厂设置一个缓存区，当上传的文件大于这个缓存区的时候，将其转存到临时文件中
        factory.setSizeThreshold(1024*1024);//缓存区大小1M
        factory.setRepository(tempFile);//临时文件保存路径，需要一个File
        //2.获取ServletFileUpload
        ServletFileUpload upload = new ServletFileUpload(factory);
        //监听文件上传进度
        upload.setProgressListener(new ProgressListener() {
            @Override
            public void update(long l, long l1, int i) {
//                l 已经读取的文件大小   l1文件大小
                System.out.println("总大小:"+l1+",已经上传的文件大小:"+l);
            }
        });
        //处理乱码问题
        upload.setHeaderEncoding("UTF-8");
        //设置单个文件最大值
        upload.setFileSizeMax(1024*1024*10);
        //设置总共能上传的文件大小
        upload.setSizeMax(1024*1024*100);

        //3.处理上传的文件
        try {
            //把前端请求解析，封装成FileItem对象,需要从ServletFileUpload中获取对象
            List<FileItem> fileItems = upload.parseRequest(req);
            for (FileItem fileItem : fileItems) {
                //判断上传的文件是普通的表单还是文件
                if (fileItem.isFormField()){
                    //getFieldName获取的是前端表单控件的name
                    String name = fileItem.getFieldName();
                    String value = fileItem.getString("UTF-8");//处理乱码
                    System.out.println(name + ":" +value);
                }else {
                    //处理文件
                    String uploadFileName = fileItem.getName();
                    //可能存在文件名不合法的情况
                    if (uploadFileName.trim().equals("") &&uploadFileName == null) {
                        continue;
                    }
                    //获得上传的文件名
                    String fileName = uploadFileName.substring(uploadFileName.lastIndexOf("/") + 1);
                    String fileExtName = uploadFileName.substring(uploadFileName.lastIndexOf(".") + 1);
                    //使用UUID生成唯一文件名
                    //网络中所有传输的数据，都需要序列化，
                    //实体类如果要在多个电脑上运行，需要其将序列化
                    //implements Serializable 标记接口 JVM在本地native方法中找
                    String uuidPath = UUID.randomUUID().toString();
                    //存放地址
                    String realPath = uploadPath + "/"+uuidPath;
                    //给每个文件一个相应的文件夹
                    File realPathFile = new File(realPath);
                    if (!realPathFile.exists()) {
                        realPathFile.mkdir();
                    }
                    //文件传输
                    //获得文件上传的流
                    InputStream inputStream = fileItem.getInputStream();
                    FileOutputStream fileOutputStream = new FileOutputStream(realPath + "/" +fileName);
                    System.out.println(realPath + "/" +fileName);
                    byte[] buffer = new byte[1024];
                    int len = 0;
                    while ((len = inputStream.read(buffer))>0){
                        fileOutputStream.write(buffer,0,len);
                    }
                    //关闭流
                    fileOutputStream.close();
                    inputStream.close();
                    System.out.println("文件上传成功");
                    fileItem.delete();
                    //Servlet请求转发信息
                    req.setAttribute("msg","文件上传成功");
                    req.getRequestDispatcher("info.jsp").forward(req,resp);
                }

            }

        } catch (FileUploadException e) {
            e.printStackTrace();
        }
    }
```

```jsp
<%--通过表单上传文件，
get上传文件大小有限制
post上传文件大小无限制--%>
<%--获取服务器路径--%>
<form action="${pageContext.request.contextPath}/upload.do" method="post" enctype="multipart/form-data">
    <p><input type="file" name="file1"></p>
    <p><input type="file" name="file2"></p>
    <p><input type="submit"> | <input type="reset"></p>
</form>
```

## 邮件发送

协议

发送协议 SMTP协议

接收邮件 POP3协议

SMTP服务器地址，一般是tmtp.xx.com

如网易 smtp.163.com   qq smtp.qq.com

相关jar包

```xml
<!--    邮件收发相关-->
    <dependency>
      <groupId>javax.mail</groupId>
      <artifactId>mail</artifactId>
      <version>1.4.7</version>
    </dependency>
    <dependency>
      <groupId>javax.activation</groupId>
      <artifactId>activation</artifactId>
      <version>1.1.1</version>
    </dependency>
```

```java
public class MainDemo1 {
    //发送一封简单邮件
    public static void main(String[] args) throws GeneralSecurityException, MessagingException {
        Properties properties = new Properties();
        properties.setProperty("mail.host","smtp.qq.com");//设置QQ服务器
        properties.setProperty("mail.transport.protocol","smtp");//邮件发送协议
        properties.setProperty("mail.smtp.auth","true");//需要验证用户名和密码
        //关于QQ邮箱，还需要设置SSL加密
        MailSSLSocketFactory sf = new MailSSLSocketFactory();
        sf.setTrustAllHosts(true);
        properties.put("mail.smtp.ssl.enable","true");
        properties.put("mail.smtp.ssl.socketFactory",sf);
        //使用JavaMail发送邮件的5个步骤
        //1.创建定义整个应用程序所需环境信息的Session对象
        //QQ才有
        Session session = Session.getDefaultInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                //发件人邮件用户名 授权码
                return new PasswordAuthentication("1475795322@qq.com", "erxfsldwxryybagg");
            }
        });
        //开启session的debug模式，这样就可以看到Email的发送状态
        session.setDebug(true);
        //2.通过session得到transport对象
        Transport transport = session.getTransport();
        //3.使用邮箱的用户名和授权码连上邮件服务器
        transport.connect("smtp.qq.com","1475795322@qq.com","erxfsldwxryybagg");
        //4.创建邮件
        //注意需要传递session
        MimeMessage me = new MimeMessage(session);
        //指明邮件的发件人
        me.setFrom(new InternetAddress("1475795322@qq.com"));
        //指明邮件的s收件人，自己给自己发也可以
        me.setRecipient(Message.RecipientType.TO,new InternetAddress("1475795322@qq.com"));
        //邮件的标题
        me.setSubject("hello");
        me.setContent("内容","text/html;charset=UTF-8");
        //5.发送邮件
        transport.sendMessage(me,me.getAllRecipients());
        //6.关闭连接
        transport.close();
    }
}
```

# Mybatis

回顾

- JDBC
- Mysql
- Java基础
- Maven
- Junit

SSM框架 配置文件最好的方式，看官网

[Mybatis官网](https://mybatis.org/mybatis-3/zh/getting-started.html)

## 1. 简介

### 什么是MyBatis？

![image-20210721231342219](allNote.assets/image-20210721231342219.png)

- MyBatis 是一款优秀的**持久层框架**，
- 它支持自定义 SQL、存储过程以及高级映射。
- MyBatis 免除了几乎所有的 JDBC 代码以及设置参数和获取结果集的工作。
- MyBatis 可以通过简单的 XML 或注解来配置和映射原始类型、接口和 Java POJO（Plain Old Java Objects，普通老式 Java 对象）为数据库中的记录。

源于iBatis，apache开源项目，13年迁移到Github

如何获得Mybatis

- maven仓库

  ```xml
  <dependency>
    <groupId>org.mybatis</groupId>
    <artifactId>mybatis</artifactId>
    <version>3.5.7</version>
  </dependency>
  ```

- Github

- 官网

### 持久化

数据持久化

- 持久化就是将程序的数据在持久状态和瞬时状态转化的过程
- 内存 断电即失
- 数据库(jdbc)，io文件持久化

为什么需要持久化

- 有一些数据不能丢掉

- 内存昂贵

### 持久层

Dao层 ，Service层 Controller层

- 完成持久化工作的代码块
- 层是界限十分明显的

### 为什么需要Mybatis

- 方便
- 传统的JDBC代码太复杂 简化 框架 自动化
- 帮助程序员将数据存入到数据库中
- 不用Mybatis也可以。更容易上手，技术没有高低之分
- 优点
  - 简单易学
  - 灵活
  - sql和代码分离，提高可维护性
  - 提供映射标签，支持对象关系组建维护
  - 提供xml标签，支持编写动态sql

## 2. 第一个Mybatis程序

思路：搭建环境-->导入Mybatis-->编写代码 -->测试

### 搭建环境

搭建数据库

```sql
create database `mybatis`;
use `mybatis`;
create table `user`(
	`id` int(20) not null primary key,
    `name` varchar(30) default null,
    `password` varchar(30) default null
)ENGINE=INNODB DEFAULT CHARSET = utf8;
insert into `user`(`id`,`name`,`password`) values
(1,'lisi','123456'),
(2,'ZS','123456'),
(3,'LS','123456');
```

新建项目

- 新建一个普通的maven项目

- 删除src文件夹，建立父工程

- 导入依赖

  ```xml
  <!--    父工程-->
      <dependencies>
  <!--        mybatis-->
          <dependency>
              <groupId>org.mybatis</groupId>
              <artifactId>mybatis</artifactId>
              <version>3.5.7</version>
          </dependency>
  <!--        MySql-->
          <dependency>
              <groupId>mysql</groupId>
              <artifactId>mysql-connector-java</artifactId>
              <version>8.0.24</version>
          </dependency>
  <!--        Junit-->
          <dependency>
              <groupId>junit</groupId>
              <artifactId>junit</artifactId>
              <version>4.13</version>
  <!--            <scope>test</scope>-->
          </dependency>
      </dependencies>
  ```

### 创建一个Module

- 编写mybatis核心配置文件

  ```xml
  <?xml version="1.0" encoding="UTF-8" ?>
  <!DOCTYPE configuration
          PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
          "http://mybatis.org/dtd/mybatis-3-config.dtd">
  <!--configuration核心配置文件-->
  <configuration>
      <environments default="development">
          <environment id="development">
              <transactionManager type="JDBC"/>
              <dataSource type="POOLED">
                  <property name="driver" value="com.mysql.jdbc.Driver"/>
                  <property name="url" value="jdbc:mysql://localhost:3306/mybatis?useSSL=true&amp;useUnicode=true&amp;characterEncoding=UTF-8&amp;serverTimezone=UTC"/>
                  <property name="username" value="root"/>
                  <property name="password" value="123456"/>
              </dataSource>
          </environment>
      </environments>
  </configuration>
  ```

- 编写mybatis工具类

  ```java
  public class MybatisUtil {
      private static SqlSessionFactory sqlSessionFactory;
      static {
          //1.获取sqlSessionFactory对象
          String resource = "mybatis-config.xml";
          InputStream inputStream = null;
          try {
              inputStream = Resources.getResourceAsStream(resource);
          } catch (IOException e) {
              e.printStackTrace();
          }
          sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
      }
  //    既然有了 SqlSessionFactory，顾名思义，我们可以从中获得 SqlSession 的实例。
  //    SqlSession 提供了在数据库执行 SQL 命令所需的所有方法。
  //    你可以通过 SqlSession 实例来直接执行已映射的 SQL 语句。例如：
      public static SqlSession getSqlSession(){
          return sqlSessionFactory.openSession();
      }
  }
  ```

### 编写代码

- 实体类

  ```java
  public class User {
      private int id;
      private String name;
      private String password;
  
      public User() {
      }
  
      public User(int id, String name, String password) {
          this.id = id;
          this.name = name;
          this.password = password;
      }
  
      public int getId() {
          return id;
      }
  
      public void setId(int id) {
          this.id = id;
      }
  
      public String getName() {
          return name;
      }
  
      public void setName(String name) {
          this.name = name;
      }
  
      public String getPassword() {
          return password;
      }
  
      public void setPassword(String password) {
          this.password = password;
      }
  
      @Override
      public String toString() {
          return "User{" +
                  "id=" + id +
                  ", name='" + name + '\'' +
                  ", password='" + password + '\'' +
                  '}';
      }
  }
  ```

- Dao接口

  ```
  public interface UserDao {
      List<User> getUserList();
  }
  ```

- 接口实现类由原来的UserDaoImpl转变为一个Mapper配置文件

  ```xml
  <?xml version="1.0" encoding="GBK" ?>
  <!DOCTYPE configuration
          PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
          "http://mybatis.org/dtd/mybatis-3-config.dtd">
  <!--configuration核心配置文件-->
  <configuration>
      <environments default="development">
          <environment id="development">
              <transactionManager type="JDBC"/>
              <dataSource type="POOLED">
                  <property name="driver" value="com.mysql.cj.jdbc.Driver"/>
                  <property name="url" value="jdbc:mysql://localhost:3306/mybatis?useSSL=true&amp;useUnicode=true&amp;characterEncoding=utf8&amp;serverTimezone=UTC"/>
                  <property name="username" value="root"/>
                  <property name="password" value="123456"/>
              </dataSource>
          </environment>
      </environments>
  <!--    每一个Mapper.xml都需要在Mybatis的核心文件中注册-->
      <mappers>
          <mapper resource="com/flywinter/dao/UserMapper.xml"/>
      </mappers>
  </configuration>
  <!--这里的GBK编码要根据IDEA编码判断是UTF-8还是GBK-->
  ```

### 测试

注意点

org.apache.ibatis.binding.BindingException: Type interface com.flywiner.dao.UserDao is not known to the MapperRegistry.

**MapperRegistry**是什么

 Could not find resource com.flywiner.dao.UserMapper.xml

Maven约定大于配置导致，需要配置下让xml也可以被扫描到

放在父pom或者子pom都可以

```xml
<!--    在build中配置resource，来防止我们资源导出失败的问题-->
<build>
    <resources>
        <resource>
            <directory>src/main/resources</directory>
            <includes>
                <include>**/*.properties</include>
                <include>**/*.xml</include>
            </includes>
            <filtering>true</filtering>
        </resource>
        <resource>
            <directory>src/main/java</directory>
            <includes>
                <include>**/*.properties</include>
                <include>**/*.xml</include>
            </includes>
            <filtering>true</filtering>
        </resource>
    </resources>
</build>
```

Junit测试

```java
    @Test
    public void test(){
        //方式1 推荐
        //获取SqlSession对象
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        try {
            //执行SQL
            UserDao mapper = sqlSession.getMapper(UserDao.class);
            List<User> userList = mapper.getUserList();
            System.out.println(userList);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //关闭SqlSession
            sqlSession.close();
        }


        //方式2  不推荐
//        List<User> list = sqlSession.selectList("com.flywinter.dao.UserDao.getUserList");
//        for (User user : list) {
//            System.out.println(user);
//        }
    }
```

#### SqlSessionFactoryBuilder

这个类可以被实例化、使用和丢弃，一旦创建了 SqlSessionFactory，就不再需要它了。 因此 SqlSessionFactoryBuilder 实例的最佳作用域是方法作用域（也就是局部方法变量）。 你可以重用 SqlSessionFactoryBuilder 来创建多个 SqlSessionFactory 实例，但最好还是不要一直保留着它，以保证所有的 XML 解析资源可以被释放给更重要的事情。

#### SqlSessionFactory



SqlSessionFactory 一旦被创建就应该在应用的运行期间一直存在，没有任何理由丢弃它或重新创建另一个实例。 使用 SqlSessionFactory 的最佳实践是在应用运行期间不要重复创建多次，多次重建 SqlSessionFactory 被视为一种代码“坏习惯”。因此 SqlSessionFactory 的最佳作用域是应用作用域。 有很多方法可以做到，最简单的就是使用单例模式或者静态单例模式。

#### SqlSession

每个线程都应该有它自己的 SqlSession 实例。SqlSession 的实例不是线程安全的，因此是不能被共享的，所以它的最佳的作用域是请求或方法作用域。 绝对不能将 SqlSession 实例的引用放在一个类的静态域，甚至一个类的实例变量也不行。 也绝不能将 SqlSession 实例的引用放在任何类型的托管作用域中，比如 Servlet 框架中的 HttpSession。 如果你现在正在使用一种 Web 框架，考虑将 SqlSession 放在一个和 HTTP 请求相似的作用域中。 换句话说，每次收到 HTTP 请求，就可以打开一个 SqlSession，返回一个响应后，就关闭它。 这个关闭操作很重要，为了确保每次都能执行关闭操作，你应该把这个关闭操作放到 finally 块中。 下面的示例就是一个确保 SqlSession 关闭的标准模式：

## 3. CRUD

### 1.namespace

namespace中的包名要和Dao/Mapper接口的包名要一致

### 2. select

选择 查询语句

- id：就是对应的namespace中的方法名
- resultType sql语句执行的返回值
- parameterType 要传入的参数类型

1. 编写接口

   ```java
   List<User> getUserList();
   ```

2. 编写对应的mapper中的sql语句

   ```xml
   <!--  select查询语句-->
       <select id="getUserList" resultType="com.flywinter.entity.User" >
           select * from mybatis.user
       </select>
   ```

3. 测试

   ```java
     @Test
       public void test(){
           //方式1 推荐
           //获取SqlSession对象
           SqlSession sqlSession = MybatisUtil.getSqlSession();
           try {
               //执行SQL
               UserMapper mapper = sqlSession.getMapper(UserMapper.class);
               List<User> userList = mapper.getUserList();
               System.out.println(userList);
           }catch (Exception e){
               e.printStackTrace();
           }finally {
               //关闭SqlSession
               sqlSession.close();
           }
           //方式2  不推荐
   //        List<User> list = sqlSession.selectList("com.flywinter.dao.UserDao.getUserList");
   //        for (User user : list) {
   //            System.out.println(user);
   //        }
       }
   ```

### 3. insert

```xml
<!--    对象中的属性可以直接取出来-->
    <insert id="addUser" parameterType="com.flywinter.entity.User">
        insert into mybatis.user (id,name,password) values (#{id},#{name},#{password})
    </insert>
```

### 4. update

```xml
<update id="updateUser" parameterType="com.flywinter.entity.User">
    update mybatis.user
    set name = #{name },password = #{password}
    where id = #{id};
</update>
```

### 5. delete

```xml
<delete id="deleteUser" parameterType="int">
    delete
    from mybatis.user
    where id = #{id};
</delete>
```

**注意增删改需要提交事务**

**对应的语句标签要对应，比如select对应select标签**

**mapper注册resource注意是路径，用/分隔**

**Maven资源无法导出，注意在build中设置文件扫描规则**

**xml乱码**

### 6. 万能的map

假设我们的实体类，或者数据库中的表、字段或者参数过多，应该考虑使用Map

```xml
<!--    传递map的key-->
    <insert id="addUser2" parameterType="map">
        insert into mybatis.user (id,name,password) values (#{userId},#{userName},#{password})
    </insert>
```

```java
int addUser2(Map<String,Object> map);
```

```java
 @Test
    public void test6(){
        //方式1 推荐
        //获取SqlSession对象
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        try {
            //执行SQL
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            HashMap<String,Object> map = new HashMap<>();
            map.put("userId",5);
            map.put("userName","hello");
            map.put("password","123");
            int lis = mapper.addUser2(map);
            if (lis > 0) {
                System.out.println(lis+" 插入成功");
            }
//            提交事务
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //关闭SqlSession
            sqlSession.close();
        }
    }
```

Mapper传递参数，直接在Sql中传入key即可 parameterType="map"

对象传递参数，直接在Sql中取对象的属性即可  parameterType="com.flywinter.entity.User"

只有一个基本类型参数的情况下，可以直接在Sql中取出 parameterType="int"

多个参数用Map或注解

模糊查询

1. Java代码执行的时候，传递通配符%%

   ```java
   List<User> userByIdName = mapper.getUserLike("%李%");
   ```

2. 在sql拼接中使用通配符%%

   ```sql
   select *
   from mybatis.user where name like %#{value}%;
   ```

## 4. 配置解析

### 1. 核心配置文件

MyBatis 的配置文件包含了会深深影响 MyBatis 行为的设置和属性信息。 配置文档的顶层结构如下

- mybatis-config.xml
- 所有配置
  - configuration（配置）
    - [properties（属性）](https://mybatis.org/mybatis-3/zh/configuration.html#properties)
    - [settings（设置）](https://mybatis.org/mybatis-3/zh/configuration.html#settings)
    - [typeAliases（类型别名）](https://mybatis.org/mybatis-3/zh/configuration.html#typeAliases)
    - [typeHandlers（类型处理器）](https://mybatis.org/mybatis-3/zh/configuration.html#typeHandlers)
    - [objectFactory（对象工厂）](https://mybatis.org/mybatis-3/zh/configuration.html#objectFactory)
    - [plugins（插件）](https://mybatis.org/mybatis-3/zh/configuration.html#plugins)
    - environments（环境配置）
      - environment（环境变量）
        - transactionManager（事务管理器）
        - dataSource（数据源）
    - [databaseIdProvider（数据库厂商标识）](https://mybatis.org/mybatis-3/zh/configuration.html#databaseIdProvider)
    - [mappers（映射器）](https://mybatis.org/mybatis-3/zh/configuration.html#mappers)
- 重点
  - properties 属性
  - settings 设置
  - environment 环境配置
  - mappers 映射器

### 2. 环境配置(environments)

Mybatis可以配置成适应多种环境

**不过尽管可以配置多个环境，但每个sqlSessionFactory实例只能选择一种环境**

Mybatis默认的事务管理器就是JDBC，连接池POOLED

### 3. 属性(properties)

这些属性可以在外部进行配置，并可以进行动态替换。你既可以在典型的 Java 属性文件中配置这些属性，也可以在 properties 元素的子元素中设置

在xml中所有的标签都可以规定其顺序

编写一个配置文件

db.properties

```properties
driver = com.mysql.cj.jdbc.Driver
url = jdbc:mysql://localhost:3306/mybatis?useSSL=true&useUnicode=true&characterEncoding=utf8&serverTimezone=UTC
username = root
password = 123456
```

在核心文件中引入

```
<!--    引入外部配置文件-->
    <properties resource="db.properties">
<!--        <property name="username" value="dev_user"/>-->
<!--        <property name="password" value="F2Fa3!33TYyg"/>-->
    </properties>
```

- 首先读取在 properties 元素体内指定的属性。
- 然后根据 properties 元素中的 resource 属性读取类路径下属性文件，或根据 url 属性指定的路径读取属性文件，并覆盖之前读取过的同名属性。
- 最后读取作为方法参数传递的属性，并覆盖之前读取过的同名属性。

### 4. 类型别名typeAliases

- 类型别名可为 Java 类型设置一个缩写名字
- 仅用于 XML 配置，意在降低冗余的全限定类名书写

```xml
<typeAliases>
  <typeAlias alias="Author" type="domain.blog.Author"/>
  <typeAlias alias="Blog" type="domain.blog.Blog"/>
  <typeAlias alias="Comment" type="domain.blog.Comment"/>
  <typeAlias alias="Post" type="domain.blog.Post"/>
  <typeAlias alias="Section" type="domain.blog.Section"/>
  <typeAlias alias="Tag" type="domain.blog.Tag"/>
</typeAliases>
```

当这样配置时，`Blog` 可以用在任何使用 `domain.blog.Blog` 的地方。

也可以指定一个包名，MyBatis 会在包名下面搜索需要的 Java Bean，比如：

```xml
<typeAliases>
  <package name="domain.blog"/>
</typeAliases>
```

每一个在包 `domain.blog` 中的 Java Bean，在没有注解的情况下，会使用 Bean 的首字母小写的非限定类名来作为它的别名。 比如 `domain.blog.Author` 的别名为 `author`；若有注解，则别名为其注解值。见下面的例子：

```java
@Alias("author")
public class Author {
    ...
}
```

在实体类比较少的时候，使用第一种，而且第一种可以自定义名

实体类比较多的时候使用第二种，如果要自定义，实体类上加注解

### 5. 设置

这是 MyBatis 中极为重要的调整设置，它们会改变 MyBatis 的运行时行为。 下表描述了设置中各项设置的含义、默认值等。

| 设置名                           | 描述                                                         | 有效值                                                       | 默认值                                                |
| :------------------------------- | :----------------------------------------------------------- | :----------------------------------------------------------- | :---------------------------------------------------- |
| cacheEnabled                     | 全局性地开启或关闭所有映射器配置文件中已配置的任何缓存。     | true \| false                                                | true                                                  |
| lazyLoadingEnabled               | 延迟加载的全局开关。当开启时，所有关联对象都会延迟加载。 特定关联关系中可通过设置 `fetchType` 属性来覆盖该项的开关状态。 | true \| false                                                | false                                                 |
| aggressiveLazyLoading            | 开启时，任一方法的调用都会加载该对象的所有延迟加载属性。 否则，每个延迟加载属性会按需加载（参考 `lazyLoadTriggerMethods`)。 | true \| false                                                | false （在 3.4.1 及之前的版本中默认为 true）          |
| multipleResultSetsEnabled        | 是否允许单个语句返回多结果集（需要数据库驱动支持）。         | true \| false                                                | true                                                  |
| useColumnLabel                   | 使用列标签代替列名。实际表现依赖于数据库驱动，具体可参考数据库驱动的相关文档，或通过对比测试来观察。 | true \| false                                                | true                                                  |
| useGeneratedKeys                 | 允许 JDBC 支持自动生成主键，需要数据库驱动支持。如果设置为 true，将强制使用自动生成主键。尽管一些数据库驱动不支持此特性，但仍可正常工作（如 Derby）。 | true \| false                                                | False                                                 |
| autoMappingBehavior              | 指定 MyBatis 应如何自动映射列到字段或属性。 NONE 表示关闭自动映射；PARTIAL 只会自动映射没有定义嵌套结果映射的字段。 FULL 会自动映射任何复杂的结果集（无论是否嵌套）。 | NONE, PARTIAL, FULL                                          | PARTIAL                                               |
| autoMappingUnknownColumnBehavior | 指定发现自动映射目标未知列（或未知属性类型）的行为。`NONE`: 不做任何反应`WARNING`: 输出警告日志（`'org.apache.ibatis.session.AutoMappingUnknownColumnBehavior'` 的日志等级必须设置为 `WARN`）`FAILING`: 映射失败 (抛出 `SqlSessionException`) | NONE, WARNING, FAILING                                       | NONE                                                  |
| defaultExecutorType              | 配置默认的执行器。SIMPLE 就是普通的执行器；REUSE 执行器会重用预处理语句（PreparedStatement）； BATCH 执行器不仅重用语句还会执行批量更新。 | SIMPLE REUSE BATCH                                           | SIMPLE                                                |
| defaultStatementTimeout          | 设置超时时间，它决定数据库驱动等待数据库响应的秒数。         | 任意正整数                                                   | 未设置 (null)                                         |
| defaultFetchSize                 | 为驱动的结果集获取数量（fetchSize）设置一个建议值。此参数只可以在查询设置中被覆盖。 | 任意正整数                                                   | 未设置 (null)                                         |
| defaultResultSetType             | 指定语句默认的滚动策略。（新增于 3.5.2）                     | FORWARD_ONLY \| SCROLL_SENSITIVE \| SCROLL_INSENSITIVE \| DEFAULT（等同于未设置） | 未设置 (null)                                         |
| safeRowBoundsEnabled             | 是否允许在嵌套语句中使用分页（RowBounds）。如果允许使用则设置为 false。 | true \| false                                                | False                                                 |
| safeResultHandlerEnabled         | 是否允许在嵌套语句中使用结果处理器（ResultHandler）。如果允许使用则设置为 false。 | true \| false                                                | True                                                  |
| mapUnderscoreToCamelCase         | 是否开启驼峰命名自动映射，即从经典数据库列名 A_COLUMN 映射到经典 Java 属性名 aColumn。 | true \| false                                                | False                                                 |
| localCacheScope                  | MyBatis 利用本地缓存机制（Local Cache）防止循环引用和加速重复的嵌套查询。 默认值为 SESSION，会缓存一个会话中执行的所有查询。 若设置值为 STATEMENT，本地缓存将仅用于执行语句，对相同 SqlSession 的不同查询将不会进行缓存。 | SESSION \| STATEMENT                                         | SESSION                                               |
| jdbcTypeForNull                  | 当没有为参数指定特定的 JDBC 类型时，空值的默认 JDBC 类型。 某些数据库驱动需要指定列的 JDBC 类型，多数情况直接用一般类型即可，比如 NULL、VARCHAR 或 OTHER。 | JdbcType 常量，常用值：NULL、VARCHAR 或 OTHER。              | OTHER                                                 |
| lazyLoadTriggerMethods           | 指定对象的哪些方法触发一次延迟加载。                         | 用逗号分隔的方法列表。                                       | equals,clone,hashCode,toString                        |
| defaultScriptingLanguage         | 指定动态 SQL 生成使用的默认脚本语言。                        | 一个类型别名或全限定类名。                                   | org.apache.ibatis.scripting.xmltags.XMLLanguageDriver |
| defaultEnumTypeHandler           | 指定 Enum 使用的默认 `TypeHandler` 。（新增于 3.4.5）        | 一个类型别名或全限定类名。                                   | org.apache.ibatis.type.EnumTypeHandler                |
| callSettersOnNulls               | 指定当结果集中值为 null 的时候是否调用映射对象的 setter（map 对象时为 put）方法，这在依赖于 Map.keySet() 或 null 值进行初始化时比较有用。注意基本类型（int、boolean 等）是不能设置成 null 的。 | true \| false                                                | false                                                 |
| returnInstanceForEmptyRow        | 当返回行的所有列都是空时，MyBatis默认返回 `null`。 当开启这个设置时，MyBatis会返回一个空实例。 请注意，它也适用于嵌套的结果集（如集合或关联）。（新增于 3.4.2） | true \| false                                                | false                                                 |
| logPrefix                        | 指定 MyBatis 增加到日志名称的前缀。                          | 任何字符串                                                   | 未设置                                                |
| logImpl                          | 指定 MyBatis 所用日志的具体实现，未指定时将自动查找。        | SLF4J \| LOG4J \| LOG4J2 \| JDK_LOGGING \| COMMONS_LOGGING \| STDOUT_LOGGING \| NO_LOGGING | 未设置                                                |
| proxyFactory                     | 指定 Mybatis 创建可延迟加载对象所用到的代理工具。            | CGLIB \| JAVASSIST                                           | JAVASSIST （MyBatis 3.3 以上）                        |
| vfsImpl                          | 指定 VFS 的实现                                              | 自定义 VFS 的实现的类全限定名，以逗号分隔。                  | 未设置                                                |
| useActualParamName               | 允许使用方法签名中的名称作为语句参数名称。 为了使用该特性，你的项目必须采用 Java 8 编译，并且加上 `-parameters` 选项。（新增于 3.4.1） | true \| false                                                | true                                                  |
| configurationFactory             | 指定一个提供 `Configuration` 实例的类。 这个被返回的 Configuration 实例用来加载被反序列化对象的延迟加载属性值。 这个类必须包含一个签名为`static Configuration getConfiguration()` 的方法。（新增于 3.2.3） | 一个类型别名或完全限定类名。                                 | 未设置                                                |
| shrinkWhitespacesInSql           | 从SQL中删除多余的空格字符。请注意，这也会影响SQL中的文字字符串。 (新增于 3.5.5) | true \| false                                                | false                                                 |
| defaultSqlProviderType           | Specifies an sql provider class that holds provider method (Since 3.5.6). This class apply to the `type`(or `value`) attribute on sql provider annotation(e.g. `@SelectProvider`), when these attribute was omitted. | A type alias or fully qualified class name                   | Not set                                               |

重点

| logImpl            | 指定 MyBatis 所用日志的具体实现，未指定时将自动查找。        | SLF4J \| LOG4J \| LOG4J2 \| JDK_LOGGING \| COMMONS_LOGGING \| STDOUT_LOGGING \| NO_LOGGING | 未设置 |
| ------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------ |
| lazyLoadingEnabled | 延迟加载的全局开关。当开启时，所有关联对象都会延迟加载。 特定关联关系中可通过设置 `fetchType` 属性来覆盖该项的开关状态。 | true \| false                                                | false  |
| cacheEnabled       | 全局性地开启或关闭所有映射器配置文件中已配置的任何缓存。     | true \| false                                                | true   |

### 6.其他配置

- [typeHandlers（类型处理器）](https://mybatis.org/mybatis-3/zh/configuration.html#typeHandlers)
- [objectFactory（对象工厂）](https://mybatis.org/mybatis-3/zh/configuration.html#objectFactory)
- plugins插件
  - mybatis-generator-core
  - mybatis-plus
  - 通用mapper

### 7. 映射器

既然 MyBatis 的行为已经由上述元素配置完了，我们现在就要来定义 SQL 映射语句了。 但首先，我们需要告诉 MyBatis 到哪里去找到这些语句。 在自动查找资源方面，Java 并没有提供一个很好的解决方案，所以最好的办法是直接告诉 MyBatis 到哪里去找映射文件。 你可以使用相对于类路径的资源引用，或完全限定资源定位符（包括 `file:///` 形式的 URL），或类名和包名等。例如：

```xml
<!-- 使用相对于类路径的资源引用 -->
<mappers>
  <mapper resource="org/mybatis/builder/AuthorMapper.xml"/>
  <mapper resource="org/mybatis/builder/BlogMapper.xml"/>
  <mapper resource="org/mybatis/builder/PostMapper.xml"/>
</mappers>
<!-- 使用完全限定资源定位符（URL） 基本不用-->
<mappers>
  <mapper url="file:///var/mappers/AuthorMapper.xml"/>
  <mapper url="file:///var/mappers/BlogMapper.xml"/>
  <mapper url="file:///var/mappers/PostMapper.xml"/>
</mappers>
<!-- 使用映射器接口实现类的完全限定类名 -->
<mappers>
  <mapper class="org.mybatis.builder.AuthorMapper"/>
  <mapper class="org.mybatis.builder.BlogMapper"/>
  <mapper class="org.mybatis.builder.PostMapper"/>
</mappers>
<!-- 将包内的映射器接口实现全部注册为映射器 -->
<mappers>
  <package name="org.mybatis.builder"/>
</mappers>
```

注意，使用class注册时:

- 接口和他的Mapper配置文件必须同名
- 接口和他的Mapper配置文件必须在一个包下

使用扫描包和上面注意的一样

### 8.生命周期和作用域

```mermaid
flowchart TB
	id1(开始) --> id2(SqlSessionFactoryBuilder) --> id3(SqlSessionFactory) --> id4(SqlSession) --> id5(SQL Mapper) -->id6(结束)
	id7(mybatis-config.xml配置文件) --> id2
	id4 --> id6
```

生命周期和作用域是至关重要的，因为错误的使用会导致非常严重的并发问题

SqlSessionFactoryBuilder

- 一旦创建了SqlSessionFactory，就不再需要他了
- 局部变量

SqlSessionFactory

- 简单理解为数据库连接池
- SqlSessionFactory 一旦被创建就应该在应用的运行期间一直存在，没有任何理由丢弃它或重新创建另一个实例
- 因此 SqlSessionFactory 的最佳作用域是应用作用域
- 最简单的就是使用单例模式或者静态单例模式。

SqlSession

- 连接到连接池的一个请求
- SqlSession 的实例不是线程安全的，因此是不能被共享的，所以它的最佳的作用域是请求或方法作用域
- 用完之后需要及时关闭，否则资源被占用

```mermaid
flowchart LR
	id1(SqlSessionFactory) --> id2(SqlSession)
	id1 --> id3(SqlSession)
	id1 --> id4(SqlSession)
	id3 --> id5(Mapper)
	id3 --> id6(Mapper)
```

这里面的每一个mapper就代表一个具体的业务

## 5. 解决属性名和字段名不一致的问题

数据库中的字段和类定义的属性不一致

1. 起别名

2. resultMap

   结果集映射

   ```xml
   <resultMap id="UserMap" type="com.flywinter.entity.User">
       <result column="password" property="pwd"/>
       <result column="id" property="id"/>
   </resultMap>
   <select id="getUserList" resultMap="UserMap" >
       select * from mybatis.user
   </select>
   ```

`resultMap` 元素是 MyBatis 中最重要最强大的元素

## 6. 日志

### 日志工厂

如果一个数据库操作，出现了异常，我们需要排错，可以用日志查看错误

曾经 debug  sout

现在 日志工厂

- SLF4J
- LOG4J(掌握)
- LOG4J2
- JDK_LOGGING
- COMMONS_LOGGING 
- STDOUT_LOGGING (掌握)
- NO_LOGGING

在Mybatis中具体使用哪一个配置文件，在设置中设定

STDOUT_LOGGING 标准日志输出

![image-20210722143016408](allNote.assets/image-20210722143016408.png)

### LOG4J

什么是Log4J

- Log4j是[Apache](https://baike.baidu.com/item/Apache/8512995)的一个开源项目，通过使用Log4j，我们可以控制日志信息输送的目的地是[控制台](https://baike.baidu.com/item/控制台/2438626)、文件、[GUI](https://baike.baidu.com/item/GUI)组件
- 我们也可以控制每一条日志的输出格式；
- 通过定义每一条日志信息的级别，我们能够更加细致地控制日志的生成过程
- 通过一个配置文件进行灵活的配置，而不需要修改应用的代码

1.先导入Log4J的包

```xml
<!--        导入log4j包-->
        <dependency>
            <groupId>log4j</groupId>
            <artifactId>log4j</artifactId>
            <version>1.2.12</version>
        </dependency>
```

2. log4j.properties

```properties
#将等级为DEBUG的日志信息输出到console和file这两个目的地，console和file的定义在下面的代码
log4j.rootLogger=DEBUG,console,file

#控制台输出的相关设置
log4j.appender.console = org.apache.log4j.ConsoleAppender
log4j.appender.console.Target = System.out
log4j.appender.console.Threshold=DEBUG
log4j.appender.console.layout = org.apache.log4j.PatternLayout
log4j.appender.console.layout.ConversionPattern=【%c】-%m%n

#文件输出的相关设置
log4j.appender.file = org.apache.log4j.RollingFileAppender
log4j.appender.file.File=./log/kuang.log
log4j.appender.file.MaxFileSize=10mb
log4j.appender.file.Threshold=DEBUG
log4j.appender.file.layout=org.apache.log4j.PatternLayout
log4j.appender.file.layout.ConversionPattern=【%p】【%d{yy-MM-dd}】【%c】%m%n

#日志输出级别
log4j.logger.org.mybatis=DEBUG
log4j.logger.java.sql=DEBUG
log4j.logger.java.sql.Statement=DEBUG
log4j.logger.java.sql.ResultSet=DEBUG
log4j.logger.java.sql.PreparedStatement=DEBUG
```

3. 配置log4j为日志的实现

```xml
<setting name="logImpl" value="LOG4J"/>
```

4. Log4j的的使用

5. 简单使用

   - 在使用Log4j的类中，导入包import org.apache.log4j.Logger;

   - 日志对象，参数为当前类的class

     ```java
     final Logger logger = Logger.getLogger(UserMapperTest.class);
     ```

   - 日志级别

## 7. 分页

为什么要分页

- 减少数据的处理

### 使用limit分页

```sql
select * from mybatis.user limit startPage,pageSize;
select * from mybatis.user limit 1,2;
```

使用Mybatis实现分页

1. 接口

   ```java
   List<User> getUserByLimit(Map<String,Integer> map);
   ```

2. Mapper.xml

   ```xml
   <!--    分页实现查询-->
       <select id="getUserByLimit" parameterType="map" resultType="com.flywinter.entity.User">
           select *
           from mybatis.user limit #{startIndex},#{pageSize}
       </select>
   ```

3. 测试

   ```java
   @Test
   public void test3(){
       //方式1 推荐
       //获取SqlSession对象
       SqlSession sqlSession = MybatisUtil.getSqlSession();
       try {
           //执行SQL
           UserMapper mapper = sqlSession.getMapper(UserMapper.class);
           Map<String,Integer> map = new HashMap<>();
           map.put("startIndex",1);
           map.put("pageSize",2);
           List<User> userList = mapper.getUserByLimit(map);
           System.out.println(userList);
       }catch (Exception e){
           e.printStackTrace();
       }finally {
           //关闭SqlSession
           sqlSession.close();
       }
   }
   ```

### 使用RowBounds实现分页

不适用SQL实现分页

1. 接口

   ```java
   List<User> getUserByRowBounds();
   ```

2. Mapper.xml

   ```xml
   <!--    分页实现查询-->
   <select id="getUserByRowBounds"  resultType="com.flywinter.entity.User">
       select * from mybatis.user
   </select>
   ```

3. 测试

   ```java
   @Test
   public void test4() {
       //获取SqlSession对象
       SqlSession sqlSession = MybatisUtil.getSqlSession();
       //RowBounds实现
       RowBounds rowBounds = new RowBounds(1, 2);
       //通过Java代码层面实现分页
       List<User> userList = sqlSession.selectList("com.flywinter.dao.UserMapper.getUserByRowBounds",null,rowBounds);
       for (User user : userList) {
           System.out.println(user);
       }
       //关闭SqlSession
       sqlSession.close();
   }
   ```

### Mybatis分页插件

[PageHelper](https://pagehelper.github.io/)

## 8. 使用注解开发

### 面向接口编程

关于接口的理解

- 定义与实现的分离
- 对个体的抽象
- 对一个方面的抽象

### 使用注解开发

1. 注解在接口上实现

   ```java
   @Select("select * from mybatis.user")
   List<User> getUserList();
   ```

2. 在核心配置中绑定接口

   ```xml
   <!--    绑定接口-->
       <mappers>
           <mapper class="com.flywinter.dao.UserMapper"/>
       </mappers>
   ```

3. 测试

   ```java
   @Test
   public void test(){
       SqlSession sqlSession = MybatisUtil.getSqlSession();
       //底层主要使用反射
       UserMapper mapper = sqlSession.getMapper(UserMapper.class);
       List<User> userList = mapper.getUserList();
       System.out.println(userList);
       sqlSession.close();
   }
   ```

本质是反射机制实现

底层 动态代理

### Mybatis详细执行流程

```mermaid
flowchart TB
	id1(Resources加载全局配置文件) --> id2(实例化SqlSessionFactoryBuilder构造器) --> id3(解析配置文件流XMLConfigBuilder) --> id4(Configuration所有的配置信息) --> id5(SqlSessionFactory实例化) --> id6(transactional事务管理)--> id7(创建executor执行器) --> id8(创建SqlSession) --> id9(实现CRUD)
	id9 --> id6
	id9 --> id10(查看是否成功)
	id10 --> id6
	id10 --> id11(提交事务) --> id12(成功)
```

### CRUD

```java
@Select("select * from user where id = #{id}")
User getUserById(@Param("id") int id);
@Insert()
@Update()
@Delete()
```

关于@Param()注解

- 基本类型的参数或者String类型，需要加上
- 引用类型不需要加
- 如果只有一个基本类型，推荐加上，可以忽略
- 在Mysql中引用的就是@Param里面的参数

#{} ${}区别

在这里用到了#{},使用#时：

1、用来传入参数，sql在解析的时候会加上" ",当成字符串来解析 ，如这里 role_id = "roleid";

2、#{}能够很大程度上防止sql注入;

延伸：

1、用${}传入数据直接显示在生成的sql中，如上面的语句，用role_id = ${roleId,jdbcType=INTEGER},那么sql在解析的时候值为role_id = roleid，执行时会报错;

2、${}方式无法防止sql注入;

3、$一般用入传入数据库对象，比如数据库表名;

4、能用#{}时尽量用#{};



## 9. Lombok使用

[Lombok](https://projectlombok.org/)

> Project Lombok is a java library that automatically plugs into your editor and build tools, spicing up your java.
> Never write another getter or equals method again, with one annotation your class has a fully featured builder, Automate your logging variables, and much more.

- java library
- plugins
- build tools
- with one annotation your class

使用步骤

- IDEA安装Lombok插件

- 项目中导入Lombok的jar包

  ```xml
  <dependency>
      <groupId>org.projectlombok</groupId>
      <artifactId>lombok</artifactId>
      <version>1.18.10</version>
  </dependency>
  ```

- 常用注解

  ```java
  @Getter and @Setter
  @FieldNameConstants
  @ToString
  @EqualsAndHashCode
  @AllArgsConstructor, @RequiredArgsConstructor and @NoArgsConstructor
  @Log, @Log4j, @Log4j2, @Slf4j, @XSlf4j, @CommonsLog, @JBossLog, @Flogger, @CustomLog
  @Data
  @Builder
  @SuperBuilder
  @Singular
  @Delegate
  @Value
  @Accessors
  @Wither
  @With
  @SneakyThrows
  @val
  @var
  experimental @var
  @UtilityClass
  Lombok config system
  Code inspections
  Refactoring actions (lombok and delombok)
  ```

## 10. 多对一处理

多对一，一对多，相对而言

- 多个学生，对应一个老师
- 对于学生而言，关联多个学生，关联一个老师 多对一
- 对于老师而言 ，集合，一个老师有很多学生，一对多

数据库表结构

```sql
use mybatis;
create table `teacher`(
                          `id` int(10) not null ,
                          `name` varchar(30) default null,
                          primary key (`id`)
)engine = innodb default charset = utf8;
insert into teacher(`id`,`name`) values (1,'李老师');

create table `student`(
                          `id` int(10) not null ,
                          `name` varchar(30) default null,
                          `tid` int(10) default null,
                          primary key (`id`),
                          key `fktid` (`tid`),
                          constraint `ftkid` foreign key (`tid`) references  `teacher` (`id`)
)engine = innodb default charset = utf8;
insert into student (id, name, tid) values (1,'小明',1);
insert into student (id, name, tid) values (2,'小明',1);
insert into student (id, name, tid) values (3,'小明',1);
insert into student (id, name, tid) values (4,'小明',1);
insert into student (id, name, tid) values (5,'小明',1);
```

### 测试环境搭建

1. 导入lombok

2. 新建实体类Teacher，Student

   ```java
   @Data
   public class Student {
       private int id;
       private String name;
       //学生需要关联一个老师
       private Teacher teacher;
   }
   ```

   ```java
   @Data
   public class Teacher {
       private int id;
       private String name;
   }
   ```

3. 建立Mapper接口

   ```java
   public interface StudentMapper {
       //查询所有的学生信息，以及对应的老师信息
       List<Student> getStudent();
       List<Student> getStudent2();
   }
   ```

   ```java
   public interface TeacherMapper {
       @Select("select * from teacher where id = #{tid}")
       Teacher getTeacher(@Param("tid") int id);
   }
   ```

4. 建立Mapper.xml文件

5. 在核心配置文件中绑定注册我们Mapper接口或文件

6. 测试查询能否成功

### 按照查询嵌套处理

```xml
<!--    思路 1.查询所有的学生信息
2.根据查询出来的学生的tid寻找对应的老师-->
    <select id="getStudent" resultMap="StudentTeacher">
        select * from student;
    </select>
    <resultMap id="StudentTeacher" type="Student">
        <result property="id" column="id"/>
        <result property="name" column="name"/>
<!--        复杂的属性，我们需要单独处理
            对象 association
            集合 collection-->
        <association property="teacher" column="tid" javaType="Teacher" select="getTeacher"/>
    </resultMap>
    <select id="getTeacher" resultType="Teacher">
        select *
        from teacher where id = #{id}
    </select>
```

### 按照结果嵌套处理

```xml
<!--按照结果嵌套处理-->
    <select id="getStudent2" resultMap="StudentTeacher2">
        select s.id sid,s.name sname,t.name tname
        from student s,teacher t where s.tid = t.id;
    </select>
    <resultMap id="StudentTeacher2" type="Student">
        <result property="id" column="sid"/>
        <result property="name" column="sname"/>
        <association property="teacher" javaType="Teacher">
            <result property="name" column="tname"/>
        </association>
    </resultMap>
```

回顾Mysql多对一查询方式

- 子查询
- 联表查询

## 11. 一对多查询

比如一个老师拥有多个学生

对于老师而言，就是一对多的关系

环境搭建，和刚才一样

1. 实体类

   ```java
   @Data
   public class Teacher {
       private int id;
       private String name;
       private List<Student> students;
   }
   ```

   ```java
   @Data
   public class Student {
       private int id;
       private String name;
       //学生需要关联一个老师
       private Teacher teacher;
   }
   ```

2. 接口

   ```java
   //获取老师及其老师对应的学生
   Teacher getTeacherWthStudent(@Param("tid") int id);
   Teacher getTeacherWthStudent2(@Param("tid") int id);
   ```

按照结果查询处理

```xml
<!--    按照结果嵌套-->
<select id="getTeacherWthStudent" resultMap="TeacherStudent">
    select s.id sid, s.name sname, t.name tname, t.id, tid
    from `student` s,
         teacher t
    where s.tid = t.id
      and t.id = #{tid}
</select>
<resultMap id="TeacherStudent" type="Teacher">
    <result property="id" column="tid"/>
    <result property="name" column="tname"/>
    <!--        复杂的查询，需要单独处理对象，association 集合collection
    javaType 是一个指定的属性的类型 集合中的泛型信息，用ofType获取-->
    <collection property="students" ofType="Student">
        <result property="id" column="sid"/>
        <result property="name" column="sname"/>
        <result property="tid" column="tid"/>
    </collection>
</resultMap>
```

按照查询嵌套处理

```xml
<!--    子查询-->
    <select id="getTeacherWthStudent2" resultMap="TeacherStudent2">
        select *
        from teacher where id = #{tid};
    </select>
    <resultMap id="TeacherStudent2" type="Teacher">
        <collection property="students" javaType="ArrayList" ofType="Student" select="getStudentByTeacherId"  column="id"/>
    </resultMap>
    <select id="getStudentByTeacherId" resultType="Student">
        select *
        from student where tid = #{tid};
    </select>
```

### 小结

1. 关联 association 多对一
2. 集合 collection 一对多
3. javaType & ofType
   1. javaType 用来指定实体类中属性的类型
   2. ofType用来指定映射到List或者集合中的实体类类型，泛型中的约束类型

注意

- 保证SQL的可读性，尽量通俗易懂
- 注意一对多和多对一 属性名和字段的问题
- 如果问题不好排查错误，可以使用日志，建议使用Log4j

慢SQL 查询过慢

面试

- MySql引擎
- InnoDB的底层原理
- 索引
- 索引优化

## 12. 动态SQL查询

>  什么是动态Sql，动态Sql就是指根据不同的条件生成不同的Sql语句

​	如果你之前用过 JSTL 或任何基于类 XML 语言的文本处理器，你对动态 SQL 元素可能会感觉似曾相识。在 MyBatis 之前的版本中，需要花时间了解大量的元素。借助功能强大的基于 OGNL 的表达式，MyBatis 3 替换了之前的大部分元素，大大精简了元素种类，现在要学习的元素种类比原来的一半还要少。

- if
- choose (when, otherwise)
- trim (where, set)
- foreach

### 搭建环境

```sql
use mybatis;
create table blog(
    id varchar(50) not null comment '博客Id',
    title varchar(100) not null comment '博客标题',
    author varchar(30) not null comment '博客作者',
    create_time datetime not null comment '创建时间',
    views int(30) not null comment '浏览量'
)engine = InnoDB default charset = utf8;
```

创建一个基础工程

- 导包

- 编写配置文件

- 编写实体类

  ```java
  @Data
  public class Blog {
      private String id;
      private String title;
      private String author;
      private Date createTime;
      private int views;
  }
  ```

- 编写实体类对应接口和Mapper.xml文件

- 

### IF

```xml
    <select id="queryBlogIF" parameterType="map" resultType="Blog">
        select *
        from mybatis.blog
        <where>
            <if test="title != null">
                and title = #{title}
            </if>
            <if test="author != null">
                and author = #{author}
            </if>
        </where>
    </select>
```

### Choose (when otherwise)

这里注意，因为用了where标签，所以检测到and后，如果冲突，会自动把and去掉



```xml
<select id="queryBlogChoose" parameterType="map" resultType="Blog">
    select *
    from blog
    <where>
        <choose>
            <when test="title != null">
                title = #{title}
            </when>
            <when test="author != null">
                and author = #{author}
            </when>
            <otherwise>
                and views = #{views}
            </otherwise>
        </choose>
    </where>
</select>
```

### trim (where set)

```xml
<update id="updateBlog" parameterType="map">
    update blog
    <set>
        <if test="title != null">
            title = #{title},
        </if>
        <if test="author != null">
            author = #{author}
        </if>
    </set>
    where id = #{id}
</update>
```

所谓的动态SQL，本质上还是SQL，只是我们可以在SQL层面，去执行一个逻辑代码

if

where set choose when

### SQL片段

有的时候，我们可能会将一些公共的部分抽取出来，方便复用

1. 使用SQL标签抽取公共的部分

   ```xml
   <sql id="if-title-author">
       <if test="title != null">
           title = #{title},
       </if>
       <if test="author != null">
           author = #{author}
       </if>
   </sql>
   ```

2. 在需要的地方nclude标签引用即可

   ```xml
   <update id="updateBlog" parameterType="map">
       update blog
       <set>
          <include refid="if-title-author"/>
       </set>
       where id = #{id}
   </update>
   ```

注意事项

- 最好基于单表来定义SQL片段 就是不要太复杂
- 不要存在where标签

### Foreach

动态 SQL 的另一个常见使用场景是对集合进行遍历

*foreach* 元素的功能非常强大，它允许你指定一个集合，声明可以在元素体内使用的集合项（item）和索引（index）变量。它也允许你指定开头与结尾的字符串以及集合项迭代之间的分隔符。这个元素也不会错误地添加多余的分隔符

```xml
<select id="selectPostIn" resultType="domain.blog.Post">
  SELECT *
  FROM POST P
  WHERE ID in
  <foreach item="item" index="index" collection="list"
      open="(" separator="," close=")">
        #{item}
  </foreach>
</select>
```



## 13. 缓存

#### 简介

> 查询 连接数据库 耗费资源
>
>  一次查询的数据，暂时存到一个可以直接取到的地方 ->内存 :缓存
>
> 再次查询相同数据的适合，直接走缓存，就不走数据库了

主从复制

1. 什么是缓存？
   - 存在内存中的临时数据
   - 将用户经常查询的数据放在缓存(内存)中，用户去查询数据就不用从磁盘上(关系型数据库文件)直接查询，从缓存中查询，从而提高查询效率，解决高并发系统的性能问题
2. 为什么使用缓存
   - 减少和数据库的交互次数，减少系统开销，提高系统效率
3. 什么样的数据能使用缓存
   - 经常查询并且不经常改变的数据

#### Mybatis缓存

- Mybatis包含一个非常强大的查询缓存特性，它可以非常方便地定制和配置缓存，缓存可以极大的提升查询效率
- Mybatis系统中默认定义了两级缓存，一级缓存和二级缓存
  - 默认情况下，只有一级缓存开启(SqlSession级别的缓存，也称为本地缓存)
  - 二级缓存需要手动开启和配置，它是基于namespace级别的缓存
  - 为了提高扩展性，Mybatis定义了缓存接口Cache，我们可以通过实现Cache接口来自定义二级缓存

#### 一级缓存

- 一级缓存也叫本地缓存：
  - 与数据库同一次会话期间查询到的数据会放在本地缓存中
  - 以后如果需要获取相同的数据，直接从缓存中拿，没必要再去查数据库

测试步骤：

1. 开启日志
2. 测试在一个sqlSession中查询两次相同记录
3. 查看日志输出

![image-20210724192428451](allNote.assets/image-20210724192428451.png)

缓存失效的情况

- 查询不同的东西
- 增删改操作，可能改变表中的数据，必然会刷新缓存
- 查询不同的Mapper.xml
- 手动清除

一级缓存默认开启，只在一次sqlSession中有效，也就是在拿到连接和关闭连接之间

相当于Map

#### 二级缓存

- 二级缓存也叫全局缓存，一级缓存作用域太低了，所以诞生了二级缓存
- 基于namespace级别的缓存，一个名称空间对应一个二级缓存
- 工作机制
  - 一个会话查询一条数据，这个数据就会被放在当前会话的一级缓存中
  - 如果当前会话关闭了，这个会话对应的一级缓存就没有了，但是我们希望会话关闭了，一级缓存被保存到二级缓存中
  - 新的会话查询信息，从二级缓存中获取内容
  - 不同的mapper查出的数据会放在自己对应的缓存map中

步骤：

1. 开启全局缓存

   ```xml
   <!--        显示开启全局缓存 默认其实就是true-->
           <setting name="cacheEnabled" value="true"/>
   ```

2. 在Mapper.xml中使用二级缓存

   ```xml
   <!--    使用二级缓存-->
       <cache
               eviction="FIFO"
               flushInterval="60000"
               size="512"
               readOnly="true"/>
   ```

3. 测试

   1. 问题 如果readOnly不为true，需要将实体类序列化 否则会报错，因为这时候可以写入了，必须序列化

小结：

- 只要开启了二级缓存，同一个Mapper下就有效
- 所有的数据都会先放在一级缓存中
- 只有当会话提交，或者关闭的时候，才会提交到二级缓存中

#### 缓存原理

```mermaid
flowchart TB
	subgraph Mapper
		subgraph Mapper1
			id2_1(二级缓存)
		end
		subgraph Mapper2
			id2_2(二级缓存)
		end
	end
	subgraph SqlSession
			subgraph SqlSession1
			id1(一级缓存)
		end
		subgraph SqlSession2
			id2(一级缓存)
		end
		subgraph SqlSession3
			id3(一级缓存)
		end
		subgraph SqlSession4
			id4(一级缓存)
		end
	end

	SqlSession1 --关闭--> Mapper1
	SqlSession2 --关闭--> Mapper1
	SqlSession3 --关闭--> Mapper2
	SqlSession4 --关闭--> Mapper2
	id1 --> id2_1
	id2 --> id2_1
	id3 --> id2_2
	id4 --> id2_2
	SqlSession1 --> id
	SqlSession2 --> id
	SqlSession3 --> id
	SqlSession4 --> id
	查询开始 --> Mapper

	id(数据库) --> id1
	id_1(缓存顺序\n先看二级缓存有没有\n再看二级缓存有没有\n查询数据库)
```

#### 自定义缓存 ehcache

> Ehcache是一种广泛使用的Java分布式缓存，主要面向通用缓存

要在程序中使用，首先导包

```xml
<dependency>
    <groupId>org.mybatis.caches</groupId>
    <artifactId>mybatis-ehcache</artifactId>
    <version>1.2.1</version>
</dependency>
```

然后在Mapper中配置

```xml
<!--    使用自定义缓存-->
    <cache type="org.mybatis.caches.ehcache.EhcacheCache"/>
```

resource下新建ehcache.xml方法

```xml
<?xml version="1.0" encoding="UTF-8"?>
<ehcache xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:noNamespaceSchemaLocation="http://ehcache.org/ehcache.xsd"
         updateCheck="false">
    <!--
       diskStore：为缓存路径，ehcache分为内存和磁盘两级，此属性定义磁盘的缓存位置。参数解释如下：
       user.home – 用户主目录
       user.dir  – 用户当前工作目录
       java.io.tmpdir – 默认临时文件路径
     -->
    <diskStore path="./tmpdir/Tmp_EhCache"/>
    <defaultCache
            eternal="false"
            maxElementsInMemory="10000"
            overflowToDisk="false"
            diskPersistent="false"
            timeToIdleSeconds="1800"
            timeToLiveSeconds="259200"
            memoryStoreEvictionPolicy="LRU"/>

    <cache
            name="cloud_user"
            eternal="false"
            maxElementsInMemory="5000"
            overflowToDisk="false"
            diskPersistent="false"
            timeToIdleSeconds="1800"
            timeToLiveSeconds="1800"
            memoryStoreEvictionPolicy="LRU"/>
    <!--
       defaultCache：默认缓存策略，当ehcache找不到定义的缓存时，则使用这个缓存策略。只能定义一个。
     -->
    <!--
      name:缓存名称。
      maxElementsInMemory:缓存最大数目
      maxElementsOnDisk：硬盘最大缓存个数。
      eternal:对象是否永久有效，一但设置了，timeout将不起作用。
      overflowToDisk:是否保存到磁盘，当系统当机时
      timeToIdleSeconds:设置对象在失效前的允许闲置时间（单位：秒）。仅当eternal=false对象不是永久有效时使用，可选属性，默认值是0，也就是可闲置时间无穷大。
      timeToLiveSeconds:设置对象在失效前允许存活时间（单位：秒）。最大时间介于创建时间和失效时间之间。仅当eternal=false对象不是永久有效时使用，默认是0.，也就是对象存活时间无穷大。
      diskPersistent：是否缓存虚拟机重启期数据 Whether the disk store persists between restarts of the Virtual Machine. The default value is false.
      diskSpoolBufferSizeMB：这个参数设置DiskStore（磁盘缓存）的缓存区大小。默认是30MB。每个Cache都应该有自己的一个缓冲区。
      diskExpiryThreadIntervalSeconds：磁盘失效线程运行时间间隔，默认是120秒。
      memoryStoreEvictionPolicy：当达到maxElementsInMemory限制时，Ehcache将会根据指定的策略去清理内存。默认策略是LRU（最近最少使用）。你可以设置为FIFO（先进先出）或是LFU（较少使用）。
      clearOnFlush：内存数量最大时是否清除。
      memoryStoreEvictionPolicy:可选策略有：LRU（最近最少使用，默认策略）、FIFO（先进先出）、LFU（最少访问次数）。
      FIFO，first in first out，这个是大家最熟的，先进先出。
      LFU， Less Frequently Used，就是上面例子中使用的策略，直白一点就是讲一直以来最少被使用的。如上面所讲，缓存的元素有一个hit属性，hit值最小的将会被清出缓存。
      LRU，Least Recently Used，最近最少使用的，缓存的元素有一个时间戳，当缓存容量满了，而又需要腾出地方来缓存新的元素的时候，那么现有缓存元素中时间戳离当前时间最远的元素将被清出缓存。
   -->
</ehcache>
```

一般使用Redis做缓存

# Spring

[Spring官网](https://spring.io/)

## 1. Spring

### 1. 简介

- Spring 春天 -----> 给软件行业带来了春天
- 2002年 首次推出了Spring框架的雏形 interface21框架
- Spring框架以interface21框架为基础，经过重新设计，并不断丰富其内涵，于2004.3.24正式发布1.0版
- Rod Johnson Spring Framework创始人 专业不是计算机，而是音乐
- spring理念，使现有的技术更加容易使用，本质上是一个大杂烩，整合现有技术框架



- SSH :Sturct2 + Spring + Hibernate
- SSM :SpringMVC+Spring +Mybatis

[源码下载地址](https://github.com/spring-projects/spring-framework)

```xml
<!-- https://mvnrepository.com/artifact/org.springframework/spring-webmvc -->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-webmvc</artifactId>
    <version>5.3.9</version>
</dependency>
<!-- https://mvnrepository.com/artifact/org.springframework/spring-webmvc -->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-jdbc</artifactId>
    <version>5.3.9</version>
</dependency>
```

### 2. 优点

- Spring是一个开源的免费框架(容器)
- Spring是一个轻量级的、非入侵式的框架
- 控制反转(IOC)、面向切面编程(AOP)
- 支持事务的处理，对框架整合的支持

==**Spring就是一个轻量级的控制反转IOC和面向切面AOP编程的框架**==

### 3. 组成

七大模块

![image-20210724220754975](allNote.assets/image-20210724220754975.png)

### 4. 扩展

Spring Boot 构建一切 --> Spring Cloud 协调一切 --> Spring Cloud Data Flow 连接一切

现代化的Java开发，实际上就是基于Spring开发

- Spring Boot
  - 一个快速开发的脚手架
  - 基于Springboot可以快速开发单个微服务
  - 约定大于配置
- Spring Cloud
  - 基于Spring Boot实现

学习Springboot需要先学习Spring和SpringMVC

**弊端 发展了太久之后，违背了原来的理念，配置非常繁琐**

## 2. IOC理论推导

1. UserDao接口
2. UserDaoImpl实现类
3. UserService业务接口
4. UserServiceImpl实现类

在之前的业务中，用户的需求会影响原来的代码，需要根据用户需求去修改源代码，代码量越大，修改一次的代价就非常昂贵

使用Set接口注入实现，已经发生了革命性的变化

```java
private UserDao userDao;

//利用Set进行动态实现值的注入
public void setUserDao(UserDao userDao) {
    this.userDao = userDao;
}
```

- 之前是程序主动创建对象，控制权在程序员手上
- 使用了set注入后，程序不再具有主动性，而是变成了被动的接受对象

这种思想从本质上解决了问题，我们不需要再去管理对象的创建了，系统的耦合性大大降低，可以更加专注业务的实现，这就是IOC的原型

```mermaid
flowchart TB
	id(用户) --> id1(业务层 主动权再程序元手上 程序调用什么)
	id2(MySql) --> id1
	id3(Oracle) --> id1
	id4(...) --> id1
	
	id_1(用户) --> id1_1(业务层 主动权在用户手上 用户选择调什么)
	id2_1(MySql) --> id1_1
	id3_1(Oracle) --> id1_1
	id4_1(...) --> id1_1
```

### IOC本质

IOC本质是一种设计思想 DI(依赖注入)是实现Ioc的一种方法，没有IOC的程序中，我们使用面向对象编程，对象的创建与对象间的依赖关系完全硬编码在程序中，对象的创建由程序自己控制，控制反转后将对象的创建转移给第三方，所谓的控制反转可以理解为获得依赖对象的方式反转了

采用XML方式配置Bean的时候，Bean的定义信息是和实现分离的，而采用注解的方式可以把两者合二为一，Bean的定义信息直接以注解的形式定义在实现类中，从而达到了零配置的目的

**控制反转是一种通过描述(XML或注解)并通过第三方去生产或获取特定对象的方式，在Spring中实现控制反转的是IOC容器，其实现方法是依赖注入(Dependency Injection,DI)**

## 3. HelloSpring

实体类

```java
package com.flywinter.entity;

/**
 * Created by IntelliJ IDEA
 * User:Zhang Xingkun
 * Date:2021/7/24 23:14
 * Description:
 */
public class Hello {
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }
}
```

配置文件

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
  https://www.springframework.org/schema/beans/spring-beans.xsd">

    <!--    使用Spring来创建我们的对象 在Spring中这些都称为Bean

    类型 变量名 = new 类型();
    Hello hello = new Hello();

    id = 变量名
    class = new 的对象
    property相当于给对象中的属性设置一个值
    -->


    <bean id="hello" class="com.flywinter.entity.Hello">
        <property name="str" value="Spring"/>
    </bean>
    <!--    <bean id="..." class="...">-->
    <!--        &lt;!&ndash; collaborators and configuration for this bean go here &ndash;&gt;-->
    <!--    </bean>-->
    <!--    &lt;!&ndash; more bean definitions go here &ndash;&gt;-->
</beans>
```

测试

```java
@Test
public void test(){
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    Hello hello = (Hello) context.getBean("hello");
    System.out.println(hello.toString());
}
```

思考问题

- Hello对象是谁创建的

  Hello对象是由Spring创建的

- Hello对象的属性是由Spring容器设置的

  hello对象的属性是由Spring容器设置的
  

这个过程就叫控制反转

控制:谁来控制对象的对象的创建，传统应用程序的对象是由程序本身控制创建的，使用Sring后，对象是由Spring来创建的

反转:程序本身不创建对象，而变成被动的接收对象

依赖注入：就是利用set方法来进行注入的

IOC是一种编程思想，由主动的编程变成被动的接收

可以通过ClassPathXmlApplicationContext查看底层实现

**对象由Spring来创建、管理、装配**

## 4. IOC创建对象的方式

1. 使用无参构造创建对象 默认

2. 假设我们使用有参构造创建对象

   1. 下标赋值

      ```xml
      <bean id="userp" class="com.flywinter.User">
          <constructor-arg index="0" value="Java"/>
      </bean>
      ```

   2. 类型创建

      ```xml
      <!--    不建议使用-->
          <bean id="userp" class="com.flywinter.User">
              <constructor-arg type="java.lang.String" value="Java"/>
          </bean>
      ```

   3. 直接通过参数命名

      ```xml
      <!--    直接通过参数命名-->
          <bean id="userp" class="com.flywinter.User">
              <constructor-arg name="name"  value="Java"/>
          </bean>
      ```

在配置文件加载的时候，容器中管理的对象就已经初始化了

## 5. Sping配置

### 别名

```xml
<!--    给对应id的bean起个别名，也可通过别名取出bean-->
    <alias name="user" alias="usrAlias"/>
```

### Bean的配置

```xml
<!--    id :bean的唯一标识符，相当于对象名
class：bean的对象所对应的全限定名 包名+类名
name：也是别名 而且可以同时取多个别名
-->
<bean id="user" class="com.flywinter.User" name="userr,u1 u3;u4">
    <property name="name" value="zx"/>
</bean>
```

### import

import一般用于用于团队开发，可以将多个配置文件导入合并为一个

假设项目中有多个人开发，每个人都有一个配置文件，可以通过import导入到同一个文件，这样创建的时候只需要读取总的配置文件就可以使用全部的bean

applicationContext.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
  https://www.springframework.org/schema/beans/spring-beans.xsd">

    <import resource="bean.xml"/>
</beans>
```

如果bean同名不会报错，但是下面的会覆盖前面的

## 6. 依赖注入

### 构造器注入

```xml
private UserDao userDao;

public UserServiceImpl(UserDao userDao) {
    this.userDao = userDao;
}
```

### set方式注入(重点)

- 依赖注入 set注入
  - 依赖：bean对象的创建依赖于容器
  - 注入：bean对象中的所有属性，由容器来注入

环境搭建

1. 复杂类型

   ```java
   public class Address {
       private String address;
   
       public String getAddress() {
           return address;
       }
   
       public void setAddress(String address) {
           this.address = address;
       }
   }
   ```

2. 真实测试对象

   ```java
   public class Student {
       private String name;
       private Address address;
       private String[] books;
       private List<String> hobbies;
       private Map<String,String> card;
       private Set<String> games;
       private String wife;
       private Properties info;
       get set
   }
   ```

3. applicationContext.xml

   ```xml
   <?xml version="1.0" encoding="UTF-8"?>
   <beans xmlns="http://www.springframework.org/schema/beans"
          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
          xsi:schemaLocation="http://www.springframework.org/schema/beans
     https://www.springframework.org/schema/beans/spring-beans.xsd">
   
       <bean id="student" class="com.flywinter.entity.Student">
           <!--        第一种，普通值注入value-->
           <property name="name" value="Alex"/>
       </bean>
   
   </beans>
   ```

4. 测试类

   ```java
   public class MyTest {
       public static void main(String[] args) {
           ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
   
           Student student = (Student) context.getBean("student");
           String name = student.getName();
           System.out.println(name);
       }
   }
   ```

完善注入信息

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
  https://www.springframework.org/schema/beans/spring-beans.xsd">


    <bean id="address" class="com.flywinter.entity.Address"/>

    <bean id="student" class="com.flywinter.entity.Student">
        <!--        第一种，普通值注入value-->
        <property name="name" value="Alex"/>
<!--        <property name="name">-->
<!--            <value>Alex</value>-->
<!--        </property>-->
<!--        第二种Bean注入 ref-->
        <property name="address" ref="address"/>

<!--    第三种    数组注入-->
        <property name="books">
            <array>
                <value>Java并发编程的艺术</value>
                <value>Java核心卷</value>
                <value>C prime plus</value>
            </array>
        </property>
        <property name="hobbies">
            <list>
                <value>写代码</value>
                <value>看电影</value>
            </list>
        </property>
<!--     第四种   Map注入-->
        <property name="card">
            <map>
                <entry key="Id card" value="1458622"/>
                <entry key="Phone number" value="451321"/>
            </map>
        </property>
<!--        第五种set注入-->
        <property name="games">
            <set>
                <value>LOL</value>
                <value>COC</value>
                <value>Control</value>
            </set>
        </property>
<!--        第六种 null注入-->
        <property name="wife">
            <null/>
        </property>
<!--        Properties注入-->
        <property name="info">
            <props>
                <prop key="gender">male</prop>
                <prop key="name">Marry</prop>
            </props>
        </property>
    </bean>

</beans>
```

### 拓展方式注入

我们可以使用p命名空间和c命名空间进行注入

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:p="http://www.springframework.org/schema/p"
       xmlns:c="http://www.springframework.org/schema/c"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
  https://www.springframework.org/schema/beans/spring-beans.xsd">

<!--    p命名空间,可以直接注入属性的值 property-->
    <bean id="user" class="com.flywinter.entity.User"
          p:name="Alex" p:age="11"/>
<!--    c命名空间 可以通过构造器注入 construct-->
    <bean id="user2" class="com.flywinter.entity.User"
          c:age="11" c:name="Mark"/>
</beans>
```



注意：p命名空间和c命名空间不能直接使用，需要导入xml约束

```xml
   xmlns:p="http://www.springframework.org/schema/p"
       xmlns:c="http://www.springframework.org/schema/c"
```

### Bean的作用域

![image-20210725154454894](allNote.assets/image-20210725154454894.png)

1. 单例模式(Spring默认机制)

   ```xml
   <bean id="user" class="com.flywinter.entity.User" scope="singleton"/>
   ```

2. 原型模式 每次从容器中get的时候，都会产生一个新的对象

   ```xml
   <bean id="user" class="com.flywinter.entity.User" scope="prototype"/>
   ```

3. 其余的request，session，application这些只能在web开发中使用

## 7. Bean的自动装配

- 自动装配是spring满足bean依赖的一种方式
- Spring会在上下文中自动寻找，并给bean装配属性

在Spring中有三种装配的方式

1. 在xml中显式的配置
2. 在java中显式的配置
3. **隐式的自动装配bean**

### 测试

1. 环境搭建 一个人有两个宠物

### byName自动装配

```xml
<!--    byName会自动在容器上下文中查找和自己对象set方法后面的值对应的beanid-->
    <bean id="people" class="com.flywinter.entity.People" autowire="byName">
        <property name="name" value="Alex"/>
    </bean>
```

### byType

```xml
    <!--    byName会自动在容器上下文中查找和自己对象属性类型相同的bean
    可以不用id-->
    <bean id="people" class="com.flywinter.entity.People" autowire="byType">
        <property name="name" value="Alex"/>
    </bean>
```

小结

- byName的时候，需要保证所有bean的id唯一，并且这个bean需要和自动注入的属性的set方法一致
- byType的时候，需要保证所有的bean的class唯一，并且这个bean需要和自动注入的属性的类型一致

### 使用注解自动装配

JDK1.5支持注解 Spring2.5以后就支持了

The introduction of annotation-based configuration raised the question of whether this approach is “better” than XML

使用注解须知

1. 导入约束 context约束

2. 配置注解支持 context:annotation-config

   ```xml
   <?xml version="1.0" encoding="UTF-8"?>
   <beans xmlns="http://www.springframework.org/schema/beans"
     xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
     xmlns:context="http://www.springframework.org/schema/context"
     xsi:schemaLocation="http://www.springframework.org/schema/beans
     https://www.springframework.org/schema/beans/spring-beans.xsd
     http://www.springframework.org/schema/context
     https://www.springframework.org/schema/context/spring-context.xsd">
     <context:annotation-config/>
   </beans>
   ```

@Autowired

直接在属性上使用即可，也可以在set方法上使用

使用Autowired我们可以不用编写set方法，前提是这个自动装配的属性在IOC(Spring)容器中存在，首先根据ByType，如果多个类型一样的，根据byName

```java
@Nullable 字段标记了这个注解，说明这个字段可以为null
```

```java
public @interface Autowired {
    boolean required() default true;
}
```

测试代码

```java
public class People {
    //如果显式定义了Autoaried的required属性为false,说明这个对象可以为null,否则不允许为空
    @Autowired(required = false)
    private Cat cat;
    @Autowired
    private Dog dog;
    private String name;
}
```

   如果@Autowired自动装配的环境比较复杂，自动装配无法通过一个注解@Autowired完成，也可以配合使用@Qualified(value="beanid")去配置寻找具体的Id

```java
@Autowired
@Qualifier("dog")
private Dog dog;
```

   @Resource注解

```java
    @Resource
//    @Resource(name = "dog")
    private Dog dog;
```

   

区别

@Resoure和@Autowired

- 都是用来自动装配的，都可以放在属性字段上
- @Autowird默认的注入方式为byType，也就是根据类型匹配，当有多个实现时，则通过byName注入，也可以通过配合@Qualifier注解来显式指定name值，指明要使用哪个具体的实现类
- @Resource默认通过byName注入，如果没有匹配则通过byType注入
- 执行顺序不同
- JDK11之后，@Resource可能会找不到，需要导入JAVA EE 6的相关包javax.annotation.Resource

   ## 8. 使用注解开发

在Spring4之后，要使用注解开发，必须保证Aop的包导入了

![image-20210725170456403](allNote.assets/image-20210725170456403.png)

使用注解需要导入context约束

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
  https://www.springframework.org/schema/beans/spring-beans.xsd
  http://www.springframework.org/schema/context
  https://www.springframework.org/schema/context/spring-context.xsd">
    <!--    添加注解支持-->
    <context:annotation-config/>
<!--    指定要扫描的包,这个包下的注解就会生效-->
    <context:component-scan base-package="com.flywinter.entity"/>

</beans>
```

注解说明

- @Autowired 自动装配通过类型，名字
- @Resource自动装配通过名字 类型
- @Nullable 字段标记了这个注解，说明这个字段可以为null



- @Component

1. bean

2. 属性如何注入

   ```java
   //等价于    <bean id="user" class="com.flywinter.entity.User"/>
   //@Component 组件
   @Component
   public class User {
       //相当于<property name="name" value="Alex"/>
   //    @Value("Alex")
       public String name = "Alex";
   
       @Value("Alex")
       public void setName(String name) {
           this.name = name;
       }
   }
   ```

3. 衍生的注解

   @Component有几个衍生注解，我们在web开发中，会按照mvc三层架构分层，功能一样，都是注册到Spring中装配，只是为了区分不同层

   - dao @Repository
   - service @Service
   - controller @Controller

4. 自动装配配置

   ```java
   - @Autowired 自动装配通过类型，名字
   - @Resource自动装配通过名字 类型
   - @Nullable 字段标记了这个注解，说明这个字段可以为null
   ```

5. 作用域

   ```java
   @Component
   @Scope("prototype")
   public class User {
       //相当于<property name="name" value="Alex"/>
   //    @Value("Alex")
       public String name = "Alex";
   
       @Value("Alex")
       public void setName(String name) {
           this.name = name;
       }
   }
   ```

6. 小结

   xml与注解

- xml更加万能，适用于任何场景，维护简单方便

- 注解 不是自己的类是用不了，维护较为复杂

- 最佳实现

  - xml用来管理bean

  - 注解只负责完成属性的注入

  - 我们在使用过程中必须让注解生效，需要开启注解支持

    ```xml
        <!--    添加注解支持-->
        <context:annotation-config/>
    <!--    指定要扫描的包,这个包下的注解就会生效-->
        <context:component-scan base-package="com.flywinter.entity"/>
    ```

## 9. 使用Java的方式配置Spring

我们现在可以不适用xml配置，完全用java来做

javaConfig是spring的一个子项目，在Spring4之后变成了核心功能

实体类

```java
@Component
public class User {
    private String name;

    public String getName() {
        return name;
    }
    @Value("Alex")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
```

配置文件

```java
@Configuration//也会被Spring容器托管,注册到容器中,
@ComponentScan("com.flywinter.entity")
@Import(Appconfig2.class)
// 因为本质上也是一个Component,和beans.xml一样
public class Appconfig {
    //注册一个bean,就相当于之前写的<bean>标签
    //这个方法的名字 就相当于bean标签中的id属性
    //这个方法的返回值 就相当于bean标签中的class属性
    @Bean
    public User getUser(){
        return new User(); //就是返回要注入bean中的对象
    }
}
```



```java
@Configuration//也会被Spring容器托管,注册到容器中,
//@ComponentScan("com.flywinter.entity")
// 因为本质上也是一个Component,和beans.xml一样
public class Appconfig2 {
//    //注册一个bean,就相当于之前写的<bean>标签
//    //这个方法的名字 就相当于bean标签中的id属性
//    //这个方法的返回值 就相当于bean标签中的class属性
//    @Bean
//    public User getUser(){
//        return new User(); //就是返回要注入bean中的对象
//    }
}
```

测试

```java
public class MyTest {
    public static void main(String[] args) {
        //如果完全使用了配置类方式去做,我们就只能通过AnnotationConfig上下文来获取容器,通
        // 过配置类的class对象加载
        ApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
        User getUser = (User) context.getBean("user");
        System.out.println(getUser);
    }
}
```

这种Java的配置方式，在SpringBoot中随处可见

## 10. 代理模式

中介

为什么要学习代理模式？因为这就是SpringAOP的底层[SpringAOP和SpringMVC]

代理模式的分类

- 静态代理
- 动态代理

```mermaid
flowchart LR
	id(真实的人\n你\n租房的人) --> id1(代理角色\n中介)-.-> id2(真实的角色\n房东)
	id1 --> id3(租房)
	id2 --> id3
```



### 静态代理

角色分析

- 抽象角色 一般会使用接口或抽象类实现
- 真实角色 被代理的角色
- 代理角色 代理真实角色，代理真实角色后，一般会做些附属操作
- 客户 访问代理角色的人



代码步骤

1. 接口

   ```java
   public interface Rent {
       void rent();
   }
   ```

2. 真实角色

   ```java
   //房东
   public class Host implements Rent{
       @Override
       public void rent(){
           System.out.println("房东要出租房子");
       }
   }
   ```

3. 代理角色

   ```java
   public class Proxy implements Rent{
       private Host host;
   
       public Proxy() {
       }
   
       public Proxy(Host host) {
           this.host = host;
       }
   
       @Override
       public void rent() {
           seeHouse();
           host.rent();
           fee();
       }
   
       public void  seeHouse(){
           System.out.println("中介带你看房子");
       }
       public void fee(){
           System.out.println("收中介费");
       }
   }
   ```

4. 客户端访问代理角色

   ```java
   public class Client {
       public static void main(String[] args) {
   //        Host host = new Host();
   //        host.rent();
           //房东要租房子
           Host host = new Host();
           //代理,中介要带房东租房子,但是代理角色通常会有些附属操作
           Proxy proxy = new Proxy(host);
           //你不用面对房东,直接找中介租房即可
           proxy.rent();
       }
   }
   ```

代理模式的好处

- 可以使真实的角色操作更加纯粹，不用去关注一些公共的业务
- 公共也就交给代理角色，实现类业务的分工
- 公共业务发生扩展的时候，方便集中管理

缺点

- 一个真实角色就会产生一个代理角色，代码量会翻倍，开发效率会降低

### 加深理解

就是为了在不改变原来代码的基础上，增加新的功能，如果是多人开发，增加功能时如果直接修改别人写好的类，那么可能导致被继承的类等之后的一系列代码异常，所有需要代理，如果自己开发，前后实现功能其实就知道，那么静态代理的优势就没有那么明显了

### 动态代理

- 动态代理和静态代理角色一样
- 动态代理的代理类是动态生成的，不是直接写好的
- 动态代理分为两大类
  - 基于接口的动态代理 [我们这里实现的]
    - JDK动态代理
  - 基于类的动态代理
    - cglib
  - Java字节码 sist

需要了解两个类 Proxy 代理 InvocationHandler 调用处理程序

动态代理的好处

- 可以使真实角色的操作更加纯粹，不用去关注一些公共的业务
- 公共也就交给代理角色，实现了业务的分工
- 公共业务发生扩展的时候，方便集中管理
- 一个动态代理类代理的是一个接口，一般就是对应的一类业务
- 一个动态代理类可以代理多个类，只要实现了同一个接口即可

## 11. AOP

### 什么是AOP	

​	在软件业，AOP为Aspect Oriented Programming的缩写，意为：[面向切面编程](https://baike.baidu.com/item/面向切面编程/6016335)，通过[预编译](https://baike.baidu.com/item/预编译/3191547)方式和运行期间动态代理实现程序功能的统一维护的一种技术。AOP是[OOP](https://baike.baidu.com/item/OOP)的延续，是软件开发中的一个热点，也是[Spring](https://baike.baidu.com/item/Spring)框架中的一个重要内容，是[函数式编程](https://baike.baidu.com/item/函数式编程/4035031)的一种衍生范型。利用AOP可以对业务逻辑的各个部分进行隔离，从而使得业务逻辑各部分之间的[耦合度](https://baike.baidu.com/item/耦合度/2603938)降低，提高程序的可重用性，同时提高了开发的效率

### AOP在Spring中的作用

提供声明式事务；允许用户自定义切面

- 横切关注点 跨越应用程序多个模块的方法或功能，即与业务逻辑无关，但是需要关注的部分，如日志，安全，缓存，事务等
- 切面(ASPECT) 横切关注点 呗模块化的特殊对象 它是一个类
- 通知(Advice) 面必须要完成的工作 它是类中的一个方法
- 目标(Target) 被通知对象
- 代理(Proxy) 向目标对象应用通知之后创建的对象
- 切入点(Pointcut) 切面通知 执行的地点的定义
- 连接点(JoinPoint) 与切入点匹配的执行点



SpringAOP中 通过Advice定义横切逻辑，Spring中支持5种类型的Advice

| 通知类型     | 连接点               | 实现接口                                        |
| ------------ | -------------------- | ----------------------------------------------- |
| 前置通知     | 方法前               | org.springframework.aop.MethodBeforeAdvice      |
| 后置通知     | 方法后               | org.springframework.aop.AfterReturningAdvice    |
| 环绕通知     | 方法前后             | org.springframework.aop.MethodInterceptor       |
| 异常抛出通知 | 方法抛出异常         | org.springframework.aop.ThrowsAdvice            |
| 引介通知     | 类中增加新的方法属性 | org.springframework.aop.IntroductionInterceptor |

### 使用Spring实现AOP

导入依赖

```xml
<dependency>
    <groupId>org.aspectj</groupId>
    <artifactId>aspectjweaver</artifactId>
    <version>1.9.7</version>
</dependency>
```



方式一：使用Spring的API接口 主要是Spring接口实现

方式二：自定义来实现AOP 主要是切面定义

方式三：使用注解实现



## 12. 整合MyBatis



1. 导入依赖
   - junit
   - mybatis
   - mysql
   - springweb
   - aop
   - mybatis-spring
   - maven静态资源过滤

```xml
<dependencies>
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.12</version>
    </dependency>
    <dependency>
        <groupId>org.mybatis</groupId>
        <artifactId>mybatis</artifactId>
        <version>3.5.7</version>
    </dependency>
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <version>8.0.24</version>
    </dependency>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-webmvc</artifactId>
        <version>5.3.9</version>
    </dependency>
    <!--Spring操作数据库的话，还需要一个spring-jdbc
           -->
    <!-- https://mvnrepository.com/artifact/org.springframework/spring-jdbc -->
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-jdbc</artifactId>
        <version>5.3.9</version>
    </dependency>
    <dependency>
        <groupId>org.aspectj</groupId>
        <artifactId>aspectjweaver</artifactId>
        <version>1.9.7</version>
    </dependency>
    <!-- https://mvnrepository.com/artifact/org.mybatis/mybatis-spring -->
    <dependency>
        <groupId>org.mybatis</groupId>
        <artifactId>mybatis-spring</artifactId>
        <version>2.0.6</version>
    </dependency>
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <version>1.18.10</version>
    </dependency>
</dependencies>

<build>
    <resources>
        <resource>
            <directory>src/main/java</directory>
            <includes>
                <include>**/*.properties</include>
                <include>**/*.xml</include>
            </includes>
            <filtering>true</filtering>
        </resource>
    </resources>
</build>
```

### 回顾Mybatis

1. 实体类编写

   ```java
   @Data
   public class User {
       private int id;
       private String name;
       private String password;
   }
   ```

2. 编写配置文件

   ```xml
   <?xml version="1.0" encoding="UTF-8" ?>
   <!DOCTYPE configuration
           PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
           "http://mybatis.org/dtd/mybatis-3-config.dtd">
   <configuration>
   
       <typeAliases>
           <package name="com.flywinter.entity"/>
       </typeAliases>
   
       <environments default="development">
           <environment id="development">
               <transactionManager type="JDBC"/>
               <dataSource type="POOLED">
                   <property name="driver" value="com.mysql.jdbc.Driver"/>
                   <property name="url" value="jdbc:mysql://localhost:3306/mybatis?useSSL=true&amp;useUnicode=true&amp;characterEncoding=UTF-8&amp;serverTimezone=UTC"/>                <property name="username" value="root"/>
                   <property name="password" value="123456"/>
               </dataSource>
           </environment>
       </environments>
   
       <mappers>
           <package name="com.flywinter.mapper"/>
       </mappers>
   </configuration>
   ```
   
3. 编写UserMapper接口

   ```java
   public interface UserMapper {
       public List<User> selectUser();
   }
   ```

4. 编写UserMapper.xml文件

   ```xml
   <?xml version="1.0" encoding="UTF-8" ?>
   <!DOCTYPE mapper
           PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
           "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
   
   <mapper namespace="com.flywinter.mapper.UserMapper">
       <!--sql-->
       <select id="selectUser" resultType="user">
           select * from mybatis.user
       </select>
   </mapper>
   ```
   
5. 测试

   ```java
   @Test
   public void selectUser() throws IOException {
   
      String resource = "mybatis-config.xml";
      InputStream inputStream = Resources.getResourceAsStream(resource);
      SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
      SqlSession sqlSession = sqlSessionFactory.openSession();
   
      UserMapper mapper = sqlSession.getMapper(UserMapper.class);
   
      List<User> userList = mapper.selectUser();
      for (User user: userList){
          System.out.println(user);
     }
   
      sqlSession.close();
   }
   ```

   

### Mybatis-Spring

将Mybatis代码无缝整合到Spring中

[Mbatis-Spring介绍网址](http://mybatis.org/spring/zh/index.html)

导入依赖

```xml
    <!-- https://mvnrepository.com/artifact/org.mybatis/mybatis-spring -->
    <dependency>
        <groupId>org.mybatis</groupId>
        <artifactId>mybatis-spring</artifactId>
        <version>2.0.2</version>
    </dependency>
```

整合实现

1. 引入Spring配置文件spring-dao.xml

   ```xm
   <?xml version="1.0" encoding="UTF-8"?>
   <beans xmlns="http://www.springframework.org/schema/beans"
          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
          xsi:schemaLocation="http://www.springframework.org/schema/beans
           https://www.springframework.org/schema/beans/spring-beans.xsd">
           
   
   </beans>
   ```

2. 将数据源替换为mybatis的数据源

   ```xml
       <!--DataSource:使用Spring的数据源替换Mybatis的配置 c3p0 dbcp druid
       我们这里使用Spring提供的JDBC：-->
       <bean id="dataSource" class="org.springframework.jdbc.datasource.DriverManagerDataSource">
           <property name="driverClassName" value="com.mysql.jdbc.Driver"/>
           <property name="url" value="jdbc:mysql://localhost:3306/mybatis?useSSL=false&amp;useUnicode=true&amp;characterEncoding=UTF-8"/>
           <property name="username" value="root"/>
           <property name="password" value="123456"/>
       </bean>
   ```

3. 配置SqlSessionFactory，关联Mybatis

   ```xml
   <!--sqlSessionFactory-->
   <bean id="sqlSessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">
       <property name="dataSource" ref="dataSource" />
       <!--关联mybatis配置文件-->
       <property name="configLocation" value="classpath:mybatis-config.xml"/>
       <property name="mapperLocations" value="classpath:com/flywinter/mapper/*.xml"/>
   </bean>
   ```

4. 注册SqlSessionTemple，关联SqlSessionFactory

   ```xml
       <!--SqlSessionTemplate:就是我们使用的sqlSession-->
       <bean id="sqlSession" class="org.mybatis.spring.SqlSessionTemplate">
           <!--只能使用构造器注入sqlSessionFactory，因为它没有set方法-->
           <constructor-arg index="0" ref="sqlSessionFactory" />
       </bean>
   ```

5. 需要UserMapper接口的UserMapperImpl实现类，私有SqlSessionTemplate

   ```java
   public class UserMapperImpl implements UserMapper {
   
       //我们的所有操作，都使用sqlSession来执行，在原来，现在都使用SqlsessionTemplate
       private SqlSessionTemplate sqlSession;
   
       public void setSqlSession(SqlSessionTemplate sqlSession) {
           this.sqlSession = sqlSession;
       }
   
       public List<User> selectUser() {
           UserMapper mapper = sqlSession.getMapper(UserMapper.class);
           return mapper.selectUser();
       }
   }
   ```

6. 将自己的实现类，注入Spring配置文件中

   ```xml
       <bean id="userMapper" class="com.flywinter.mapper.UserMapperImpl">
           <property name="sqlSession" ref="sqlSession"/>
       </bean>
   ```

7. 测试使用

   ```java
       @Test
       public void test () throws IOException {
           ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
           UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
           for (User user : userMapper.selectUser()) {
               System.out.println(user);
           }
       }
   ```

```xml
<?xml version="1.0" encoding="GBK" ?>
<!DOCTYPE configuration
        PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-config.dtd">
<!--configuration core file-->
<configuration>
    
    <typeAliases>
        <package name="com.flywinter.entity"/>
    </typeAliases>

</configuration>
```

整合实现二

修改UserMapperImpl

```java
public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {

    public List<User> selectUser() {
        
        return getSqlSession().getMapper(UserMapper.class).selectUser();
    }
}
```

注入Spring配置文件

```xml
    <bean id="userMapper2" class="com.flywinter.mapper.UserMapperImpl2">
        <property name="sqlSessionFactory" ref="sqlSessionFactory"/>
    </bean>
```

测试

```java
    @Test
    public void test () throws IOException {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        UserMapper userMapper = context.getBean("userMapper2", UserMapper.class);
        for (User user : userMapper.selectUser()) {
            System.out.println(user);
        }
    }
```

声明式事务

1. 使用Spring管理事务，注意头文件的约束导入 : tx

   ```xml
          xmlns:tx="http://www.springframework.org/schema/cache"
   
   
   http://www.springframework.org/schema/tx
   http://www.springframework.org/schema/tx/spring-tx.xsd">
   ```

   

2. JDBC事务

    ```xml
        <bean id="transactionManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
            <property name="dataSource" ref="dataSource"/>
        </bean>
    ```

    

3. 配置好事务管理器后我们需要去配置事务的通知

        <!--结合AOP实现事务的织入-->
        <!--配置事务通知-->
        <tx:advice id="txAdvice" transaction-manager="transactionManager">
            <!--给那些方法配置事务-->
            <!--配置事务的传播特性： new -->
            <tx:attributes>
                <tx:method name="add" propagation="REQUIRED"/>
                <tx:method name="delete" propagation="REQUIRED"/>
                <tx:method name="update" propagation="REQUIRED"/>
                <tx:method name="query" read-only="true"/>
                <tx:method name="*" propagation="REQUIRED"/>
            </tx:attributes>
        </tx:advice>

spring事务传播特性：

- 事务传播行为就是多个事务方法相互调用时，事务如何在这些方法间传播。spring支持7种事务传播行为：

- propagation_requierd：如果当前没有事务，就新建一个事务，如果已存在一个事务中，加入到这个事务中，这是最常见的选择。
- propagation_supports：支持当前事务，如果没有当前事务，就以非事务方法执行。
- propagation_mandatory：使用当前事务，如果没有当前事务，就抛出异常。
- propagation_required_new：新建事务，如果当前存在事务，把当前事务挂起。
- propagation_not_supported：以非事务方式执行操作，如果当前存在事务，就把当前事务挂起。
- propagation_never：以非事务方式执行操作，如果当前事务存在则抛出异常。
- propagation_nested：如果当前存在事务，则在嵌套事务内执行。如果当前没有事务，则执行与propagation_required类似的操作。
- Spring 默认的事务传播行为是 PROPAGATION_REQUIRED，它适合于绝大多数的情况。就好比，我们刚才的几个方法存在调用，所以会被放在一组事务当中！

4. 配置AOP，导入aop的头文件

    ```xml
        <!--配置事务切入-->
        <aop:config>
            <aop:pointcut id="txPointCut" expression="execution(* com.flywinter.mapper.*.*(..))"/>
            <aop:advisor advice-ref="txAdvice" pointcut-ref="txPointCut"/>
        </aop:config>
    ```

    

5. 删掉刚才插入的数据，再次测试！

    ```java
        @Test
        public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
    
            for (User user : userMapper.selectUser()) {
                System.out.println(user);
            }
    }
	
	```


思考：为什么需要事务？

如果不配置事务，可能存在数据提交不一致的情况；
如果我们不在Spring中去配置声明式事务，我们就需要在代码中手动配置事务！
事务在项目的开发中十分重要，涉及到数据的一致性和完整性问题，不容马虎！










# 设计模式

```mermaid
flowchart LR
id0(设计模式) --> id1(六大原则) 
	id1 --> id1_1(开闭原则)
	id1 --> id1_2(单一职责原则)
	id1 --> id1_3(里氏替换原则)
	id1 --> id1_4(依赖倒置原则)
	id1 --> id1_5(迪米特法则)
	id1 --> id1_6(接口隔离原则)
id0 --> id2(23种设计模式)
	id2 --> id2_1(5种构建型模式)
		id2_1 --> id2_1_1(工厂方法模式)
		id2_1 --> id2_1_2(抽象工厂模式)
		id2_1 --> id2_1_3(单例模式)
		id2_1 --> id2_1_4(建造者模式)
		id2_1 --> id2_1_5(原型模式)
	id2 --> id2_2(7种结构型模式)
		id2_2 --> id2_2_1(适配器模式)
		id2_2 --> id2_2_2(桥接模式)
		id2_2 --> id2_2_3(组合模式)
		id2_2 --> id2_2_4(装饰模式)
		id2_2 --> id2_2_5(外观模式)
		id2_2 --> id2_2_6(享元模式)
		id2_2 --> id2_2_7(代理模式)
	id2 --> id2_3(11种行为型模式)
		id2_3 --> id2_3_1(责任链模式)
		id2_3 --> id2_3_2(命令模式)
		id2_3 --> id2_3_3(解释器模式)
		id2_3 --> id2_3_4(迭代器模式)
		id2_3 --> id2_3_5(中介者模式)
		id2_3 --> id2_3_6(备忘录模式)
		id2_3 --> id2_3_7(观察者模式)
		id2_3 --> id2_3_8(状态模式)
		id2_3 --> id2_3_9(策略模式)
		id2_3 --> id2_3_10(模板方法模式)
		id2_3 --> id2_3_11(访问者模式)
```







### 六大原则

#### 1.开闭原则

> 一个软件实体，如类、模块和函数应该对修改关闭，对拓展开放

#### 2.单一职责原则

> 一个类只做一件事，一个类应该只有一个引起它修改的原因

#### 3.里氏替换原则

> 子类应该可以完全替换父类，也就是说，在继承时，只拓展新功能，不要破坏父类的功能

#### 4.依赖倒置原则

> 细节依赖于抽象，而抽象不应该依赖于细节，细节的实现由实现层实现

#### 5.迪米特法则

> 最少知道原则

#### 6.接口隔离原则

> 客户端不应该依赖不需要的接口，如果存在冗余，应该拆分接口

### 二十三种设计模式

#### 5种构建型模式

##### 1. 工厂方法模式

> 日常编程中构建对象，最常用的方式就是new一个对象，虽然方便，但这实际上属于一种硬编码，每new一个对象，相当于调用者多知道了一个类，增加了类和类之间的联系，增加了耦合度，不利于程序的松耦合，所以对象的构建过程可以被封装起来，工厂模式便是用于封装对象的设计模式

###### 1.1 简单工厂模式

> 比如一个水果工厂，只需要输入要创建的对应水果的名字，就可以建造相应的水果

##### 2. 抽象工厂模式

##### 3. 单例模式

```java
//饿汉式
class Singleton{
    private final static  Singleton instance = new Singleton();
    private Singleton(){}
    public static Singleton getInstance(){
        return instance;
    }
}
//懒汉式 线程安全
class Singleton{
    private static Singleton singleton;
    private Singleton(){}
    public static synchronized Singleton getInstance(){
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
```

##### 4. 建造者模式

##### 5. 原型模式

#### 7种结构型模式

##### 1. 适配器模式

##### 2. 桥接模式

##### 3. 组合模式

##### 4. 装饰模式

##### 5. 外观模式

##### 6. 享元模式

##### 7. 代理模式

#### 11种行为型模式

##### 1. 责任链模式

##### 2. 命令模式

##### 3. 解释器模式

##### 4. 迭代器模式

##### 5. 中介者模式

##### 6. 备忘录模式

##### 7. 观察者模式

##### 8. 状态模式

##### 9. 策略模式

##### 10. 模板方法模式

##### 11.访问者模式



# 数据结构和算法笔记

```mermaid
flowchart LR
id0(数据结构和算法) --> id1(数据结构)
	id1 --> id1_1(数组Array) --> id1_1_1(插入快 删除慢 \n大小固定 单一元素)
	id1 --> id1_2(栈Stack) --> id1_2_1(先进后出 存取其他项慢)
	id1 --> id1_3(队列Queue) --> id1_3_1(先进先出 存取其他项慢)
	id1 --> id1_4(链表Linked List) --> id1_4_1(插入删除块 查找慢)
	id1 --> id1_5(树Tree)
		id1_5 --> id1_5_1(二叉树) --> id1_5_1_1(平衡二叉树查找\n 插入删除快 删除算法复杂)
		id1_5 --> id1_5_2(红黑树) --> id1_5_2_1(查找 删除 插入都快\n 树总是平衡的算法复杂)
		id1_5 --> id1_5_3(2-3-4树) --> id1_5_3_1(查找 删除 插入都快\n树总是平衡的 类似的树对磁盘存储有效 \n算法复杂)
	id1 --> id1_6(哈希表Hash) --> id1_6_1(如果关键字已知则存取块\n删除慢 如果不知道关键字存取慢\n对存储空间使用不充分)
	id1 --> id1_7(堆Heap) --> id1_7_1(插入 删除快 对最大数据项存取快\n对其他数据项存取慢)
	id1 --> id1_8(图Graph) --> id1_8_1(对现实世界建模\n有些算法慢且复杂)
```





# Linux相关指令

## Ubuntu

### 更新

```bash
sudo apt-get update
```

### 清理软件卸载残余

```bash
sudo apt-get clean
```

### 安装软件

```bash
sudo apt-get install python3.9 //软件名加版本
```

### 搜索软件

```bash
sudo apt-cache search maven //关键字
```

### 清除窗口

```bash
clear
```

### 显示当前文件夹下所有文件

```bash
ls
```

### 显示当前路径

```bash
pwd
```

### 进入文件夹(cd)

```bash
cd [dirName]   //进入dirName文件夹
cd ~          //跳转到home目录，根目录
cd ../       //跳到上一层目录
cd ../..        //跳到当前目录的上上两层
```

### 删除文件或目录

```bash
rm [fileName.txt]  //删除fileName.txt文件
rm -r [directory]   //删除directory文件夹
```

### 新建文件

```bash
mkdir [directory]   //创建directory文件夹
touch [my.txt]     //创建my.txt文件
```

### 移动文件

```bash
mv readme.txt ~/software   //移动readme.txt文件到 ~/software目录下
mv readme.txt software/   //移动readme.txt文件到当前目录的software文件夹下
mv readme.txt ~/software/my.txt   //移动readme.txt文件到 ~/software目录下，并且移动后的文件重命名为my.txt
mv readm.txt my.txt     //重命名readme.txt 为my.txt
mv read  my     //重命名文件夹read为my
```

### 复制文件

```bash
cp readme.txt ~/software   //复制readme.txt文件到 ~/software目录下
cp readme.txt ~/software/my.txt   //复制readme.txt文件到 ~/software目录下,并且复制后的文件命名为my.txt
cp readme.txt my.txt      //复制readme.txt文件到当前文件夹下，并且复制后的文件重命名为my.txt
```

### 解压文件

```bash
unzip my.zip    //解压my.zip到当前目录
unzip my.zip -d download/        //解压my.zip文件到当前目录下的downlaod文件夹下，如果不存在会自动创建
tar xzvf my.tar.gz     //解压my.tar.gz到当前目录
tar xzvf my.tar.gz -C ~/download     //解压my.tar.gz到~/download目录，如果目录不存在会报错
```

### 查看环境变量

```bash
env   //env命令是environment的缩写，用于列出所有的环境变量；
export    //单独使用export命令也可以像env列出所有的环境变量，不过export命令还有其他额外的功能；
echo $PATH   // echo $PATH用于列出变量PATH的值，里面包含了已添加的目录。
```

# Git和Github使用

## 版本控制

> 什么是版本控制 就是版本迭代

版本控制(Revision Control)是一种再开发过程中用于管理我们对文件、目录或工程等内容的修改历史，方便查看更改历史记录，备份以便恢复以前的版本的软件工程技术。

- 实现跨区域多人协同开发
- 追踪和记载一个或多个文件的历史记录
- 组织和保护你的源代码文档
- 统计工作量
- 并行开发，提高开发效率
- 跟踪记录整个软件的开发过程
- 减轻开发人员的负担，节省时间，同时降低人为错误

简单说就是用于管理多人协同开发项目的技术

> eg v1 v1.1 v2

多人开发就必须使用版本控制

主流版本控制

- Git
- SVN
- CVS
- VSS
- TFS

版本控制产品非常多，现在影响最大且使用最广泛的就是Git

### 版本控制分类

#### 1.本地版本控制

记录文件的每次更新，可以对每一个版本做一个快照，或是记录补丁文件，适合个人用，如RCS

```mermaid
flowchart LR
	id1(File) --- id2[Version]
	subgraph Version Databse 
		id2(Version1) --- id3[Version2] --- id4[Version3]
	end
```

#### 2.集中版本控制 SVN

所有的版本数据都保存在服务器上。协同开发者从服务器上同步更新或上传自己的数据

```mermaid
flowchart LR
	subgraph ComputerA
		id1(file)   
	end
	subgraph ComputerB
		id2(file)
	end
	subgraph Central VCS Server
		subgraph VersionDatabase
			id3(Version 3) --- id4(Verison 2) --- id5(Version 1)
		end
	end
	VersionDatabase --> ComputerA
	VersionDatabase --> ComputerB
```

所有的版本数据都存储在服务器，用户本地只有自己以前所同步的版本，如果不联网，用户就看不到历史版本，也无法切换版本验证问题，或在不同分支工作，而且，所有数据都保存在单一的服务器上，有很大的风险整个服务器会损坏，这样就丢失所有数据，当然可以定期备份，eg SVN、CVS、VSS

#### 3.分布式版本控制 Git

每个人都拥有全部的代码，带来安全隐患

所有版本信息仓库全部同步到本地的每个用户，这样就可以在本地查看所有版本历史，可以离线在本地提交，只需在联网时push到相应的服务器或者用户那里，由于每个用户那里保存的都是所有版本数据，只要有一个用户设备没有问题就可以恢复所有的数据，但这增加了本地存储空间的占用

不会因为服务器损坏或者网络问题，造成不能工作的情况

```mermaid
flowchart TB
	subgraph Computer
		subgraph VersionDatabase1
			id1(Version3) --- id2(Version2) --- id3(Version1)
		end
	end
	subgraph ComputerA
		id4(file)
		subgraph VersionDatabase2
			id5(Version3) --- id6(Version2) --- id7(Version1)
		end
	end
	subgraph ComputerB
		id8(file)
		subgraph VersionDatabase3
			id9(Version3) --- id10(Version2) --- id11(Version1)
		end
	end
	Computer --> ComputerA
	Computer --> ComputerB
	ComputerA --> Computer
	ComputerB --> Computer
	VersionDatabase2 --> id4(file)
	VersionDatabase3 --> id8(file)
	VersionDatabase2 --> VersionDatabase3
	VersionDatabase3 --> VersionDatabase2
```

> Git 和SVN的最主要区别

SVN是集中式版本控制系统

- 版本放在中央服务器，工作时用的是自己的电脑，需要首先从中央服务器得到最新的版本，然后工作，完成工作后推送到中央服务器，必须联网

Git是分布式版本控制系统

- 没有中央服务器，每个人的电脑都是一个完整的版本库，工作的时候不需要联网了，因为版本都在自己的电脑上，协同的方法是这样的：比如在自己电脑上更改了文件A，其他人也在电脑上更改了文件A，这时两个人之间只需要把各自修改的推送给对方，就可以互相看对象的修改了，Git可以直接看到更新了哪些代码和文件

-**Git是目前世界上最先进的分布式版本控制系统**



## Git历史

- 免费、开源、最初Git是为辅助Linux内核开发的，来代替BitKeeper
- BitKepper是一个专有的分布式版本控制系统，最初是为了维护Linux内核，收费
- Linux和Git之父李纳斯·托沃兹

## Git环境配置

#### [Git官网](https://git-scm.com/)

如果下载慢可以用[淘宝镜像](http://npm.taobao.org/mirrors/git-for-windows)下载

迅雷复制下载链接也可以加快下载速度

> 卸载

删除git相关环境变量

控制面板卸载

- Git Bash Unix与Linux风格的命令行 使用最多 推荐
- Git CMD windows风格命令行
- Git GUI 图形界面的Git，不推荐使用

### linux基本命令

- cd 改变目录
- cd .. 回退到上一个目录 ，直接cd进入默认目录
- pwd 显示当前所在的目录路径
- ls(ll) 都是列出当前目录中所有的文件，ll列出的内容更详细
- touch 新建一个文件 eg touch text.txt
- rm 删除一个文件
- mkdir 新建一个目录
- rm -r 删除一个文件夹

> rm -rf / 千万不要在linux尝试，删除电脑中全部文件

- mv 移动文件 mv index.html src
- reset 重新初始化终端/清屏
- clear 清屏
- history 查看命令历史
- help 帮助
- exit 退出
- #表示注释

> Git配置

所有的配置文件其实都保存在本地

--system 在安装目录的gitconfig文件夹下

--global 在c盘用户文件夹下的.gitconfig文件夹下

- git config -l

  - 当前项目下关于Git的全部配置

- git config --system --list

  - 系统自己配置的
  - 查看系统配置

- git config --global --list

  - 查看用户配置

  - 自己配置的，比如用户名密码等
  - **必须配置，不然不知道谁提交的**

- git config --global user.name "fallofleaf"

  - 配置用户名

- git config --global user.email "1475795322@qq.com"

  - 配置用户邮箱

> 只需要一次全局用户配置就可以 
>
> 特定的项目中，不加global选项，这样就可以使用特定的邮箱和用户名

## Git基本理论(核心)

> 工作区域

Git本地有三个工作区域:工作目录(Working Directory)、暂存区(Stage/Index)、资源库(Repository或Git Directory)，如果在加上远程的git仓库(Remote Directory)就可以分为四个工作区域，文件在这四个区域之间的转换关系如下

```mermaid
flowchart TB
	id1[Remote Directory] --git pull--> id2[History]
	id2[History] --git push--> id1[Remote Directory]
	id2[History] --git reset--> id3[Stage/Index]
	id3[Stage/Index] --git commit--> id2[History]
	id3[Stage/Index] --git checkout--> id4[Working Directory]
	id4[Working Directory] --git add files--> id3[Stage/Index]
```

git add .  git commit  git push

- Workspace 工作区，就是平常存放项目代码的地方
- Index/Stage 暂存区，用于临时存放改动的地方，实际上是一个文件，保存即将提交的文件列表信息
- Repository 仓库区(本地仓库) ，就是安全存放数据的地方，这里面有提交的所有版本的数据，其中HEAD指向最新放入仓库的版本
- Remote 远程仓库 托管代码的服务器，可以简单的认为是项目组中的一台电脑用于远程数据交换

.git是一个隐藏文件夹

> git 一般工作流程

1. 在工作目录中添加、修改文件
2. 将需要进行管理的文件放入暂存区
3. 将暂存区域的文件提交到git仓库

因此git的文件有三种状态：已修改(Modified)、已暂存(staged)、已提交(committed)

```mermaid
sequenceDiagram
workspace ->> index:add (-u)
index ->> local repository:commit
workspace ->> local repository:commit -a
local repository ->> remote repository:push
remote repository ->> workspace:pull or rebase
remote repository ->> local repository:fetch
local repository ->> workspace:chekcout HEAD
index ->> workspace:checkout
local repository ->> workspace:diff HEAD
index ->> workspace:diff
```

## Git项目搭建

> 创建工作目录与常用命令

工作目录一般就是git管理的文件夹，可以是项目目录，也可以是一个空目录，建议不要有中文

```mermaid
sequenceDiagram
Remote ->> Repository:fetch/clone
Repository ->> Remote:push
Index ->> Repository:commit
Repository ->> workspace:checkout
workspace ->> Index:add
Remote ->> workspace:pull
```

> 本地仓库搭建

创建本地仓库的方法有两种：一种是创建全新的仓库，另一种是克隆远程仓库

1. 创建全新的仓库，需要在Git管理的项目根目录执行

   - ```bash
     # 在当前目录新建一个Git代码库
     $ git init
     ```

2. 执行后可以看到，仅仅在项目目录多出了一个.git目录，关于版本等的所有信息都在这个目录里面

> 克隆远程仓库

1. 另一种方式是克隆远程目录，从远程服务器上的仓库完全镜像一份至本地

   - ```bash
     # 克隆一个项目和他的整个代码历史(版本信息)
     $ git clone [url]
     ```

## Git文件操作

> 文件四种状态

版本控制就是对文件的版本控制，要对文件进行修改，提交等操作，首先要直到文件当前在什么状态，不然可能会提交了现在还不想提交的文件，或者要提交的文件没有提交上

- **Untracked**: 未跟踪，此文件在文件夹中，但并没有加入到git库，不参与版本控制，通过**git add**状态变为**Staged**
- **Unmodify**: 文件已经入库，未修改，即本库中的文件快照内容与文件夹中完全一致，这种类型的文件有两种去处，如果它被修改，而变为Modified，如果使用**git rm**移出版本库，则称为**Untracked**文件
- **Modified**: 文件已修改，仅仅是修改，并没有进行其他的操作，这个文件也有两个去处，通过**git add**可进入暂存**staged**状态，使用**git checkout** 则丢弃修改过，返回到**unmodify**状态，这个git checkout即从库中取出文件，覆盖当前修改
- **Staged**: 暂存状态，执行**git commit**则将修改同步到库中，这时库中的文件和本地文件又变为一致，文件为**Unmodify**状态，执行**git reset HEAD filename**取消暂存，文件状态为**Modified**

> 查看文件状态

```bash
#查看指定文件状态
git status [fileName]
#查看所有文件状态
git status
# git add .     添加所有文件到暂存区
# git commit -m "消息内容"   提交暂存区中的内容到本地仓库   -m  [信息]
```

> 忽略文件

有些时候我们不想把某些文件纳入到版本控制中，比如数据库文件，临时文件，设计文件等

在主目录下建立.gitignore文件,此文件有以下规则:

1. 忽略文件中的空行或以#开始的行将会被忽略
2. 可以使用Linux通配符，比如*代表任意多个字符，?代表一个字符，[abc]代表可选字符范围，{string1,string....}代表可选的字符串等
3. 如果名称的最前面有一个感叹号，表示例外规则，将不被忽略
4. 如果名称的最前面是一个路径分隔符(/)，表示要忽略的文件在此目录下， 而子目录中的文件不忽略
5. 如果名称的最后面是一个路径分隔符(/)，表示要忽略的是此目录下该名称的子目录，而非文件(默认文件或目录都忽略)

```bash
# 注释
*.txt      #忽略所有.txt结尾的文件
!lib.txt   #但lib.txt除外
/temp      #仅忽略项目根目录下的TODO文件，不包括目录temp，就是除了temp都不上传
build/     #忽略build/目录下的所有文件
doc/*.txt  #会忽略doc/notes.txt但不包括doc/server/arch.txt
```

Gitlab搭建Git服务器

## 使用Github等

免密登录

- 进入用户目录的.ssh文件夹，如果没有可以用mkdir .shh 生成(即进入git bash后，输入mkdir ~/.ssh)

-  ```bash
   cd .ssh #进入.ssh目录
   ssh-keygen -t rsa #创建公钥
   ```

- Github/码云添加公钥

许可证：开源是否可转载，是否可商用

## Git分支

master主分支

dev开发用

v1.0版本分支

git分支中常用的命令

```bash
git branch #列出所有本地分支
git branch -r #列出所有远程分支
git branch [branch-name] #新建一个分支，依旧停留在原来的分支
git checkout -b [branch-name] #新建一个分支，并切换到当前分支
git checkout [branch-name] #切换到指定分支
git branch -d [branch-name] #删除分支
git merge [branch-name] #合并指定分支到当前分支
#删除远程分支
git push origin --delete [branch-name]
git branch -dr [remote/branch]
```

如果一个文件在合并分支是都被修改了则会引起冲突：解决的方法是可以修改冲突文件后重新提交，选择保留什么代码

**master主分支应该非常稳定，用来发布新版本，一般情况下不允许在上面工作，工作一般情况下在新建的dev分支上工作，工作完成后，比如要发布，或者说dev分支代码稳定后，可以合并到主分支master上**

## Git后续操作

[Git大全](https://gitee.com/all-about-git)

### 仓库

```
# 在当前目录新建一个Git代码库
$ git init

# 新建一个目录，将其初始化为Git代码库
$ git init [project-name]

# 下载一个项目和它的整个代码历史
$ git clone [url]
```

### 配置

```
# 显示当前的Git配置
$ git config --list

# 编辑Git配置文件
$ git config -e [--global]

# 设置提交代码时的用户信息
$ git config [--global] user.name "[name]"
$ git config [--global] user.email "[email address]"
```

### 增加/删除文件

```
# 添加指定文件到暂存区
$ git add [file1] [file2] ...

# 添加指定目录到暂存区，包括子目录
$ git add [dir]

# 添加当前目录的所有文件到暂存区
$ git add .

# 添加每个变化前，都会要求确认
# 对于同一个文件的多处变化，可以实现分次提交
$ git add -p

# 删除工作区文件，并且将这次删除放入暂存区
$ git rm [file1] [file2] ...

# 停止追踪指定文件，但该文件会保留在工作区
$ git rm --cached [file]

# 改名文件，并且将这个改名放入暂存区
$ git mv [file-original] [file-renamed]
```

### 代码提交

```
# 提交暂存区到仓库区
$ git commit -m [message]

# 提交暂存区的指定文件到仓库区
$ git commit [file1] [file2] ... -m [message]

# 提交工作区自上次commit之后的变化，直接到仓库区
$ git commit -a

# 提交时显示所有diff信息
$ git commit -v

# 使用一次新的commit，替代上一次提交
# 如果代码没有任何新变化，则用来改写上一次commit的提交信息
$ git commit --amend -m [message]

# 重做上一次commit，并包括指定文件的新变化
$ git commit --amend [file1] [file2] ...
```

### 分支

```
# 列出所有本地分支
$ git branch

# 列出所有远程分支
$ git branch -r

# 列出所有本地分支和远程分支
$ git branch -a

# 新建一个分支，但依然停留在当前分支
$ git branch [branch-name]

# 新建一个分支，并切换到该分支
$ git checkout -b [branch]

# 新建一个分支，指向指定commit
$ git branch [branch] [commit]

# 新建一个分支，与指定的远程分支建立追踪关系
$ git branch --track [branch] [remote-branch]

# 切换到指定分支，并更新工作区
$ git checkout [branch-name]

# 切换到上一个分支
$ git checkout -

# 建立追踪关系，在现有分支与指定的远程分支之间
$ git branch --set-upstream [branch] [remote-branch]

# 合并指定分支到当前分支
$ git merge [branch]

# 选择一个commit，合并进当前分支
$ git cherry-pick [commit]

# 删除分支
$ git branch -d [branch-name]

# 删除远程分支
$ git push origin --delete [branch-name]
$ git branch -dr [remote/branch]
```

### 标签

```
# 列出所有tag
$ git tag

# 新建一个tag在当前commit
$ git tag [tag]

# 新建一个tag在指定commit
$ git tag [tag] [commit]

# 删除本地tag
$ git tag -d [tag]

# 删除远程tag
$ git push origin :refs/tags/[tagName]

# 查看tag信息
$ git show [tag]

# 提交指定tag
$ git push [remote] [tag]

# 提交所有tag
$ git push [remote] --tags

# 新建一个分支，指向某个tag
$ git checkout -b [branch] [tag]
```

### 查看信息

```
# 显示有变更的文件
$ git status

# 显示当前分支的版本历史
$ git log

# 显示commit历史，以及每次commit发生变更的文件
$ git log --stat

# 搜索提交历史，根据关键词
$ git log -S [keyword]

# 显示某个commit之后的所有变动，每个commit占据一行
$ git log [tag] HEAD --pretty=format:%s

# 显示某个commit之后的所有变动，其"提交说明"必须符合搜索条件
$ git log [tag] HEAD --grep feature

# 显示某个文件的版本历史，包括文件改名
$ git log --follow [file]
$ git whatchanged [file]

# 显示指定文件相关的每一次diff
$ git log -p [file]

# 显示过去5次提交
$ git log -5 --pretty --oneline

# 显示所有提交过的用户，按提交次数排序
$ git shortlog -sn

# 显示指定文件是什么人在什么时间修改过
$ git blame [file]

# 显示暂存区和工作区的差异
$ git diff

# 显示暂存区和上一个commit的差异
$ git diff --cached [file]

# 显示工作区与当前分支最新commit之间的差异
$ git diff HEAD

# 显示两次提交之间的差异
$ git diff [first-branch]...[second-branch]

# 显示今天你写了多少行代码
$ git diff --shortstat "@{0 day ago}"

# 显示某次提交的元数据和内容变化
$ git show [commit]

# 显示某次提交发生变化的文件
$ git show --name-only [commit]

# 显示某次提交时，某个文件的内容
$ git show [commit]:[filename]

# 显示当前分支的最近几次提交
$ git reflog
```

### 远程同步



```
# 下载远程仓库的所有变动
$ git fetch [remote]

# 显示所有远程仓库
$ git remote -v

# 显示某个远程仓库的信息
$ git remote show [remote]

# 增加一个新的远程仓库，并命名
$ git remote add [shortname] [url]

# 取回远程仓库的变化，并与本地分支合并
$ git pull [remote] [branch]

# 上传本地指定分支到远程仓库
$ git push [remote] [branch]

# 强行推送当前分支到远程仓库，即使有冲突
$ git push [remote] --force

# 推送所有分支到远程仓库
$ git push [remote] --all
```

### 撤销

```
# 恢复暂存区的指定文件到工作区
$ git checkout [file]

# 恢复某个commit的指定文件到暂存区和工作区
$ git checkout [commit] [file]

# 恢复暂存区的所有文件到工作区
$ git checkout .

# 重置暂存区的指定文件，与上一次commit保持一致，但工作区不变
$ git reset [file]

# 重置暂存区与工作区，与上一次commit保持一致
$ git reset --hard

# 重置当前分支的指针为指定commit，同时重置暂存区，但工作区不变
$ git reset [commit]

# 重置当前分支的HEAD为指定commit，同时重置暂存区和工作区，与指定commit一致
$ git reset --hard [commit]

# 重置当前HEAD为指定commit，但保持暂存区和工作区不变
$ git reset --keep [commit]

# 新建一个commit，用来撤销指定commit
# 后者的所有变化都将被前者抵消，并且应用到当前分支
$ git revert [commit]

暂时将未提交的变化移除，稍后再移入
$ git stash
$ git stash pop
```

### 其他

```
# 生成一个可供发布的压缩包
$ git archive
```

[Git命令学习](https://oschina.gitee.io/learn-git-branching/)

# ActiveMQ

## MQ简介

- MQ(Message Queue) 即消息中间件，消息队列
- JMS - Java Message Service

# 学习资料

### Video

- [计算机科学速成课](https://www.bilibili.com/video/av21376839/)

# 相关软件下载链接

## OpenJDK

- [OpenJDK](http://jdk.java.net/archive)
- [apt-get安装](http://openjdk.java.net/install/#:~:text=Oracle%27s%20OpenJDK%20JDK%20binaries%20for%20Windows%2C%20macOS%2C%20and,the%20command%20line%20using%20%24%20tar%20xvf%20openjdk-13%2A_bin.tar.gz)

# 编程及安装软件相关问题及教程

Oracle数据库和PLSql

[Oracle数据库安装](https://zhuanlan.zhihu.com/p/152206091)

[PLSql连接Oracle数据库及PLSql激活安装](https://zhuanlan.zhihu.com/p/152228026)

[XShell学生版安装](https://www.netsarang.com/zh/free-for-home-school/)

maven validate，compile，deploy，clean，build，install，deploy区别
validate： - 验证项目是正确的，所有必要的信息都是可用的
compile： - compile the source code of the project
test： - 使用合适的测试编译的源代码单元测试框架。这些测试不应该要求将代码打包或部署
包： - 获取已编译的代码并将其打包为其可分发格式，例如 JAR。
验证：- 对集成测试的结果进行任何检查，以确保满足质量标准
安装：- 将包安装到本地存储库中，用作其他项目的依赖项在本地
部署 - 在构建环境中完成，将最终包复制到远程存储库以与其他开发人员和项目共享
maven validate，compile，deploy，clean，build，install，deploy区别
validate： - validate the project is correct and all necessary information is available
compile： - compile the source code of the project
test： - test the compiled source code using a suitable unit testing framework. These tests should not require the code be packaged or deployed
package: - take the compiled code and package it in its distributable format, such as a JAR.
verify: - run any checks on results of integration tests to ensure quality criteria are met
install: - install the package into the local repository, for use as a dependency in other projects locally
deploy - done in the build environment, copies the final package to the remote repository for sharing with other developers and projects

Ctrl+N按名字搜索类
　　相当于eclipse的ctrl+shift+R；
　　输入类名可以定位到这个类文件；
　　甚至不是自己写的类也能搜索；
　　如果能匹配的自己写的类，优先匹配自己写的类；

1
2
3
4
5
Ctrl+Shift+N按文件名搜索文件
Ctrl+H查看类的继承关系
　　例如HashMap的父类是AbstractMap，子类则有一大堆
1
Ctrl+Alt+B查看子类方法实现
　　Ctrl+B可以查看父类或父方法定义；
　　ctrl+鼠标左键也可以查看父类或父方法定义；
　　但是Ctrl+Alt+B就可以查看具体的方法。

1
2
3
4
Alt+F7查找类或方法在哪被使用
   相当于eclipse的ctrl+shif+H；
1
Ctrl+F/Ctrl+Shift+F按照文本的内容查找
    相当于eclipse的ctrl+H；
    Ctrl+F是在本页查找；
　   Ctrl+Shift+F是全局查找；
1
2
3
Shift+Shift搜索任何东西
shift+shift非常强大，可搜索类、资源、配置项、方法等，还能搜索路径。
其中搜索路径非常实用，
例如你写了一个功能叫hello，在java，js，css，jsp中都有hello的文件夹，
那我们可以搜索"hello/"找到路径中包含hello的文件夹。



cat + log名，查看log





[Workbench查看ER即实体结构图](https://blog.csdn.net/calm_encode/article/details/114584644)



# 网络传输相关知识

**三次握手**

客户端发一个包

客户端返回确认包

客户端再次发送确认包

**四次挥手**

客户端发送包告诉服务器需要关闭连接

服务端发送确认包，告诉客户端等待

服务端准备关闭连接，发送FIN标记包

客户端收到FIN包，发送确认包，服务端收到确认包关闭连接，客户端等待固定时间后没收到服务端发送的包，自己也关闭连接

Https加密通信过程

客户端信任服务端证书，并和服务端确认双方加密算法，

客户端生成随机数，通过证书约定的非对称加密算法进行加密，加密的随机数密钥和所有的通信信息获取hash值，加密后发送给服务端

服务端收到随机数密钥和加密签名，使用私钥将加密的随机数解密，根据获得的随机数解密获取hash值，验证hash值

成功之后，服务器将通信信息加密后发送给客户端

客户端解密，验证

上述任何一个过程失败，建立安全连接失败

Android 四大组件

**activity、service、content provider、broadcast receiver** 。

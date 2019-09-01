### Spring Aop

#### 切入点表达式

```java
execution
// 被代理对象实现或集成接口或类
target
// 匹配类或子类
within
// 匹配当前切面类对象实现了接口
this
// 匹配传入参数
args
// 匹配 bean 的名称或 id
bean

// 带@ 匹配注解
// 匹配方法上是否有注解
@annotation
// 匹配 参数中是否有注解
@args
// 匹配对象类上是否有注解
@target
```



- 匹配语法

```txt
* 匹配任何数量字符
 
.. 匹配任意数量字符，包名和方法参数中
 
+ 匹配指定类型的子类型；仅能作为后缀放在类型模式后边。

java.lang.String   匹配String类型；

java.*.String   匹配java包下的任何“一级子包”下的String类型；如匹配java.lang.String，但不匹配java.lang.ss.String。

java..*   匹配java包及任何子包下的任何类型；如匹配java.lang.String、java.lang.annotation.Annotation。

java.lang.*ing   匹配任何java.lang包下的以ing结尾的类型；

java.lang.Number+   匹配java.lang包下的任何Number的自类型；如匹配java.lang.Integer，也匹配java.math.BigInteger。
```

- 逻辑运算符

```txt
&&
||
!
```



- execution

> execution(注解 修饰符 返回值 全限定类名.方法名(方法参数))

```java
@Pointcut("execution(@com.fly.aop.aop.annotation.AopAnnotation public * com.fly..*.*(..)))")
```

```java
@Pointcut("execution(@(com.fly.aop.aop.annotation.AopAnnotation || io.swagger.annotations.ApiOperation) public * com.fly..*.*(..)))")
```


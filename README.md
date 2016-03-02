# 海浪Android编码规范


## 变量声明


* 每次只声明一个变量

> 不要使用组合声明，比如 `int a, b;`。

* 需要时才声明，并尽快进行初始化

> 不要在一个代码块的开头把局部变量一次性都声明了(这是c语言的做法)，而是在第一次需要使用它时才声明。局部变量    在声明时最好就进行初始化，或者声明后尽快进行初始化。

* 数组初始化：可写成块状结构

> 数组初始化可以写成块状结构，比如，下面的写法都是OK的
```
new int[] {
  0, 1, 2, 3
}


new int[] {
  0,
  1,
  2,
  3
}

new int[] {
  0, 1,
  2, 3
}

new int[]
    {0, 1, 2, 3}
```

* 非C风格的数组声明

>中括号是类型的一部分：String[] args， 而非String args[]。

## switch语句

* Fall-through：注释

> 在一个switch块内，每个语句组要么通过`break`, `continue`, `return`或抛出异常来终止，要么通过一条注释来说明程序将继续执行到下一个语句组， 任何能表达这个意思的注释都是OK的(典型的是用// fall through)。这个特殊的注释并不需要在最后一个语句组(一般是`default`)中出现。示例：

```
switch (input) {
  case 1:
  case 2:
    prepareOneOrTwo();
    // fall through
  case 3:
    handleOneTwoOrThree();
    break;
  default:
    handleLargeNumber(input);
}
```
* default的情况要写出来

> 每个switch语句都包含一个default语句组，即使它什么代码也不包含。

## 命名约定

* 包名

> 包名全部小写， 连续的单词只是简单地连接起来，不使用下划线

* 类名

> 类名都以 `UpperCamelCase` 风格编写。
类名通常是名词或名词短语，接口名称有时可能是形容词或形容词短语。现在还没有特定的规则或行之有效的约定来命名注解类型。
测试类的命名以它要测试的类的名称开始，以 `Test` 结束。例如， `HashTest` 或 `HashIntegrationTest`。


* lowerCamelCase

> 方法名、非常量字段名、参数名、局部变量名都以 `lowerCamelCase` 风格编写。

* 常量名

> 常量名命名模式为 `CONSTANT_CASE` ，全部字母大写，用下划线分隔单词。那，到底什么算是一个常量？

> 每个常量都是一个静态final字段，但不是所有静态final字段都是常量。在决定一个字段是否是一个常量时， 考虑它是否真的感觉像是一个常量。例如，如果任何一个该实例的观测状态是可变的，则它几乎肯定不会是一个常量。 只是永远不打算改变对象一般是不够的，它要真的一直不变才能将它示为常量。

```
// Constants
static final int NUMBER = 5;
static final ImmutableList<String> NAMES = ImmutableList.of("Ed", "Ann");
static final Joiner COMMA_JOINER = Joiner.on(',');  // because Joiner is immutable
static final SomeMutableType[] EMPTY_ARRAY = {};
enum SomeEnum { ENUM_CONSTANT }

// Not constants
static String nonFinal = "non-final";
final String nonStatic = "non-static";
static final Set<String> mutableCollection = new HashSet<String>();
static final ImmutableSet<SomeMutableType> mutableElements = ImmutableSet.of(mutable);
static final Logger logger = Logger.getLogger(MyClass.getName());
static final String[] nonEmptyArray = {"these", "can", "change"};
```

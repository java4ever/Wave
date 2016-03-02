# 海浪Android编码规范


## 变量声明


* 每次只声明一个变量

 > 不要使用组合声明，比如 `int a, b;`。

* 需要时才声明，并尽快进行初始化``
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

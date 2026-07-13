# 从 JavaScript 到 Java：语法差异与学习路线汇总

本文根据当前目录下的两个 PDF 文件《java与javaScript 语法的区别》和《从 Java 到 JavaScript》整理而成，但学习视角已经调整为：**【核心】你已经学过 JavaScript，现在正在学习 Java**。

> 强调说明：**【核心】** 表示核心结论，**【易错】** 表示易错点，**【建议】** 表示学习建议，**【类比】** 表示类比理解。

JavaScript 和 Java 名字相似，语法上也都能看到 C 系语言的影子，比如花括号、分号、`if/else`、`for`、`while`、`switch`、`break` 等。但二者的编程思维差异很大。JavaScript 更灵活，变量可以随时绑定不同类型的值，函数可以独立存在，对象可以直接用字面量创建；Java 更严格，更强调类型、类、对象、访问权限、编译检查和工程结构。

如果你已经会 JavaScript，学习 Java 时最重要的变化是：**【核心】从“灵活运行”切换到“先定义清楚，再编译运行”**。

## 1. 先建立整体印象

JavaScript 常见运行环境是浏览器和 Node.js。你写一个 `.js` 文件，可以直接让浏览器或 Node.js 执行。Java 则通常先写 `.java` 源文件，编译成 `.class` 字节码，再由 JVM 运行。

| 维度 | JavaScript | Java |
| --- | --- | --- |
| 类型系统 | 动态类型、弱类型 | 静态类型、强类型 |
| 运行方式 | 解释或即时编译执行 | 先编译，再由 JVM 执行 |
| 组织方式 | 函数、对象、模块都很常见 | 类是基本组织单位 |
| 变量声明 | `let`、`const`、`var` | 必须写清楚类型 |
| 对象模型 | 对象、原型、`class` 语法糖 | 真正以类和对象为核心 |
| 典型用途 | 前端、Node.js、全栈 | 后端、Android、桌面、企业应用 |

**【类比】可以把 Java 理解成一个规则更明确的世界**：你需要提前告诉编译器变量是什么类型、方法接收什么参数、返回什么结果、哪些成员可以被外部访问。刚开始会觉得啰嗦，但好处是 **【核心】错误更早暴露，项目变大后也更容易维护**。

## 2. 第一个 Java 程序：从脚本到类

在 JavaScript 中，你可以直接写：

```javascript
console.log("Hello World");
```

Java 里不能把语句随便放在文件顶层，代码通常要写在类中，并从 `main` 方法开始运行：

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

这里先记住几个关键词：

| Java 写法 | 暂时可以这样理解 |
| --- | --- |
| `public class HelloWorld` | 定义一个公开的类，类名是 `HelloWorld` |
| `main` | Java 程序的入口方法 |
| `String[] args` | 命令行参数，先知道它是固定写法即可 |
| `System.out.println` | 类似 JavaScript 的 `console.log` |

对 JavaScript 学习者来说，这段代码最不习惯的地方是“为什么打印一句话要包这么多层”。答案是：**【核心】Java 的基本单位是类，程序入口也必须是类里的方法**。

## 3. 变量声明：从 `let/const` 到明确类型

JavaScript 中变量声明看重“能不能重新赋值”：

```javascript
let count = 1;
const name = "Tom";
```

Java 中变量声明看重“这个变量是什么类型”：

```java
int count = 1;
String name = "Tom";
final double PI = 3.14;
```

对照记忆：

| JavaScript | Java | 说明 |
| --- | --- | --- |
| `let count = 1` | `int count = 1` | Java 要写明 `int` |
| `const name = "Tom"` | `final String name = "Tom"` | Java 中 `final` 表示不能重新赋值 |
| `let price = 9.9` | `double price = 9.9` | Java 区分整数和小数类型 |

Java 的变量一旦声明为某种类型，就不能随便换成另一种类型：

```java
int age = 18;
// age = "18"; // 错误：int 变量不能存字符串
```

这和 JavaScript 很不一样：

```javascript
let age = 18;
age = "18"; // JavaScript 允许，但 Java 不允许
```

**【建议】学习 Java 时要养成一个习惯**：每次写变量前先问自己，**【核心】这个值到底是什么类型**。

## 4. 数据类型：Java 比 JavaScript 分得更细

JavaScript 里常见原始类型包括 `number`、`string`、`boolean`、`undefined`、`null`、`symbol`、`bigint`。普通数字大多都用 `number`。

Java 中基本类型分得更细：

| Java 类型 | 含义 | 类比 JavaScript |
| --- | --- | --- |
| `byte` | 很小的整数 | 较少初学使用 |
| `short` | 短整数 | 较少初学使用 |
| `int` | 常用整数 | `number` 的整数场景 |
| `long` | 更大的整数 | 类似大整数场景 |
| `float` | 单精度小数 | 小数 |
| `double` | 双精度小数，常用 | `number` 的小数场景 |
| `char` | 单个字符 | JS 没有单独 `char` 类型 |
| `boolean` | `true` / `false` | `boolean` |

Java 还有引用类型，比如 `String`、数组、类对象、集合等。注意 Java 的字符串类型是 `String`，首字母大写，因为它是一个类：

```java
String message = "hello";
```

和 JavaScript 不同，Java 中基本类型和引用类型有明显区别。初学时可以先这样理解：

- `int`、`double`、`boolean` 这类是简单值。
- `String`、数组、对象、集合这类更像“有方法、有结构的东西”。

## 5. `undefined` 与 `null`：Java 没有 `undefined`

JavaScript 中有两个容易混淆的空值：

```javascript
let a;
console.log(a); // undefined

const b = null;
```

Java 中没有 `undefined`。变量必须先声明，局部变量还必须明确赋值后才能使用：

```java
int age;
// System.out.println(age); // 错误：局部变量没有初始化

String name = null;
```

Java 的 `null` 表示 **【核心】引用类型当前没有指向对象**。比如：

```java
String name = null;
```

**【易错】如果你对 `null` 调用方法，就会出现常见的 `NullPointerException`**：

```java
String name = null;
// System.out.println(name.length()); // 运行时报错
```

对 JS 学习者来说，可以把 Java 的 `null` 理解成 **【类比】“这个对象引用目前是空的”**，但 **【易错】Java 不存在“变量声明了却自动是 `undefined`”这种值**。

## 6. 类型转换：Java 不会像 JavaScript 那样自动乱转

JavaScript 中经常发生隐式类型转换：

```javascript
"5" + 3;     // "53"
"5" - 3;     // 2
false == 0;  // true
```

Java 更严格。字符串和数字不会随意混算：

```java
String s = "5";
int n = 3;

System.out.println(s + n); // "53"，这里是字符串拼接
// int result = s - n;     // 错误：字符串不能直接做减法
```

如果要把字符串转成数字，需要显式转换：

```java
int value = Integer.parseInt("123");
double price = Double.parseDouble("9.99");
```

从 JavaScript 转 Java 时，请特别记住：**【核心】Java 编译器会阻止很多“不清不楚”的操作**。你需要把转换写明白。

## 7. 运算符：相似但比较规则不同

Java 和 JavaScript 都有 `+`、`-`、`*`、`/`、`%`、`++`、`--`、`&&`、`||`、`!`、`?:` 等运算符。

但比较时要注意：

JavaScript 推荐使用 `===`：

```javascript
1 === "1"; // false
```

Java 没有 `===`，基本类型用 `==` 比较值：

```java
int a = 1;
int b = 1;
System.out.println(a == b); // true
```

**【易错】但 Java 中比较字符串内容不能用 `==`，要用 `.equals()`**：

```java
String s1 = new String("hello");
String s2 = new String("hello");

System.out.println(s1 == s2);      // false，比较是否同一个对象
System.out.println(s1.equals(s2)); // true，比较内容
```

**【核心】这对 JavaScript 学习者非常重要**。可以这样记：

- **【核心】Java 基本类型比较值，用 `==`。**
- **【核心】Java 引用类型的内容比较，通常用 `.equals()`。**
- **【易错】Java 的 `==` 用在对象上时，比较的是“是不是同一个对象”。**

## 8. 流程控制：语法很像，上手最快

Java 的 `if`、`for`、`while`、`switch` 和 JavaScript 很相似。

JavaScript：

```javascript
for (let i = 0; i < 3; i++) {
  console.log(i);
}
```

Java：

```java
for (int i = 0; i < 3; i++) {
    System.out.println(i);
}
```

主要差异是 Java 的循环变量要写类型，比如 `int i`。另外 **【易错】Java 的条件表达式必须是 `boolean`**，不像 JavaScript 那样可以把 `0`、`""`、`null` 自动当成假值：

```java
int count = 0;
// if (count) { } // 错误：Java 条件必须是 boolean

if (count > 0) {
    System.out.println("has count");
}
```

在 JavaScript 中你可能习惯：

```javascript
if (count) {
  console.log("has count");
}
```

在 Java 中要写成 **【核心】明确的判断**。

## 9. 数组：Java 数组固定长度、固定类型

JavaScript 数组非常灵活：

```javascript
const arr = [1, "hello", true];
arr.push({ name: "Tom" });
```

Java 数组更严格：

```java
int[] nums = {1, 2, 3};
String[] names = {"Tom", "Jerry"};
```

**【核心】Java 数组有两个特点**：

- **【核心】长度创建后固定。**
- **【核心】一个数组只能存同一种类型。**

```java
int[] nums = new int[3];
nums[0] = 10;
nums[1] = 20;
nums[2] = 30;
// nums[3] = 40; // 错误：数组越界
```

如果你想要类似 JavaScript 数组那种可变长度容器，**【建议】Java 常用 `ArrayList`**：

```java
import java.util.ArrayList;

ArrayList<String> names = new ArrayList<>();
names.add("Tom");
names.add("Jerry");
System.out.println(names.get(0));
```

可以简单类比：

| JavaScript | Java |
| --- | --- |
| `arr.push(x)` | `list.add(x)` |
| `arr[0]` | `array[0]` 或 `list.get(0)` |
| `arr.length` | `array.length` |
| `arr.length` | `list.size()` |

**【易错】注意：Java 数组用 `.length`，`ArrayList` 用 `.size()`。**

## 10. 函数与方法：Java 更强调“方法属于类”

JavaScript 中函数可以独立存在：

```javascript
function add(a, b) {
  return a + b;
}

const multiply = (a, b) => a * b;
```

Java 中通常叫“方法”，**【核心】方法要写在类里面，并且要声明参数类型和返回值类型**：

```java
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}
```

这里的 `int` 出现了三次：

- 第一个 `int`：方法返回一个整数。
- `int a`：参数 `a` 是整数。
- `int b`：参数 `b` 是整数。

如果方法没有返回值，使用 **【核心】`void`**：

```java
public void sayHello() {
    System.out.println("Hello");
}
```

**【核心】Java 支持方法重载**，也就是同一个方法名可以根据参数不同写多份：

```java
public int add(int a, int b) {
    return a + b;
}

public double add(double a, double b) {
    return a + b;
}
```

**【类比】JavaScript 没有这种传统意义上的函数重载，通常用默认参数、剩余参数或手动判断参数。**

## 11. 类与对象：Java 的核心知识

JavaScript 中你可能经常直接写对象字面量：

```javascript
const user = {
  name: "Tom",
  age: 18,
  sayHi() {
    console.log(this.name);
  }
};
```

Java 中更常见的方式是 **【核心】先定义类，再创建对象**：

```java
public class User {
    String name;
    int age;

    public void sayHi() {
        System.out.println(name);
    }
}
```

使用对象：

```java
User user = new User();
user.name = "Tom";
user.age = 18;
user.sayHi();
```

可以这样类比：

| JavaScript | Java |
| --- | --- |
| 对象字面量 `{}` | 对象实例 |
| `class User {}` | `class User {}` |
| `new User()` | `new User()` |
| 属性 | 字段/成员变量 |
| 方法 | 方法 |

虽然 JavaScript 也有 `class`，但它底层仍和原型有关。**【核心】Java 的类是语言的核心组织方式，不只是语法糖。****【建议】学习 Java 时，类、对象、构造方法、封装、继承、多态是主线。**

## 12. 构造方法：创建对象时初始化数据

JavaScript 中构造函数或 `class constructor` 可能是这样的：

```javascript
class User {
  constructor(name, age) {
    this.name = name;
    this.age = age;
  }
}
```

Java 中构造方法写法如下：

```java
public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

创建对象：

```java
User user = new User("Tom", 18);
```

**【核心】构造方法的特点**：

- **【核心】名字必须和类名一样。**
- **【易错】没有返回值类型，连 `void` 也不写。**
- **【核心】常用于初始化对象字段。**

## 13. `this`：Java 里比 JavaScript 简单

JavaScript 中 `this` 会随着调用方式变化，比如对象调用、普通函数调用、`bind`、箭头函数等都会影响它。

Java 的 `this` 简单很多：**【核心】它指向当前对象实例**。

```java
public class User {
    String name;

    public User(String name) {
        this.name = name;
    }
}
```

这里 `this.name` 表示当前对象的字段，右边的 `name` 是构造方法参数。**【核心】它们同名时，用 `this` 区分。**

你可以记住：**【建议】Java 中不需要像 JavaScript 那样担心 `this` 因为调用方式不同而丢失。**

## 14. 访问修饰符：Java 的“权限系统”

JavaScript 初学阶段常常不会特别强调访问权限，很多属性直接挂在对象上就能访问。**【核心】Java 更强调封装，所以有访问修饰符**：

| 修饰符 | 含义 |
| --- | --- |
| `public` | 哪里都可以访问 |
| `private` | 只能在当前类内部访问 |
| `protected` | 当前类、同包、子类可访问 |
| 默认不写 | 同一个包内可访问 |

常见写法是 **【核心】字段用 `private`，再通过 getter/setter 控制访问**：

```java
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```

**【类比】这类似于 JavaScript 中你不希望外部随便改对象内部状态，于是通过方法来读写**，只是 Java 把这种封装变成了更正式的语言机制。

## 15. 字符串：Java 中内容比较用 `.equals()`

JavaScript 中：

```javascript
"hello" === "hello"; // true
```

Java 中字符串是对象。**【易错】判断字符串内容是否相同，使用 `.equals()`**：

```java
String a = "hello";
String b = "hello";

System.out.println(a.equals(b)); // true
```

**【易错】不要养成用 `==` 比较字符串内容的习惯。**`==` 在引用类型上比较的是两个变量是否指向同一个对象。

## 16. 集合：从 JS 数组过渡到 Java 集合框架

JavaScript 的数组很万能，既能当列表，也能配合对象实现很多结构。**【核心】Java 会把不同数据结构分得更清楚**：

| 需求 | Java 常用类型 |
| --- | --- |
| 可变长度列表 | `ArrayList` |
| 不重复集合 | `HashSet` |
| 键值对 | `HashMap` |

`HashMap` 类似 JavaScript 的对象或 `Map`：

```java
import java.util.HashMap;

HashMap<String, Integer> scores = new HashMap<>();
scores.put("Tom", 90);
scores.put("Jerry", 85);

System.out.println(scores.get("Tom"));
```

尖括号里的 `<String, Integer>` 叫泛型，表示 key 是 `String`，value 是 `Integer`。**【核心】这能让编译器提前检查类型错误。**

## 17. JSON 与对象：Java 需要库，JavaScript 更天然

JavaScript 里 JSON 操作非常直接：

```javascript
const text = JSON.stringify({ name: "Tom" });
const obj = JSON.parse(text);
```

**【类比】Java 标准库没有像 JavaScript 那样直接把 JSON 当作语言的一部分。**实际项目里通常使用 Jackson、Gson 等库来完成 JSON 和 Java 对象之间的转换。

这也体现了二者定位差异：

- JavaScript 与 Web、JSON 天然贴近。
- Java 更强调类模型、类型模型和工程结构。

## 18. 异常处理：Java 更正式

JavaScript 中：

```javascript
try {
  throw new Error("Something went wrong");
} catch (error) {
  console.error(error.message);
}
```

Java 中也有 `try/catch/finally`：

```java
try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println(e.getMessage());
} finally {
    System.out.println("always runs");
}
```

**【核心】Java 的异常体系更正式**，有些异常还要求你必须处理或声明抛出。初学阶段先掌握：

- `try`：放可能出错的代码。
- `catch`：捕获并处理异常。
- `finally`：无论是否出错都会执行。
- `throw`：主动抛出异常。
- `throws`：声明方法可能抛出异常。

## 19. 给 JavaScript 学习者的 Java 学习路线

如果你已经会 JavaScript，**【建议】学习 Java 可以按这条路线走**：

1. **【建议】先熟悉 Java 程序结构**：类、`main` 方法、编译运行、包名。
2. 掌握基本类型、变量声明、类型转换和运算符。
3. 用 Java 写熟 `if`、`for`、`while`、`switch`，**【易错】注意条件必须是 `boolean`**。
4. 学数组，再学 `ArrayList`，把它和 JavaScript 数组做对照。
5. **【核心】重点学习类和对象**：字段、方法、构造方法、`this`。
6. 学封装：`private`、`public`、getter、setter。
7. **【核心】学继承、多态和接口，这是 Java 面向对象的核心。**
8. 学集合框架：`ArrayList`、`HashSet`、`HashMap`。
9. 学异常处理、文件操作、常用 API。
10. 如果以后做后端，再继续学 JDBC、Maven、Spring Boot。

## 20. 常见思维转换

从 JavaScript 转向 Java，**【核心】最重要的不是背更多语法，而是切换思维方式**：

| JavaScript 习惯 | Java 中的新习惯 |
| --- | --- |
| 变量很灵活 | **【核心】变量类型要明确** |
| 对象可以随手创建 | **【核心】通常先定义类** |
| 数组能混合类型 | **【核心】数组/集合通常固定元素类型** |
| `if (value)` 判断真假值 | **【易错】条件必须明确是 `boolean`** |
| 函数可独立存在 | **【核心】方法通常属于类** |
| `this` 容易变 | **【建议】`this` 指向当前对象** |
| JSON 很自然 | Java 对象和 JSON 通常靠库转换 |
| 运行时才发现很多问题 | 编译期会提前拦住很多问题 |

## 总结

JavaScript 的优势是灵活、表达简洁、贴近 Web；**【核心】Java 的优势是类型明确、结构稳定、适合大型工程**。你已经学过 JavaScript，所以很多基础语法不会陌生，比如条件、循环、函数调用、对象概念。但学习 Java 时要特别适应它的“规则感”：**【核心】类型要写清楚，代码要放进类里，对象要由类创建，访问权限要设计好**，很多错误会在编译阶段就被指出。

可以把 Java 看作一次 **【核心】从“灵活脚本思维”到“严谨工程思维”的训练**。刚开始它会显得啰嗦，但当项目变大、文件变多、多人协作时，这些规则会变成很有价值的保护。

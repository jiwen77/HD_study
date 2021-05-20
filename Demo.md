# Base

## Demo_01

```java
package com.wen.base;

public class Demo01 {
    public static void main(String[] args) {
        String Ahello = "101.76.193.1";
        String hello = "有事就找小网管儿";
        String $hello = "小网管儿qq：";
        String _hello = "3552660852";
        String 有事就找="小网管儿";

        System.out.println(Ahello);
        System.out.println(hello);
        System.out.println($hello);
        System.out.println(_hello);
        System.out.println(有事就找);
    }
}

```



## Demo_02

1. **基本数据类型**

**整数类型：**

**byte**占1个字节范围：-128~127

**short**占2个字节范围：-32768~32767

**int**占4个字节范围：...

**long**占8个字节范围：...



**浮点类型**

**float**占4个字节

**double**占8个字节



**Boolean类型**

占1位其值只有true和false两个



2. **引用数据类型**

**类**

**接口**

**数组**



```java
package com.wen.base;

public class Demo02 {
    public static void main(String[] args) {
        //八大数据类型

        //整数
        int num1 = 10;
        byte num2 = 20;
        short num3 = 30;
        long num4 = 30L;        //Long类型要在数字后面加个L

        //小数：浮点数
        float num5 = 50.1F;     //float类型要在数字后面加个F
        double  num6 = 3.14159265358979;

        //字符
        char name = '网';

        //字符串，String不是关键字，类
        String namea = "小网管儿";

        //布尔值：true/false
        boolean flag = true;
        //boolean flag = false;

    }
}

```



## Demo_03

```java
package com.wen.base;

public class Demo03 {
    public static void main(String[] args) {
        //整数拓展：    进制：   二进制0b   十进制     二进制0   十六进制0x
        int i = 10;
        int i2 = 010;   //八进制
        int i3 = 0x10;

        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println("==================================================");

    }
}
```



## Demo_04

转义字符
\u 转译，将unicode编码转为相应的字符
\t 制表，相当于tab
\n 换行，相当于Enter



```java
package com.wen.base;

public class Demo04 {
    public static void main(String[] args) {

        //float     有限  离散  舍入误差    大约  接近但不等于
        float f = 0.1f; //0.1
        double d = 1.0/10;  //0.1

        System.out.println(f==d);   //false

        float d1 = 231231231231f;
        float d2 = d1 + 1;

        System.out.println(d1==d2);     //true

        char c1 = 'a';
        char c2 = '网';

        System.out.println(c1);
        System.out.println((int)c1);        //强制转换
        System.out.println(c2);
        System.out.println((int)c2);        //强制转换

        //所有的字符本质还是数字
        //编码    Unicode表：（97 = a    65 = A)  2字节   0 - 65536

        char c3 = '\u0061' ;        //十六进制0061对应字符a
        System.out.println(c3);
    }

    }

```



## Demo_05

低	-------------------------------------------------------->	高

byte , short , char -> int -> long -> float -> double

**强制转换：	**（类型）变量名	高 -> 低

**自动转换：	**							   低 -> 高



注意点：

1. 不能对布尔值进行转换
2. 不能吧对象类型转换为不相干的类型
3. 在把高容量转换到低容量时，强制转换
4. 转换的时候可能存在内存溢出，精度问题

```java
package com.wen.base;

public class Demo05 {
    public static void main(String[] args) {
        int i = 128;
        byte b = (byte)i;       //高转低，需要强制转换        内存溢出      byte类型：-128 - 127
        double c = i;           //低转高，不需要强制转换

        System.out.println(i);
        System.out.println(b);
        System.out.println(c);


        System.out.println("=====================");
        System.out.println((int)23.7);          //23.7为double
        System.out.println((int)-45.89f);       //-45.89为float

        System.out.println("=====================");
        char d = 'a';
        int e = d+1;
        System.out.println(e);
        System.out.println((char)e);
    }
}

```



## Demo_06

```java
package com.wen.base;

public class Demo06 {
    public static void main(String[] args) {
        //操作数比较大的数的时候，注意溢出问题
        //JDK新特性，数字之间可以用下划线分割
        int money = 10_0000_0000;
        int years = 20;
        int total = money*years;    //-1474836480,计算时溢出了
        long total2 = money*years;  //默认是int，转换之前已经溢出了
        long total3 = money*((long)years);  //先把其中一个数转换为long再计算

        System.out.println(total);
        System.out.println(total2);
        System.out.println(total3);

    }
}

```



## Demo_07

```java
package com.wen.base;

public class Demo07 {
    public static void main(String[] args) {
        //int a,b,c;        尽量不要这样写，为了程序的可读性，尽量每个变量分行定义
        int a = 1;
        int b = 2;
        int c = 3;
        String name = "小网管儿";
        char x = 'X';
        double pi = 3.14;
    }
}

```



## Demo_08

变量命名规范：

1. 类成员变量：首字母小写和驼峰原则；
2. 局部变量：首字母小写和驼峰原则
3. 常量：大写字母和下划线
4. 类名：首字母大写和驼峰原则
5. 方法名：首字母小写和驼峰原则

```java
package com.wen.base;

public class Demo08 {
    //类变量   static
    static  double salary = 2500;

    //属性：变量

    //实例变量：从属于对象；如果不自行初始化，这个类型的默认值是0    0.0
    //布尔值默认false
    String name;
    int age;

    //main方法
    public static void main(String[] args) {
        //局部变量：必须声明和初始化值
        int i = 10;
        System.out.println(i);

        //变量类型  变量名字 = new com.wen.base.Demo08
        Demo08 demo08 = new Demo08();
        System.out.println(demo08.age);

        //类变量   static
        System.out.println(salary);
    }
}

```



## Demo_09

```java
package com.wen.base;

public class Demo09 {
    //修饰符，不存在先后顺序
    static final double PI = 3.14;

    public static void main(String[] args) {
        System.out.println(PI);
    }
}
```



## JavaDoc

### JavaDoc

javadoc命令是用来生成自己的API文档的

参数信息

@author	作者名

@version	版本号

@since	指明需要最早使用的jdk版本

@param	参数名

@return	返回值情况

@throws	异常抛出情况



### DocDemo

```java
package com.wen.base;

/**
 * @author 小网管儿
 * @version 1.0
 * @since 1.8
 */
public class Doc {
    String name;

    /**
     * @author 小网管儿
     * @param name
     * @return
     * @throws Exception
     */
    public String test (String name) throws Exception
    {
        return name;
    }
    //通过命令行生成JavaDoc文档：
    // javadoc -encoding UTF-8 -charset UTF-8 Doc.java
}

```







# Operator 

## Demo_01

```java
package com.wen.operator;

public class Demo01 {
    public static void main(String[] args) {
        //二元运算符
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/(double)b);
    }
}
```



## Demo_02

```java
package com.wen.operator;

public class Demo02 {
    public static void main(String[] args) {
        long a =123123123123L;
        int b = 123;
        short c = 10;
        byte d = 8;

        //如果里面有long或double则数据类型为Long或double，按优先级
        System.out.println(a+b+c+d);    //Long
        System.out.println(b+c+d);    //Int
        System.out.println(c+d);    //Int

    }
}
```



## Demo_03

```java
package com.wen.operator;

public class Demo03 {
    public static void main(String[] args) {
        //关系运算符返回的结果：   正确，错误   布尔值

        int a = 10;
        int b = 20;
        int c = 21;

        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(c%a);    //%取余运算符
    }
}
```



## Demo_04

```java
package com.wen.operator;

public class Demo04 {
    public static void main(String[] args) {
        int a = 3;
        //a++   先给b赋值，再自增
        int b = a++;
        //++a   先自增，在给c赋值
        int c = ++a;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
```





## Demo_05

```java
package com.wen.operator;

public class Demo05 {
    public static void main(String[] args) {
        //与（and)    或（or）   非（取反）
        boolean a =true;
        boolean b =false;

        System.out.println("a && b: "+(b&&a));  //逻辑与运算：两个变量都为真，结果才为true
        System.out.println("a || b: "+(b||a));  //逻辑或运算：两个变量有一个为真，结果才为true
        System.out.println("！（a && b）: "+!(b&&a));  //如果为真，则变为假，如果是假则变为真

        //短路运算
        int c = 5;
        boolean d = (c<4)&&(c++<4);     //在运算时，c<4已确定d为false，所以不往下运算，c没有自增
        System.out.println(d);
        System.out.println(c);

    }
}
```



## Demo_06

```java
package com.wen.operator;

public class Demo06 {
    public static void main(String[] args) {
        /*
        A = 0011 1100
        B = 0000 1101

        A&B 0000 1100
        A|B 0011 1101
        A^B 0011 0001       //异或
        ~B  1111 0010

        2*8 = 16  ->  2*2*2*2

       <<       位左移
       >>       位右移

         */
        System.out.println(2<<3);       //2左移3位，等于16
        System.out.println(2>>1);        //2右移1位，等于1
    }
}
```



## Demo_07

```java
package com.wen.operator;

public class Demo07 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        a+=b;   //a = a+b
        a-=b;   //a = a-b

        //字符串连接符  +   两侧只要出现string类型，都将数转换为string在进行相加
        System.out.println(a+b);
        System.out.println(""+a+b);

    }
}
```



## Demo_08

```java
package com.wen.operator;

public class Demo08 {
    public static void main(String[] args) {
        //三元运算符
        //x ? y : z
        //如果x==true，则结果为y,否则结果为z

        int score = 80;
        String type = score <60 ?"不及格":"及格"; //必须掌握
        //if
        System.out.println(type);

    }
}
```





# Scanner

## Scanner对象详解

**一般格式:**

```java
Scanner s = new Scanner(System.in);
        if(scanner.hasNext()){
            String str = scanner.nextLine();
            System.out.println("输出的内容为："+str);
        }
```

通过Scanner类的next()与nextLine()方法获取输入的字符串，在读取前我们一般需要使用hasNext()与hasNextLine()判断是否还有输入的数据。

next():

1. 一定要读取到有效字符后才可以结束输入。
2. 对输入有效字符之前遇到的空白，next()方法会自动将其去掉。
3. 只有输入有效字符后才将其后面输入的空白（空格）作为分隔符或者结束符。
4. next()不能得到带有空格的字符串。



nextLine():

1. 以Enter为结束符，也就是说nextLine()方法返回的是输入回车之前的所有字符
2. 可以获得空白。

如果要获取整数、浮点数等还有：nextInt()、nextFloat()、nextDouble()等。对应的还有hasNextInt()、hasNextFloat()、hasNextDouble()等。



## Demo01

```java
package com.wen.scanner;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        //创建一个扫描器对象，用于接收键盘数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("使用next方式接收： ");

        //判断用户有没有输入字符串
        if(scanner.hasNext()==true){
            String str = scanner.next();
            System.out.println("输出的内容为："+str);
        }
        //凡是属于IO流的类如果不关闭会一直占用资源，要养成好习惯用完就关掉
        scanner.close();
        }
}
```



## Demo02

```java
package com.wen.scanner;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        //从键盘接收数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("使用nextLine方式接收： ");

        //判断是否还有输入
        if(scanner.hasNext()){
            String str = scanner.nextLine();
            System.out.println("输出的内容为："+str);
        }
        scanner.close();

    }
}
```



## Demo03

```java
package com.wen.scanner;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        //从键盘接收数据
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        float f = 0.0f;

        System.out.println("请输入整数：");

        if (scanner.hasNextInt()){
            i = scanner.nextInt();
            System.out.println("整数数据："+i);
        }
        else {
            System.out.println("输入的不是整数数据："+i);
        }

        System.out.println("请输入小数：");

        if (scanner.hasNextFloat()){
            f = scanner.nextFloat();
            System.out.println("小数数据："+f);
        }
        else {
            System.out.println("输入的不是小数数据："+f);
        }
    }
}
```



## Demo04

```java
package com.wen.scanner;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        //我们可以输入多个数字，并求其总和与平均数，每输入一个数字用回车确认，通过输入非数字来结束输入并输出执行结果
        Scanner scanner = new Scanner(System.in);

        //和
        double sum = 0;
        //计算输入了多少个数字
        int m = 0;

        //通过循环判断是否还有输入，并在里面对每一次进行求和和统计
        while (scanner.hasNextDouble()){
            double x = scanner.nextDouble();

            m = m+1; //m++

            sum = sum+x;
            System.out.println("你输入了第"+m+"个数据，然后当前结果是sum="+sum);
            System.out.println("你输入了第"+m+"个数据，然后当前结果是average="+(sum/m));
        }
        System.out.println(m+"个数的和为"+sum);
        System.out.println(m+"个数的平均值为"+(sum/m));
        scanner.close();
    }
}
```



# Struct

## 顺序结构

顺序结构：

JAVA的基本结构就是顺序结构，除非特别指明，否则就按照顺序一句一句执行。

顺序结构是最简单的算法结构。

### ShunXuDemo

```java
package com.wen.struct;

public class ShunXuDemo {
    public static void main(String[] args) {
        System.out.println("小网管儿1");
        System.out.println("小网管儿2");
        System.out.println("小网管儿3");
        System.out.println("小网管儿4");
        System.out.println("小网管儿5");
    }
}
```



## If选择结构

### IfDemo01

```java
package com.wen.struct;

import java.util.Scanner;

public class IfDemo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        //equals：判断字符串是否相等
        if (s.equals("Hello"))
        {
            System.out.println(s);
        }
        else {
            System.out.println("End");
        }
        scanner.close();

    }
}
```



### IfDemo02

```java
package com.wen.struct;

import java.util.Scanner;

public class IfDemo02 {
    public static void main(String[] args) {
        //考试分数大于等于60就是及格，小于60就是不及格
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入成绩：");
        int score = scanner.nextInt();

        if(score>=60){
            System.out.println("及格");
        }
        else System.out.println("不及格");
    }
}

```



### IfDemo03

```java
package com.wen.struct;

import java.util.Scanner;

public class IfDemo03 {
    public static void main(String[] args) {
        //考试分数90~100为A，80~89为B，70~89为C，60~69为D，60以下为E
        Scanner scanner = new Scanner(System.in);
        /*
        if语句至多有 1 个else语句，else语句在所有的else if语句之后
        if语句可以有若干个else if语句，它们必须在else语句之前
        一旦其中一个else if 语句检测为true，其他的else if 以及else 语句都将跳过执行
         */

        System.out.println("请输入成绩：");
        float score = scanner.nextFloat();
        System.out.println("成绩为"+score);
        if(score>=90){
            System.out.println("成绩等级为A");
            if(score==100)
                System.out.println("恭喜满分！！！");
        }
        else if(score>=80)
            System.out.println("成绩等级为B");
        else if (score>=70)
            System.out.println("成绩等级为C");
        else if (score>=60)
            System.out.println("成绩等级为D");
        else System.out.println("成绩等级为E");

        scanner.close();
    }
}
```



## Switch选择结构

### SwitchDemo01

```java
package com.wen.struct;

import java.util.Scanner;

//分析分数的等级
public class SwitchDemo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入成绩：");
        float score = scanner.nextFloat();
        char grade;
        if(score>=90){
            grade = 'A';
        }
        else if (score>=80){
            grade = 'B';
        }
        else if (score>=70){
            grade = 'C';
        }
        else if (score>=60){
            grade = 'D';
        }
        else
            grade = 'E';
        System.out.println("成绩为："+score);
        System.out.println("等级为："+grade);
        switch (grade){
            case 'A':
                System.out.println("优秀！！！！");
                break;
            case 'B':
                System.out.println("良好！！！");
                break;
            case 'C':
                System.out.println("一般！！");
                break;
            case 'D':
                System.out.println("及格！");
                break;
            case 'E':
                System.out.println("请您立即联系教务处办理退学手续，谢谢！");
                break;
            default:
                System.out.println("未知等级");
        }
    }
}
```



### SwitchDemo02

```java
package com.wen.struct;

public class SwitchDemo02 {
    public static void main(String[] args) {
        String name = "小网管儿";
        //JDK7的新特性，表达式结果可以是字符串！
        //字符的本质还是数字

        //反编译   java--class （字节码文件）----反编译（IDEA)
        switch (name){
            case "小网管儿":
                System.out.println("小网管儿");
                break;
            case "网管儿":
                System.out.println("网管儿");
                break;
            case "小网管":
                System.out.println("小网管");
                break;
            default:
                System.out.println("???");
        }
    }
}
```



## While循环结构

### While循环详解

```java
while(布尔表达式){
		循环体内容;
}
```

- 只要布尔表达式为true，循环就会一直执行下去。
- 我们大多数情况是会让循环停止下来，我们需要一个让表达式失效的方式来结束循环。
- 少部分情况需要循环一直执行，比如服务器的请求响应监听。
- 循环条件一直为true就会造成无线循环（死循环），我们正常的业务编程中应该尽量避免死循环。会影响程序性能或者造成程序卡死奔溃！



### WhileDemo01

```java
package com.wen.struct;

public class WhileDemo01 {
    public static void main(String[] args) {
        //输出1~100
        int i = 0;
        while(i<100){
            i++;
            System.out.println(i);
        }
    }
}
```



### WhileDemo02

```java
package com.wen.struct;

public class WhileDemo02 {
    public static void main(String[] args) {
        //死循环
        while(true){
            //等待客户端连接
            //定时检查
            //。。。
        }
    }
}
```



### WhileDemo03

```java
package com.wen.struct;

public class WhileDemo03 {
    public static void main(String[] args) {
        //计算1+2+3+...+100

        int i = 0;
        int sum = 0;

        while (i<=100)
        {
            sum = sum+i;
            i++;
        }
        System.out.println(sum);
    }
}
```



## DoWhile循环结构

### DoWhileDemo01

```java
package com.wen.struct;

//do while语句至少执行一次循环体
public class DoWhileDemo01 {
    public static void main(String[] args) {
        int a = 0;
        while (a<0){
            System.out.println(a);
            a++;
        }
        System.out.println("===============");
        do {
            System.out.println(a);
            a++;
        }while (a<0);
    }
}

```



### DoWhileDemo02

```java
package com.wen.struct;

public class DoWhileDemo02 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;

        do{
            sum = sum+i;
            i++;
        }while (i<=100);
        System.out.println(sum);
    }
}
```



## For循环结构

### for循环详解

说明：

最先执行初始化步骤，可以声明一种类型，但可初始化一个或多个循环控制变了，也可以是空语句。

然后，检测布尔表达式的值，如果为true，循环体被执行；如果为false，循环终止，开始执行循环体后面的语句。

执行一次循环后，更新循环控制变量（迭代因子控制循环变量的增减）。

再次检测布尔表达式，循环执行上面的过程。

简答来说：

for循环步骤：

1. 初始化 -> 布尔表达式判断
2. 更新循环控制变量 -> 布尔值表达式判断
3. 更新循环控制变量 -> 布尔值表达式判断
4. 更新循环控制变量 -> 布尔值表达式判断
5. ....
6. ....

在for循环语句中定义的循环控制变量只能在for循环中使用

```java
//死循环
for(; ; ){
    
}
```



### ForDemo01

```java
package com.wen.struct;
/*for语句格式：
for(初始化;布尔表达式;更新)
循环体;
*/
public class ForDemo01 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i =1;i<=100;i++)
        {
            System.out.println(i);
            sum = sum+i;
        }
        System.out.println(sum);
        System.out.println("for循环结束！");
    }
}
```



### ForDemo02

```java
package com.wen.struct;

public class ForDemo02 {
    public static void main(String[] args) {
        //练习1：计算0到100之间的奇数和、偶数和

        int oddSum = 0;     //奇数和
        int evenSum = 0;    //偶数和

        for(int i = 0;i<=100;i++){
            if (i % 2 == 0) {
                evenSum+=i;
            }else {
                oddSum+=i;
            }
        }
        System.out.println("奇数和为"+oddSum);
        System.out.println("偶数和为"+evenSum);
    }
}
```



### ForDemo03

```java
package com.wen.struct;

public class ForDemo03 {
    public static void main(String[] args) {
        //练习2：输出1-1000之间能被5整除的数，并且每行输出3个

        for (int i = 1;i <= 1000;i++)
        {
            if(i%5==0){
                System.out.print(i+"\t");
            }
            if (i%15==0){
                System.out.println();
            }
        }
    }
    //println   输出完会换行      :println==printline
    //print   输出完不换行
}
```



### ForDemo04

```java
package com.wen.struct;

public class ForDemo04 {
    public static void main(String[] args) {
        //打印九九乘法表
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (i * j)+"\t");
            }
            System.out.println();
        }
    }
}
```



### ForDemo05

```java
package com.wen.struct;

public class ForDemo05 {
    public static void main(String[] args) {
        //增强for循环

        int[] numbers = {10,20,30,40,50};   //定义了一个数组
        for (int i = 0;i<5;i++)
        {
            System.out.println(numbers[i]);
        }

        System.out.println("=========================");

        //遍历数组的元素，与上面的for循环等效
        for (int x:numbers){
            System.out.println(x);
        }
    }
}
```



## Break、Continue、GoTo

### Break语句详解

break在任何循环语句的主体部分，均可用break控制循环的流程。**break用于强行退出循环**，不执行循环中剩余的语句。（break语句也在switch语句中使用）

### BreakDemo

```java
package com.wen.struct;
//Break语句：强制跳出循环
public class BreakDemo {
    public static void main(String[] args) {
        int i = 0;
        while (i<100)
        {
            i++;
            System.out.println(i);
            if (i==30){
                break;
            }
        }
        System.out.println("123");
    }
}
```



### Continue语句详解

continue语句用在循环语句体中，**用于终止某次循环过程**，即跳过循环体中尚未执行的语句，接着进行下一次是否进行循环的判定。

### ContinueDemo

```java
package com.wen.struct;
//continue
public class ContinueDemo {
    public static void main(String[] args) {
        int i = 0;
        while (i<100)
        {
            i++;
            if (i%10==0){
                System.out.println();
                continue;
            }
            System.out.println(i);
        }
    }
}
```



### 关于GoTo关键字

- goto关键字很早就在程序设计语言中出现，尽管goto仍是Java的一个保留字，但并未在语言中得到正式使用；Java没有goto。然而，在break和continue这两个关键字的身上，仍然能看到goto的影子---带标签的break和continue。
- ”标签“是指后面跟一个冒号的标识符，例如：**lebel：**
- 对Java来说是唯一用到标签的地方是循环语句之前。而在循环之前设置标签的唯一理由是：**我们希望在其中嵌套另一个循环，由于break和continue关键字通常只中断当前循环，但若随同标签使用，它们就会中断到存在标签的地方**



### LabelDemo

```java
package com.wen.struct;

public class TestDemo {
    public static void main(String[] args) {
        //打印三角形  5行
        for (int i = 1;i<=5;i++){
            for (int j = 5;j>=i;j--)
            {
                System.out.print(" ");
            }
            for (int j =1;j<=i;j++)
            {
                System.out.print("*");
            }
            for (int j =1;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```



## Debug

### TestDemo

```java
package com.wen.struct;

public class TestDemo {
    public static void main(String[] args) {
        //打印三角形  5行
        //从第一个for语句开始debug，一步一步实现三角形打印
        for (int i = 1;i<=5;i++){
            for (int j = 5;j>=i;j--)
            {
                System.out.print(" ");
            }
            for (int j =1;j<=i;j++)
            {
                System.out.print("*");
            }
            for (int j =1;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```







# Method



## 方法的定义

Java方法类似于其他语言的函数，是一段用来完成



### Demo01

```java
public class Demo01 {
    //main方法
    public static void main(String[] args) {

        //实际参数： 实际调用传递给他的参数
    int sum = add(1,2);
        System.out.println(sum);
        test();
    }

    //加法
    //形式参数，用来定义作用的
public static int add(int a,int b){
    return a+b;
}

    //输出1-1000之间能被5整除的数，并且每行输出3个
public static void test(){
    for (int i = 1;i <= 1000;i++)
    {
        if(i%5==0){
            System.out.print(i+"\t");
        }
        if (i%15==0){
            System.out.println();
        }
    }
}

}
```



## 方法重载

重载就是在一个类中，有相同的函数名称，但形参不同的函数。



### 规则

- 方法名称必须相同。
- 参数列表必须不同（个数不同、或类型不同、参数排列顺序不同）。
- 方法的返回类型可以相同也可以不相同
- 仅仅返回类型不同不足以成为方法的重载。



### 实现

方法名称相同时，编译器会根据调用的方法的参数个数、参数类型等去逐个匹配，以选择对应的方法，如果匹配失败，则编译器报错。



### Demo02

```java
package com.wen.method;

public class Demo02 {
    public static void main(String[] args) {
    double max = max(10,20);       //方法重载：当返回值为double则调用返回值为double方法，当返回值为int则调用返回值为int的方法
        System.out.println(max);
    }

    //比大小
    public static double max(double num1,double num2){
        double result = 0;

        if(num1==num2){
            System.out.println("num1==num2");
            return 0;   //终止方法
        }

        if (num1 > num2){
            result = num1;
        }else {
            result = num2;
        }
        return result;
    }

        //比大小
    public static int max(int num1,int num2){
        int result = 0;

        if(num1==num2){
            System.out.println("num1==num2");
            return 0;   //终止方法
        }

        if (num1 > num2){
            result = num1;
        }else {
            result = num2;
        }
        return result;
    }
}
```



## Demo03

```java
package com.wen.method;

public class Demo03 {
    public static void main(String[] args) {    //通过命令行向main方法传参
        for (int i = 0;i<args.length;i++)
        {
            System.out.println(args[i]);
        }
    }
}
```

![image-20210430170642391](C:\Users\jiwen&77\AppData\Roaming\Typora\typora-user-images\image-20210430170642391.png)



## Demo04

```java
package com.wen.method;

public class Demo04 {
    public static void main(String[] args) {
        Demo04 demo04 = new Demo04();
        demo04.test(1, 2,3,45,6);
    }

    public void test(int x, int... i){
        System.out.println(i[0]);
        System.out.println(i[1]);
        System.out.println(i[2]);
        System.out.println(i[3]);
    }

}
```



## Demo05

```java
package com.wen.method;

public class Demo05 {
    public static void main(String[] args) {
        //调用可变参数的方法
        printMax(34, 3, 3, 2, 56.5);
        printMax(new double[]{1, 2, 3});
    }

    public static void printMax(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No argument passed");
            return;     //如果没有数则exit
        }
        double result = numbers[0];

        //打擂
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > result) {
                result = numbers[i];
            }
        }
        System.out.println("The max value is " + result);
    }
}
```

## 递归



### **递归结构包括两个部分：**

递归头：什么时候不调用自身方法。如果没有头，将陷入死循环。

递归体：什么时候需要调用自身方法。



### Demo06

```java
package com.wen.method;

import com.wen.struct.TestDemo;
//递归调用
public class Demo06 {
    public static void main(String[] args) {
        System.out.println(f(31));
    }
    public static int f(int n){

        if(n==1){
            return 1;
        }else {
            return n*f(n-1);
        }
    }
}
```



## DemoPractice

```java
package com.wen.method;

import java.util.Scanner;

public class DemoPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        System.out.println("请输入第1个数字:");
        a=scanner.nextDouble();
        System.out.println("请输入第2个数字");
        b=scanner.nextDouble();
        System.out.println(max1(a,b));
        System.out.println(max2(a,b));
        System.out.println(max3(a,b));
    }
    //比大小
    public static double max1(double num1,double num2){
        int result = 0;

        if (num1 == num2){
            System.out.println("num1 = num2");
            return num1;       //终止方法
        }
        if(num1>num2){

        return num1;
        }else {
            return num2;
        }
    }
    //下面给出两种更简单的实现比较大小

    //三目运算符
    public static double max2(double num1,double num2){
        return num1>=num2?num1:num2;
    }
    //调用Math类中的max方法,返回两个参数中的最大值
    public static double max3(double num1,double num2){
        return Math.max(num1, num2);
    }

```



# Array



## 数组

### 数组的使用

1. 首先必须声明数组变量，才能在程序中使用数组。下面是声明数组变量的方法：

   ```java
   dataType[] arrayRefVar;		//Java定义数组首选
   或
   dataType arrayRefVar[];		//效果相同，用于便利C/C++转到Java的程序员
   ```

2. Java语言使用new操作符来创建数组，语法如下：

   ```java
   dataType[] arrayRefVar = new dataType[arraySize];
   ```

3. 数组的元素是通过索引访问的，数组索引从0开始。

4. 获取数组长度：      array.length

### ArrayDemo01

```java
package com.wen.array;

public class ArrayDemo01 {
    public static void main(String[] args) {
        //变量的类型     变量的名字   =   变量的值
        //数组类型

        int[] nums;     //1. 声明一个数组

        nums = new int[10];     //2.创建一个数组

        //3. 给数组元素中赋值

        for(int i = 0;i<nums.length;i++){
            nums[i] = i+1;
        }

        //计算所有元素之和
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum = sum+nums[i];
        }
        System.out.println(sum);
    }
}
```



## 数组三种初始化

### 静态初始化

```java
int[] a = {1,2,3};
Man[] mans = {new Man(1,1),new Man(2,2)};
```

### 动态初始化

```java
int[] a = new int[2];
a[0] = 1;
a[1] = 2;
```

### 数组的默认初始化

数组是引用类型，它的元素相当于类的实例变量，因此数组一经分配空间，其中的每个元素也被实例变量同样的方法被隐式初始化。

### ArrayDemo02

```java
package com.wen.array;

public class ArrayDemo02 {
    public static void main(String[] args) {
        //静态初始化
        int[] a = {1,2,3,4,5,6,7,8};
        System.out.println(a[0]);

        //动态初始化 : 包含默认初始化
        int[] b = new int[10];
        b[0] = 10;
        System.out.println(b[0]);

        //创建数组后未赋值，则数组元素值默认为0
        System.out.println(b[1]);
        System.out.println(b[2]);


        int[] c = new int[2];
        System.out.println(c[2]);
    }
}
```



## 数组的四个基本特点

- 其长度是确定的。数组一旦被创建，它的大小就是不可以改变的。
- 其元素必须是相同类型，不允许出现混合类型。
- 数组中的元素可以是任何数据类型，包括基本类型和引用类型。
- 数组变量属引用类型，数据也可以看成是对象，数组中的每个元素相于该对象的成员变量。
- 数组本身就是对象，Java中对象是在堆中的，因此数组无论保存原始类型还是其他对象类型，**数组对象本身是在堆中的**。

下标的合法区间：[0,length-1]，如果越界就会报错；

```java
public static void main(String[] args){
	int[] a = new int[2];
    System.out.println(a[2]);
}
```

报错：<font color='red'>ArrayIndexOutOfBoundsException：数组下标越界异常</font>



### ArrayDemo03

```java
package com.wen.array;

public class ArrayDemo03 {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5};

        //打印全部的数组元素
        for(int i = 0;i < arrays.length;i++){
            System.out.println(arrays[i]);
        }
        System.out.println("=================");
        //计算所有元素的和
        int sum = 0;
        for (int i = 0;i<arrays.length;i++){
            sum +=arrays[i];
        }
        System.out.println("sum="+sum);
        System.out.println("=================");

        //查找最大元素
        int max = arrays[0];

        for (int i = 1;i<arrays.length;i++){
            if(arrays[i]>max){
                max = arrays[i];
            }
        }
        System.out.println("max"+max);
    }
}
```



### 小结

- 数组是相同数据类型（数据类型可以为任意类型）的有序集合
- 数组也是对象。数组元素相当于对象的成员变量。
- 数组长度是确定的，不可变的。如果越界，则报：ArrayIndexOutOfBoundsException



## ArrayDemo04

```java
package com.wen.array;

public class ArrayDemo04 {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5};

        //JDK1.5        没有下标
        for (int array : arrays) {
            System.out.println(array);
        }

        //printArray(arrays);

        int[] reverse = reverse(arrays);
        printArray(reverse);

    }

    //反转数组
    public static int[] reverse(int[] arrays){
        int [] result = new int[arrays.length];

        //反转的操作
        for (int i = 0,j=result.length-1; i < arrays.length; i++,j--) {
            result [j] = arrays[i];
        }
        return result;
    }

    //打印数组元素
    public static void printArray(int[] arrays){
        for (int i = 0; i <arrays.length ; i++) {
            System.out.print(arrays[i]+" ");
        }
    }


}
```



## ArrayDemo05

```java
package com.wen.array;

import java.util.jar.JarEntry;

public class ArrayDemo05 {
    public static void main(String[] args) {
        //多维数组
        /*
            1,2     array[0]
            3,4     array[1]
            5,6     array[2]
         */
        int[][] array = {{1, 2}, {3, 4}, {5, 6}};
        printArray(array[0]);
        System.out.println();
        System.out.println(array[0][0]);
        System.out.println(array[0][1]);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
    //打印数组元素
    public static void printArray(int[] arrays){
        for (int i = 0; i <arrays.length ; i++) {
            System.out.print(arrays[i]+" ");
        }
    }

}
```



## Arrays类

### Arrays类

- 数组的工具java.util.Arrays
- 由于数组对象本身并没有什么方法可以供我们调用，但API中提供了一个工具类Arrays供我们使用，从而可以对数据对象进行一些基本的操作。
- <font color= red> 查看JDK帮助文档</font>
- Arrays类中的方法都是static修饰的静态方法，在使用的时候可以直接使用类名进行调用，而“不用”使用对象来调用（注意：是“不用”而不是“不能”）

具有以下常用功能：

- 给数组赋值：通过fill方法。
- 对数组排序：通过sort方法，按升序。
- 比较数组：通过equals方法比较数组中元素值是否相等。
- 查找数组元素：通过binarySearch方法能对排序好的数组进行二分查找法操作。



### ArrayDemo06

```java
package com.wen.array;

import java.util.Arrays;

public class ArrayDemo06 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,9090,31231,543,21,3,23};

        //打印数组元素
        System.out.println(a);  //输出hash code:[I@1b6d3586

        System.out.println(Arrays.toString(a)); //打印数组
        printarray(a);      //自己编写打印数组方法

        Arrays.sort(a); //数组进行排序

        System.out.println(Arrays.toString(a));

        Arrays.fill(a,2,4,0);   //数组的第2到4个元素被0填充
        System.out.println(Arrays.toString(a));
        Arrays.fill(a,0);   //数组填充
        System.out.println(Arrays.toString(a));
    }
    public static void printarray (int []a){
        for (int i = 0; i <a.length ; i++) {
            if(i==0)
            {
                System.out.print("{");
            }
            System.out.print(a[i]+",");
            if(i==a.length-1){
                System.out.println("}");
            }
        }
    }
}
```



## ArrayDemo07

**数组的冒泡排序**

```java
package com.wen.array;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.jar.JarEntry;

public class ArrayDemo07 {
    public static void main(String[] args) {
    int[] a={1,2,70,123,10000,12,55};
    a=sort(a);
        System.out.println(Arrays.toString(a));
    }

    //冒泡排序
    //1、比较数组中，两个相邻元素，如果第一个数比第二个数大，就交换它们的位置
    //2、每一次比较中，都会产生出一个最大，或最小的数字；
    //3、下一轮则可以少一次排序
    //4、依次循环，直到结束。

    public static int[] sort(int[] array){
        //临时变量
        int temp = 0;

        //外层循环，判断我们这个要走多少次
        for (int i = array.length-1; i >0 ; i--) {
            //内层循环，比较判断两个数，如果第一个数比第二个数大，则交换位置
            for (int j =i-1; j >=0; j--){
                if(array[j]>array[i])
                {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
```



## 稀疏数组

### 稀疏数组

- 当一个数组中大部分元素为0或为同一值时，可以使用稀疏数组来保存该数组。
- 稀疏数组的处理方式：
  	1. 记录数组一共有几行几列，有多少个不同值。
   	2. 把具有不同值的元素和行列及值记录在一个小规模的数组中，从而缩小程序的规模
- 如下图，左边是原始数组，右边是稀疏数组。

![image-20210512181353050](C:\Users\jiwen&77\AppData\Roaming\Typora\typora-user-images\image-20210512181353050.png)



### ArrayDemo08

```java
package com.wen.array;

public class ArrayDemo08 {
    public static void main(String[] args) {
        //1、创建一个二维数组11*11   0：没有棋子  1：黑棋    2：白棋
        int[][] array1 = new int[11][11];
        array1[1][2] = 1;
        array1[2][3] = 1;
        //输出原始的数组
        System.out.println("输出原始的数组");

        for (int[] ints : array1) {
            for (int anInt : ints) {
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }
        //转换为稀疏数组保存
        //获取有效值的个数
        int sum = 0;
        for (int i = 0; i <11 ; i++) {
        for (int j = 0; j <11 ; j++) {
            if(array1[i][j]!=0){
                sum++;
            }
        }
        }
        System.out.println("有效值的个数："+sum);

        //2、创建一个稀疏数组的数组
        int[][] array2 = new int [sum+1][3];

        array2[0][0] = 11;
        array2[0][1] = 11;
        array2[0][2] = sum;

        //遍历二维数组，将非零的值，存放稀疏数组中
        int count = 0;
        for (int i = 0; i <array1.length ; i++) {
        for (int j = 0; j <array1[i].length ; j++) {
            if(array1[i][j]!=0){
                count++;
                array2[count][0]=i;
                array2[count][1]=j;
                array2[count][2]=array1[i][j];
            }
        }
        }

        //输出稀疏数组
        System.out.println("稀疏数组");

        for (int i = 0; i < array2.length ; i++) {
            System.out.println(array2[i][0]+"\t"+array2[i][1]+"\t"+array2[i][2]);
        }
        System.out.println("======================");
        System.out.println("还原");

        //1、读取稀疏数组
        int[][] array3 = new int [array2[0][0]][array2[0][1]];

        //2、给其中的元素还原它的值
        for (int i = 1; i <array2.length ; i++) {
            array3[array2[i][0]][array2[i][1]] = array2[i][2];
        }

        System.out.println("输出还原的数组");

        for (int[] ints : array3) {
            for (int anInt : ints) {
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }
    }
}
```





# oop

## package demo01

### 对象

1. 类是一个模板，抽象的；对象是一个具体的实例

2. 方法：定义、调用！

3. 对应的引用

   引用类型：	基本类型

   对象是通过引用来操作的：栈  --->  堆

### Demo01

```java
package com.oop.demo01;

import java.io.IOException;
import java.security.PublicKey;

//Demo01类
public class Demo01 {
    //核心方法：main
    public static void main(String[] args) {

    }
        /*
            修饰符 返回值 方法名(...){
            //方法体
            return 返回值；
            }
         */
    public String sayHello(){
        return "hello, world";
    }

    public int max(int a,int b){
        return a>b ? a : b;     //三元运算符
    }

    //数组下标越界：Arrayindexoutofbounds
    public void readFile(String file) throws IOException{

    }
}

```



### Demo02

```java
package com.oop.demo01;

public class Demo02 {
    public static void main(String[] args) {

        //实例化这个类new
        //对象类型  对象名 = 对象值；
        Student student = new Student();

        student.say();
    }
}
```



```java
package com.oop.demo01;

//学生类
public class Student {

    //非静态方法
    public void say(){
        System.out.println("学生无话可说");
    }
}
```



### Demo03

```java
package com.oop.demo01;

public class Demo03 {
    public static void main(String[] args) {
        //实际参数和形式参数的类型要对应
        int add = Demo03.add(1,2);
        System.out.println(add);
    }

    public static int add(int a,int b){
        return a+b;
    }
}
```



### Demo04

```java
package com.oop.demo01;

//值传递
public class Demo04 {
    public static void main(String[] args) {
        int a = 1;
        System.out.println(a);  //1

        Demo04.change(a);

        System.out.println(a);  //1  调用change()没有返回值

    }

    //返回值为空
    public static void change(int a){
        a = 10;
    }
}
```





### Demo05

属性：字段  Field  成员变量

默认初始化：

​		数字：0	0.0

​		char： u0000

​		Boolean： false

​		引用：null

```java
package com.oop.demo01;

//引用传递：对象，本质还是值传递
//对象：内存
public class Demo05 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);        //null

        Demo05.change(person);

        System.out.println(person.name);    //wenSAMA
    }

    public static void change(Person person){
        //person是一个对象：指向的--->  Person person = new Person();这是一个具体的人，可以改变属性
        person.name = "wenSAMA";
    }

}

//定义了一个Person类，有一个属性：name
class Person{
    String name;    //默认值为null

}
```



## package demo02

### 构造器

对象的创建和使用

- 必须使用new  关键字创建对象，调用构造器	Person hu_SAMA	=	new Person();
- 对象的属性  hu_SAMA.name;
- 对象的方法  hu_SAMA.sleep();

### Person

```java
package com.oop.demo02;

//java---> class
public class Person {
    //alt + insert 快速生成构造器

   //一个类即使什么都不写，它也会存在一个方法
    //显示的定义构造器

    String name;

    //实例化初始值
    //1、使用new关键字，本质是在调用构造器
    //2、构造器一般用来初始化值

    //无参构造
    public Person(){
        this.name = "hu_SAMA";
    }

    //有参构造:一旦定义了有参构造，无参就必须显示定义（无有参构造时，会自动生成一个无参构造）
    public Person(String name){
        this.name = name;
    }
}

/*
    构造器：
        1、和类名相同
        2、没有返回值
    作用：
        1、new 本质在调用构造方法
        2、初始化对象的值
    注意点：
        1、定义有参构造后，如果想使用无参构造，显得地定义一个无参构造
    构造器快捷键：
        alt + insert
 */

```



### Student

```java
package com.oop.demo02;

//学生类
public class Student {
    //属性：字段
    String name;        //初始默认为null
    int age;            //初始默认为0

    //方法
    public void study(){
        System.out.println("wenSAMA_糊");
    }
}

/*public static void main(String[] args) {

        //类：抽象的，实例化
        //类实例化后会返回一个自己的对象
        //student对象就是一个Student类的具体事例

        Student huhuhu = new Student();
        Student huhuSAMA = new Student();

        huhuhu.name = "糊SAMA";
        huhuhu.age = 118;

        huhuSAMA.name = "米古月米古月";
        huhuSAMA.age = 119;

        System.out.println(huhuhu.name);
        System.out.println(huhuhu.age);

        System.out.println(huhuSAMA.name);
        System.out.println(huhuSAMA.age);
    }

 */
```



### Application

```java
package com.oop.demo02;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class Application {
    public static void main(String[] args) {

        //new 实例化了一个对象
        //无参构造
        Person person1 = new Person();
        //有参构造
        Person person = new Person("hu_SAMA");

        System.out.println(person1.name);
        System.out.println(person.name);    //hu_SAMA
    }
}
```



## package demo03

### 属性与方法

- 静态的属性	属性
- 动态行为        方法

### Pet

```java
package com.oop.demo03;

public class Pet {
    public String name;
    public int age;

    //无参构造

    public void shout(){
        System.out.println("叫了一声");
    }
}
```



### Application

```java
package com.oop.demo03;

public class Application {
    public static void main(String[] args) {
        Pet dog = new Pet();
        dog.name = "旺财";
        dog.age = 3;
        dog.shout();

        System.out.println(dog.name);
        System.out.println(dog.age);
    }
}
```



## package demo04

### 封装详解

#### 私有属性private

1. 提高程序的安全性，保护数据
2. 隐藏代码的实现细节
3. 统一接口
4. 系统的可维护增加了



#### public和private的区别

public默认可被外部直接访问或调用的，而private默认只能在对象内部进行访问或调用，不能被外部调要被访问或调用要在对象内部编写相关函数，在外部调用该函数实现间接访问或调用private。

### Student

```java
package com.oop.demo04;

//类     private：私有
public class Student {
    //属性私有
    private String name;     //名字
    private int id;          //学号
    private char sex;        //性别
    private int age;        //年龄

   //提供一些可以操作私有属性的方法
    //提供一些public 的get、 set方法

    //get 获得这个数据
    public String getName(){
        return  this.name;
    }

    //set 给这个数据设置值
    public void setName(String name){
        this.name = name;
    }
    
    //alt + insert 选择Getter and Setter自动生成
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 120 || age <0){
            this.age = 3;
        }else {
            this.age = age;
        }
    }
}
```



### Application

```java
package com.oop.demo04;

public class Application {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("hu_SAMA");
        System.out.println(student.getName());

    }
}
```



## package demo05

### 继承

#### super注意点

1. super调用父类的构造方法，必须在构造方法的第一个
2. super必须只能出现在子类的方法或者构造方法中！
3. super和this 不能同时调用构造方法！



this和super的区别：

代表的对象不同：

​	this： 本身调用者这个对象

​	super： 代表父类对象的应用

前提

​	this： 没有继承也可以使用

​	super： 只能在继承条件才可以使用

构造方法

​	this()： 本类的构造

​	super()： 父类的构造



### Person

```java
package com.oop.demo05;

//在Java中，所有的类，都默认直接或间接地继承Object（里面有一些基本的方法）
//父（基）类
//子类继承了父类，就会拥有父类的全部方法
public class Person {
    public Person(String name){
        System.out.println("Person");
    }
    protected String name = "hu_SAMA";

    public void print(){
        System.out.println("Person");
    }
}
```



### Student

```java
package com.oop.demo05;

import javax.crypto.interfaces.PBEKey;
import java.security.PublicKey;

//子（派生）类
public class Student extends Person {
    public Student(){
        //隐藏代码：调用了父亲的无参构造
        super("name");  //调用父亲的构造器，必须在子类构造器的第一行
        System.out.println("Student的无参构造执行了");
    }
    private String name = "wen_SAMA";


    public void print(){
        System.out.println("Student");
    }

    public void test1(){
        print();        //Student
        this.print();   //Student
        super.print();  //Person
    }

}
```



### Teacher

```java
package com.oop.demo05;

import javax.naming.Name;

//子（派生）类
public class Teacher extends Person{
    public  Teacher(){
        super("name");
    }
}
```



### Application

```java
package com.oop.demo05;

public class Application {
    public static void main(String[] args) {
        Student student = new Student();
    }
}
```



## package demo06



### 重写

重写需要有继承关系，子类重写父类的方法！

子类和父类的方法和父类必须一致，方法体不同

1. 方法名必须相同
2. 参数列表必须相同
3. 修饰符： 范围可以扩大但不能缩小： public > Protected > Default > private
4. 抛出的异常： 范围可以被缩小，但不能扩大： ClassNotFoundException > Exception（大）

为什么需要重写：

父类的功能，子类不一定需要，或者不一定满足

重写快捷键： Alt + Insert : override



### A

```java
package com.oop.demo06;

//继承
public class A extends B {
    //Override  重写
    @Override
    public void test() {
        System.out.println('A');
    }
}
```



### B

```java
package com.oop.demo06;

import javax.sound.midi.Soundbank;
//重写是方法的重写，和属性无关
public class B {
    public void test(){
        System.out.println("B=>test()");
    }
}

```



### Application

```java
package com.oop.demo06;

public class Application {
    public static void main(String[] args) {
        //静态的方法和非静态的方法区别很大
        //非静态才能重写
        //方法的调用只和左边，定义的数据类型有关
        A a = new A();
        a.test();

        //父类的引用指向了子类
        B b = new A();      //子类重写了父类
        b.test();
    }
}
```



## package demo07

### 多态

多态即同一方法可以根据发送对象的不同而采用多种不同的行为方式。

一个对象的实际类型是确定的，但可以指向对象的引用类型有很多

1. 多态是方法的多态，属性没有多态
2. 父类和子类，有联系	类型转换异常！
3. 存在条件： 继承关系，方法需要重写



不能被重写的：

1. static	方法，属于类，它不属于实例
2. final  常量
3. private  方法



多态注意事项
1. 多态是方法的多态，属性没有多态
2. 父类和子类，有联系   类型转换异常！
3. 存在条件： 继承关系，方法需要重写，父类引用指向子类对象 Father f1 = new Son()



### Person

```java
package com.oop.demo07;

public class Person {
    public void run(){
        System.out.println("run");
    }
}
```



### Student

```java
package com.oop.demo07;

public class Student extends Person {
    @Override
    public void run() {
        System.out.println("son");
    }

    public void eat(){
        System.out.println("eat");
    }
}
```



### Application

```java
package com.oop.demo07;

public class Application {
    public static void main(String[] args) {

        //一个对象的是实际类型是确定的
        //new Student();
        //new Person();

        //可以指向的引用类型不确定： 父类的引用指向子类
        Student s1 = new Student();
        Person s2 = new Student();
        Object s3 = new Student();

        //对象能执行哪些方法，主要看对象左边的类型，和右边的关系不打
        s2.run();   //子类重写了父类的方法，执行子类的方法
        //s2.eat();   //报错，Person类型没有这个方法，子类重写父类的方法，但父类不会得到子类特有的方法
        ((Student) s2).eat();       //强制转换，将对象类型强制转换为student，高转低，强转
        s1.run();
    }
}
```



## package demo08

### 强制转换

1. 父类引用指向子类的对象
2. 把子类转换为父类，向上转型
3. 把父类转换为子类，向下转型： 强制转换
4. 方便方法的调用，减少重复的代码

### Person

```java
package com.oop.demo08;

public class Person {
    public void run(){
        System.out.println("run");
    }
}
```



### Student

```java
package com.oop.demo08;

public class Student extends Person {
    public void go(){
        System.out.println("go");
    }
}
```



### Teacher

```java
package com.oop.demo08;

public class Teacher extends Person {
}
```



### Application

```java
package com.oop.demo08;

public class Application {
    public static void main(String[] args) {
        //类型之间的转换：父  子

        //高--->低
        Person obj = new Student();

        //student将这个对象转换为Student类型，我们就可以使用Student类型的方法了
        //1
        Student student = (Student) obj;    //强转
        student.go();
        student.run();
        //2.
        ((Student)obj).go();

        //子类转换为父类，可能丢失自己本来的一些独特的方法
        Student student1 = new Student();
        student.go();
        Person person = student1;    //自动转
        //person.go();      //编译报错
    }

}

/*
    public static void main(String[] args) {
        //Object > String
        //Object > Person > Student
        //Object > Person > Teacher
        Object object = new Student();

        System.out.println(object instanceof Student);  //ture
        System.out.println(object instanceof Person);   //ture
        System.out.println(object instanceof Object);   //ture
        System.out.println(object instanceof Teacher);  //false
        System.out.println(object instanceof String);   //false
        System.out.println("===================================");
        Person person = new Student();
        System.out.println(person instanceof Student);  //true
        System.out.println(person instanceof Person);   //true
        System.out.println(person instanceof Object);   //true
        System.out.println(person instanceof Teacher);  //false
        //  System.out.println(person instanceof String);   //编译就报错
        System.out.println("===================================");
        Student student = new Student();
        System.out.println(student instanceof Student);  //true
        System.out.println(student instanceof Person);   //true
        System.out.println(student instanceof Object);   //true
        //  System.out.println(student instanceof Teacher);  //编译即报错
        //  System.out.println(student instanceof String);   //编译即报错

        //编译是否通过，看对象类型和目标是否存在父子关系
        //ture还是false主要看对象引用类型和目标是否存在父子关系
    }
 */
```



## package demo09

### 匿名代码块与静态代码块

### Person

```java
package com.oop.demo09;

//final 断子绝孙符
public class Person {
    //2 :赋初值
    {
        //代码块（匿名代码块）
        System.out.println("匿名代码块");
    }
    //1 :只执行一次
    static {
        //静态代码块
        System.out.println("静态代码块");
    }

    //3
    public Person(){
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println("===================");
        Person person2 = new Person();

    }

}
```



```java
package com.oop.demo09;

//static
public class Student {
    private static int age;
    private double socre;

    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(Student.age);
        // System.out.println(Student.score);    //报错
        System.out.println(s1.age);
        System.out.println(s1.socre);


    }

    public void run() {
    go();
    }

    public static void go() {
   // run();    //报错，静态方法需要使用非静态方法之前应先实例化对象,，因为在类加载时，只加载了静态方法，没有加载非静态方法
        Student student = new Student();
        student.run();
    }
}
//static和类一起加载
```



### Test

```java
package com.oop.demo09;

import static java.lang.Math.random;

public class Test {
    public static void main(String[] args) {
        System.out.println(Math.random());
    }
}
```



## package demo10

### 抽象类

抽象类   abstract 	 extends：单继承 （接口可以多继承）

1. 不能new这个抽象类，只能靠子类去实现它： 约束

2. 抽象类中可以写普通的方法

3. 抽象方法必须写在抽象类中

4. 抽象的抽象： 约束

### Action

```java
package com.oop.demo10;

public abstract class Action {
    //约束，有人帮我们实现
    //abstract，抽象方法,只有方法的名字，没有方法的具体实现
    public abstract void doSomething();
}
```



### A

```java
package com.oop.demo10;

//抽象类的所有方法，继承了
public class A extends Action {
    //抽象类子类必须重写父类的抽象方法，否则会报错
    @Override
    public void doSomething() {

    }
}
```



### Application

```java
package com.oop.demo10;

public class Application {
    public static void main(String[] args) {
    //  new Action(); //报错，抽象类不能被实例化，只能通过子类去实现（new子类对象）
    }
}
```



## package demo11

### 接口

只有规范（抽象方法）。

作用：

1. 约束
2. 定义一些方法，让不同的人实现
3. public abstract
4. public static final
5. 接口不能被实例化
6. implements可以实现多个接口
7. 必须重写接口中的方法





### UserService

```java
package com.oop.demo11;

public interface UserService {
    //常量 public abstract final
    int age = 99;

    //接口中的所有定义都是抽象的  public abstract
    void add(String name);
    void delete(String name);
    void update(String name);
    void query(String name);

}
```



### TimeService

```java
package com.oop.demo11;

public interface TimeService {
    void timer();
}
```



### UserServiceImpl

```java
package com.oop.demo11;

//通过类实现接口
//实现接口的类，就需要重写接口的所有方法

//多继承，利用接口实现多继承

public class UserServiceImpl implements UserService,TimeService {

    @Override
    public void add(String name) {

    }

    @Override
    public void delete(String name) {

    }

    @Override
    public void update(String name) {

    }

    @Override
    public void query(String name) {

    }

    @Override
    public void timer() {

    }
}
```



## package demo12

### 内部类

内部类就是在一个类的内部再定义一个类。比如，A类中定义一个B类，那么B类相对A类来说就称为内部类，而A类相对B类来说就是外部类。

- 成员内部类
- 静态内部类
- 局部内部类
- 匿名内部类



### Outer

```java
package com.oop.demo12;

public class Outer {
    private int id = 10;
    public void out(){
        System.out.println("这是外部类的方法");
    }

    //局部内部类：在方法中的类
    public void method(){
        class Inner1{
            public void in(){

            }
        }
    }

    //一个java类中可以有多个class，但只能有一个public class
    class  Inner{
        public void in(){
            System.out.println("这是内部类的方法");
        }

        //获得外部类的私有属性
        public void getID(){
            System.out.println(id);
        }
    }
}
```



### Application

```java
package com.oop.demo12;

public class Application {
    public static void main(String[] args) {
        //先实例化一个外部类对象
        Outer outer = new Outer();
        //通过这个外部类去实例化内部类
        Outer.Inner inner = outer.new Inner();
        inner.in();
        inner.getID();
    }
}
```



### Test

```java
package com.oop.demo12;

import com.oop.demo11.UserService;

public class Test {
    public static void main(String[] args) {
        //匿名内部类： 没有名字初始化类,不用将实例保存到变量中
        new Apple().eat();
        
        new UserService1(){
            @Override
            public void hello() {
            }
        };
    }
}

class Apple{
    public void eat(){
        System.out.println("1");
    }
}

interface UserService1{
    void hello();
}
```



# Exception

## 异常

异常处理的5个关键字：

try	catch	finally	throw	throws



### 介绍

- Java把异常当作对象来处理，并定义一个基类java.lang.Throwable作为所有异类的超类。
- 在Java API中已经定义了许多异常类，这些异常类分为两大类，错误<font color =red>Error</font>和异常<font color =red>Exception</font>

**Error和Exception的区别：**

Error通常是灾难性的致命错误，是程序无法控制和处理的，当出现这些异常时，Java虚拟机（JVM）一般会选择终止线程；Exception通常情况下是可以被程序处理的，并且在程序中应该尽可能的去处理这些异常。



### 简单分类

**检查型异常：**最具代表的检查性异常是用户错误或问题引起的异常，这是程序员无法预见的。例如要打开一个不存在文件时，一个异常就发生了，这些异常在编译时不能被简单地忽略。

**运行时异常：**运行时异常是可能被程序员避免的异常。与检查性异常相反，运行时异常可以在编译时被忽略。

**错误：**错误不是异常，而是脱离程序员控制的问题。错误在代码中通常被忽略。例如，当栈溢出时，一个错误就发生了，它们在编译也检查不到的。



## package demo01



### Demo01

```java
package com.exception.demo01;

public class Demo01 {
    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
        demo01.a();
    }

    public void a(){
        b();
    }
    public void b(){
        a();
    }
}
```



### Test

```java
package com.exception.demo01;

public class Test {
    public static void main(String[] args) {
        try {
            new Test().test(1,0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }


        /*
        int a = 1;
        int b = 0;

        //假设要捕获多个异常：从小到大
        try {
            //try监控区域

            System.out.println(a / b);
        } catch (ArithmeticException e) {         //catch中为想要捕获的异常类型，当捕获到的异常相同时，执行体内的功能
            System.out.println("程序出现异常，变量b不能为0");
        } catch (Exception e) {
            System.out.println("Exception");
        } catch (Throwable t) {
            System.out.println("Throwable");
        } finally {
            //处理善后工作
            System.out.println("finally");
        }
        //finally 可以不要


         */
/*
        try {
            //try监控区域
            new Test().a();
        }catch (ArithmeticException e){
            System.out.println("程序出现异常，变量b不能为0");
        }finally {
            //处理善后工作
            System.out.println("finally");
        }
    }


    public void a(){
        b();
    }
    public void b(){
        a();
    }


 */
    }

    //假设在方法中处理不了异常，方法上抛异常
    public void test(int a,int b) throws ArithmeticException{
        if (b == 0) {//主动抛出异常    throw   throws
            throw new ArithmeticException();  //主动抛出异常
        }
        System.out.println(a/b);
    }
}
```



### Test2

```java
package com.exception.demo01;

public class Test2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        //Ctrl + Alt +T ： 快速生成try catch finally
        try {
            System.out.println(a/b);
        } catch (Exception e) {
            e.printStackTrace();    //打印错误的栈信息
        } finally {
        }
    }
}
```



## package demo02

### 自定义异常

在Java内置的异常类可以描述编程是出现的大部分异常情况。除此之外，用户还可以自定义异常。用户自定义异常类，只需集成Exception类即可。

在程序中使用自定义异常类，大体可分为以下几个步骤：

1. 创建自定义异常类。
2. 在方法中通过throw关键字抛出异常对象。
3. 如果在当前抛出异常的方法中处理异常，可以使用try-catch语句捕获并处理；否则在方法的声明处通过throws关键字指明要抛出给方法调用者的异常继续进行下一步操作。
4. 在出现异常方法的调用者中捕获并处理异常



### MyException

```java
package com.exception.demo02;

//自定义的异常类
public class MyException extends Exception {
    //传递数字 > 10
    private int detail;

    public MyException(int a){
        this.detail = a;
    }

    //toString:异常的打印信息

    @Override
    public String toString() {
        return  "MyException{" +  detail + '}';
    }
}
```



### Test

```java
package com.exception.demo02;

public class Test {
    //可能会存在异常的方法

    static void test(int a) throws MyException{ //在方法上用throws往更高的地方抛出
        //个人理解：在方法内用throw抛出后异常是在方法内的，只能在方法内捕获
        //如要在方法外捕获必须在方法上加上throws往更高处抛出，抛出后可在整个类里被捕获

        System.out.println("传递的参数为："+a);
        if(a>10){
            throw new MyException(a);    //抛出
        }

        System.out.println("OK");
    }

    public static void main(String[] args) {
        try{
            test(11);
        }catch (MyException e){
            //可以在catch里增加一些处理异常的代码块
            System.out.println("MyException=>" +e); //这里的e是MyException中的toString方法
        }
    }
}
```



## 异常实际应用经验总结

- 处理运行时异常时，采用逻辑去合理的规避同时辅助try - catch处理
- 在多重catch块后面，可以加一个catch (Exception) 来处理可能会被遗漏的异常
- 对于不确定的代码，也可以加上try - catch，处理潜在的异常
- 尽量去处理异常，切忌只是简单地调用printStackTrace() 去打印输出
- 具体如何处理异常，要根据不同的业务需求和异常类型去决定
- 尽量添加finally语句块去释放占用的资源



# Annotation

## 注解介绍

### Annotation的作用

- 不是程序本身，可以对程序作出解释（这一点和注释没什么区别）
- 可以被其他程序（比如编译器等）读取



### Annotation的格式

注解是以”@注解名“在代码中存在的，还可以添加一些参数值，例如：@SuppressWarnings(value = “unchecked”)



### Annotation使用

可以附加在package，class，method，field等上面，相当于给他们添加了额外的辅助信息，可以通过反射机制编程实现对这些原数据的访问





## 内置注解

- <font color = #CC9933>@Override</font>：定义在java.lang.Override中，此注解只适用于修辞手法，表示一个方法声明打算重写超类中的另一个方法声明
- <font color = #CC9933>@Deprecated</font>：定义在java.lang.Deprecated中，此注解可以用于修辞手法，属性，类，表示不鼓励程序员使用这样的元素，通常是因为它很危险或者存在更好的选择
- <font color = #CC9933>@SuppressWarnings</font>：定义在java.lang.SuppressWarning中，用来抑制编译时的警告信息。与前两种注解不同，你需要添加一个参数才能正确使用，这些参数都是已经定义好的，选择性使用就好了:
  - <font color = #CC9933>@SuppressWarnings(“all”)</font>
  - <font color = #CC9933>@SuppressWarnings(“unchecked”)</font>
  - <font color = #CC9933>@SuppressWarnings(value={“uncheked”, “deprecation”})</font>
  - 等等....



### Test01

```java
package com.annotation;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all")
public class Test01 extends Object {
    @Override   //重写的注解
    public String toString() {
        return super.toString();
    }

    //Deprecated   不推荐程序员使用，但是可以使用，或者存在更好的方式
    @Deprecated
    public static void test(){
        System.out.println("Deprecated");
    }

    public static void main(String[] args) {
        test();
    }

}

```





## 元注解



- 元注解的作用就是负责注解其他注解，Java定义了4个标准的meta-annotation类型，他们被用来提供对其他annotation类型作说明

- 这些类型和它们所支持的类在java.lang.annotation包中可以找到：
  - <font color = #CC9933>@Target</font>：用于描述注解的适用范围（即：被描述的注解可以用在什么地方）
  - <font color = #CC9933>@Retention</font>：表示需要在什么级别保存改注解信息，用于描述注解的生命周期（SOURCE < CLASS < RUNTIME）
  - <font color = #CC9933>@Documented</font>：说明该注解将被包含在javadoc中
  - <font color = #CC9933>@Inherited</font>：说明子类可以继承父类中的该注解



### Test02

```java
package com.annotation;

import java.lang.annotation.*;

//测试元注解
public class Test02 {
}

//定义一个注解
//Target   表示我们的注解可以用在哪些地方
@Target(value = {ElementType.METHOD,ElementType.TYPE})

//Retention 表示我们的注解在什么地方还有效
@Retention(value = RetentionPolicy.RUNTIME)

//Documented    表示是否将我们的注解生成在JavaDoc中
@Documented

//Inherited 子类可以继承父类的注解
@Inherited
@interface MyAnnotation{

}
```



## 自定义注解

使用**@inteeface**自定义注解时，自动继承了java.lang.annotation.Annotation接口



**分析**：

1. @interface用来声明一个注解，格式：public @interface 注解名 {定义内容}	
2. 其中的每一个方法实际上是声明了一个配置参数
3. 方法的名称就是参数的名称
4. 返回值类型就是参数类型（返回值只能是基本类型：Class，String，enum）
5. 可以通过default来声明参数的默认值
6. 如果只有一个参数成员，一般参数名为value
7. 注解元素必须要有值，我们定义注解元素时，经常使用空字符串、0作为默认值



### Test03

```java
package com.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Test03 {
    //注解可以显示赋值， 如果没有默认值，就必须给注解赋值
    @MyAnnotation2(name = "hu_sama",SAMAname = {"huhu_SAMA"})
    public void test1(){}

    @MyAnnotation3("当注解中只有一个值时，默认给该参数赋值")
    public void test2(){}
}

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2{
    //注解的参数 ： 参数类型 + 参数名();
    String name()  default "";
    int age() default 18;
    int id() default -1;

    String[] SAMAname();
}

@interface MyAnnotation3{
    String value();
}
```





# Reflection

## 反射

### 介绍

Reflection（反射）是Java被视为动态语言的关键，反射机制允许程序在执行期间借助于Reflection API 取得任何类的内部信息，并能直接操作任意对象的内部属性及方法。

```java
Class c = Class.forName("java.lang.String");
```

加载完类之后，在堆内存的方法区就产生了一个Class类型的对象（一个类只有一个Class对象），这个对象就包含了完整的类的结构信息。我们可以通过这个对象看到类的结构。这个对象就像一面镜子，透过这个镜子看到类的结构，所以，我们形象地称之为：反射

- 正常方式： 引入需要的“包类”名称 --->  通过new实例化 ---> 取得实例化对象
- 反射方式： 实例化对象 ---> getClass() 方法 ---> 得到完整的“包类”名称

### Java反射机制提供的功能

- 在运行时判断任意一个对象所属的类
- 在运行时构造任意一个类的对象
- 在运行时判断任意一个类所具有的成员变量和方法
- 在运行时获取泛型信息
- 在运行时调用任意一个对象的成员变量和方法
- 在运行时处理注解
- 生成动态代理
- ......



### Test01

```java
package com.reflection;

public class Test01 {
    public static void main(String[] args) throws ClassNotFoundException {
        //通过反射获取类的Class对象
        Class c1 = Class.forName("com.reflection.User");
        System.out.println(c1);

        Class c2 = Class.forName("com.reflection.User");
        Class c3 = Class.forName("com.reflection.User");
        Class c4 = Class.forName("com.reflection.User");

        //一个类在内存中只有一个Class对象
        //一个类被加载后，类的整个结构都会被封装在Class对象中
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());
    }
}

class User{
    private String name;
    private int id;
    private int age;
    public User() {
    }

    public User(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User"+'{'+"name = "+name+','+" id = " +id + ','+" age = "+age+'}';
    }

    private void test(){

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
```





## 获取Class类的方式

1. 若已知具体的类，通过类的class属性获取，该方法最为安全可靠，程序性能最高

   ```java
   Class clazz = Person.class;
   ```

2. 已知某个类的实例，调用实例的getClass()方法获取Class对象

   ```java
   Class clazz = person.getClass();
   ```

3. 已知一个类的全类名，且该类在类路径下，可通过Class类的静态方法forName() 获取，可能抛出<font color = red>ClassNotFoundException</font>

   ```java
   Class clazz = Class.forName("demo01.Student");
   ```

4. 内置基本数据类型可以直接用类名.Type

5. 还可以利用ClassLoader...



### Test02

```java
package com.reflection;

public class Test02 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Student();
        System.out.println("这个人是"+person.name);

        //方式一：  通过对象获得
        Class c1 = person.getClass();
        System.out.println(c1.hashCode());

        //方式二：  forName获得
        Class c2 = Class.forName("com.reflection.Student");
        System.out.println(c2.hashCode());

        //方式三：  通过类名.class获得
        Class c3 = Student.class;
        System.out.println(c3.hashCode());

        //方式四：  基本内置类型的包装类都有一个Type属性
        Class c4 = Integer.TYPE;
        System.out.println(c4);

        //获得父类类型
        Class c5 = c1.getSuperclass();
        System.out.println(c5);


    }
}

class Person{
    public String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{"+"name="+name+'\''+'}';
    }
}

class Student extends Person{
    public Student(){
        this.name = "学生";
    }
}

class Teacher extends Person{
    public Teacher(){
        this.name = "老师";
    }
}
```



## 可以有Class对象的类型

- class：外部类，成员（成员内部类，静态内部类），局部内部类，匿名内部类。
- interface：接口
- [ ]：数组
- enum： 枚举
- annotation： 注解@interface
- primitive type： 基本数据类型
- void



### Test03

```java
package com.reflection;

import java.lang.annotation.ElementType;

//所有类型的Class对象
public class Test03 {
    public static void main(String[] args) {
        Class c1 = Object.class;    //类
        Class c2 = Comparable.class;    //接口
        Class c3 = String[].class;  //一维数组
        Class c4 = int[][].class;   //二维数组
        Class c5 = Override.class;  //注解
        Class c6 = ElementType.class;   //枚举
        Class c7 = Integer.class;      //基本数据类型
        Class c8 = void.class;      //void
        Class c9 = Class.class;     //Class

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c8);
        System.out.println(c9);

        //只要元素类型与维度一样，就是同一个Class
        int[] a = new int[10];
        int[] b = new int[100];
        System.out.println(a.getClass().hashCode());
        System.out.println(b.getClass().hashCode());
    }
}

```



## 类的加载与ClassLoader

- 加载：将class文件字节码内容加载到内存中，并将这些静态数据转换成方法区的运行时数据结构，然后生成一个代表这个类的java.lang.Class对象。
- 链接：将Java类的二进制代码合并到JVM的运行状态之中的进程。
  - 验证：确保加载的信息符合JVM规范，没有安全方面的问题
  - 准备：正式为类变量（static）分配内存并设置类变量默认初始值得阶段，这些内存都将在方法区中进行分配。
  - 解析：虚拟机常量池内的符号引用（常量名）替换为直接引用（地址)的过程。
- 初始化：
  - 执行构造器<clinit>()方法的过程。类构造器<clinit>() 方法是由编译器自动收集类中所有类变量的赋值动作和静态代码块中的语句合并产生的。（类构造器是构造类信息的，不是构造该对象的构造器）
  - 当初始化一个类的时候，如果发现其父类还没有进行初始化，则需要先触发其父类的初始化。
  - 虚拟机会保证一个类的<clinit>() 方法在多线程环境中被正确加锁和同步。

### Test04

```java
package com.reflection;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class Test04 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(A.m);

        /*
        1. 加载到内存，会产生一个类对应的Class对象
        2. 链接，链接结束后m = 0
        3. 初始化
            <clinit>(){
                        System.out.println("A类静态代码块初始化");
                        m = 300;
                        m = 100;
                        }
         */
    }
}
class A{
    static {
        System.out.println("A类静态代码块初始化");
        m = 300;
    }
    static int m = 100;

    public A(){
        System.out.println("A类的无参构造初始化");
    }
}
```



## 类的初始化

- 类的主动引用（一定会发生类的初始化）
  - 当虚拟机启动，先初始化main方法所在的类
  - new一个类的对象
  - 调用类的静态成员（除了final常量）和静态方法
  - 使用java.lang.reflect包的方法对类进行反射调用
  - 当初始化一个类时，如果其父类没有被初始化，则先会初始化它的父类
- 类的被动引用（不会发生类的初始化）
  - 当访问一个静态域时，只有真正声明这个域的类才会被初始化。如：当通过子类引用父类的静态变量，不会导致子类初始化。
  - 通过数组定义类引用，不会触发此类的初始化
  - 引用常量不会触发此类的初始化（常量在链接阶段就存入调用类的常量池中了）

### Test05

```java
package com.reflection;

//测试类是什么时候被初始化
public class Test05 {
    static {
        System.out.println("main类被加载");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        //1. 主动引用
        //Son son = new Son();

        //反射也会产生主动引用
        //Class.forName("com.reflection.Son");

        //不会产生类的引用的方法
        //System.out.println(Son.b);      //子类不会被加载

        //Son[] array = new Son[5];

        System.out.println(Son.M);      //常量在链接阶段就进入常量池中，调用不需要初始化

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
    static final int M = 1;
}

```



## 类加载器

- 类加载的作用： 将class文件字节码内容加载到内存中，并将这些静态数据转换成方法区的运行时数据结构，然后在堆中生成一个代表这个类的java.lang.Class对象，作为方法区中类数据的访问入口。
- 类缓存： 标准的JavaSE类加载器可以按要求查找类，但一旦某个类被加载到类加载器中，它将维持加载（缓存）一段时间。不过JVM垃圾回收机制可以回收这些Class对象

**JVM规范定义了如下类型的类加载器：**

- 引导类加载器： 用C++编写的，是JVM自带的类加载器负责Java平台核心库，用来装载核心类库。**该加载器无法直接获取。**
- 扩展类加载器： 负责jre/lib/ext目录下的jar包或 -D java.ext.dirs 指定目录下的jar包装入工作库中
- 系统类加载器： 负责java - classpath 或 -D java.class.path所指的目录下的类与jar包装入工作，是最常用的加载器

### Test06

```java
package com.reflection;

public class Test06 {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        //获取系统类加载器的父类加载器--->扩展类加载器
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);

        //获取扩展类加载器的父类加载器--->根加载器(C/C++)
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);

        //测试当前类是哪个加载器加载的
        ClassLoader classLoader = Class.forName("com.reflection.Test06").getClassLoader();
        System.out.println(classLoader);

        //测试JDK内置的类是谁加载的
        classLoader = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader);

        //如何获得系统加载器可以加载的路径
        System.out.println(System.getProperty("java.class.path"));
        //G:\Environment\Java\JDK1.8\jre\lib\charsets.jar;
        // G:\Environment\Java\JDK1.8\jre\lib\deploy.jar;
        // G:\Environment\Java\JDK1.8\jre\lib\ext\access-bridge-64.jar;
        // G:\Environment\Java\JDK1.8\jre\lib\ext\cldrdata.jar;
        // G:\Environment\Java\JDK1.8\jre\lib\ext\dnsns.jar;
        // G:\Environment\Java\JDK1.8\jre\lib\ext\jaccess.jar;
        // G:\Environment\Java\JDK1.8\jre\lib\ext\jfxrt.jar;
        // G:\Environment\Java\JDK1.8\jre\lib\ext\localedata.jar;
        // G:\Environment\Java\JDK1.8\jre\lib\ext\nashorn.jar;
        // G:\Environment\Java\JDK1.8\jre\lib\ext\sunec.jar;
        // G:\Environment\Java\JDK1.8\jre\lib\ext\sunjce_provider.jar;
        // G:\Environment\Java\JDK1.8\jre\lib\ext\sunmscapi.jar;
        // G:\Environment\Java\JDK1.8\jre\lib\ext\sunpkcs11.jar;
        // G:\Environment\Java\JDK1.8\jre\lib\ext\zipfs.jar;
        // G:\Environment\Java\JDK1.8\jre\lib\javaws.jar;
        // G:\Environment\Java\JDK1.8\jre\lib\jce.jar;
        // G:\Environment\Java\JDK1.8\jre\lib\jfr.jar;
        // G:\Environment\Java\JDK1.8\jre\lib\jfxswt.jar;
        // G:\Environment\Java\JDK1.8\jre\lib\jsse.jar;
        // G:\Environment\Java\JDK1.8\jre\lib\management-agent.jar;
        // G:\Environment\Java\JDK1.8\jre\lib\plugin.jar;
        // G:\Environment\Java\JDK1.8\jre\lib\resources.jar;
        // G:\Environment\Java\JDK1.8\jre\lib\rt.jar;
        // C:\Users\jiwen&77\Desktop\Note\javaSE\out\production\java基础语法;G:\IDEA 2019.3.3\lib\idea_rt.jar

        //双亲委派机制
            //不能定义java.lang.String，因为根加载器中已存在这个jar包，不会运行用户定义的同名jar包。

    }
}

```



## 获取运行时类的完整结构

通过反射获取运行时类的完整结构

Field	Method	Constructor	Superclass	Interface	Annotation

- 实现的全部接口
- 所继承的父类
- 全部的构造器
- 全部的方法
- 全部的Field
- 注解
- ......



### Test07

```java
package com.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//获得类的信息
public class Test07 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        //1.
        Class c1 = Class.forName("com.reflection.User");

        //2.
        User user = new User();
        c1 = user.getClass();

        //获得类的名字
        System.out.println(c1.getName());   //获得包名 + 类名
        System.out.println(c1.getSimpleName()); //获得类名

        //获得类的属性
        System.out.println("===========================");
        //1.
        Field[] fields = c1.getFields();        //只能找到public属性

        //2.
        fields = c1.getDeclaredFields();        //能找到全部属性
        for (Field field : fields) {
            System.out.println(field);
        }

        //获得指定属性的值
        System.out.println("===========================");
        Field name = c1.getDeclaredField("name");
        System.out.println(name);

        //获得类的方法
        System.out.println("===========================");
        Method[] methods = c1.getMethods();     //获得本类及其父类的全部public方法
        for (Method method : methods) {
            System.out.println("getMethods："+method);
        }
        System.out.println("===========================");
        methods = c1.getDeclaredMethods();      //获得本类的所有方法
        for (Method method : methods) {
            System.out.println("getDeclaredMethods:"+method);
        }

        //获得指定方法
        //重载
        System.out.println("===========================");
        Method getName = c1.getMethod("getName", null);
        Method setName = c1.getMethod("setName", String.class);
        System.out.println(getName);
        System.out.println(setName);

        //获得指定的构造器
        System.out.println("===========================");
        Constructor[] constructors = c1.getConstructors();      //获得public方法
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println("===========================");
        constructors = c1.getDeclaredConstructors();            //获得本类的全部方法
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }

        //获得指定的构造器
        System.out.println("===========================");
        Constructor declaredConstructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        System.out.println(declaredConstructor);
    }
}
```



## Class类创建对象与调用指定方法

### 创建类的对象

 调用Class对象的newInstance()方法

- 类必须有一个无参数的构造器
- 类的构造器的访问权限需要足够

也可以用有参构造器：

- 通过Class类的getDeclaredConstructor(Class ... parameterTypes)取得本类的指定形参类型的构造器
- 向构造器的形参中传递一个对象数组进去，里面包含了构造器中的各个参数。
- 通过Constructor实例化对象



### 调用指定方法

通过反射，调用类中的方法，通过Method类完成。

1. 通过Class类的getMethod(String name,Class... parameterTypes)方法取得一个Method对象，并设置此方法操作时所需要的参数类型。
2. 之后使用Object invoke(Object obj, Object[] args)进行调用，并向方法中传递要设置的对象的参数信息。



```java
Object invoke(Object obj, Object[] args)
```

- Object对应原方法的返回值，若原方法无返回值，此时返回null
- 若原方法为静态方法，此时形参Object obj可为null
- 若原方法形参列表为空，则Object[] args为null
- 若原方法声明为private，则需要在调用invoke() 方法前，显示调用方法对象的setAccessible(true) 方法，将可访问private的方法。



### Test08

```java
package com.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//动态地创建对象，通过反射
public class Test08 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        //获得Class对象
        Class c1 = Class.forName("com.reflection.User");

        //构造一个对象
        User user = (User) c1.newInstance();    //本质是调用了类的无参构造
        System.out.println(user);

        //通过构造器创建对象
        Constructor constructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        User user2 = (User)constructor.newInstance("hu_SAMA", 18, 19);
        System.out.println(user2);

        //通过反射调用普通方法
        User user3 = (User) c1.newInstance();
        //通过反射获取一个方法
        Method setName = c1.getDeclaredMethod("setName", String.class);
        //invoke: 激活的意思
        //（对象，"方法的值"）
        setName.invoke(user3,"huhu_SAMA");
        System.out.println(user3.getName());

        //通过反射操作属性
        System.out.println("=============================");
        User user4 = (User) c1.newInstance();
        Field name = c1.getDeclaredField("name");

        //不能直接操作私有属性，需要关闭程序的安全监测，属性或者方法的setAccessible(true)
        name.setAccessible(true);
        name.set(user4,"hu_SAMA");
        System.out.println(user4.getName());
    }
}

```



## setAccessible

- Method和Field、Constructor对象都有setAccessible() 方法。
- setAccessible作用是启动和禁用访问安全检查的开关。
- 参数值为true则指示反射的对象在使用时应该取消Java语言访问检查。
  - 提高反射的效率。如果在代码中必须用反射，而该句代码需要频繁地被调用，那么请设置为true。
  - 使得原本无法访问的私有成员也可以访问
- 参数值为false则指示反射的对象应该实施Java语言的访问检查。



### Test09

```java
package com.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//分析性能问题
public class Test09 {
    //普通方式调用
    public static void test01(){
        User user = new User();

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000 ; i++) {
            user.getName();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("普通方式执行10亿次: "+(endTime-startTime)+" ms");
    }

    //反射方式调用
    public static void test02() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user = new User();
        Class c1 = user.getClass();

        Method getName = c1.getDeclaredMethod("getName", null);
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000000000; i++) {
            getName.invoke(user,null);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("反射方式执行10亿次: "+(endTime - startTime) +" ms");
    }

    //反射方式调用    关闭检测
    public static void test03() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user = new User();
        Class c1 = user.getClass();


        Method getName = c1.getDeclaredMethod("getName", null);
        getName.setAccessible(true);
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000000000; i++) {
            getName.invoke(user,null);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("关闭检测执行10亿次: "+(endTime - startTime) +" ms");
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        test01();
        test02();
        test03();
    }
}
```



## 通过反射获取泛型

### Test10

```java
package com.reflection;

import com.exception.demo01.Test;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

//通过反射获取泛型
public class Test10 {
    public void test01(Map<String,User> map, List<User> list){
        System.out.println("test01");
    }

    public Map<String,User> test02(){
        System.out.println("test02");
        return null;
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Method method = Test10.class.getMethod("test01", Map.class, List.class);

        Type[] genericParameterTypes = method.getGenericParameterTypes();
        for (Type genericParameterType : genericParameterTypes) {
            System.out.println("#"+genericParameterType);
            if(genericParameterType instanceof ParameterizedType){
                Type[] actualTypeArguments = ((ParameterizedType) genericParameterType).getActualTypeArguments();
                for (Type actualTypeArgument : actualTypeArguments) {
                    System.out.println(actualTypeArgument);
                }
            }
        }

        method = Test10.class.getMethod("test02",null);
        Type genericReturnType = method.getGenericReturnType();

        if(genericReturnType instanceof ParameterizedType){
            Type[] actualTypeArguments = ((ParameterizedType) genericReturnType).getActualTypeArguments();
            for (Type actualTypeArgument : actualTypeArguments) {
                System.out.println(actualTypeArgument);
            }
        }
    }
}

```



## 反射操作注解

### Test11

```java
package com.reflection;

import java.lang.annotation.*;
import java.lang.reflect.Field;

//练习反射操作注解
public class Test11 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class c1 = Class.forName("com.reflection.Student2");

        //通过反射获得注解
        Annotation[] annotations = c1.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        //获得注解的value的值
        Tablehuhu tablehuhu = (Tablehuhu) c1.getAnnotation(Tablehuhu.class);
        String value = tablehuhu.value();
        System.out.println(value);

        //获得类指定的注解
        Field field = c1.getDeclaredField("name");
        Fieldhuhu annotation = field.getAnnotation(Fieldhuhu.class);
        System.out.println(annotation.columnName());
        System.out.println(annotation.type());
        System.out.println(annotation.length());
    }
}


@Tablehuhu("db_student")
class Student2 {
    @Fieldhuhu(columnName = "db_id", type = "int" ,length = 10)
    private int id;
    @Fieldhuhu(columnName = "db_age", type = "int" ,length = 10)
    private int age;
    @Fieldhuhu(columnName = "db_name", type = "varchar" ,length = 3)
    private String name;

    public Student2() {

    }

    public Student2(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
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
        return "Student2{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

//类名的注解
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Tablehuhu{
    String value();
}

//属性的注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface Fieldhuhu{
    String columnName();
    String type();
    int length();

}
```

↓	↓	↓	↓

↓	↓	↓	↓

↓	↓	↓	↓

**spring boot  !!!**


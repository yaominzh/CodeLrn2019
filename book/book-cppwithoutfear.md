[toc]
# chap07
## chap7.2 指针
指针是包含数字地址的变量
why boter with *p in the first place?
one reason, remember, jis that pointers enable a function to chamge the value of an argument passed to it.

when an integer is added or subtracted from an address expression, the compiler automatically multiplies that integer by the size of the base type.
在地址表达式上加减整数值,编译器自动使整数乘以指针基类型大小.

# chap08
## Individual Characters versus Strings

> c++ makes a distinction between individual characters and strings. A lot depends on whether you use single or double quotation marks
 - expressions in single quotation marks are treated  as numeric values after translation In to ASCII codes, They are not arrays.
 - expressions in double quotation marks are as arrys of char and, as such, are translated in to addresses.

# chap10

| inline functions | other class functions |
| --- | --- |
| Defind inside the class declaration itself | defind outside the class declaration but prototyped in side the class
| no scope prefix in used | the scope prefix must be used in the definition
| at run time, body of functions is 'inlined' | at run time a true function call is made, transferrin gexecution to aonther code locaion 
| appropriate for small functions | appropriate for longer functions
| has some restrictions; cannot use recursive calls | no special restrictions
# chap13

## stack

| stack class function | description
| --- | --- |
| stack.push(data) | pushes data onto top of stack
| stack.top() | returns data from top of stack
| stack.pop() | removes top item of stack 
| stack.size() | returns the number of items currently stored in the stack
| stack.empty() | returns true if empty, false otherwise
# cardinal rules
A class or data declaration always ends with a semicolon.

# ref
> 罗素悖论 理发师悖论
>小城里的理发师放出豪言,他只为而且一定要为城里所有不为自己刮胡子的人 刮胡子.但问题是理发师应该为自己刮胡子吗?
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
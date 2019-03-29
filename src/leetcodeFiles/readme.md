### Emp文件是对于java值传递的解析，别删除！

### java中的知识点
1.数组为空和数组长度为0的区别：
   数组为空表示数组是null，数组不存在
   数组长度为0表示数组是[]，数组对象是存在的
2.各种转换
   StringBuffer->String：   StringBuffer.toString()
   String->StringBuffer：   new StringBuffer(String)
   String->String[]    :    String.split()
   String->Integer     :    String.parse()
   
3.字符串中的length是方法（计算出长度）,数组中的长度是属性
  String a = "hello ";
  a.length();
  String[] aa = new String[];
  System.out.println(aa.length);
  
4.优先队列PriorityQueue底层应该是堆实现的
  堆是数据结构，优先队列也是
  堆排序是一种算法，让堆成为堆的算法
  
5.绘制uml：https://www.jianshu.com/p/12d87aab6fd0

### 待学习
1.堆排序
2.快速排序
3.自定义比较器的原理
   

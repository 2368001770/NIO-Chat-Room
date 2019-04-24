# NIO多人聊天室

---

BIO：阻塞式IO模型、弹性收缩能力差、多线程消耗资源

NIO：非阻塞式IO模型、弹性收缩能力强、单线程节省资源

通道（Channel）：双向性、非阻塞性、操作唯一性（只能通过Buffer进行操作）
>*文件类————FileChannel
>*UDP类————DatagramChannel
>*TCP类：————ServerSocketChannel、SocketChannel

缓冲区（Buffer）：一块内存区域、读写Channel中的数据
>*属性————容量（Capacity）、上限（Limit）、位置（Position）、标记（Mark）

多路复用器（Selector）：I/O事件就绪选择、NIO网络编程基础之一

选择键SelectionKey（）：四种就绪状态常量、有价值的属性

NIO网络编程基础步骤：
>*1、创建Selector
>*2、创建ServerSocketChannel，并绑定监听端口
>*3、将Channel设置为非阻塞模式
>*4、将Channel注册到Selector上，监听连接事件
>*5、循环调用selector的select方法，检测就绪情况
>*6、调用selectorKeys方法获取就绪Channel集合
>*7、判断就绪事件的种类，调用不同业务处理方法
>*8、重复第四步

NIO网络编程缺陷：
>*1、NIO类库和API繁杂
>*2、可靠性能力补齐、工作量和难度非常大
>*3、Selector空轮询（bug），CPU 100%

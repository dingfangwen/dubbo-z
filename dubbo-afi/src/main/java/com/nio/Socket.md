阻塞/非阻塞 -- 从线程的角度考虑，在执行某一步操作时线程有没有被挂起。
同步/异步 -- 从程序逻辑执行角度考虑，在执行某一逻辑处理时，能否去处理其他逻辑。

BIO -- BlockingIO -- 同步阻塞方式的IO
	面向流，操作字节或字符

	connect
	accept
	write
	read

	在高并发的场景下，BIO会遇到无法解决的瓶颈。

	线程本身的开辟运行销毁本身都是相当耗费资源的。
	性能再好的服务器所能开辟的线程的数量也是相当有限。
	传统的BIO,一个客户端一个连接的方式，不可避免的遇到了性能瓶颈。


	为了解决这种性能的瓶颈我们希望能够复用少量的线程来处理多个客户端的连接，但是我们发现，传统的BIO固有的阻塞操作的特点决定了这件事情是无法实现的。



NIO -- NewIO -- NonBlockingIO -- 同步非阻塞式IO
	面向通道，操作的是缓冲区

	Buffer
	Channel
	Selector


	Buffer -- 缓冲区

		capacity - 总容量
		position - 当前位
		limit - 限制位

		在缓冲区初始化好后，position为0，limit等于capacity，capacity永远等于缓冲区的容量。

		在写入数据时，会在postion指定的位置写入数据，并且将postion+1指向下一个可写的位置。
		postion最大不能超过limit的值。

		在读取数据之前，应该将postion归0，limit设置为当初写入时position最终的位置。

		在读取时，从position指定位置读取数据，postion+1指向下一个可读取的位置，无论怎样不会超过limit的限制。
		这样一来就可以读取到之前写入的数据了。

		capacity();
		int postion();
		postion(int x);
		limit();
		limit(int x);
		
		创建缓冲区
			static ByteBuffer allocate(int capacity);
			static ByteBuffer wrap(byte [] buf);
			static ByteBuffer wrap(byte [] buf,int offset,int length);

		写入数据
			put(byte b)
			put(byte[] src) 
			put(byte[] src, int offset, int length)
			put(ByteBuffer src) 
	 		。。。。

	 	读取数据
	 		byte get()  
	 		get(byte[] dst) 
			get(byte[] dst, int offset, int length)
			byte get(int index)   
			byte[] array()  

		反转缓冲区
			flip();//将limit设置为postion，将position设置为0，通常在写完数据读取前要进行反转操作。

		判断postion和limit之间是否有元素
			boolean hasRemaning();
			int remaining();

		清除缓冲区
			clear();//将limit设置为capacity，将position设置为0，并没有真正的清空数据，但是在大部分情况下不会有什么负面影响。

		设置自定义标志位，重置到标志位：
			mark();//设置自定义标志位
			reset();//将postion回到之前设置的自定义标志位

		重绕此缓冲区
			rewind();//将position设置为0


	Channel
		面向缓冲区进行操作。
		双向的数据传输，没有方向的限制。
		可以被设置为非阻塞的状态，在非阻塞状态下进行connect accept read write操作时，都不会产生阻塞。

		SocketChannel 
		ServerSocketChannel	
						-- TCP

		DatagramChannel -- UDP
		
		FileChannel
			
	Selector -- 选择器，可以实现同时注册管理多个连接，选择出已经就绪可以处理的连接，交给线程来处理。是整个NIO实现少量线程处理多个连接的关键组件。
		（1）通过静态方法获取Selector
		（2）在channel上提供了将channel注册到选择器中的方法
			SelectionKey register(Selector sel, int ops, Object att)  
			//sel:要注册到的选择器
			//ops:要注册的事件，可以注册 SelectionKey.OP_ACCEPT \SelectionKey.OP_CONNECT  \SelectionKey.OP_READ \SelectionKey.OP_WRITE  \
			//att:可以在注册时指定一个附件，这个附件是可以任意指定的一个对象，如果没有任何附件需要携带可以传入一个null
		（3）调用阻塞的select()方法，获取已经就绪操作的通道
			selec.select();

		（4）通过调用方法，获取已经就绪的通道的键，循环遍历进行处理
			Set<SelectionKey> selec.selectedKeys();

	Mina
	Netty
	


AIO -- AsynchronousIO -- 异步非阻塞式IO -- JDK1.7
	
	
粘包
    1.使用固定的长度
    2.使用特殊的边界符 
    3.使用协议
    



	
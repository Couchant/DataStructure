public class Array {

    private int[] data;
    private int size;

    /**
     * 构造函数
     * @param capacity 容量
     */
    public Array(int capacity){
        data=new int[capacity];
        size=0;
    }

    /**
     * 无参数的构造参数，默认容量为10
     */
    public Array(){
        this(10);
    }

    /**
     *
     * @return 数组中的元素个数
     */
    public int getSize(){
        return size;
    }

    /**
     *
     * @return 数组容量
     */
    public int getCapacity(){
        return data.length;
    }

    /**
     *
     * @return 数组是否为空
     */
    public boolean isEmpty(){
        return size == 0;
    }

    /**
     *
     * @param e 末尾插入e
     */
    public void addLast(int e){
        /*if (size==data.length){
            throw new IllegalArgumentException("AddLast failed. Array is full.");
        }
        data[size]=e;
        size++;*/
        add(size,e);
    }

    /**
     *
     * @param index 第 个位置
     * @param e 插入元素
     */
    public void add(int index,int e){
        if (size==data.length){
            throw new IllegalArgumentException("AddLast failed. Array is full.");
        }
        if(index < 0||index>size){
            throw new IllegalArgumentException("Add failed. Required index <=size and index >=0..");
        }
        for (int i = size-1; i >=index ; i--) {
            data[i+1]=data[i];
        }
        data[index]=e;
        size++;
    }
}

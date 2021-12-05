package pool;


import java.util.Stack;

public class CBServerClientIDXPool {
    public static final int MIN = 1;

    private volatile static CBServerClientIDXPool singleton;
    public static CBServerClientIDXPool getSingleton() {
        if (singleton == null) {
            synchronized (CBServerClientIDXPool.class) {
                if (singleton == null) {
                    count = MIN;
                    singleton = new CBServerClientIDXPool();
                }
            }
        }
        return singleton;
    }

    private static int count = 1;
    private static Stack<Integer> rest = new Stack<Integer>();

    public int getId(){
        if (rest.empty()){
            count++;
            return count - 1;
        }
        else{
            int id = rest.peek();
            rest.pop();
            return id;
        }
    }

    public void freeId(int id){
        if (id == count - 1) count--;
        else rest.push(id);
    }

}

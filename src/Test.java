import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Test {
    private static long time = System.currentTimeMillis();
    public static void main(String[] args) {
        User u = new User();
        u.setName("小白");

        u.begin();
        System.out.println("过了15分钟~");
        u.stop();

        System.out.println("======过了2小时之后======");
        u.runBegin();
        System.out.println("跑了15分钟");
        u.runStop();

        System.out.println();
        System.out.println();
        System.out.println();

        // 做一个方法
        if(time % 2 == 1){
            playComputer(u);
        }else{
            playPhone(u);
        }



    }

    private static void playPhone(User u) {
        System.out.println(u.getName() + "去玩耍手机");
    }

    private static void playComputer(User u) {
        System.out.println(u.getName() + "去玩耍电脑");
    }
}

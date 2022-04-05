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

        int count = 3;
        System.out.println(count);

        System.out.println();
        System.out.println();
        System.out.println();


        if(time % 2 == 0){
            playComputer(u);
        }else{
            playPhone(u);
        }



        System.out.println();
        System.out.println();
        System.out.println();

        // 做一个接口
        u.walkBegin();
        System.out.println("40分钟过后");
        u.walkStop();
    }

    private static void playPhone(User u) {
        System.out.println(u.getName() + "去玩会电脑~");
    }

    private static void playComputer(User u) {
        System.out.println(u.getName() + "去玩会手机~");



    }
}

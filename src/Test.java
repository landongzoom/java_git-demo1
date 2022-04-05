public class Test {
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


        int count1 = 3;
        int count2 = 4;

        System.out.println(count1);
        System.out.println(count2);
    }
}

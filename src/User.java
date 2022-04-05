public class User implements Eat,Run,Walk{
    @Override
    public void begin() {
        System.out.println(getName() + "开始食用美食~~");
    }

    @Override
    public void stop() {
        System.out.println(getName() + "吃完了，并打了一个饱嗝~~");
    }

    @Override
    public void runBegin() {
        System.out.println(getName() + "开始跑步，一开始跑得很快~~");
    }

    @Override
    public void runStop() {
        System.out.println(getName() + "跑步停止，今天运动已达标~~");
    }

    @Override
    public void walkBegin() {
        System.out.println(getName() + "开始散步");
    }

    @Override
    public void walkStop() {
        System.out.println(getName() + "结束散步，并踩了一朵小红花");
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

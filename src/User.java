public class User implements Eat{
    @Override
    public void begin() {
        System.out.println(getName() + "开始食用美食~~");
    }

    @Override
    public void stop() {
        System.out.println(getName() + "吃完了，并打了一个饱嗝~~");
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

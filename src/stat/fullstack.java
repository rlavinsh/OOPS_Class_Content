package stat;

public class fullstack {
    static class Frontend{
        void skill(){
            System.out.println("I know html css js");
        }
    }
    static class Backend extends Frontend{
        void skill(){
            super.skill();
            System.out.println("I know node express mongo");
        }
    }
    public static void main(String[] args) {
        Backend b1 = new Backend();
        b1.skill();
    }
}

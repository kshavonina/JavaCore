package July6;

public class Main {
    public static void main(String[] args) {
        String s = "Jack";
        s = s + " Daniels";
        System.out.println(s);
        // но это не значит, что будет изменена существуетвующая строка.
        // просто будет выделена еще память отдельно под строку " Daniels"

        StringBuffer buffer = new StringBuffer();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            s = s + i;
        }
    }

    private String getString() {
        StringBuilder sb = new StringBuilder();
        return sb.append("first").append("second").toString();
    }
}

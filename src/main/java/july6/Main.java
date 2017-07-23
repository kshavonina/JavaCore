package july6;

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

        char[] value = "asd".toCharArray();
        String str = new String(value, 0, 2);
        System.out.println(str);

        CharSequence sequence = new StringBuilder();
    }

    private String getString() {
        StringBuilder sb = new StringBuilder();
        return sb.append("first").append("second").toString();
    }
}

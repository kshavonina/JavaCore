package July6;

public class Main {
    public static void main(String[] args) {
        String s = "Jack";
        s = s + " Daniels";
        System.out.println(s);
        // но это не значит, что будет изменена существуетвующая строка.
        // просто будет выделена еще память отдельно под строку " Daniels"

        


    }
}

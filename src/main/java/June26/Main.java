package June26;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] rooms = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(rooms));
        System.out.println(rooms[1]); // info about second room
        System.out.println();

//        // catching exception
//        rooms[3] = 4;
//        System.out.println(rooms[3]);

        // => do next:
        int[] newRooms = new int[rooms.length + 1];
        newRooms = Arrays.copyOf(rooms, 4); // initialization with copying from old array "rooms"
        newRooms[3] = 4;
        System.out.println();
        System.out.println(newRooms[3]);
        System.out.println(Arrays.toString(newRooms));
        System.out.println();

        // another way:
        rooms  = Arrays.copyOf(rooms,4);
        rooms[3] = 4;
        System.out.println(rooms[3]);
        System.out.println(Arrays.toString(rooms));
        System.out.println();

        // about bit operations --MUST KNOW--
        System.out.println(10 ^ 2);
        System.out.println(10 ^ 1);
        System.out.println();

        // clone() is protected method
        Object obj = new Object();
        System.out.println();

        // fori & forEach (forEach works with iterators)
        int[] rooms2 = new int[] {1, 2, 3, 4};

        for (int i = 0; i < rooms.length; i++) {
            System.out.println(rooms[i]);
        }
        System.out.println();

        for (int roomNumber : rooms) {
            System.out.println(roomNumber);
        }
        System.out.println();

        // example with list of cats
        List<String> list = new LinkedList<>();

        // array of arrays
        int[][] field = new int[5][5];
        field[0][4] = 2;

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }




    }
}

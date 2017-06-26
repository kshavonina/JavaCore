package June26;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] rooms = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(rooms));
        System.out.println(rooms[1]); // info about second room

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

        // another way:
        rooms  = Arrays.copyOf(rooms,4);
        rooms[3] = 4;
        System.out.println(rooms[3]);
        System.out.println(Arrays.toString(rooms));

        // about bit operations --MUST KNOW--
        System.out.println(10 ^ 2);
        System.out.println(10 ^ 1);
    }
}

package june22;

public class Cat {
    private String name = "Musya";
    private Number countNum;
    private Integer countInt;

    public Cat() {

    }

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        return name != null ? name.equals(cat.name) : cat.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
        //return 1;
    }

    public void catLegSize(int size) {
        System.out.println("My cat size: " + countInt + size + 10);
    }

    public void catLegSize(long size) {
        System.out.println("My cat size: " + countNum + size + 20);
    }


}

package pl.urbanowicz;

public class App {
    public static void main(String[] args) {
        House house = new House.HouseBuilder()
                .buildDoors("Doors")
                .buildRoof("Roofs")
                .buildWalls("Walls")
                .buildFloors("Floors")
                .build();

        System.out.println(house);
    }
}

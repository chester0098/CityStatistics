import entities.Floors;
import entities.Item;

import java.util.*;

public class Main implements IMain {
    Map<String, Floors> cityFloors = new HashMap<>();
    Map<Integer, Item> itemRepetition = new HashMap<>();

    public static void main(String[] args) {
        Main main = new Main();

        XMLParser xmlParser = new XMLParser();
        xmlParser.parse(main);

        System.out.println("Повторения: ");
        main.showItemRepetition();

        System.out.println();
        System.out.println("Количество этажей в городах:");
        main.showCityFloors();
    }

    @Override
    public void addNewItem(Item item) {
        countingRepetitions(item);
        setCityFloors(item);
    }

    private void countingRepetitions(Item item) {
        if (itemRepetition.containsKey(item.hashCode())) {
            Item newItem = itemRepetition.get(item.hashCode());
            newItem.count += 1;
            itemRepetition.put(item.hashCode(), newItem);
        } else {
            item.count = 1;
            itemRepetition.put(item.hashCode(), item);
        }
    }

    public void setCityFloors(Item item) {
        if (cityFloors.containsKey(item.city))
            cityFloors.put(item.city, floorCount(cityFloors.get(item.city), item.floor));
        else cityFloors.put(item.city, floorCount(new Floors(), item.floor));
    }

    private Floors floorCount(Floors floors, int buildingFloors) {
        switch (buildingFloors) {
            case 1 -> floors.setOneStory(floors.getOneStory() + 1);
            case 2 -> floors.setTwoStory(floors.getTwoStory() + 1);
            case 3 -> floors.setThreeStory(floors.getThreeStory() + 1);
            case 4 -> floors.setFourStory(floors.getFourStory() + 1);
            case 5 -> floors.setFiveStory(floors.getFiveStory() + 1);
        }
        return floors;
    }

    public void showItemRepetition() {
        for (Map.Entry<Integer, Item> item : itemRepetition.entrySet()) {
            if (item.getValue().count > 1) {
                System.out.println(item.getValue().toString() + "; Повторения: " + item.getValue().count);
            }
        }
    }

    public void showCityFloors() {
        for (Map.Entry<String, Floors> item : cityFloors.entrySet()) {
            System.out.println(item.getKey() + " : " + item.getValue().toString());
        }
    }
}

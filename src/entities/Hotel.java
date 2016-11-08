package entities;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

public class Hotel {

    private long id;
    private String name;
    private String city;
    private List<Room> rooms;
    //TODO
    //добавить поле ReservedBy типа User
    //поле Currency перенести из сущности Рум в сущность Хотел

    public Hotel(String name, String city, List<Room> rooms, Currency currency, int numberOfRooms) {
//        this.id = TextUtils.getLastId("Hotel");  TextUtils пока досвечивается красным
        this.name = name;
        this.city = city;
        this.rooms = new ArrayList<Room>();
    }

    public Hotel(long id, String name, String city, List<Room> rooms, Currency currency, int numberOfRooms) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.rooms = new ArrayList<Room>();
    }

    public Room findRoomById(long id) {
        Room roomIsfound = null;
        try {

//            roomIsfound = rooms.stream().filter(room -> room.getId() == id).findAny().orElse(null); стрим подсвечен красным
        } catch (NullPointerException e) {
            System.out.println("This room doesn't exist in the list of hotel rooms");
        }
        return roomIsfound;
    }

    public void addRoom(Room room) {
        this.rooms.add(room);
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hotel hotel = (Hotel) o;

        if (name != null ? !name.equals(hotel.name) : hotel.name != null) return false;
        return city != null ? city.equals(hotel.city) : hotel.city == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Hotel \"" + name + "\" in city " + city;
    }
}
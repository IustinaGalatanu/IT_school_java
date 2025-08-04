package org.example.Homework.session18;
//Given a list of objects representing database entities with fields such as id, name, and timestamp, ensure that no two entities are considered equal if their id fields are different.
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Entity {
    private int id;
    private String name;
    private long timestamp;

    public Entity(int id, String name, long timestamp) {
        this.id = id;
        this.name = name;
        this.timestamp = timestamp;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // same object reference
        if (o == null || getClass() != o.getClass()) return false;

        Entity entity = (Entity) o;
        return Objects.equals(id, entity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Entity[id=" + id + ", name='" + name + "', timestamp=" + timestamp + "]";
    }
}


class Entities {
    public static void main(String[] args) {
        Entity e1 = new Entity(1, "Alice", 1620L);
        Entity e2 = new Entity(1, "Alice Changed", 1629L);
        Entity e3 = new Entity(1, "Bob", 1630L);

        Set<Entity> set = new HashSet<>();
        set.add(e1);
        set.add(e2);
        set.add(e3);

        System.out.println("Set size: " + set.size());

        for (Entity e : set) {
            System.out.println(e);
        }

        System.out.println("e1.equals(e2): " + e1.equals(e2));
        System.out.println("e1.equals(e3): " + e1.equals(e3));
    }
}



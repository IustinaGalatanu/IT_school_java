package org.example.Homework.session18;
//Create a generic repository class for storing objects. The repository should use a HashMap internally. Override equals and hashcode methods to ensure the correct behavior of the repository.

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Repository<ID, T> {
        private Map<ID, T> storage = new HashMap<>();

        public void save(ID id, T value) {
            storage.put(id, value);
        }

        public T get(ID id) {
            return storage.get(id);
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Repository)) return false;
            Repository<?, ?> other = (Repository<?, ?>) o;
            return Objects.equals(storage, other.storage);
        }

        @Override
        public int hashCode() {
            return Objects.hash(storage);
        }
}
class Rep {
    public static void main(String[] args) {

        Repository<Integer, String> rep1 = new Repository<>();
        Repository<Integer, String> rep2 = new Repository<>();

        rep1.save(1, "Ana");
        rep2.save(1, "Ana");

        System.out.println(rep1.get(1));
        System.out.println(rep1.equals(rep2));
        System.out.println(rep1.hashCode());
    }
}




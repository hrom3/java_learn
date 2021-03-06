package classworkmy.collections.dto;

import java.util.Objects;

public class PassportIdUnique {
        private String name;
        private String id;
        private String number;

        public PassportIdUnique(String name, String id, String number) {
            this.name = name;
            this.id = id;
            this.number = number;
        }

        public PassportIdUnique() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            PassportIdUnique passport = (PassportIdUnique) o;
            return Objects.equals(id, passport.id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }

    @Override
    public String toString() {
        return "PassportIdUnique{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}

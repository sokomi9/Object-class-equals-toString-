class Car
{
         protected String model;
         protected int price;
        @Override
        public String toString() {
            return "Car [model=" + model + ", price=" + price + "]";
        }
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((model == null) ? 0 : model.hashCode());
            result = prime * result + price;
            return result;
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Car other = (Car) obj;
            if (model == null) {
                if (other.model != null)
                    return false;
            } else if (!model.equals(other.model))
                return false;
            if (price != other.price)
                return false;
            return true;
        }
         
}
public class index {

    public static void main(String[] args) {
        Car obj1 = new Car();
        obj1.model = "Benz";
        obj1.price = 10000;

        Car obj2 = new Car();
        obj2.model = "Benz";
        obj2.price = 10000;

        boolean test = obj1.equals(obj2);

        System.out.println(test);
    }
}
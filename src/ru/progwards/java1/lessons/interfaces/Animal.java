package ru.progwards.java1.lessons.interfaces;


    public class Animal {
        static enum AnimalKind {ANIMAL, COW, HAMSTER, DUCK}
        static enum FoodKind {UNKNOWN, HAY, CORN}

        private AnimalKind animalKind = AnimalKind.ANIMAL;
        private FoodKind foodKind = FoodKind.UNKNOWN;

        private double weight = 1d;
        double foodCoeff = 0.02;

        Animal() {
        }

        Animal(double weight) {
            this.weight = weight;
        }

        Animal(AnimalKind animalKind, FoodKind food, double weight, double foodCoeff) {
            this.animalKind = animalKind;
            this.foodKind = food;
            this.weight = weight;
            this.foodCoeff = foodCoeff;
        }

        public AnimalKind getKind() {
            return animalKind;
        }

        public FoodKind getFoodKind() {
            return foodKind;
        }

        @Override
        public String toString() {
            return "I am " + getKind() + ", eat " + getFoodKind() + " " + calculateFoodWeight();
        }

        public double getWeight() {
            return weight;
        }

        void setFoodCoeff(double foodCoeff) {
            this.foodCoeff = foodCoeff;
        }
        public double getFoodCoeff() {
            return foodCoeff;
        }
        public double getCoeff() {
            return foodCoeff;
        }


        public double calculateFoodWeight() {
            return getWeight() * getFoodCoeff();
        }
        public String toStringFull()
        {return "I am"+animalKind +",eat"+foodCoeff+calculateFoodWeight();}

        public boolean equals(Object anObject){    // H7
            if(anObject==this)
                return true;
            if(anObject == null|| anObject.getClass() !=this.getClass())
                return false;
            Animal animal = (Animal)anObject;
            return Double.compare(animal.calculateFoodWeight(),this.calculateFoodWeight())==0;
        }


        public double getFood1kgPrice() {
            switch (foodKind) {
                case HAY:
                    return 20d;
                case CORN:
                    return 50d;
                case UNKNOWN:
                    //return 0;
            }
            return 0;
        }
        public double getFoodPrice(){return calculateFoodWeight() * getFood1kgPrice();
        }

        public int compareFoodPrice(Animal aminal){    // 7
            return Double.compare(getFoodPrice(),aminal.getFoodPrice());
        }

        public int compareTo(Animal o){
            if(o==this)return 0;
            double a= this.getWeight();
            double b =((Animal) o).getWeight();
            if(a==b)return 0;
            if(a>b)return 1;
            return -1;
        }

        public static void main(String[] args) {

            Animal animal = new Animal();
            System.out.println(animal);
        }
    }




package homework;

public class CatTest2 { //ppt 문제 2

    class Cat {
        private String breed;
        private String color;
        private int age;

        public Cat(String breed, String color, int age) {
            this.breed = breed;
            this.color = color;
            this.age = age;
        }

        public Cat(String breed, String color) {
            this.breed = breed;
            this.color = color;
        }

        public Cat(String breed) {
            this.breed = breed;
        }

        public void eat(String time) {
            System.out.println(time + "에 사료를 먹습니다.");
        }

        public void meow() {
            System.out.println("야옹~~~");
        }

        public void scratch() {
            System.out.println("스크래치를 긁습니다.");
        }

        public String getBreed() {
            return breed;
        }

        public void setBreed(String breed) {
            this.breed = breed;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    public static void main(String[] args) {
    	
        CatTest2 outer = new CatTest2();
        
        Cat myCat = outer.new Cat("코숏", "노랑", 3);

        System.out.println("나의 고양이는 " + myCat.getColor() + " " + myCat.getBreed() + "입니다.");

        myCat.eat("아침");
        myCat.meow();

        System.out.println();

        myCat.eat("점심");
        myCat.scratch();
        myCat.meow();
    }
}

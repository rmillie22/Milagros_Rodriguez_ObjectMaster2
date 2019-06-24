public class Human {
    public int strength;
    public int stealth;
    public int intelligence;
    public int health;

    public Human() {
        this.strength = 3;
        this.stealth = 3;
        this.intelligence = 3;
        this.health = 100;
    }

    public Human attack(Human attacked) {
        attacked.health -= this.strength;
        return this;
    }

    public void displayHealth() {
        System.out.println(this.health);
    }
    public class Ninja extends Human {
        public int stealth;
        public Ninja() {
            this.stealth = 10;
        }

        public Ninja steal(Human target){
            target.health -= this.stealth;
            this.health += this.stealth;
            return this;
        }

        public Ninja runAway(){
            this.health -=10;
            return this;
        }
    }
    public static class Samurai extends Human{
        private static int counter;
        public Samurai(){
            this.health = 200;
            counter++;
        }

        public Samurai dealthBlow(Human target){
            target.health = 0;
            this.health = this.health/2;
            return this;
        }

        public Samurai meditate(){
            this.health += this.health/2;
            return this;
        }

        public int howMany(){
            return counter;
        }
    }
    public class Wizard extends Human{
        public Wizard(){
            this.health = 50;
            this.intelligence = 8;
        }

        public Wizard heal(Human healed){
            healed.health += this.intelligence;
            return this;
        }

        public Wizard fireball(Human target) {
            target.health -= this.intelligence*3;
            return this;
        }
    }
    public class HumanTest{
        public void main(String[] args){
            Human human = new Human();
            Human human2 = new Human();
            human.attack(human2);
            human2.displayHealth();
        }
    }
}


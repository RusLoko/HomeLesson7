import static java.lang.System.*;

public class Main {
    private static int TIME = 0;
    public static void main(String[] args) {
        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Полосатый", 130, 4);
        cat[1] = new Cat("Меченый", 100, 3);
        cat[2] = new Cat("Няшка", 50, 2);
        Plate plate = new Plate(700);
        out.println("Привет! У Вас есть три кота: " + cat[0].getName() + ", " + cat[1].getName() + " и " + cat[2].getName() + ", которые хотят есть каждые " + cat[0].getSatietyTime() + ", " + cat[1].getSatietyTime() + " и " + cat[2].getSatietyTime() + " час(а) соответственно.");
        out.println("Коты обладают разной прожорливостью. Сейчас в миске " + plate.getFood() + " грамм кошачьего корма. Посмотрим насколько его хватит, в данный момент коты очень голодны и идут покушать.\n");

        do {

            if (cat[0].getSatiety() == 0) {

                if (!plate.checkFood(cat[0].getAppetite())) {
                    plate.increaseFood();
                }

                cat[0].eat(plate);
                out.println("Кот " + cat[0].getName() + " съел " + cat[0].getAppetite() + " граммов корма и проголодается через " + (cat[0].getSatiety()) + " часа(ов)");
            }

            cat[0].setSatiety(cat[0].getSatiety() - 1);


            if (cat[1].getSatiety() == 0) {

                if (!plate.checkFood(cat[1].getAppetite())) {
                    plate.increaseFood();
                }

                cat[1].eat(plate);
                out.println("Кот " + cat[1].getName() + " съел " + cat[1].getAppetite() + " граммов корма и проголодается через " + (cat[1].getSatiety()) + " часа(ов)");
            }

            cat[1].setSatiety(cat[1].getSatiety() - 1);

            if (cat[2].getSatiety() == 0) {

                if (!plate.checkFood(cat[2].getAppetite())) {
                    plate.increaseFood();
                }

                cat[2].eat(plate);
                out.println("Кот " + cat[2].getName() + " съел " + cat[2].getAppetite() + " граммов корма и проголодается через " + (cat[2].getSatiety()) + " часа(ов)");
            }

            cat[2].setSatiety(cat[2].getSatiety() - 1);
            out.println("\n С момента начала кормежки прошел(ло) " + TIME + " час(а). В миске осталось " + plate.getFood() + " граммов корма.\n");
            TIME++;

        } while (TIME <= 24);
    }
}



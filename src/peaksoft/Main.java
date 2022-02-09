package peaksoft;

public class Main {

    public static void main(String[] args) {


        Koy koy = new Koy("Барашка", 3, 45);
        Koy koy1 = new Koy("Торнадо", 4, 50);
        Koy koy2 = new Koy("Блекстар", 5, 44);
        Koy koy3 = new Koy("Блу", 5, 55);
        Koy koy4 = new Koy("Овен", 2, 43);
        Koy koy5 = new Koy("Корень", 1, 23);
        Koy koy6 = new Koy("Сталкер", 7, 34);
        Koy koy7 = new Koy("Курага", 5, 33);

        Koy[] ship = {koy, koy1, koy2, koy3, koy4, koy5, koy6, koy7};

        Ui ui = new Ui("Медальон", 6, 120);
        Ui ui1 = new Ui("Тибон", 3, 131);
        Ui ui2 = new Ui("Стейк", 2, 143);
        Ui ui3 = new Ui("Рибай", 4, 111);
        Ui ui4 = new Ui("Медиум", 5, 154);

        Ui[] cow = {ui, ui1, ui2, ui3, ui4};

        At at = new At("БТР", 5, 180);
        At at1 = new At("Ураган", 7, 170);

        At[] horse = {at, at1};


        Djailoo djailoo = new Djailoo("Ачык Асман", "Таш-Сарай", "Абдулла", new Ui[5], new Koy[8], new At[2]);
        System.out.println("Название фермы: "+djailoo.getNameFerm()+", адрес: "+djailoo.getAddress()+", имя: "+djailoo.getName());
        System.out.println("Коровы: ");
        for (Ui cows : cow) {

            System.out.println(cows.getName() + ": " + cows.getAge() + ": " + cows.getWeight());

        }

        System.out.println("__________________________________________");
        System.out.println("Овцы: ");
        for (Koy ships : ship) {
            System.out.println(ships.getName() + ": " + ships.getAge() + ": " + ships.getWeight());

        }

        System.out.println("_________________________________________________");
        System.out.println("Лошади: ");
        for (At horses : horse) {
            System.out.println(horses.getName() + ": " + horses.getAge() + ": " + horses.getWeight());

        }
    }
}

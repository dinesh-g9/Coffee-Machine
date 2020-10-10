class Army {

    public static void createArmy() {
        Unit krishna = new Unit("krishna");
        Unit paroksh = new Unit("paroksh");
        Unit gorakh = new Unit("gorakh");
        Unit dattatreya = new Unit("dattatreya");
        Unit bolenath = new Unit("bolenath");

        Knight aghor = new Knight("aghor");
        Knight bakthi = new Knight("bakthi");
        Knight surrender = new Knight("surrender");

        General mahadev = new General("mahadev");

        Doctor ashwani = new Doctor("ashwani");
    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}
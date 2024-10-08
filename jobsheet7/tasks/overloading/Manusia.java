package jobsheet7.tasks.overloading;


class Manusia {
    public void bernafas() {
        System.out.println("Manusia sedang bernafas.");
    }

    public void makan() {
        System.out.println("Manusia sedang makan.");
    }
}


class Dosen extends Manusia {
    @Override
    public void makan() {
        System.out.println("Dosen sedang makan.");
    }

    public void lembur() {
        System.out.println("Dosen sedang lembur.");
    }
}


class Mahasiswa extends Manusia {
    @Override
    public void makan() {
        System.out.println("Mahasiswa sedang makan.");
    }

    public void tidur() {
        System.out.println("Mahasiswa sedang tidur.");
    }
}




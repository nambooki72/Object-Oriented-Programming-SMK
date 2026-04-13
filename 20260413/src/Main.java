// 컴퓨터공학 전공
class ComputerStudent extends DonggukStudent implements CatCare {
    ComputerStudent(String name) {
        super(name);
    }

    @Override
    void study() {
        System.out.println(name + "이(가) 자바와 알고리즘을 공부 중...");
    }

    @Override
    public void giveChuru() {
        System.out.println(name + "이(가) 고양이에게 츄르를 줍니다.");
    }
}

// 경제학 전공
class EconomicsStudent extends DonggukStudent implements CatCare {
    EconomicsStudent(String name) {
        super(name);
    }

    @Override
    void study() {
        System.out.println(name + "이(가) 미시경제와 거시경제를 공부 중...");
    }

    @Override
    public void giveChuru() {
        System.out.println(name + "이(가) 고양이에게 츄르를 줍니다.");
    }
}

// 생명과학 전공
class BioStudent extends DonggukStudent implements CatCare {
    BioStudent(String name) {
        super(name);
    }

    @Override
    void study() {
        System.out.println(name + "이(가) 신경과학과 생명과학을 공부 중...");
    }

    @Override
    public void giveChuru() {
        System.out.println(name + "이(가) 고양이에게 츄르를 줍니다.");
    }
}

public class Main {
    public static void main(String[] args) {
        DonggukStudent[] students = new DonggukStudent[3];

        students[0] = new ComputerStudent("정모");
        students[1] = new EconomicsStudent("민수");
        students[2] = new BioStudent("지연");

        for (DonggukStudent s : students) {
            s.study();
        }

        System.out.println("------ 고양이 돌보기 ------");

        for (DonggukStudent s : students) {
            ((CatCare) s).giveChuru();
        }
    }
}
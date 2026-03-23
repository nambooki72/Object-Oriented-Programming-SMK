public class SwitchClass {
    public static void main(String[] args) {

        String nation = "KOR";

        switch (nation) {

            case "KOR":
            case "JPN":
            case "CHN":
                System.out.println("아시아 국가입니다.");
                break;

            case "FRA":
            case "GER":
            case "GBR":
                System.out.println("유럽 국가입니다.");
                break;

            case "USA":
            case "CAN":
            case "BRA":
                System.out.println("아메리카 국가입니다.");
                break;

            default:
                System.out.println("지역이 확인되지 않습니다.");
        }
    }
}
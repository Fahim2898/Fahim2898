package cricket;
import AnotherPackage.Information;
public class main {
    public static void main(String[] args) {
        Information cricket_info = new Information();
        cricket_info.setInformation();
        int prize = cricket_info.total_prize();
        int bonus_prize = cricket_info.Bonus(prize);
        cricket_info.printInformation(prize, bonus_prize);

        
    }
}
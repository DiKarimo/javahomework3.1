public class BonusMilesService {

    public int calculate(int cost) {
        int mile = 20;

        int total;
        if (cost >= mile) {
            total = cost / mile;
        } else {
            total = 0;
        }
        return total;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Lotto {
    public static void main(String[] args) {
        List<Integer> lottos = new ArrayList<>();

        final int[] myLottoNumbers = {1,2,3,4,5,6};

        getWinningNumberOfLotto(lottos);

        confirmOfMatchNumber(myLottoNumbers,lottos);
    }

    public static void getWinningNumberOfLotto (List<Integer> lottos){
        while (lottos.size() < 6) {
            int randomNumber = (int)(Math.random() * 45) + 1;
            if (!lottos.contains(randomNumber))
                lottos.add(randomNumber);
        }
        System.out.println("로또 당첨 번호는 " + lottos + " 입니다.\n");
    }

    public static void confirmOfMatchNumber(int[] arrays, List<Integer> list) {
        List<Integer> matchNumbers = new ArrayList<>();

        for (int array : arrays) {
            if (list.contains(array)) {
                matchNumbers.add(array);
            }
        }

        if (matchNumbers.isEmpty()) {
            System.out.println("아쉽지만 겹치는 번호가 없습니다.");
        } else {
            System.out.print("축하합니다! 겹치는 번호는 ");
            for (int matchNumber = 0; matchNumber < matchNumbers.size(); matchNumber++) {
                System.out.print(matchNumbers.get(matchNumber));
                if (matchNumber < matchNumbers.size() - 1) {
                    System.out.print(", ");
                }
            } System.out.println(" 입니다!");
        }
    }
}

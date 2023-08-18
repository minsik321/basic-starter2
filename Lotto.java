import java.util.ArrayList;
import java.util.List;

public class Lotto {
    public static void main(String[] args) {
        List<Integer> winningLottoNumbers = new ArrayList<>();
        final int[] myLottoNumbers = {1,2,3,4,5,6};
        getWinningLottoNumbers(winningLottoNumbers);
        confirmMatchLottoNumbers(myLottoNumbers,winningLottoNumbers);
    }

    public static void getWinningLottoNumbers(List<Integer> winningLottoNumbers){
        while (winningLottoNumbers.size() < 6) {
            int randomNumber = (int)(Math.random() * 45) + 1;
            if (!winningLottoNumbers.contains(randomNumber))
                winningLottoNumbers.add(randomNumber);
        }
        System.out.println("로또 당첨 번호는 " + winningLottoNumbers + " 입니다.\n");
    }

    public static void confirmMatchLottoNumbers(int[] arrays, List<Integer> list) {
        List<Integer> matchLottoNumbers = new ArrayList<>();
        for (int array : arrays) {
            if (list.contains(array)) {
                matchLottoNumbers.add(array);
            }
        }
        if (matchLottoNumbers.isEmpty()) {
            System.out.println("아쉽지만 겹치는 번호가 없습니다.");
        } else {
            System.out.print("축하합니다! 겹치는 번호는 ");
            for (int matchNumber = 0; matchNumber < matchLottoNumbers.size(); matchNumber++) {
                System.out.print(matchLottoNumbers.get(matchNumber));
                if (matchNumber < matchLottoNumbers.size() - 1) {
                    System.out.print(", ");
                }
            } System.out.println(" 입니다!");
        }
    }
}

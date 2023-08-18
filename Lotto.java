import java.util.ArrayList;
import java.util.List;

public class Lotto {
    public static void main(String[] args) {
        List<Integer> winningLottoNumbers = new ArrayList<>();
        final int[] myLottoNumbers = {1,2,3,4,5,6};
        getWinningLottoNumbers(winningLottoNumbers);
        confirmMatchLottoNumbers(myLottoNumbers,winningLottoNumbers);
    }

    static void getWinningLottoNumbers(List<Integer> winningLottoNumbers){
        while (winningLottoNumbers.size() < 6) {
            int randomNumber = (int)(Math.random() * 45) + 1;
            if (!winningLottoNumbers.contains(randomNumber))
                winningLottoNumbers.add(randomNumber);
        }
        System.out.print("로또 당첨 번호는 ");
        printLottoNumbers(winningLottoNumbers);
        System.out.println(" 입니다.\n");
    }

    static void confirmMatchLottoNumbers(int[] arrays, List<Integer> list) {
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
            printLottoNumbers(matchLottoNumbers);
            System.out.println(" 입니다!");
        }
    }

    static void printLottoNumbers(List<Integer> list) {
        for (int lottoNumber = 0; lottoNumber < list.size(); lottoNumber++) {
            System.out.print(list.get(lottoNumber));
            if (lottoNumber < list.size() - 1) {
                System.out.print(", ");
            }
        }

    }
}

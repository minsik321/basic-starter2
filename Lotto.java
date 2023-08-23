import java.util.HashSet;

public class Lotto {
    public static void main(String[] args) {
    }
    static HashSet<Integer> getWinningLottoNumbers() {
        HashSet<Integer> winningLottoNumbers = new HashSet<>();
        while (winningLottoNumbers.size() < 6) {
            int randomNumber = (int) (Math.random() * 45) + 1;
            winningLottoNumbers.add(randomNumber);
        }
        return winningLottoNumbers;
    }
}
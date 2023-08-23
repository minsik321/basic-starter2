import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringJoiner;

public class Lotto {
    public static void main(String[] args) {
        HashMap<String, StringJoiner> roundOfWinningLottoNumbers = new HashMap<>();
    }
    static HashSet<Integer> getWinningLottoNumbers() {
        HashSet<Integer> winningLottoNumbers = new HashSet<>();
        while (winningLottoNumbers.size() < 6) {
            int randomNumber = (int) (Math.random() * 45) + 1;
            winningLottoNumbers.add(randomNumber);
        }
        return winningLottoNumbers;
    }
    static StringJoiner changeType(HashSet<Integer> winningLottoNumbers) {
        StringJoiner stringJoinerTypeWinningLottoNumbers = new StringJoiner(" ,");
        for (Integer ordinalNumber : winningLottoNumbers) {
            stringJoinerTypeWinningLottoNumbers.add(String.valueOf(ordinalNumber));
        }
        return stringJoinerTypeWinningLottoNumbers;
    }
    static void saveWinningLottoNumbers(HashMap<String ,StringJoiner> roundOfWinningLottoNumbers) {
        String MaxRoundOfNumber;
        if (roundOfWinningLottoNumbers.keySet().isEmpty()) {
            MaxRoundOfNumber = "0회차";
        } else {
            MaxRoundOfNumber = Collections.max(roundOfWinningLottoNumbers.keySet());
        }
        roundOfWinningLottoNumbers.put(Integer.parseInt(MaxRoundOfNumber.substring(0,1))+1 + "회차",changeType(getWinningLottoNumbers()));
    }
    static void numberOfSaveWinningLottoNumbers(int number, HashMap<String ,StringJoiner> roundOfWinningLottoNumbers) {
        for (int ordinalNumber = 0; ordinalNumber < number; ordinalNumber++) {
            saveWinningLottoNumbers(roundOfWinningLottoNumbers);
        }
    }
}
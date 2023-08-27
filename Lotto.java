import java.util.*;

public class Lotto {
    public static void main(String[] args) {
        HashMap<String, StringJoiner> roundOfWinningLottoNumbers = new HashMap<>();
        saveWinningLottoNumbers(5,roundOfWinningLottoNumbers);
        printOrderInformation(roundOfWinningLottoNumbers);
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
    static void saveWinningLottoNumbers(int number ,HashMap<String ,StringJoiner> roundOfWinningLottoNumbers) {
        for (int ordinalNumber = 0; ordinalNumber < number; ordinalNumber++) {
            String MaxRoundOfNumber;
            if (roundOfWinningLottoNumbers.keySet().isEmpty()) {
                MaxRoundOfNumber = "0회차";
            } else {
                MaxRoundOfNumber = Collections.max(roundOfWinningLottoNumbers.keySet());
            }
            roundOfWinningLottoNumbers.put(Integer.parseInt(MaxRoundOfNumber.substring(0, 1)) + 1 + "회차", changeType(getWinningLottoNumbers()));
        }
    }
    static void printOrderInformation(HashMap<String , StringJoiner> roundOfWinningLottoNumbers ) {
        Scanner input = new Scanner(System.in);
        System.out.println("지정 하신 회차에 따른 로또 당첨 번호를 출력 합니다.");
        String answer = input.next();
        if (!roundOfWinningLottoNumbers.containsKey(answer)) {
            System.out.println("지정 하신 회차에 대한 로또 당첨 번호는 없습니다.");
        } else {
            Optional.ofNullable(roundOfWinningLottoNumbers.get(answer))
                    .ifPresent((winningLottoNumbers) -> System.out.println(answer + "의 로또 당첨 번호는 " + winningLottoNumbers + " 입니다."));
        }
    }
}
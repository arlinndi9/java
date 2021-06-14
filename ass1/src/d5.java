public class d5 {
    public static void main(String[] args) {
        String[] arr = {"airplane", "apple", "banana","ant","car","deer","engine","eagle","elephant","arrow","chessboard"};

        int maxLength = 0;
        String longestString = null;
        for (String s : arr) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                longestString = s;

            }
        }
        System.out.println("fjala "+longestString+" permbane numrin maksimal te shkronjave:"+longestString.length());
    }
}

class MethodTest {
    
    // 1. 1부터 n까지 출력
    void printFrom1ToN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    // 2. 문자열 n번 출력
    void printMessage(String message, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }

    // 3. 정수 2개 더하기
    int add(int a, int b) {
        return a + b;
    }

    // 4. 짝수인지 판단
    boolean isEven(int num) {
        return num % 2 == 0;
    }

    // 5. 문자열에 문자 개수 세기
    int countLetter(String text, char letter) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }

    // 메인 메소드
    public static void main(String[] args) {
        MethodTest mt = new MethodTest();

        System.out.println("▶ 1부터 5까지 출력");
        mt.printFrom1ToN(5);

        System.out.println("\n▶ 'Hello' 3번 출력");
        mt.printMessage("Hello", 3);

        System.out.println("\n▶ 10 + 20 = " + mt.add(10, 20));

        System.out.println("\n▶ 7은 짝수인가? " + mt.isEven(7));
        System.out.println("▶ 8은 짝수인가? " + mt.isEven(8));

        System.out.println("\n▶ 'banana'에 'a'는 몇 개? " + mt.countLetter("banana", 'a'));
    }
}
